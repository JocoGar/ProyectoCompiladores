parser grammar GramaticaParser;

options { tokenVocab=GramaticaLexer; }


programa
    : seccionRegistros
      seccionGlobales
      seccionFunciones
      bloquePrincipal
      comentariosFinales
      EOF
    ;

seccionRegistros
    : (comentario | declaracionRegistro)*
    ;

declaracionRegistro
    : PAL_REGISTRO IDENTIFICADOR CONTIENE campoRegistro* LISTO
    ;

campoRegistro
    : tipoGeneral IDENTIFICADOR HECHO
    ;

seccionGlobales
    : (comentario | declaracionGlobal)*
    ;

seccionFunciones
    : (comentario | declaracionFuncion)*
    ;

comentariosFinales
    : comentario*
    ;

comentario
    : COMENTARIO_LINEA
    | COMENTARIO_BLOQUE
    ;

/* 
   BLOQUE DE GLOBALES
  */

declaracionGlobal
    : declaracionVariable
    | declaracionArreglo
    ;

/* 
   BLOQUE DE FUNCIONES
 */

declaracionFuncion
    : tipoRetorno IDENTIFICADOR ABRE parametros? CIERRA CONTIENE bloque LISTO
    ;

parametros
    : parametro (SEPARA parametro)*
    ;

parametro
    : PAL_REFERENCIA? tipoGeneral IDENTIFICADOR
    ;

/* 
   RAÍZ DEL PROGRAMA
 */

bloquePrincipal
    : PAL_VACIO PAL_RAIZ ABRE CIERRA CONTIENE bloque LISTO
    ;

/*
   BLOQUES E INSTRUCCIONES
  */

bloque
    : (comentario | instruccion)*
    ;

instruccion
    : declaracionVariable
    | declaracionArreglo
    | asignacion HECHO
    | asignacionCompuesta HECHO
    | actualizacion HECHO
    | instruccionImprimir HECHO
    | instruccionCaptar HECHO
    | estructuraCondicional
    | estructuraMientras
    | estructuraHacerMientras
    | estructuraPara
    | estructuraSwitch
    | instruccionRetorno HECHO
    | instruccionControlFlujo HECHO
    | llamadaFuncion HECHO
    ;

declaracionVariable
    : tipoGeneral IDENTIFICADOR (PAL_ASIGNA (expresion | inicializadorLista))? HECHO
    ;

declaracionArreglo
    : tipoGeneral IDENTIFICADOR INICIO_PONCHO NUMERO? FIN_PONCHO (PAL_ASIGNA inicializadorLista)? HECHO
    ;

inicializadorLista
    : CONTIENE expresion (SEPARA expresion)* LISTO
    ;

asignacion
    : destinoAsignacion PAL_ASIGNA expresion
    ;

asignacionCompuesta
    : destinoAsignacion (PAL_AUMENTA | PAL_REDUCE | PAL_ESCALA | PAL_DIVIDE) expresion
    ;

destinoAsignacion
    : IDENTIFICADOR
    | accesoArreglo
    | accesoCampo
    ;
/* 
   ENTRADA / SALIDA
*/

instruccionImprimir
    : (PAL_PROYECTAR | PAL_PROYECTAR_LINEA) ABRE expresion (SEPARA expresion)* CIERRA
    ;

instruccionCaptar
    : PAL_CAPTAR ABRE destinoEntrada CIERRA
    ;

destinoEntrada
    : destinoAsignacion
    ;

/* 
   CONDICIONALES
*/

estructuraCondicional
    : PAL_VALIDAR ABRE expresion CIERRA CONTIENE bloque LISTO
      (PAL_SIGUIENTE ABRE expresion CIERRA CONTIENE bloque LISTO)*
      (PAL_ALTERNO CONTIENE bloque LISTO)?
    ;

/* 
   CICLOS
*/

estructuraMientras
    : PAL_REPETIR ABRE expresion CIERRA CONTIENE bloque LISTO
    ;

estructuraHacerMientras
    : PAL_INICIAR CONTIENE bloque LISTO PAL_REPETIR ABRE expresion CIERRA HECHO
    ;

estructuraPara
    : PAL_LOOP ABRE inicializacionPara? HECHO expresion? HECHO actualizacionPara? CIERRA CONTIENE bloque LISTO
    ;

inicializacionPara
    : declaracionPara
    | asignacionSimple
    ;

declaracionPara
    : tipoVariable IDENTIFICADOR (PAL_ASIGNA expresion)?
    ;

asignacionSimple
    : IDENTIFICADOR PAL_ASIGNA expresion
    ;

actualizacionPara
    : actualizacion
    | asignacionSimple
    | asignacionCompuesta
    ;

actualizacion
    : destinoAsignacion (PAL_SUBIR | PAL_BAJAR)
    | (PAL_SUBIR | PAL_BAJAR) destinoAsignacion
    ;
/* 
   SWITCH / CASE
*/

estructuraSwitch
    : PAL_LIGHT ABRE expresion CIERRA CONTIENE casoSwitch* defectoSwitch? LISTO
    ;

casoSwitch
    : PAL_CERRADO valorCaso ENTONCES bloque
    ;

defectoSwitch
    : PAL_DEFENSE ENTONCES bloque
    ;

valorCaso
    : NUMERO
    | cadenaLiteral
    | PAL_VERDAD
    | PAL_MENTIRA
    ;

/* 
   CONTROL DE FLUJO
*/

instruccionRetorno
    : PAL_DAR expresion?
    ;

instruccionControlFlujo
    : PAL_PARAR
    | PAL_SALTAR
    ;

/*
   LLAMADAS A FUNCIÓN
*/

llamadaFuncion
    : IDENTIFICADOR ABRE argumentos? CIERRA
    ;

argumentos
    : expresion (SEPARA expresion)*
    ;

/* 
   EXPRESIONES CON PRECEDENCIA
 */

expresion
    : expresionLogica
    ;

expresionLogica
    : expresionRelacional ((PAL_VINCULO | PAL_OPCION) expresionRelacional)*
    ;

expresionRelacional
    : expresionAditiva ((PAL_SUPERA | PAL_BAJO | PAL_MINIMO | PAL_TOPE | PAL_CALCA | PAL_AJENO) expresionAditiva)*
    ;

expresionAditiva
    : expresionMultiplicativa ((PAL_UNE | PAL_QUITA) expresionMultiplicativa)*
    ;

expresionMultiplicativa
    : expresionUnaria ((PAL_VECES | PAL_REPARTE | PAL_SOBRA) expresionUnaria)*
    ;

expresionUnaria
    : PAL_OPUESTO expresionUnaria
    | PAL_QUITA expresionUnaria
    | expresionPrimaria
    ;

expresionPrimaria
    : ABRE expresion CIERRA
    | llamadaFuncion
    | accesoArreglo
    | accesoCampo
    | literal
    ;
accesoCampo
    : IDENTIFICADOR (PAL_CAMPO IDENTIFICADOR)+
    ;
/* 
   ARREGLOS
*/

accesoArreglo
    : IDENTIFICADOR INICIO_PONCHO expresion FIN_PONCHO
    ;

/* 
   LITERALES Y TIPOS
*/

literal
    : IDENTIFICADOR
    | NUMERO
    | cadenaLiteral
    | PAL_VERDAD
    | PAL_MENTIRA
    | PAL_SALTO
    ;

cadenaLiteral
    : CADENA_INICIO TEXTO_CADENA? CADENA_CIERRA
    ;

tipoVariable
    : PAL_NUMERO
    | PAL_REAL
    | PAL_PRECISO
    | PAL_SIGNO
    | PAL_TEXTO
    | PAL_ESTADO
    ;

tipoGeneral
    : tipoVariable
    | IDENTIFICADOR
    ;

tipoRetorno
    : tipoGeneral
    | PAL_VACIO
    ;