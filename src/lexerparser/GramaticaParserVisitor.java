// Generated from GramaticaParser.g4 by ANTLR 4.13.2
package lexerparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#seccionGlobales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionGlobales(GramaticaParser.SeccionGlobalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#seccionFunciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionFunciones(GramaticaParser.SeccionFuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comentariosFinales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentariosFinales(GramaticaParser.ComentariosFinalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(GramaticaParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracionGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionGlobal(GramaticaParser.DeclaracionGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(GramaticaParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bloquePrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloquePrincipal(GramaticaParser.BloquePrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(GramaticaParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(GramaticaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(GramaticaParser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionArreglo(GramaticaParser.DeclaracionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionArreglo(GramaticaParser.AsignacionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccionImprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionImprimir(GramaticaParser.InstruccionImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccionCaptar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionCaptar(GramaticaParser.InstruccionCaptarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#destinoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinoEntrada(GramaticaParser.DestinoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estructuraCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraCondicional(GramaticaParser.EstructuraCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estructuraMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraMientras(GramaticaParser.EstructuraMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estructuraHacerMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraHacerMientras(GramaticaParser.EstructuraHacerMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estructuraPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraPara(GramaticaParser.EstructuraParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#inicializacionPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacionPara(GramaticaParser.InicializacionParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracionPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionPara(GramaticaParser.DeclaracionParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacionSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSimple(GramaticaParser.AsignacionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#actualizacionPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizacionPara(GramaticaParser.ActualizacionParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#actualizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizacion(GramaticaParser.ActualizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estructuraSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraSwitch(GramaticaParser.EstructuraSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#casoSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoSwitch(GramaticaParser.CasoSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defectoSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefectoSwitch(GramaticaParser.DefectoSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#valorCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorCaso(GramaticaParser.ValorCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccionRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionRetorno(GramaticaParser.InstruccionRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccionControlFlujo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionControlFlujo(GramaticaParser.InstruccionControlFlujoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(GramaticaParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLogica(GramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(GramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionAditiva(GramaticaParser.ExpresionAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMultiplicativa(GramaticaParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(GramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPrimaria(GramaticaParser.ExpresionPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#accesoArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoArreglo(GramaticaParser.AccesoArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GramaticaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cadenaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadenaLiteral(GramaticaParser.CadenaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipoRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRetorno(GramaticaParser.TipoRetornoContext ctx);
}