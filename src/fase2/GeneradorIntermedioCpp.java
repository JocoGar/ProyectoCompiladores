/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

/**
 *
 * @author 1jose
 */ 


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lexerparser.GramaticaParser;
import lexerparser.GramaticaParserBaseVisitor;

public class GeneradorIntermedioCpp extends GramaticaParserBaseVisitor<Void> {

    private final StringBuilder codigo;
    private final StringBuilder funciones;
    private final StringBuilder inicializacionesGlobales;
    private final StringBuilder registros;

    private final List<String> declaracionesGlobales;
    private final Set<String> globalesDeclaradas;

    private StringBuilder cuerpoActual;
    private final List<String> declaracionesActuales;
    private final Set<String> declaradosActuales;

    private int temporal;
    private int etiqueta;

    private boolean procesandoGlobales;

    private final List<String> pilaBreak;
    private final List<String> pilaContinue;

    public GeneradorIntermedioCpp() {
        this.codigo = new StringBuilder();
        this.funciones = new StringBuilder();
        this.registros = new StringBuilder();
        this.inicializacionesGlobales = new StringBuilder();

        this.declaracionesGlobales = new ArrayList<>();
        this.globalesDeclaradas = new HashSet<>();

        this.cuerpoActual = null;
        this.declaracionesActuales = new ArrayList<>();
        this.declaradosActuales = new HashSet<>();

        this.temporal = 0;
        this.etiqueta = 0;

        this.procesandoGlobales = false;

        this.pilaBreak = new ArrayList<>();
        this.pilaContinue = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo.toString();
    }

    public void guardarArchivo() {
        try (PrintWriter pw = new PrintWriter("CodigoIntermedio.cpp", "UTF-8")) {
            pw.print(getCodigo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void iniciarBloque() {
        cuerpoActual = new StringBuilder();
        declaracionesActuales.clear();
        declaradosActuales.clear();
    }

    private String finalizarBloque() {
        StringBuilder salida = new StringBuilder();

        for (String declaracion : declaracionesActuales) {
            salida.append("    ").append(declaracion).append("\n");
        }

        if (!declaracionesActuales.isEmpty()) {
            salida.append("\n");
        }

        salida.append(cuerpoActual);

        cuerpoActual = null;
        declaracionesActuales.clear();
        declaradosActuales.clear();

        return salida.toString();
    }

    private void escribir(String linea) {
        if (procesandoGlobales) {
            inicializacionesGlobales.append("    ").append(linea).append("\n");
            return;
        }

        if (cuerpoActual != null) {
            cuerpoActual.append("    ").append(linea).append("\n");
        } else {
            funciones.append("    ").append(linea).append("\n");
        }
    }

    private void escribirEtiqueta(String etiqueta) {
        if (procesandoGlobales) {
            inicializacionesGlobales.append("    ").append(etiqueta).append(":;\n");
            return;
        }

        if (cuerpoActual != null) {
            cuerpoActual.append("    ").append(etiqueta).append(":;\n");
        } else {
            funciones.append("    ").append(etiqueta).append(":;\n");
        }
    }

    private void declarar(String declaracion, String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            declaracionesActuales.add(declaracion);
            return;
        }

        if (!declaradosActuales.contains(nombre)) {
            declaradosActuales.add(nombre);
            declaracionesActuales.add(declaracion);
        }
    }

    private void declararGlobal(String declaracion, String nombre) {
        if (!globalesDeclaradas.contains(nombre)) {
            globalesDeclaradas.add(nombre);
            declaracionesGlobales.add(declaracion);
        }
    }

    private String nuevoTemporal() {
        temporal++;
        String t = "t" + temporal;

        if (procesandoGlobales) {

            declaracionesActuales.add("double " + t + ";");
        } else if (cuerpoActual != null) {
            declarar("double " + t + ";", t);
        }

        return t;
    }

    private String nuevaEtiqueta() {
        etiqueta++;
        return "L" + etiqueta;
    }

private String tipoCpp(String tipo) {
    switch (tipo) {
        case "num":
            return "int";
        case "real":
            return "float";
        case "preciso":
            return "double";
        case "signo":
            return "char";
        case "text":
            return "string";
        case "estado":
            return "bool";
        case "empty":
            return "void";
        default:
            return tipo;
    }
}

    private String operadorCpp(String op) {
        switch (op) {
            case "une":
                return "+";
            case "quita":
                return "-";
            case "veces":
                return "*";
            case "reparte":
                return "/";
            case "sobra":
                return "%";
            case "supera":
                return ">";
            case "bajo":
                return "<";
            case "minimo":
                return ">=";
            case "tope":
                return "<=";
            case "calca":
                return "==";
            case "ajeno":
                return "!=";
            case "vinculo":
                return "&&";
            case "opcion":
                return "||";
            case "opuesto":
                return "!";
            case "aumenta":
                return "+=";
            case "reduce":
                return "-=";
            case "escala":
                return "*=";
            case "divide":
                return "/=";
            default:
                return op;
        }
    }

    @Override
    public Void visitPrograma(GramaticaParser.ProgramaContext ctx) {
        codigo.append("#include <iostream>\n");
        codigo.append("#include <string>\n");
        codigo.append("using namespace std;\n\n");

        codigo.append("// Codigo de tres direcciones\n\n");

        visit(ctx.seccionRegistros());

        codigo.append(registros);

        if (registros.length() > 0) {
            codigo.append("\n");
        }

        procesandoGlobales = true;

        iniciarBloque();
        visit(ctx.seccionGlobales());
        String declaracionesTemporalesGlobales = finalizarBloque();
        procesandoGlobales = false;

        for (String declaracion : declaracionesGlobales) {
            codigo.append(declaracion).append("\n");
        }

        if (!declaracionesGlobales.isEmpty()) {
            codigo.append("\n");
        }

        visit(ctx.seccionFunciones());

        codigo.append(funciones);
        codigo.append("\n");

        iniciarBloque();
        visit(ctx.bloquePrincipal().bloque());
        String cuerpoMain = finalizarBloque();

        codigo.append("int main() {\n");


        codigo.append(declaracionesTemporalesGlobales);


        codigo.append(inicializacionesGlobales);

        if (inicializacionesGlobales.length() > 0) {
            codigo.append("\n");
        }

        codigo.append(cuerpoMain);
        codigo.append("    return 0;\n");
        codigo.append("}\n");

        return null;
    }

    @Override
public Void visitDeclaracionRegistro(GramaticaParser.DeclaracionRegistroContext ctx) {
    String nombre = ctx.IDENTIFICADOR().getText();

    registros.append("struct ")
            .append(nombre)
            .append(" {\n");

    for (GramaticaParser.CampoRegistroContext campo : ctx.campoRegistro()) {
        registros.append("    ")
                .append(tipoCpp(campo.tipoGeneral().getText()))
                .append(" ")
                .append(campo.IDENTIFICADOR().getText())
                .append(";\n");
    }

    registros.append("};\n");

    return null;
}
    @Override
    public Void visitDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx) {
        String tipo = tipoCpp(ctx.tipoRetorno().getText());
        String nombre = ctx.IDENTIFICADOR().getText();

        StringBuilder parametros = new StringBuilder();

        if (ctx.parametros() != null) {
            for (int i = 0; i < ctx.parametros().parametro().size(); i++) {
                GramaticaParser.ParametroContext p = ctx.parametros().parametro(i);

                if (i > 0) {
                    parametros.append(", ");
                }

            parametros.append(tipoCpp(p.tipoGeneral().getText()));

            if (p.PAL_REFERENCIA() != null) {
                parametros.append(" &");
            } else {
                parametros.append(" ");
            }

            parametros.append(p.IDENTIFICADOR().getText());
            }
        }

        iniciarBloque();
        visit(ctx.bloque());
        String cuerpoFuncion = finalizarBloque();

        funciones.append(tipo)
                .append(" ")
                .append(nombre)
                .append("(")
                .append(parametros)
                .append(") {\n");

        funciones.append(cuerpoFuncion);

        if (tipo.equals("void")) {
            funciones.append("    return;\n");
        }

        funciones.append("}\n\n");

        return null;
    }

        @Override
        public Void visitDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx) {
            String tipo = tipoCpp(ctx.tipoGeneral().getText());
            String nombre = ctx.IDENTIFICADOR().getText();

            if (procesandoGlobales) {
                declararGlobal(tipo + " " + nombre + ";", nombre);

                if (ctx.expresion() != null) {
                    String valor = generarExpresion(ctx.expresion());
                    escribir(nombre + " = " + valor + ";");
                } else if (ctx.inicializadorLista() != null) {
                    escribir(nombre + " = " + inicializadorLista(ctx.inicializadorLista()) + ";");
                }

                return null;
            }

            declarar(tipo + " " + nombre + ";", nombre);

            if (ctx.expresion() != null) {
                String valor = generarExpresion(ctx.expresion());
                escribir(nombre + " = " + valor + ";");
            } else if (ctx.inicializadorLista() != null) {
                escribir(nombre + " = " + inicializadorLista(ctx.inicializadorLista()) + ";");
            }

            return null;
        }

@Override
public Void visitDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx) {
    String tipo = tipoCpp(ctx.tipoGeneral().getText());
    String nombre = ctx.IDENTIFICADOR().getText();

    String tamanio = "";

    if (ctx.NUMERO() != null) {
        tamanio = ctx.NUMERO().getText();
    } else if (ctx.inicializadorLista() != null) {
        tamanio = String.valueOf(ctx.inicializadorLista().expresion().size());
    }

    String declaracion = tipo + " " + nombre + "[" + tamanio + "]";

    if (ctx.inicializadorLista() != null) {
        declaracion += " = " + inicializadorLista(ctx.inicializadorLista());
    }

    declaracion += ";";

    if (procesandoGlobales) {
        declararGlobal(declaracion, nombre);
    } else {
        declarar(declaracion, nombre);
    }

    return null;
}

@Override
public Void visitAsignacion(GramaticaParser.AsignacionContext ctx) {
    String destino = destinoAsignacion(ctx.destinoAsignacion());
    String valor = generarExpresion(ctx.expresion());

    escribir(destino + " = " + valor + ";");
    return null;
}

@Override
public Void visitAsignacionCompuesta(GramaticaParser.AsignacionCompuestaContext ctx) {
    String destino = destinoAsignacion(ctx.destinoAsignacion());
    String valor = generarExpresion(ctx.expresion());
    String operador = operadorCpp(ctx.getChild(1).getText());

    escribir(destino + " " + operador + " " + valor + ";");
    return null;
}

    @Override
    public Void visitInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx) {
        String valor = generarExpresion(ctx.expresion());

        escribir("cout << " + valor + " << endl;");
        return null;
    }

@Override
public Void visitInstruccionCaptar(GramaticaParser.InstruccionCaptarContext ctx) {
    String destino = destinoAsignacion(ctx.destinoEntrada().destinoAsignacion());

    escribir("cin >> " + destino + ";");
    return null;
}

    @Override
    public Void visitInstruccionRetorno(GramaticaParser.InstruccionRetornoContext ctx) {
        if (ctx.expresion() != null) {
            String valor = generarExpresion(ctx.expresion());
            escribir("return " + valor + ";");
        } else {
            escribir("return;");
        }

        return null;
    }

    @Override
    public Void visitActualizacion(GramaticaParser.ActualizacionContext ctx) {
        String nombre = destinoAsignacion(ctx.destinoAsignacion());


        if (ctx.getText().contains("subir")) {
            escribir(nombre + " = " + nombre + " + 1;");
        } else {
            escribir(nombre + " = " + nombre + " - 1;");
        }

        return null;
    }

    @Override
    public Void visitEstructuraCondicional(GramaticaParser.EstructuraCondicionalContext ctx) {
        String etiquetaFin = nuevaEtiqueta();

        for (int i = 0; i < ctx.expresion().size(); i++) {
            String etiquetaVerdadero = nuevaEtiqueta();
            String etiquetaSiguiente = nuevaEtiqueta();

            String condicion = generarExpresion(ctx.expresion(i));

            escribir("if (" + condicion + ") goto " + etiquetaVerdadero + ";");
            escribir("goto " + etiquetaSiguiente + ";");

            escribirEtiqueta(etiquetaVerdadero);
            visit(ctx.bloque(i));
            escribir("goto " + etiquetaFin + ";");

            escribirEtiqueta(etiquetaSiguiente);
        }

        if (ctx.PAL_ALTERNO() != null) {
            visit(ctx.bloque(ctx.bloque().size() - 1));
        }

        escribirEtiqueta(etiquetaFin);
        return null;
    }

    @Override
    public Void visitEstructuraMientras(GramaticaParser.EstructuraMientrasContext ctx) {
        String inicio = nuevaEtiqueta();
        String cuerpo = nuevaEtiqueta();
        String fin = nuevaEtiqueta();

        pilaBreak.add(fin);
        pilaContinue.add(inicio);

        escribirEtiqueta(inicio);

        String condicion = generarExpresion(ctx.expresion());

        escribir("if (" + condicion + ") goto " + cuerpo + ";");
        escribir("goto " + fin + ";");

        escribirEtiqueta(cuerpo);
        visit(ctx.bloque());
        escribir("goto " + inicio + ";");

        escribirEtiqueta(fin);

        pilaBreak.remove(pilaBreak.size() - 1);
        pilaContinue.remove(pilaContinue.size() - 1);

        return null;
    }

    @Override
    public Void visitEstructuraHacerMientras(GramaticaParser.EstructuraHacerMientrasContext ctx) {
        String inicio = nuevaEtiqueta();
        String evaluar = nuevaEtiqueta();
        String fin = nuevaEtiqueta();

        pilaBreak.add(fin);
        pilaContinue.add(evaluar);

        escribirEtiqueta(inicio);

        visit(ctx.bloque());

        escribirEtiqueta(evaluar);

        String condicion = generarExpresion(ctx.expresion());

        escribir("if (" + condicion + ") goto " + inicio + ";");
        escribir("goto " + fin + ";");

        escribirEtiqueta(fin);

        pilaBreak.remove(pilaBreak.size() - 1);
        pilaContinue.remove(pilaContinue.size() - 1);

        return null;
    }

    @Override
    public Void visitEstructuraPara(GramaticaParser.EstructuraParaContext ctx) {
        String inicio = nuevaEtiqueta();
        String cuerpo = nuevaEtiqueta();
        String actualizar = nuevaEtiqueta();
        String fin = nuevaEtiqueta();

        if (ctx.inicializacionPara() != null) {
            generarInicializacionPara(ctx.inicializacionPara());
        }

        pilaBreak.add(fin);
        pilaContinue.add(actualizar);

        escribirEtiqueta(inicio);

        if (ctx.expresion() != null) {
            String condicion = generarExpresion(ctx.expresion());
            escribir("if (" + condicion + ") goto " + cuerpo + ";");
            escribir("goto " + fin + ";");
        } else {
            escribir("goto " + cuerpo + ";");
        }

        escribirEtiqueta(cuerpo);

        visit(ctx.bloque());

        escribirEtiqueta(actualizar);

        if (ctx.actualizacionPara() != null) {
            generarActualizacionPara(ctx.actualizacionPara());
        }

        escribir("goto " + inicio + ";");
        escribirEtiqueta(fin);

        pilaBreak.remove(pilaBreak.size() - 1);
        pilaContinue.remove(pilaContinue.size() - 1);

        return null;
    }

    @Override
    public Void visitEstructuraSwitch(GramaticaParser.EstructuraSwitchContext ctx) {
        String evaluado = generarExpresion(ctx.expresion());
        String fin = nuevaEtiqueta();
        String defecto = ctx.defectoSwitch() != null ? nuevaEtiqueta() : fin;

        String[] etiquetasCasos = new String[ctx.casoSwitch().size()];

        for (int i = 0; i < ctx.casoSwitch().size(); i++) {
            etiquetasCasos[i] = nuevaEtiqueta();
            String valor = valorCaso(ctx.casoSwitch(i).valorCaso());

            escribir("if (" + evaluado + " == " + valor + ") goto " + etiquetasCasos[i] + ";");
        }

        escribir("goto " + defecto + ";");

        pilaBreak.add(fin);

        for (int i = 0; i < ctx.casoSwitch().size(); i++) {
            escribirEtiqueta(etiquetasCasos[i]);
            visit(ctx.casoSwitch(i).bloque());
            escribir("goto " + fin + ";");
        }

        if (ctx.defectoSwitch() != null) {
            escribirEtiqueta(defecto);
            visit(ctx.defectoSwitch().bloque());
            escribir("goto " + fin + ";");
        }

        pilaBreak.remove(pilaBreak.size() - 1);

        escribirEtiqueta(fin);
        return null;
    }

    @Override
    public Void visitInstruccionControlFlujo(GramaticaParser.InstruccionControlFlujoContext ctx) {
        if (ctx.PAL_PARAR() != null) {
            if (!pilaBreak.isEmpty()) {
                escribir("goto " + pilaBreak.get(pilaBreak.size() - 1) + ";");
            }
        } else {
            if (!pilaContinue.isEmpty()) {
                escribir("goto " + pilaContinue.get(pilaContinue.size() - 1) + ";");
            }
        }

        return null;
    }

    @Override
    public Void visitLlamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx) {
        escribir(llamadaFuncion(ctx) + ";");
        return null;
    }

    private void generarInicializacionPara(GramaticaParser.InicializacionParaContext ctx) {
        if (ctx.declaracionPara() != null) {
            GramaticaParser.DeclaracionParaContext d = ctx.declaracionPara();

            String tipo = tipoCpp(d.tipoVariable().getText());
            String nombre = d.IDENTIFICADOR().getText();

            declarar(tipo + " " + nombre + ";", nombre);

            if (d.expresion() != null) {
                String valor = generarExpresion(d.expresion());
                escribir(nombre + " = " + valor + ";");
            }
        } else {
            GramaticaParser.AsignacionSimpleContext a = ctx.asignacionSimple();
            String valor = generarExpresion(a.expresion());
            escribir(a.IDENTIFICADOR().getText() + " = " + valor + ";");
        }
    }

private void generarActualizacionPara(GramaticaParser.ActualizacionParaContext ctx) {
    if (ctx.actualizacion() != null) {
        visit(ctx.actualizacion());
        return;
    }

    if (ctx.asignacionSimple() != null) {
        GramaticaParser.AsignacionSimpleContext a = ctx.asignacionSimple();
        String valor = generarExpresion(a.expresion());
        escribir(a.IDENTIFICADOR().getText() + " = " + valor + ";");
        return;
    }

    if (ctx.asignacionCompuesta() != null) {
        visit(ctx.asignacionCompuesta());
    }
}

    private String generarExpresion(GramaticaParser.ExpresionContext ctx) {
        return expresionLogica(ctx.expresionLogica());
    }

    private String expresionLogica(GramaticaParser.ExpresionLogicaContext ctx) {
        String izquierda = expresionRelacional(ctx.expresionRelacional(0));

        for (int i = 1; i < ctx.expresionRelacional().size(); i++) {
            String derecha = expresionRelacional(ctx.expresionRelacional(i));
            String op = operadorCpp(ctx.getChild((i * 2) - 1).getText());
            String t = nuevoTemporal();

            escribir(t + " = " + izquierda + " " + op + " " + derecha + ";");
            izquierda = t;
        }

        return izquierda;
    }

    private String expresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx) {
        String izquierda = expresionAditiva(ctx.expresionAditiva(0));

        for (int i = 1; i < ctx.expresionAditiva().size(); i++) {
            String derecha = expresionAditiva(ctx.expresionAditiva(i));
            String op = operadorCpp(ctx.getChild((i * 2) - 1).getText());

            String t = nuevoTemporal();
            escribir(t + " = " + izquierda + " " + op + " " + derecha + ";");
            izquierda = t;
        }

        return izquierda;
    }

    private String expresionAditiva(GramaticaParser.ExpresionAditivaContext ctx) {
        String izquierda = expresionMultiplicativa(ctx.expresionMultiplicativa(0));

        for (int i = 1; i < ctx.expresionMultiplicativa().size(); i++) {
            String derecha = expresionMultiplicativa(ctx.expresionMultiplicativa(i));
            String op = operadorCpp(ctx.getChild((i * 2) - 1).getText());
            String t = nuevoTemporal();

            escribir(t + " = " + izquierda + " " + op + " " + derecha + ";");
            izquierda = t;
        }

        return izquierda;
    }

    private String expresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx) {
        String izquierda = expresionUnaria(ctx.expresionUnaria(0));

        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            String derecha = expresionUnaria(ctx.expresionUnaria(i));
            String operadorOriginal = ctx.getChild((i * 2) - 1).getText();
            String op = operadorCpp(operadorOriginal);
            String t = nuevoTemporal();

            if (operadorOriginal.equals("sobra")) {
                escribir(t + " = (int)" + izquierda + " % (int)" + derecha + ";");
            } else {
                escribir(t + " = " + izquierda + " " + op + " " + derecha + ";");
            }

            izquierda = t;
        }

        return izquierda;
    }

    private String expresionUnaria(GramaticaParser.ExpresionUnariaContext ctx) {
        if (ctx.expresionUnaria() != null) {
            String valor = expresionUnaria(ctx.expresionUnaria());
            String op = operadorCpp(ctx.getStart().getText());


            if (esValorSimple(valor)) {
                return op + valor;
            }

            String t = nuevoTemporal();
            escribir(t + " = " + op + valor + ";");
            return t;
        }

        return expresionPrimaria(ctx.expresionPrimaria());
    }

    private String expresionPrimaria(GramaticaParser.ExpresionPrimariaContext ctx) {
        if (ctx.expresion() != null) {
            return generarExpresion(ctx.expresion());
        }

if (ctx.llamadaFuncion() != null) {
    return llamadaFuncion(ctx.llamadaFuncion());
}

        if (ctx.accesoArreglo() != null) {
    return accesoArreglo(ctx.accesoArreglo());
        }

        if (ctx.accesoCampo() != null) {
            return accesoCampo(ctx.accesoCampo());
        }

        return literal(ctx.literal());
    }

    private boolean esValorSimple(String valor) {
        if (valor == null || valor.isEmpty()) {
            return false;
        }

        if (valor.startsWith("\"") && valor.endsWith("\"")) {
            return true;
        }

        if (valor.equals("true") || valor.equals("false")) {
            return true;
        }

        if (valor.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }

        if (valor.matches("[0-9]+(\\.[0-9]+)?")) {
            return true;
        }

        return false;
    }

    private String literal(GramaticaParser.LiteralContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            return ctx.IDENTIFICADOR().getText();
        }

        if (ctx.NUMERO() != null) {
            return ctx.NUMERO().getText();
        }

        if (ctx.cadenaLiteral() != null) {
            return cadena(ctx.cadenaLiteral());
        }

        if (ctx.PAL_VERDAD() != null) {
            return "true";
        }

        if (ctx.PAL_MENTIRA() != null) {
            return "false";
        }
        if (ctx.PAL_SALTO() != null) {
            return "\"\\n\"";
            }

        return "";
    }

    private String accesoArreglo(GramaticaParser.AccesoArregloContext ctx) {
        String indice = generarExpresion(ctx.expresion());
        return ctx.IDENTIFICADOR().getText() + "[" + indice + "]";
    }

    private String llamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.IDENTIFICADOR().getText()).append("(");

        if (ctx.argumentos() != null) {
            for (int i = 0; i < ctx.argumentos().expresion().size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }

                sb.append(generarExpresion(ctx.argumentos().expresion(i)));
            }
        }

        sb.append(")");
        return sb.toString();
    }

    private String cadena(GramaticaParser.CadenaLiteralContext ctx) {
        String contenido = "";

        if (ctx.TEXTO_CADENA() != null) {
            contenido = ctx.TEXTO_CADENA().getText();
        }

        contenido = contenido.replace("\\", "\\\\").replace("\"", "\\\"");
        return "\"" + contenido + "\"";
    }

    private String valorCaso(GramaticaParser.ValorCasoContext ctx) {
        if (ctx.NUMERO() != null) {
            return ctx.NUMERO().getText();
        }

        if (ctx.cadenaLiteral() != null) {
            return cadena(ctx.cadenaLiteral());
        }

        if (ctx.PAL_VERDAD() != null) {
            return "true";
        }

        if (ctx.PAL_MENTIRA() != null) {
            return "false";
        }

        return "";
    }
    
    private String accesoCampo(GramaticaParser.AccesoCampoContext ctx) {
    StringBuilder sb = new StringBuilder();

    sb.append(ctx.IDENTIFICADOR(0).getText());

    for (int i = 1; i < ctx.IDENTIFICADOR().size(); i++) {
        sb.append(".").append(ctx.IDENTIFICADOR(i).getText());
    }

    return sb.toString();
}

private String destinoAsignacion(GramaticaParser.DestinoAsignacionContext ctx) {
    if (ctx.IDENTIFICADOR() != null) {
        return ctx.IDENTIFICADOR().getText();
    }

    if (ctx.accesoArreglo() != null) {
        return accesoArreglo(ctx.accesoArreglo());
    }

    if (ctx.accesoCampo() != null) {
        return accesoCampo(ctx.accesoCampo());
    }

    return "";
}

private String inicializadorLista(GramaticaParser.InicializadorListaContext ctx) {
    StringBuilder sb = new StringBuilder();

    sb.append("{");

    for (int i = 0; i < ctx.expresion().size(); i++) {
        if (i > 0) {
            sb.append(", ");
        }

        sb.append(generarExpresion(ctx.expresion(i)));
    }

    sb.append("}");

    return sb.toString();
}
}