/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

/**
 *
 * @author 1jose
 */

import java.util.ArrayList;
import java.util.List;
import lexerparser.GramaticaParser;
import lexerparser.GramaticaParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import proyectocompilador.ErrorInfo;

public class AnalizadorSemantico extends GramaticaParserBaseVisitor<TipoDato> {

    private final TablaSimbolos tabla;
    private final List<ErrorInfo> errores;
    private TipoDato tipoFuncionActual;
    private String nombreFuncionActual;
    private boolean dentroFuncion;

    public AnalizadorSemantico() {
        this.tabla = new TablaSimbolos();
        this.errores = new ArrayList<>();
        this.tipoFuncionActual = TipoDato.VACIO;
        this.nombreFuncionActual = "";
        this.dentroFuncion = false;
    }

    public TablaSimbolos getTabla() {
        return tabla;
    }

    public List<ErrorInfo> getErrores() {
        return errores;
    }

    public boolean tieneErrores() {
        return !errores.isEmpty();
    }

    private void agregarError(Token token, String lexema, String mensaje) {
        errores.add(new ErrorInfo(
                "Semántico",
                token != null ? token.getLine() : 0,
                token != null ? token.getCharPositionInLine() : 0,
                lexema,
                mensaje
        ));
    }

    private TipoDato tipoVariable(GramaticaParser.TipoVariableContext ctx) {
        return TipoDato.desdeTexto(ctx.getText());
    }

    private TipoDato tipoRetorno(GramaticaParser.TipoRetornoContext ctx) {
        return TipoDato.desdeTexto(ctx.getText());
    }

    @Override
    public TipoDato visitPrograma(GramaticaParser.ProgramaContext ctx) {
        visit(ctx.seccionGlobales());

        for (GramaticaParser.DeclaracionFuncionContext funcion : ctx.seccionFunciones().declaracionFuncion()) {
            registrarFirmaFuncion(funcion);
        }

        for (GramaticaParser.DeclaracionFuncionContext funcion : ctx.seccionFunciones().declaracionFuncion()) {
            analizarFuncion(funcion);
        }

        visit(ctx.bloquePrincipal());

        return TipoDato.VACIO;
    }

    private void registrarFirmaFuncion(GramaticaParser.DeclaracionFuncionContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();
        TipoDato tipo = tipoRetorno(ctx.tipoRetorno());

        Simbolo funcion = new Simbolo(
                nombre,
                tipo,
                "función",
                tabla.getNombreAmbitoActual(),
                tabla.getNivelAmbitoActual(),
                tokenId.getLine(),
                tokenId.getCharPositionInLine()
        );

        if (ctx.parametros() != null) {
            for (GramaticaParser.ParametroContext p : ctx.parametros().parametro()) {
                funcion.agregarParametro(tipoVariable(p.tipoVariable()));
            }
        }

        if (!tabla.declarar(funcion)) {
            agregarError(tokenId, nombre, "La función '" + nombre + "' ya fue declarada en este ámbito.");
        }
    }

    private void analizarFuncion(GramaticaParser.DeclaracionFuncionContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        TipoDato tipoAnterior = tipoFuncionActual;
        String nombreAnterior = nombreFuncionActual;
        boolean estabaDentro = dentroFuncion;

        tipoFuncionActual = tipoRetorno(ctx.tipoRetorno());
        nombreFuncionActual = nombre;
        dentroFuncion = true;

        tabla.entrarAmbito("función_" + nombre);

        if (ctx.parametros() != null) {
            for (GramaticaParser.ParametroContext p : ctx.parametros().parametro()) {
                Token tokenParam = p.IDENTIFICADOR().getSymbol();
                String nombreParam = tokenParam.getText();
                TipoDato tipoParam = tipoVariable(p.tipoVariable());

                Simbolo parametro = new Simbolo(
                        nombreParam,
                        tipoParam,
                        "parámetro",
                        tabla.getNombreAmbitoActual(),
                        tabla.getNivelAmbitoActual(),
                        tokenParam.getLine(),
                        tokenParam.getCharPositionInLine()
                );

                if (!tabla.declarar(parametro)) {
                    agregarError(tokenParam, nombreParam, "El parámetro '" + nombreParam + "' ya fue declarado en la función '" + nombre + "'.");
                }
            }
        }

        visit(ctx.bloque());

        tabla.salirAmbito();

        tipoFuncionActual = tipoAnterior;
        nombreFuncionActual = nombreAnterior;
        dentroFuncion = estabaDentro;
    }

    @Override
    public TipoDato visitBloquePrincipal(GramaticaParser.BloquePrincipalContext ctx) {
        tabla.entrarAmbito("raiz");
        visit(ctx.bloque());
        tabla.salirAmbito();
        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();
        TipoDato tipo = tipoVariable(ctx.tipoVariable());

        Simbolo simbolo = new Simbolo(
                nombre,
                tipo,
                "variable",
                tabla.getNombreAmbitoActual(),
                tabla.getNivelAmbitoActual(),
                tokenId.getLine(),
                tokenId.getCharPositionInLine()
        );

        if (!tabla.declarar(simbolo)) {
            agregarError(tokenId, nombre, "La variable '" + nombre + "' ya fue declarada en este ámbito.");
        }

        if (ctx.expresion() != null) {
            TipoDato tipoExpresion = visit(ctx.expresion());

            if (!tipoExpresion.compatibleCon(tipo)) {
                agregarError(tokenId, nombre, "No se puede asignar una expresión de tipo " + tipoExpresion + " a la variable '" + nombre + "' de tipo " + tipo + ".");
            }
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();
        TipoDato tipo = tipoVariable(ctx.tipoVariable());

        Simbolo simbolo = new Simbolo(
                nombre,
                tipo,
                "arreglo",
                tabla.getNombreAmbitoActual(),
                tabla.getNivelAmbitoActual(),
                tokenId.getLine(),
                tokenId.getCharPositionInLine()
        );

        try {
            int tamanio = Integer.parseInt(ctx.NUMERO().getText());
            simbolo.setTamanioArreglo(tamanio);

            if (tamanio <= 0) {
                agregarError(ctx.NUMERO().getSymbol(), ctx.NUMERO().getText(), "El tamaño del arreglo debe ser mayor que cero.");
            }
        } catch (Exception e) {
            agregarError(ctx.NUMERO().getSymbol(), ctx.NUMERO().getText(), "El tamaño del arreglo no es válido.");
        }

        if (!tabla.declarar(simbolo)) {
            agregarError(tokenId, nombre, "El arreglo '" + nombre + "' ya fue declarado en este ámbito.");
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitAsignacion(GramaticaParser.AsignacionContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        Simbolo simbolo = tabla.buscar(nombre);

        if (simbolo == null) {
            agregarError(tokenId, nombre, "La variable '" + nombre + "' no ha sido declarada.");
            visit(ctx.expresion());
            return TipoDato.ERROR;
        }

        if (simbolo.getRol().equals("función")) {
            agregarError(tokenId, nombre, "No se puede asignar un valor directamente a una función.");
            return TipoDato.ERROR;
        }

        if (simbolo.getRol().equals("arreglo")) {
            agregarError(tokenId, nombre, "El identificador '" + nombre + "' es un arreglo. Debes indicar una posición.");
            return TipoDato.ERROR;
        }

        TipoDato tipoExpresion = visit(ctx.expresion());

        if (!tipoExpresion.compatibleCon(simbolo.getTipo())) {
            agregarError(tokenId, nombre, "No se puede asignar una expresión de tipo " + tipoExpresion + " a la variable '" + nombre + "' de tipo " + simbolo.getTipo() + ".");
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitAsignacionArreglo(GramaticaParser.AsignacionArregloContext ctx) {
        TipoDato tipoArreglo = visit(ctx.accesoArreglo());
        TipoDato tipoExpresion = visit(ctx.expresion());

        if (!tipoExpresion.compatibleCon(tipoArreglo)) {
            Token token = ctx.accesoArreglo().IDENTIFICADOR().getSymbol();
            agregarError(token, token.getText(), "El valor asignado al arreglo no es compatible. Se esperaba " + tipoArreglo + " y se recibió " + tipoExpresion + ".");
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitAccesoArreglo(GramaticaParser.AccesoArregloContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        Simbolo simbolo = tabla.buscar(nombre);

        if (simbolo == null) {
            agregarError(tokenId, nombre, "El arreglo '" + nombre + "' no ha sido declarado.");
            visit(ctx.expresion());
            return TipoDato.ERROR;
        }

        if (!simbolo.getRol().equals("arreglo")) {
            agregarError(tokenId, nombre, "El identificador '" + nombre + "' no es un arreglo.");
            visit(ctx.expresion());
            return TipoDato.ERROR;
        }

        TipoDato tipoIndice = visit(ctx.expresion());

        if (tipoIndice != TipoDato.NUM && tipoIndice != TipoDato.ERROR) {
            agregarError(tokenId, nombre, "El índice del arreglo '" + nombre + "' debe ser de tipo NUM.");
        }

        return simbolo.getTipo();
    }

    @Override
    public TipoDato visitActualizacion(GramaticaParser.ActualizacionContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        Simbolo simbolo = tabla.buscar(nombre);

        if (simbolo == null) {
            agregarError(tokenId, nombre, "La variable '" + nombre + "' no ha sido declarada.");
            return TipoDato.ERROR;
        }

        if (!simbolo.getTipo().esNumerico()) {
            agregarError(tokenId, nombre, "Solo se puede usar subir/bajar con variables numéricas.");
            return TipoDato.ERROR;
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitDeclaracionPara(GramaticaParser.DeclaracionParaContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();
        TipoDato tipo = tipoVariable(ctx.tipoVariable());

        Simbolo simbolo = new Simbolo(
                nombre,
                tipo,
                "variable",
                tabla.getNombreAmbitoActual(),
                tabla.getNivelAmbitoActual(),
                tokenId.getLine(),
                tokenId.getCharPositionInLine()
        );

        if (!tabla.declarar(simbolo)) {
            agregarError(tokenId, nombre, "La variable '" + nombre + "' ya fue declarada en este ámbito.");
        }

        if (ctx.expresion() != null) {
            TipoDato tipoExpresion = visit(ctx.expresion());

            if (!tipoExpresion.compatibleCon(tipo)) {
                agregarError(tokenId, nombre, "No se puede inicializar '" + nombre + "' con una expresión de tipo " + tipoExpresion + ".");
            }
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitAsignacionSimple(GramaticaParser.AsignacionSimpleContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        Simbolo simbolo = tabla.buscar(nombre);

        if (simbolo == null) {
            agregarError(tokenId, nombre, "La variable '" + nombre + "' no ha sido declarada.");
            visit(ctx.expresion());
            return TipoDato.ERROR;
        }

        TipoDato tipoExpresion = visit(ctx.expresion());

        if (!tipoExpresion.compatibleCon(simbolo.getTipo())) {
            agregarError(tokenId, nombre, "No se puede asignar tipo " + tipoExpresion + " a la variable '" + nombre + "' de tipo " + simbolo.getTipo() + ".");
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitLlamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx) {
        Token tokenId = ctx.IDENTIFICADOR().getSymbol();
        String nombre = tokenId.getText();

        Simbolo funcion = tabla.buscarGlobal(nombre);

        if (funcion == null || !funcion.getRol().equals("función")) {
            agregarError(tokenId, nombre, "La función '" + nombre + "' no ha sido declarada.");
            if (ctx.argumentos() != null) {
                visit(ctx.argumentos());
            }
            return TipoDato.ERROR;
        }

        int esperados = funcion.getParametros().size();
        int recibidos = ctx.argumentos() == null ? 0 : ctx.argumentos().expresion().size();

        if (esperados != recibidos) {
            agregarError(tokenId, nombre, "La función '" + nombre + "' espera " + esperados + " argumento(s), pero recibió " + recibidos + ".");
            return funcion.getTipo();
        }

        if (ctx.argumentos() != null) {
            for (int i = 0; i < ctx.argumentos().expresion().size(); i++) {
                TipoDato tipoArgumento = visit(ctx.argumentos().expresion(i));
                TipoDato tipoParametro = funcion.getParametros().get(i);

                if (!tipoArgumento.compatibleCon(tipoParametro)) {
                    agregarError(tokenId, nombre, "El argumento " + (i + 1) + " de la función '" + nombre + "' debe ser " + tipoParametro + ", pero se recibió " + tipoArgumento + ".");
                }
            }
        }

        return funcion.getTipo();
    }

    @Override
    public TipoDato visitInstruccionRetorno(GramaticaParser.InstruccionRetornoContext ctx) {
        if (!dentroFuncion) {
            agregarError(ctx.getStart(), "dar", "La instrucción 'dar' solo puede utilizarse dentro de una función.");
            return TipoDato.ERROR;
        }

        TipoDato tipoDevuelto = TipoDato.VACIO;

        if (ctx.expresion() != null) {
            tipoDevuelto = visit(ctx.expresion());
        }

        if (!tipoDevuelto.compatibleCon(tipoFuncionActual)) {
            agregarError(ctx.getStart(), "dar", "La función '" + nombreFuncionActual + "' debe retornar " + tipoFuncionActual + ", pero retorna " + tipoDevuelto + ".");
        }

        return tipoDevuelto;
    }

    @Override
    public TipoDato visitInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx) {
        visit(ctx.expresion());
        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitInstruccionCaptar(GramaticaParser.InstruccionCaptarContext ctx) {
        visit(ctx.destinoEntrada());
        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitDestinoEntrada(GramaticaParser.DestinoEntradaContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            Token tokenId = ctx.IDENTIFICADOR().getSymbol();
            String nombre = tokenId.getText();

            Simbolo simbolo = tabla.buscar(nombre);

            if (simbolo == null) {
                agregarError(tokenId, nombre, "La variable '" + nombre + "' no ha sido declarada.");
                return TipoDato.ERROR;
            }

            if (simbolo.getRol().equals("función")) {
                agregarError(tokenId, nombre, "No se puede capturar entrada directamente en una función.");
                return TipoDato.ERROR;
            }

            return simbolo.getTipo();
        }

        return visit(ctx.accesoArreglo());
    }

    @Override
    public TipoDato visitEstructuraCondicional(GramaticaParser.EstructuraCondicionalContext ctx) {
        for (GramaticaParser.ExpresionContext expresion : ctx.expresion()) {
            TipoDato tipo = visit(expresion);

            if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
                agregarError(expresion.getStart(), expresion.getText(), "La condición de validar/siguiente debe ser de tipo ESTADO.");
            }
        }

        for (GramaticaParser.BloqueContext bloque : ctx.bloque()) {
            tabla.entrarAmbito("bloque_condicional_l" + bloque.getStart().getLine());
            visit(bloque);
            tabla.salirAmbito();
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitEstructuraMientras(GramaticaParser.EstructuraMientrasContext ctx) {
        TipoDato tipo = visit(ctx.expresion());

        if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
            agregarError(ctx.expresion().getStart(), ctx.expresion().getText(), "La condición de repetir debe ser de tipo ESTADO.");
        }

        tabla.entrarAmbito("bloque_repetir_l" + ctx.getStart().getLine());
        visit(ctx.bloque());
        tabla.salirAmbito();

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitEstructuraHacerMientras(GramaticaParser.EstructuraHacerMientrasContext ctx) {
        tabla.entrarAmbito("bloque_iniciar_l" + ctx.getStart().getLine());
        visit(ctx.bloque());
        tabla.salirAmbito();

        TipoDato tipo = visit(ctx.expresion());

        if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
            agregarError(ctx.expresion().getStart(), ctx.expresion().getText(), "La condición de iniciar/repetir debe ser de tipo ESTADO.");
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitEstructuraPara(GramaticaParser.EstructuraParaContext ctx) {
        tabla.entrarAmbito("bloque_loop_l" + ctx.getStart().getLine());

        if (ctx.inicializacionPara() != null) {
            visit(ctx.inicializacionPara());
        }

        if (ctx.expresion() != null) {
            TipoDato tipo = visit(ctx.expresion());

            if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
                agregarError(ctx.expresion().getStart(), ctx.expresion().getText(), "La condición de loop debe ser de tipo ESTADO.");
            }
        }

        if (ctx.actualizacionPara() != null) {
            visit(ctx.actualizacionPara());
        }

        visit(ctx.bloque());

        tabla.salirAmbito();

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitEstructuraSwitch(GramaticaParser.EstructuraSwitchContext ctx) {
        TipoDato tipoLight = visit(ctx.expresion());

        for (GramaticaParser.CasoSwitchContext caso : ctx.casoSwitch()) {
            TipoDato tipoCaso = visit(caso.valorCaso());

            if (!tipoCaso.compatibleCon(tipoLight)) {
                agregarError(caso.valorCaso().getStart(), caso.valorCaso().getText(), "El tipo del caso no coincide con la expresión evaluada en light.");
            }

            tabla.entrarAmbito("bloque_cerrado_l" + caso.getStart().getLine());
            visit(caso.bloque());
            tabla.salirAmbito();
        }

        if (ctx.defectoSwitch() != null) {
            tabla.entrarAmbito("bloque_defense_l" + ctx.defectoSwitch().getStart().getLine());
            visit(ctx.defectoSwitch().bloque());
            tabla.salirAmbito();
        }

        return TipoDato.VACIO;
    }

    @Override
    public TipoDato visitValorCaso(GramaticaParser.ValorCasoContext ctx) {
        if (ctx.NUMERO() != null) {
            return ctx.NUMERO().getText().contains(".") ? TipoDato.REAL : TipoDato.NUM;
        }

        if (ctx.cadenaLiteral() != null) {
            return TipoDato.TEXTO;
        }

        if (ctx.PAL_VERDAD() != null || ctx.PAL_MENTIRA() != null) {
            return TipoDato.ESTADO;
        }

        return TipoDato.ERROR;
    }

    @Override
    public TipoDato visitExpresion(GramaticaParser.ExpresionContext ctx) {
        return visit(ctx.expresionLogica());
    }

    @Override
    public TipoDato visitExpresionLogica(GramaticaParser.ExpresionLogicaContext ctx) {
        TipoDato tipo = visit(ctx.expresionRelacional(0));

        if (ctx.expresionRelacional().size() > 1) {
            if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
                agregarError(ctx.expresionRelacional(0).getStart(), ctx.expresionRelacional(0).getText(), "Las operaciones vinculo/opcion requieren operandos ESTADO.");
            }

            for (int i = 1; i < ctx.expresionRelacional().size(); i++) {
                TipoDato otro = visit(ctx.expresionRelacional(i));

                if (otro != TipoDato.ESTADO && otro != TipoDato.ERROR) {
                    agregarError(ctx.expresionRelacional(i).getStart(), ctx.expresionRelacional(i).getText(), "Las operaciones vinculo/opcion requieren operandos ESTADO.");
                }
            }

            return TipoDato.ESTADO;
        }

        return tipo;
    }

    @Override
    public TipoDato visitExpresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx) {
        TipoDato tipo = visit(ctx.expresionAditiva(0));

        if (ctx.expresionAditiva().size() > 1) {
            for (int i = 1; i < ctx.expresionAditiva().size(); i++) {
                TipoDato otro = visit(ctx.expresionAditiva(i));

                if (!tipo.compatibleCon(otro)) {
                    agregarError(ctx.expresionAditiva(i).getStart(), ctx.expresionAditiva(i).getText(), "No se pueden comparar tipos incompatibles: " + tipo + " y " + otro + ".");
                }
            }

            return TipoDato.ESTADO;
        }

        return tipo;
    }

    @Override
    public TipoDato visitExpresionAditiva(GramaticaParser.ExpresionAditivaContext ctx) {
        TipoDato tipo = visit(ctx.expresionMultiplicativa(0));

        for (int i = 1; i < ctx.expresionMultiplicativa().size(); i++) {
            TipoDato otro = visit(ctx.expresionMultiplicativa(i));

            if (!tipo.esNumerico() || !otro.esNumerico()) {
                agregarError(ctx.expresionMultiplicativa(i).getStart(), ctx.expresionMultiplicativa(i).getText(), "Las operaciones une/quita requieren operandos numéricos.");
                tipo = TipoDato.ERROR;
            } else {
                tipo = TipoDato.dominanteNumerico(tipo, otro);
            }
        }

        return tipo;
    }

    @Override
    public TipoDato visitExpresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx) {
        TipoDato tipo = visit(ctx.expresionUnaria(0));

        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            TipoDato otro = visit(ctx.expresionUnaria(i));

            if (!tipo.esNumerico() || !otro.esNumerico()) {
                agregarError(ctx.expresionUnaria(i).getStart(), ctx.expresionUnaria(i).getText(), "Las operaciones veces/reparte/sobra requieren operandos numéricos.");
                tipo = TipoDato.ERROR;
            } else {
                tipo = TipoDato.dominanteNumerico(tipo, otro);
            }
        }

        return tipo;
    }

    @Override
    public TipoDato visitExpresionUnaria(GramaticaParser.ExpresionUnariaContext ctx) {
        if (ctx.expresionUnaria() != null) {
            TipoDato tipo = visit(ctx.expresionUnaria());
            String operador = ctx.getStart().getText();

            if (operador.equals("opuesto")) {
                if (tipo != TipoDato.ESTADO && tipo != TipoDato.ERROR) {
                    agregarError(ctx.getStart(), operador, "El operador opuesto solo se puede aplicar a expresiones ESTADO.");
                }

                return TipoDato.ESTADO;
            }

            if (operador.equals("quita")) {
                if (!tipo.esNumerico() && tipo != TipoDato.ERROR) {
                    agregarError(ctx.getStart(), operador, "El operador quita unario solo se puede aplicar a expresiones numéricas.");
                }

                return tipo;
            }
        }

        return visit(ctx.expresionPrimaria());
    }

    @Override
    public TipoDato visitExpresionPrimaria(GramaticaParser.ExpresionPrimariaContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }

        if (ctx.llamadaFuncion() != null) {
            return visit(ctx.llamadaFuncion());
        }

        if (ctx.accesoArreglo() != null) {
            return visit(ctx.accesoArreglo());
        }

        return visit(ctx.literal());
    }

    @Override
    public TipoDato visitLiteral(GramaticaParser.LiteralContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            Token tokenId = ctx.IDENTIFICADOR().getSymbol();
            String nombre = tokenId.getText();

            Simbolo simbolo = tabla.buscar(nombre);

            if (simbolo == null) {
                agregarError(tokenId, nombre, "El identificador '" + nombre + "' no ha sido declarado.");
                return TipoDato.ERROR;
            }

            if (simbolo.getRol().equals("función")) {
                agregarError(tokenId, nombre, "La función '" + nombre + "' debe llamarse usando abre/cierra.");
                return TipoDato.ERROR;
            }

            return simbolo.getTipo();
        }

        if (ctx.NUMERO() != null) {
            return ctx.NUMERO().getText().contains(".") ? TipoDato.REAL : TipoDato.NUM;
        }

        if (ctx.cadenaLiteral() != null) {
            return TipoDato.TEXTO;
        }

        if (ctx.PAL_VERDAD() != null || ctx.PAL_MENTIRA() != null) {
            return TipoDato.ESTADO;
        }

        return TipoDato.ERROR;
    }
}