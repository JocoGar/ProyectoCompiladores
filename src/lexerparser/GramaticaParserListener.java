// Generated from GramaticaParser.g4 by ANTLR 4.13.2
package lexerparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#seccionGlobales}.
	 * @param ctx the parse tree
	 */
	void enterSeccionGlobales(GramaticaParser.SeccionGlobalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#seccionGlobales}.
	 * @param ctx the parse tree
	 */
	void exitSeccionGlobales(GramaticaParser.SeccionGlobalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#seccionFunciones}.
	 * @param ctx the parse tree
	 */
	void enterSeccionFunciones(GramaticaParser.SeccionFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#seccionFunciones}.
	 * @param ctx the parse tree
	 */
	void exitSeccionFunciones(GramaticaParser.SeccionFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comentariosFinales}.
	 * @param ctx the parse tree
	 */
	void enterComentariosFinales(GramaticaParser.ComentariosFinalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comentariosFinales}.
	 * @param ctx the parse tree
	 */
	void exitComentariosFinales(GramaticaParser.ComentariosFinalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(GramaticaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(GramaticaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracionGlobal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionGlobal(GramaticaParser.DeclaracionGlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracionGlobal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionGlobal(GramaticaParser.DeclaracionGlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloquePrincipal}.
	 * @param ctx the parse tree
	 */
	void enterBloquePrincipal(GramaticaParser.BloquePrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloquePrincipal}.
	 * @param ctx the parse tree
	 */
	void exitBloquePrincipal(GramaticaParser.BloquePrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(GramaticaParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(GramaticaParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(GramaticaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(GramaticaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionArreglo(GramaticaParser.AsignacionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionArreglo(GramaticaParser.AsignacionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instruccionImprimir}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instruccionImprimir}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instruccionCaptar}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionCaptar(GramaticaParser.InstruccionCaptarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instruccionCaptar}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionCaptar(GramaticaParser.InstruccionCaptarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#destinoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterDestinoEntrada(GramaticaParser.DestinoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#destinoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitDestinoEntrada(GramaticaParser.DestinoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estructuraCondicional}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraCondicional(GramaticaParser.EstructuraCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estructuraCondicional}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraCondicional(GramaticaParser.EstructuraCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estructuraMientras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraMientras(GramaticaParser.EstructuraMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estructuraMientras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraMientras(GramaticaParser.EstructuraMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estructuraHacerMientras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraHacerMientras(GramaticaParser.EstructuraHacerMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estructuraHacerMientras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraHacerMientras(GramaticaParser.EstructuraHacerMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estructuraPara}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraPara(GramaticaParser.EstructuraParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estructuraPara}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraPara(GramaticaParser.EstructuraParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#inicializacionPara}.
	 * @param ctx the parse tree
	 */
	void enterInicializacionPara(GramaticaParser.InicializacionParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#inicializacionPara}.
	 * @param ctx the parse tree
	 */
	void exitInicializacionPara(GramaticaParser.InicializacionParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracionPara}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionPara(GramaticaParser.DeclaracionParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracionPara}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionPara(GramaticaParser.DeclaracionParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionSimple(GramaticaParser.AsignacionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionSimple(GramaticaParser.AsignacionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#actualizacionPara}.
	 * @param ctx the parse tree
	 */
	void enterActualizacionPara(GramaticaParser.ActualizacionParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#actualizacionPara}.
	 * @param ctx the parse tree
	 */
	void exitActualizacionPara(GramaticaParser.ActualizacionParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(GramaticaParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(GramaticaParser.ActualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estructuraSwitch}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraSwitch(GramaticaParser.EstructuraSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estructuraSwitch}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraSwitch(GramaticaParser.EstructuraSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#casoSwitch}.
	 * @param ctx the parse tree
	 */
	void enterCasoSwitch(GramaticaParser.CasoSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#casoSwitch}.
	 * @param ctx the parse tree
	 */
	void exitCasoSwitch(GramaticaParser.CasoSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#defectoSwitch}.
	 * @param ctx the parse tree
	 */
	void enterDefectoSwitch(GramaticaParser.DefectoSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#defectoSwitch}.
	 * @param ctx the parse tree
	 */
	void exitDefectoSwitch(GramaticaParser.DefectoSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valorCaso}.
	 * @param ctx the parse tree
	 */
	void enterValorCaso(GramaticaParser.ValorCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valorCaso}.
	 * @param ctx the parse tree
	 */
	void exitValorCaso(GramaticaParser.ValorCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instruccionRetorno}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionRetorno(GramaticaParser.InstruccionRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instruccionRetorno}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionRetorno(GramaticaParser.InstruccionRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instruccionControlFlujo}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionControlFlujo(GramaticaParser.InstruccionControlFlujoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instruccionControlFlujo}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionControlFlujo(GramaticaParser.InstruccionControlFlujoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLogica(GramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLogica(GramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAditiva(GramaticaParser.ExpresionAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAditiva(GramaticaParser.ExpresionAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(GramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(GramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPrimaria(GramaticaParser.ExpresionPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPrimaria(GramaticaParser.ExpresionPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#accesoArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAccesoArreglo(GramaticaParser.AccesoArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#accesoArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAccesoArreglo(GramaticaParser.AccesoArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GramaticaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GramaticaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cadenaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCadenaLiteral(GramaticaParser.CadenaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cadenaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCadenaLiteral(GramaticaParser.CadenaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(GramaticaParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(GramaticaParser.TipoRetornoContext ctx);
}