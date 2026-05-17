/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

public enum TipoDato {
    NUM,
    REAL,
    PRECISO,
    SIGNO,
    TEXTO,
    ESTADO,
    VACIO,
    REGISTRO,
    ERROR;

    public static TipoDato desdeTexto(String texto) {
        if (texto == null) {
            return ERROR;
        }

        switch (texto) {
            case "num":
                return NUM;
            case "real":
                return REAL;
            case "preciso":
                return PRECISO;
            case "signo":
                return SIGNO;
            case "text":
                return TEXTO;
            case "estado":
                return ESTADO;
            case "empty":
                return VACIO;
            default:
                return REGISTRO;
        }
    }

    public boolean esNumerico() {
        return this == NUM || this == REAL || this == PRECISO;
    }

public boolean compatibleCon(TipoDato destino) {
    if (this == ERROR || destino == ERROR) {
        return true;
    }

    if (this == destino) {
        return true;
    }

    // NUM es entero. No acepta REAL ni PRECISO.
    if (destino == NUM) {
        return this == NUM;
    }

    // REAL acepta enteros y reales, pero no preciso si quieres evitar pérdida de precisión.
    if (destino == REAL) {
        return this == NUM || this == REAL;
    }

    // PRECISO acepta cualquier tipo numérico.
    if (destino == PRECISO) {
        return this == NUM || this == REAL || this == PRECISO;
    }

    if (this == REGISTRO && destino == REGISTRO) {
    return true;
}
    return false;
}
    public static TipoDato dominanteNumerico(TipoDato a, TipoDato b) {
        if (a == ERROR || b == ERROR) {
            return ERROR;
        }

        if (!a.esNumerico() || !b.esNumerico()) {
            return ERROR;
        }

        if (a == PRECISO || b == PRECISO) {
            return PRECISO;
        }

        if (a == REAL || b == REAL) {
            return REAL;
        }

        return NUM;
    }

    public String aCpp() {
        switch (this) {
            case NUM:
                return "int";
            case REAL:
                return "float";
            case PRECISO:
                return "double";
            case SIGNO:
                return "char";
            case TEXTO:
                return "string";
            case ESTADO:
                return "bool";
            case VACIO:
                return "void";
            case REGISTRO:
                return "auto";
            default:
                return "auto";
        }
    }
}