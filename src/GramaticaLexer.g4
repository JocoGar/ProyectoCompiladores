lexer grammar GramaticaLexer;

// Tipos de datos
PAL_NUMERO  : 'num' ;
PAL_REAL    : 'real' ;
PAL_PRECISO : 'preciso' ;
PAL_SIGNO   : 'signo' ;
PAL_TEXTO   : 'text' ;
PAL_ESTADO  : 'estado' ;
PAL_VACIO   : 'empty' ;

// Asignación / E-S
PAL_ASIGNA     : 'asigna' ;
PAL_PROYECTAR  : 'proyectar' ;
PAL_PROYECTAR_LINEA : 'proyectar_linea' ;
PAL_CAPTAR     : 'captar' ;

// Condicionales
PAL_VALIDAR    : 'validar' ;
PAL_ALTERNO    : 'alterno' ;
PAL_SIGUIENTE  : 'siguiente' ;

// Ciclos
PAL_REPETIR    : 'repetir' ;
PAL_INICIAR    : 'iniciar' ;
PAL_LOOP       : 'loop' ;

// Switch / Case
PAL_LIGHT      : 'light' ;
PAL_CERRADO    : 'cerrado' ;
PAL_DEFENSE    : 'defense' ;
ENTONCES       : 'entonces' ;

// Control de flujo
PAL_PARAR      : 'parar' ;
PAL_SALTAR     : 'saltp' ;
PAL_DAR        : 'dar' ;
PAL_RAIZ       : 'raiz' ;

// Booleanos
PAL_VERDAD     : 'verdad' ;
PAL_MENTIRA    : 'mentira' ;

// Operadores aritméticos
PAL_UNE        : 'une' ;
PAL_VECES      : 'veces' ;
PAL_QUITA      : 'quita' ;
PAL_REPARTE    : 'reparte' ;
PAL_SOBRA      : 'sobra' ;

// Operadores relacionales
PAL_SUPERA     : 'supera' ;
PAL_BAJO       : 'bajo' ;
PAL_MINIMO     : 'minimo' ;
PAL_TOPE       : 'tope' ;
PAL_CALCA      : 'calca' ;
PAL_AJENO      : 'ajeno' ;

// Operadores lógicos
PAL_VINCULO    : 'vinculo' ;
PAL_OPCION     : 'opcion' ;
PAL_OPUESTO    : 'opuesto' ;

// Incremento / decremento
PAL_SUBIR      : 'subir' ;
PAL_BAJAR      : 'bajar' ;

// Registros / estructuras
PAL_REGISTRO   : 'registro' ;
PAL_CAMPO      : 'campo' ;
PAL_REFERENCIA : 'referencia' ;

// Asignaciones compuestas
PAL_AUMENTA    : 'aumenta' ;
PAL_REDUCE     : 'reduce' ;
PAL_ESCALA     : 'escala' ;
PAL_DIVIDE     : 'divide' ;

// Literal especial
PAL_SALTO      : 'salto' ;

// Delimitadores
CONTIENE       : 'contiene' ;
LISTO          : 'listo' ;
HECHO          : 'hecho' ;
ABRE           : 'abre' ;
CIERRA         : 'cierra' ;
SEPARA         : 'separa' ;

// Arreglos
INICIO_PONCHO  : 'inicio_poncho' ;
FIN_PONCHO     : 'fin_poncho' ;

// Cadenas
CADENA_INICIO
    : 'cadena' -> pushMode(MODO_CADENA)
    ;

// Literales numéricos e identificadores
NUMERO
    : [0-9]+ ('.' [0-9]+)?
    ;

IDENTIFICADOR
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

// Comentarios visibles en la tabla de tokens
COMENTARIO_LINEA
    : 'nota' ~[\r\n]*
    ;

COMENTARIO_BLOQUE
    : 'apunte' .*? 'fin_apunte'
    ;

// Espacios
WS
    : [ \t\r\n]+ -> skip
    ;


mode MODO_CADENA;

CADENA_CIERRA
    : 'fin_cadena' -> popMode
    ;

// Captura el contenido de la cadena como un token aparte
TEXTO_CADENA
    : ( ~[f]
      | 'f' ~[i]
      | 'fi' ~[n]
      | 'fin' ~[_]
      | 'fin_' ~[c]
      | 'fin_c' ~[a]
      | 'fin_ca' ~[d]
      | 'fin_cad' ~[e]
      | 'fin_cade' ~[n]
      | 'fin_caden' ~[a]
      )+
    ;