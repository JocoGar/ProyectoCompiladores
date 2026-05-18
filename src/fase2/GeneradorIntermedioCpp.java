package fase2;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lexerparser.GramaticaParser;
import lexerparser.GramaticaParserBaseVisitor;

public class GeneradorIntermedioCpp extends GramaticaParserBaseVisitor<Void> {

    private static class VariableC3D {
        String nombreOriginal;
        String temporal;
        String tipoCpp;
        boolean arreglo;
        String tamanio;

        VariableC3D(String nombreOriginal, String temporal, String tipoCpp, boolean arreglo, String tamanio) {
            this.nombreOriginal = nombreOriginal;
            this.temporal = temporal;
            this.tipoCpp = tipoCpp;
            this.arreglo = arreglo;
            this.tamanio = tamanio;
        }
    }

    private final StringBuilder codigo;
    private final StringBuilder funciones;
    private final StringBuilder registros;
    private final StringBuilder inicializacionesGlobales;

    private final List<String> declaracionesGlobales;
    private final Set<String> globalesDeclaradas;

    private StringBuilder cuerpoActual;
    private final List<String> declaracionesActuales;
    private final Set<String> declaradosActuales;
    private final Set<String> parametrosReferenciaActuales;

    private final Map<String, VariableC3D> variablesActuales;
    private final Map<String, VariableC3D> variablesGlobales;

    private final Map<String, String> tiposTemporales;
    private final Map<String, String> tiposFunciones;

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
        this.parametrosReferenciaActuales = new HashSet<>();

        this.variablesActuales = new LinkedHashMap<>();
        this.variablesGlobales = new LinkedHashMap<>();

        this.tiposTemporales = new HashMap<>();
        this.tiposFunciones = new HashMap<>();

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
        variablesActuales.clear();
        parametrosReferenciaActuales.clear();
        tiposTemporales.clear();
    }

    private String finalizarBloque() {
        String cuerpoOptimizado = optimizarCopiasTemporales(cuerpoActual.toString());
        cuerpoOptimizado = eliminarGotosConsecutivos(cuerpoOptimizado);
        cuerpoOptimizado = optimizarCodigoMuerto(cuerpoOptimizado);

        StringBuilder salida = new StringBuilder();

        for (String declaracion : declaracionesActuales) {
            String temp = extraerTemporalDeclarado(declaracion);

            if (temp.isEmpty() || apareceTemporal(cuerpoOptimizado, temp)) {
                salida.append("    ").append(declaracion).append("\n");
            }
        }

        if (salida.length() > 0) {
            salida.append("\n");
        }

        salida.append(cuerpoOptimizado);

        cuerpoActual = null;
        declaracionesActuales.clear();
        declaradosActuales.clear();
        variablesActuales.clear();
        parametrosReferenciaActuales.clear();
        tiposTemporales.clear();

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

    private String nuevoNombreTemporal() {
        temporal++;
        return "t" + temporal;
    }

    private String nuevoTemporal() {
        return nuevoTemporalTipo("int");
    }

    private String nuevoTemporalTipo(String tipoCpp) {
        String t = nuevoNombreTemporal();
        tiposTemporales.put(t, tipoCpp);

        if (procesandoGlobales) {
            declararGlobal(tipoCpp + " " + t + ";", t);
        } else if (cuerpoActual != null) {
            declarar(tipoCpp + " " + t + ";", t);
        }

        return t;
    }

    private String declararTemporalUsuario(String nombreOriginal, String tipoCpp, boolean arreglo, String tamanio) {
        String temp = nuevoNombreTemporal();
        tiposTemporales.put(temp, tipoCpp);

        VariableC3D variable = new VariableC3D(nombreOriginal, temp, tipoCpp, arreglo, tamanio);

        if (procesandoGlobales) {
            variablesGlobales.put(nombreOriginal, variable);

            if (arreglo) {
                declararGlobal(tipoCpp + " " + temp + "[" + tamanio + "];", temp);
            } else {
                declararGlobal(tipoCpp + " " + temp + ";", temp);
            }

            return temp;
        }

        variablesActuales.put(nombreOriginal, variable);

        if (arreglo) {
            declarar(tipoCpp + " " + temp + "[" + tamanio + "];", temp);
        } else {
            declarar(tipoCpp + " " + temp + ";", temp);
        }

        return temp;
    }

    private String declararTemporalParametro(String nombreOriginal, String tipoCpp) {
        String temp = nuevoNombreTemporal();
        tiposTemporales.put(temp, tipoCpp);

        VariableC3D variable = new VariableC3D(nombreOriginal, temp, tipoCpp, false, "");
        variablesActuales.put(nombreOriginal, variable);

        return temp;
    }

    private String resolverIdentificador(String nombre) {
        if (variablesActuales.containsKey(nombre)) {
            return variablesActuales.get(nombre).temporal;
        }

        if (variablesGlobales.containsKey(nombre)) {
            return variablesGlobales.get(nombre).temporal;
        }

        return nombre;
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
            default:
                return op;
        }
    }

    @Override
    public Void visitPrograma(GramaticaParser.ProgramaContext ctx) {
        codigo.append("#include <iostream>\n");
        codigo.append("#include <string>\n");
        codigo.append("using namespace std;\n\n");

        codigo.append("// Codigo de tres direcciones\n");

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

        tiposFunciones.put(nombre, tipo);

        iniciarBloque();

        StringBuilder parametros = new StringBuilder();

        if (ctx.parametros() != null) {
            for (int i = 0; i < ctx.parametros().parametro().size(); i++) {
                GramaticaParser.ParametroContext p = ctx.parametros().parametro(i);

                if (i > 0) {
                    parametros.append(", ");
                }

                String tipoParametro = tipoCpp(p.tipoGeneral().getText());
                String nombreOriginal = p.IDENTIFICADOR().getText();
                String tempParametro = declararTemporalParametro(nombreOriginal, tipoParametro);

                if (p.PAL_REFERENCIA() != null) {
                    parametrosReferenciaActuales.add(tempParametro);
                }

                parametros.append(tipoParametro);

                if (p.PAL_REFERENCIA() != null) {
                    parametros.append(" &");
                } else {
                    parametros.append(" ");
                }

                parametros.append(tempParametro);
            }
        }

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
        String nombreOriginal = ctx.IDENTIFICADOR().getText();

        String temp = declararTemporalUsuario(nombreOriginal, tipo, false, "");

        if (ctx.expresion() != null) {
            String valor = generarExpresion(ctx.expresion());
            escribir(temp + " = " + valor + ";");
        } else if (ctx.inicializadorLista() != null) {
            escribir(temp + " = " + inicializadorLista(ctx.inicializadorLista()) + ";");
        }

        return null;
    }

    @Override
    public Void visitDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx) {
        String tipo = tipoCpp(ctx.tipoGeneral().getText());
        String nombreOriginal = ctx.IDENTIFICADOR().getText();

        String tamanio = "";

        if (ctx.NUMERO() != null) {
            tamanio = ctx.NUMERO().getText();
        } else if (ctx.inicializadorLista() != null) {
            tamanio = String.valueOf(ctx.inicializadorLista().expresion().size());
        }

        String temp = nuevoNombreTemporal();
        tiposTemporales.put(temp, tipo);

        VariableC3D variable = new VariableC3D(nombreOriginal, temp, tipo, true, tamanio);

        String declaracion = tipo + " " + temp + "[" + tamanio + "]";

        if (ctx.inicializadorLista() != null) {
            declaracion += " = " + inicializadorLista(ctx.inicializadorLista());
        }

        declaracion += ";";

        if (procesandoGlobales) {
            variablesGlobales.put(nombreOriginal, variable);
            declararGlobal(declaracion, temp);
        } else {
            variablesActuales.put(nombreOriginal, variable);
            declarar(declaracion, temp);
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
        String operadorOriginal = ctx.getChild(1).getText();

        String operador;

        switch (operadorOriginal) {
            case "aumenta":
                operador = "+";
                break;
            case "reduce":
                operador = "-";
                break;
            case "escala":
                operador = "*";
                break;
            case "divide":
                operador = "/";
                break;
            default:
                operador = "";
                break;
        }

        String temp = nuevoTemporalTipo(tipoDeExpresion(destino));
        escribir(temp + " = " + destino + " " + operador + " " + valor + ";");
        escribir(destino + " = " + temp + ";");

        return null;
    }

        @Override
        public Void visitInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx) {
            StringBuilder salida = new StringBuilder();

            salida.append("cout");

            for (GramaticaParser.ExpresionContext expresion : ctx.expresion()) {
                String valor = generarExpresion(expresion);
                salida.append(" << ").append(valor);
            }

            salida.append(" << endl;");

            escribir(salida.toString());

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
        String destino = destinoAsignacion(ctx.destinoAsignacion());
        String temp = nuevoTemporalTipo(tipoDeExpresion(destino));

        if (ctx.getText().contains("subir")) {
            escribir(temp + " = " + destino + " + 1;");
        } else {
            escribir(temp + " = " + destino + " - 1;");
        }

        escribir(destino + " = " + temp + ";");

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

            String tempCondicion = nuevoTemporalTipo("bool");
            escribir(tempCondicion + " = " + evaluado + " == " + valor + ";");
            escribir("if (" + tempCondicion + ") goto " + etiquetasCasos[i] + ";");
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
            String nombreOriginal = d.IDENTIFICADOR().getText();
            String temp = declararTemporalUsuario(nombreOriginal, tipo, false, "");

            if (d.expresion() != null) {
                String valor = generarExpresion(d.expresion());
                escribir(temp + " = " + valor + ";");
            }

            return;
        }

        if (ctx.asignacionSimple() != null) {
            GramaticaParser.AsignacionSimpleContext a = ctx.asignacionSimple();
            String destino = resolverIdentificador(a.IDENTIFICADOR().getText());
            String valor = generarExpresion(a.expresion());
            escribir(destino + " = " + valor + ";");
        }
    }

    private void generarActualizacionPara(GramaticaParser.ActualizacionParaContext ctx) {
        if (ctx.actualizacion() != null) {
            visit(ctx.actualizacion());
            return;
        }

        if (ctx.asignacionSimple() != null) {
            GramaticaParser.AsignacionSimpleContext a = ctx.asignacionSimple();
            String destino = resolverIdentificador(a.IDENTIFICADOR().getText());
            String valor = generarExpresion(a.expresion());
            escribir(destino + " = " + valor + ";");
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

            izquierda = emitirOperacionC3D(izquierda, op, derecha);
        }

        return izquierda;
    }

    private String expresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx) {
        String izquierda = expresionAditiva(ctx.expresionAditiva(0));

        for (int i = 1; i < ctx.expresionAditiva().size(); i++) {
            String derecha = expresionAditiva(ctx.expresionAditiva(i));
            String op = operadorCpp(ctx.getChild((i * 2) - 1).getText());

            izquierda = emitirOperacionC3D(izquierda, op, derecha);
        }

        return izquierda;
    }

    private String expresionAditiva(GramaticaParser.ExpresionAditivaContext ctx) {
        String izquierda = expresionMultiplicativa(ctx.expresionMultiplicativa(0));

        for (int i = 1; i < ctx.expresionMultiplicativa().size(); i++) {
            String derecha = expresionMultiplicativa(ctx.expresionMultiplicativa(i));
            String op = operadorCpp(ctx.getChild((i * 2) - 1).getText());

            izquierda = emitirOperacionC3D(izquierda, op, derecha);
        }

        return izquierda;
    }

    private String expresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx) {
        String izquierda = expresionUnaria(ctx.expresionUnaria(0));

        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            String derecha = expresionUnaria(ctx.expresionUnaria(i));
            String operadorOriginal = ctx.getChild((i * 2) - 1).getText();
            String op = operadorCpp(operadorOriginal);

            if (operadorOriginal.equals("sobra")) {
                String plegado = plegarConstantes(izquierda, "%", derecha);

                if (plegado != null) {
                    izquierda = plegado;
                } else {
                    String temp = nuevoTemporalTipo("int");
                    escribir(temp + " = (int)" + izquierda + " % (int)" + derecha + ";");
                    izquierda = temp;
                }
            } else {
                izquierda = emitirOperacionC3D(izquierda, op, derecha);
            }
        }

        return izquierda;
    }

    private String expresionUnaria(GramaticaParser.ExpresionUnariaContext ctx) {
        if (ctx.expresionUnaria() != null) {
            String valor = expresionUnaria(ctx.expresionUnaria());
            String op = operadorCpp(ctx.getStart().getText());

            String tipoTemp = op.equals("!") ? "bool" : tipoDeExpresion(valor);
            String temp = nuevoTemporalTipo(tipoTemp);

            escribir(temp + " = " + op + valor + ";");

            return temp;
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

    private String literal(GramaticaParser.LiteralContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            return resolverIdentificador(ctx.IDENTIFICADOR().getText());
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
        String base = resolverIdentificador(ctx.IDENTIFICADOR().getText());

        return base + "[" + indice + "]";
    }

    private String accesoCampo(GramaticaParser.AccesoCampoContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(resolverIdentificador(ctx.IDENTIFICADOR(0).getText()));

        for (int i = 1; i < ctx.IDENTIFICADOR().size(); i++) {
            sb.append(".").append(ctx.IDENTIFICADOR(i).getText());
        }

        return sb.toString();
    }

    private String destinoAsignacion(GramaticaParser.DestinoAsignacionContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            return resolverIdentificador(ctx.IDENTIFICADOR().getText());
        }

        if (ctx.accesoArreglo() != null) {
            return accesoArreglo(ctx.accesoArreglo());
        }

        if (ctx.accesoCampo() != null) {
            return accesoCampo(ctx.accesoCampo());
        }

        return "";
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

    private boolean esNumero(String valor) {
        if (valor == null) {
            return false;
        }

        return valor.matches("-?[0-9]+(\\.[0-9]+)?");
    }

    private boolean esCero(String valor) {
        return esNumero(valor) && Double.parseDouble(valor) == 0.0;
    }

    private boolean esUno(String valor) {
        return esNumero(valor) && Double.parseDouble(valor) == 1.0;
    }

    private String quitarDecimalSiEntero(double valor) {
        if (valor == Math.rint(valor)) {
            return String.valueOf((long) valor);
        }

        return String.valueOf(valor);
    }

    private String plegarConstantes(String izquierda, String operador, String derecha) {
        if (!esNumero(izquierda) || !esNumero(derecha)) {
            return null;
        }

        double a = Double.parseDouble(izquierda);
        double b = Double.parseDouble(derecha);

        switch (operador) {
            case "+":
                return quitarDecimalSiEntero(a + b);
            case "-":
                return quitarDecimalSiEntero(a - b);
            case "*":
                return quitarDecimalSiEntero(a * b);
            case "/":
                if (b == 0) {
                    return null;
                }
                return quitarDecimalSiEntero(a / b);
            case "%":
                if (b == 0) {
                    return null;
                }
                return quitarDecimalSiEntero((int) a % (int) b);
            case ">":
                return a > b ? "true" : "false";
            case "<":
                return a < b ? "true" : "false";
            case ">=":
                return a >= b ? "true" : "false";
            case "<=":
                return a <= b ? "true" : "false";
            case "==":
                return a == b ? "true" : "false";
            case "!=":
                return a != b ? "true" : "false";
            default:
                return null;
        }
    }

    private String simplificarIdentidad(String izquierda, String operador, String derecha) {
        switch (operador) {
            case "+":
                if (esCero(derecha)) {
                    return izquierda;
                }
                if (esCero(izquierda)) {
                    return derecha;
                }
                break;

            case "-":
                if (esCero(derecha)) {
                    return izquierda;
                }
                break;

            case "*":
                if (esUno(derecha)) {
                    return izquierda;
                }
                if (esUno(izquierda)) {
                    return derecha;
                }
                if (esCero(derecha) || esCero(izquierda)) {
                    return "0";
                }
                break;

            case "/":
                if (esUno(derecha)) {
                    return izquierda;
                }
                break;
        }

        return null;
    }

    private String emitirOperacionC3D(String izquierda, String operador, String derecha) {
        String plegado = plegarConstantes(izquierda, operador, derecha);

        if (plegado != null) {
            return plegado;
        }

        String simplificado = simplificarIdentidad(izquierda, operador, derecha);

        if (simplificado != null) {
            return simplificado;
        }

        String tipoTemp = tipoResultadoOperacion(operador, izquierda, derecha);
        String temp = nuevoTemporalTipo(tipoTemp);

        escribir(temp + " = " + izquierda + " " + operador + " " + derecha + ";");

        return temp;
    }

    private String tipoDeIdentificador(String nombre) {
        VariableC3D variable = variablesActuales.get(nombre);

        if (variable != null) {
            return variable.tipoCpp;
        }

        variable = variablesGlobales.get(nombre);

        if (variable != null) {
            return variable.tipoCpp;
        }

        for (VariableC3D v : variablesActuales.values()) {
            if (v.temporal.equals(nombre)) {
                return v.tipoCpp;
            }
        }

        for (VariableC3D v : variablesGlobales.values()) {
            if (v.temporal.equals(nombre)) {
                return v.tipoCpp;
            }
        }

        return null;
    }

    private String tipoDeExpresion(String valor) {
        if (valor == null || valor.isEmpty()) {
            return "int";
        }

        String tipoTemporal = tiposTemporales.get(valor);

        if (tipoTemporal != null) {
            return tipoTemporal;
        }

        String tipoIdentificador = tipoDeIdentificador(valor);

        if (tipoIdentificador != null) {
            return tipoIdentificador;
        }

        Matcher llamada = Pattern.compile("^([a-zA-Z_][a-zA-Z0-9_]*)\\s*\\(").matcher(valor);

        if (llamada.find()) {
            return tiposFunciones.getOrDefault(llamada.group(1), "int");
        }

        if (valor.matches("-?\\d+\\.\\d+")) {
            return "double";
        }

        if (valor.matches("-?\\d+")) {
            return "int";
        }

        if ("true".equals(valor) || "false".equals(valor)) {
            return "bool";
        }

        if (valor.startsWith("\"") && valor.endsWith("\"")) {
            return "string";
        }

        if (valor.contains("[")) {
            String base = valor.substring(0, valor.indexOf('['));
            return tipoDeExpresion(base);
        }

        if (valor.contains(".")) {
            return "int";
        }

        return "int";
    }

    private String tipoResultadoOperacion(String operador, String izquierda, String derecha) {
        if (operador.equals("!")
                || operador.equals("&&")
                || operador.equals("||")
                || operador.equals(">")
                || operador.equals("<")
                || operador.equals(">=")
                || operador.equals("<=")
                || operador.equals("==")
                || operador.equals("!=")) {
            return "bool";
        }

        if (operador.equals("%")) {
            return "int";
        }

        String ti = tipoDeExpresion(izquierda);
        String td = tipoDeExpresion(derecha);

        if ("double".equals(ti) || "double".equals(td)) {
            return "double";
        }

        if ("float".equals(ti) || "float".equals(td)) {
            return "float";
        }

        return "int";
    }

    private String optimizarCopiasTemporales(String cuerpo) {
        String[] lineas = cuerpo.split("\\R");
        boolean[] eliminar = new boolean[lineas.length];

        Pattern operacionTemporal = Pattern.compile(
                "^(t\\d+)\\s*=\\s*(t\\d+|[a-zA-Z_][a-zA-Z0-9_]*|\\d+(?:\\.\\d+)?)\\s*"
                + "([+\\-*/%]|>=|<=|==|!=|>|<|&&|\\|\\|)\\s*"
                + "(t\\d+|[a-zA-Z_][a-zA-Z0-9_]*|\\d+(?:\\.\\d+)?);$"
        );

        Pattern copiaTemporal = Pattern.compile("^(t\\d+)\\s*=\\s*(t\\d+);$");

        for (int i = 0; i < lineas.length - 1; i++) {
            String actual = lineas[i].trim();
            String siguiente = lineas[i + 1].trim();

            Matcher m1 = operacionTemporal.matcher(actual);

            if (!m1.find()) {
                continue;
            }

            String temporalIntermedio = m1.group(1);
            String expresion = m1.group(2) + " " + m1.group(3) + " " + m1.group(4);

            Matcher m2 = copiaTemporal.matcher(siguiente);

            if (!m2.find()) {
                continue;
            }

            String temporalDestino = m2.group(1);
            String copiaFuente = m2.group(2);

            if (!copiaFuente.equals(temporalIntermedio)) {
                continue;
            }

            if (temporalUsadoDespues(lineas, temporalIntermedio, i + 1)) {
                continue;
            }

            lineas[i + 1] = temporalDestino + " = " + expresion + ";";
            eliminar[i] = true;
        }

        return reconstruirLineas(lineas, eliminar);
    }

    private String eliminarGotosConsecutivos(String cuerpo) {
        String[] lineas = cuerpo.split("\\R");
        StringBuilder sb = new StringBuilder();

        String anterior = null;

        for (String lineaOriginal : lineas) {
            String linea = lineaOriginal.trim();

            if (linea.isEmpty()) {
                continue;
            }

            if (linea.equals(anterior) && linea.matches("^goto\\s+L\\d+;$")) {
                continue;
            }

            if (linea.matches("^L\\d+:;?$")) {
                sb.append(linea).append("\n");
            } else {
                sb.append("    ").append(linea).append("\n");
            }

            anterior = linea;
        }

        return sb.toString();
    }

    private boolean temporalUsadoDespues(String[] lineas, String temporal, int desde) {
        Pattern p = Pattern.compile("\\b" + Pattern.quote(temporal) + "\\b");

        for (int i = desde + 1; i < lineas.length; i++) {
            if (p.matcher(lineas[i]).find()) {
                return true;
            }
        }

        return false;
    }

    private String optimizarCodigoMuerto(String cuerpo) {
        String[] lineas = cuerpo.split("\\R");
        boolean[] eliminar = new boolean[lineas.length];

        boolean cambio;

        do {
            cambio = false;

            for (int i = 0; i < lineas.length; i++) {
                if (eliminar[i]) {
                    continue;
                }

                String linea = lineas[i].trim();

                Matcher m = Pattern.compile("^(t\\d+)\\s*=\\s*(.+);$").matcher(linea);

                if (!m.find()) {
                    continue;
                }

                String destino = m.group(1);
                String derecha = m.group(2);

                if (parametrosReferenciaActuales.contains(destino)) {
                    continue;
                }

                if (tieneEfectoLateral(derecha)) {
                    continue;
                }

                boolean usadoEnOtraParte = false;

                for (int j = 0; j < lineas.length; j++) {
                    if (i == j || eliminar[j]) {
                        continue;
                    }

                    if (apareceTemporal(lineas[j], destino)) {
                        usadoEnOtraParte = true;
                        break;
                    }
                }

                if (!usadoEnOtraParte) {
                    eliminar[i] = true;
                    cambio = true;
                }
            }
        } while (cambio);

        return reconstruirLineas(lineas, eliminar);
    }

    private String reconstruirLineas(String[] lineas, boolean[] eliminar) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lineas.length; i++) {
            if (!eliminar[i] && !lineas[i].trim().isEmpty()) {
                String linea = lineas[i].trim();

                if (linea.matches("^L\\d+:;?$")) {
                    sb.append(linea).append("\n");
                } else {
                    sb.append("    ").append(linea).append("\n");
                }
            }
        }

        return sb.toString();
    }

    private String extraerTemporalDeclarado(String declaracion) {
        Pattern p = Pattern.compile("\\b(t\\d+)\\b");
        Matcher m = p.matcher(declaracion);

        if (m.find()) {
            return m.group(1);
        }

        return "";
    }

    private boolean apareceTemporal(String texto, String temporal) {
        return Pattern.compile("\\b" + Pattern.quote(temporal) + "\\b").matcher(texto).find();
    }

    private boolean tieneEfectoLateral(String derecha) {
        if (derecha.contains("cin") || derecha.contains("cout") || derecha.contains("return")) {
            return true;
        }

        return Pattern.compile("\\b[a-zA-Z_][a-zA-Z0-9_]*\\s*\\(").matcher(derecha).find();
    }
}