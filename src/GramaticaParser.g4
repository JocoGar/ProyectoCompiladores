parser grammar GramaticaParser;

options { tokenVocab=GramaticaLexer; }


programa
    : seccionGlobales
      seccionFunciones
      bloquePrincipal
      comentariosFinales
      EOF
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
    : tipoVariable IDENTIFICADOR
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
    | asignacionArreglo HECHO
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
    : tipoVariable IDENTIFICADOR (PAL_ASIGNA expresion)? HECHO
    ;

declaracionArreglo
    : tipoVariable IDENTIFICADOR INICIO_PONCHO NUMERO FIN_PONCHO HECHO
    ;

asignacion
    : IDENTIFICADOR PAL_ASIGNA expresion
    ;

asignacionArreglo
    : accesoArreglo PAL_ASIGNA expresion
    ;

/* 
   ENTRADA / SALIDA
*/

instruccionImprimir
    : PAL_PROYECTAR ABRE expresion CIERRA
    ;

instruccionCaptar
    : PAL_CAPTAR ABRE destinoEntrada CIERRA
    ;

destinoEntrada
    : IDENTIFICADOR
    | accesoArreglo
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
    ;

actualizacion
    : IDENTIFICADOR (PAL_SUBIR | PAL_BAJAR)
    | (PAL_SUBIR | PAL_BAJAR) IDENTIFICADOR
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
    | literal
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

tipoRetorno
    : tipoVariable
    | PAL_VACIO
    ;