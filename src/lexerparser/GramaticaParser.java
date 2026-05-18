// Generated from GramaticaParser.g4 by ANTLR 4.13.2
package lexerparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAL_NUMERO=1, PAL_REAL=2, PAL_PRECISO=3, PAL_SIGNO=4, PAL_TEXTO=5, PAL_ESTADO=6, 
		PAL_VACIO=7, PAL_ASIGNA=8, PAL_PROYECTAR=9, PAL_PROYECTAR_LINEA=10, PAL_CAPTAR=11, 
		PAL_VALIDAR=12, PAL_ALTERNO=13, PAL_SIGUIENTE=14, PAL_REPETIR=15, PAL_INICIAR=16, 
		PAL_LOOP=17, PAL_LIGHT=18, PAL_CERRADO=19, PAL_DEFENSE=20, ENTONCES=21, 
		PAL_PARAR=22, PAL_SALTAR=23, PAL_DAR=24, PAL_RAIZ=25, PAL_VERDAD=26, PAL_MENTIRA=27, 
		PAL_UNE=28, PAL_VECES=29, PAL_QUITA=30, PAL_REPARTE=31, PAL_SOBRA=32, 
		PAL_SUPERA=33, PAL_BAJO=34, PAL_MINIMO=35, PAL_TOPE=36, PAL_CALCA=37, 
		PAL_AJENO=38, PAL_VINCULO=39, PAL_OPCION=40, PAL_OPUESTO=41, PAL_SUBIR=42, 
		PAL_BAJAR=43, PAL_REGISTRO=44, PAL_CAMPO=45, PAL_REFERENCIA=46, PAL_AUMENTA=47, 
		PAL_REDUCE=48, PAL_ESCALA=49, PAL_DIVIDE=50, PAL_SALTO=51, CONTIENE=52, 
		LISTO=53, HECHO=54, ABRE=55, CIERRA=56, SEPARA=57, INICIO_PONCHO=58, FIN_PONCHO=59, 
		CADENA_INICIO=60, NUMERO=61, IDENTIFICADOR=62, COMENTARIO_LINEA=63, COMENTARIO_BLOQUE=64, 
		WS=65, CADENA_CIERRA=66, TEXTO_CADENA=67;
	public static final int
		RULE_programa = 0, RULE_seccionRegistros = 1, RULE_declaracionRegistro = 2, 
		RULE_campoRegistro = 3, RULE_seccionGlobales = 4, RULE_seccionFunciones = 5, 
		RULE_comentariosFinales = 6, RULE_comentario = 7, RULE_declaracionGlobal = 8, 
		RULE_declaracionFuncion = 9, RULE_parametros = 10, RULE_parametro = 11, 
		RULE_bloquePrincipal = 12, RULE_bloque = 13, RULE_instruccion = 14, RULE_declaracionVariable = 15, 
		RULE_declaracionArreglo = 16, RULE_inicializadorLista = 17, RULE_asignacion = 18, 
		RULE_asignacionCompuesta = 19, RULE_destinoAsignacion = 20, RULE_instruccionImprimir = 21, 
		RULE_instruccionCaptar = 22, RULE_destinoEntrada = 23, RULE_estructuraCondicional = 24, 
		RULE_estructuraMientras = 25, RULE_estructuraHacerMientras = 26, RULE_estructuraPara = 27, 
		RULE_inicializacionPara = 28, RULE_declaracionPara = 29, RULE_asignacionSimple = 30, 
		RULE_actualizacionPara = 31, RULE_actualizacion = 32, RULE_estructuraSwitch = 33, 
		RULE_casoSwitch = 34, RULE_defectoSwitch = 35, RULE_valorCaso = 36, RULE_instruccionRetorno = 37, 
		RULE_instruccionControlFlujo = 38, RULE_llamadaFuncion = 39, RULE_argumentos = 40, 
		RULE_expresion = 41, RULE_expresionLogica = 42, RULE_expresionRelacional = 43, 
		RULE_expresionAditiva = 44, RULE_expresionMultiplicativa = 45, RULE_expresionUnaria = 46, 
		RULE_expresionPrimaria = 47, RULE_accesoCampo = 48, RULE_accesoArreglo = 49, 
		RULE_literal = 50, RULE_cadenaLiteral = 51, RULE_tipoVariable = 52, RULE_tipoGeneral = 53, 
		RULE_tipoRetorno = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionRegistros", "declaracionRegistro", "campoRegistro", 
			"seccionGlobales", "seccionFunciones", "comentariosFinales", "comentario", 
			"declaracionGlobal", "declaracionFuncion", "parametros", "parametro", 
			"bloquePrincipal", "bloque", "instruccion", "declaracionVariable", "declaracionArreglo", 
			"inicializadorLista", "asignacion", "asignacionCompuesta", "destinoAsignacion", 
			"instruccionImprimir", "instruccionCaptar", "destinoEntrada", "estructuraCondicional", 
			"estructuraMientras", "estructuraHacerMientras", "estructuraPara", "inicializacionPara", 
			"declaracionPara", "asignacionSimple", "actualizacionPara", "actualizacion", 
			"estructuraSwitch", "casoSwitch", "defectoSwitch", "valorCaso", "instruccionRetorno", 
			"instruccionControlFlujo", "llamadaFuncion", "argumentos", "expresion", 
			"expresionLogica", "expresionRelacional", "expresionAditiva", "expresionMultiplicativa", 
			"expresionUnaria", "expresionPrimaria", "accesoCampo", "accesoArreglo", 
			"literal", "cadenaLiteral", "tipoVariable", "tipoGeneral", "tipoRetorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'num'", "'real'", "'preciso'", "'signo'", "'text'", "'estado'", 
			"'empty'", "'asigna'", "'proyectar'", "'proyectar_linea'", "'captar'", 
			"'validar'", "'alterno'", "'siguiente'", "'repetir'", "'iniciar'", "'loop'", 
			"'light'", "'cerrado'", "'defense'", "'entonces'", "'parar'", "'saltp'", 
			"'dar'", "'raiz'", "'verdad'", "'mentira'", "'une'", "'veces'", "'quita'", 
			"'reparte'", "'sobra'", "'supera'", "'bajo'", "'minimo'", "'tope'", "'calca'", 
			"'ajeno'", "'vinculo'", "'opcion'", "'opuesto'", "'subir'", "'bajar'", 
			"'registro'", "'campo'", "'referencia'", "'aumenta'", "'reduce'", "'escala'", 
			"'divide'", "'salto'", "'contiene'", "'listo'", "'hecho'", "'abre'", 
			"'cierra'", "'separa'", "'inicio_poncho'", "'fin_poncho'", "'cadena'", 
			null, null, null, null, null, "'fin_cadena'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAL_NUMERO", "PAL_REAL", "PAL_PRECISO", "PAL_SIGNO", "PAL_TEXTO", 
			"PAL_ESTADO", "PAL_VACIO", "PAL_ASIGNA", "PAL_PROYECTAR", "PAL_PROYECTAR_LINEA", 
			"PAL_CAPTAR", "PAL_VALIDAR", "PAL_ALTERNO", "PAL_SIGUIENTE", "PAL_REPETIR", 
			"PAL_INICIAR", "PAL_LOOP", "PAL_LIGHT", "PAL_CERRADO", "PAL_DEFENSE", 
			"ENTONCES", "PAL_PARAR", "PAL_SALTAR", "PAL_DAR", "PAL_RAIZ", "PAL_VERDAD", 
			"PAL_MENTIRA", "PAL_UNE", "PAL_VECES", "PAL_QUITA", "PAL_REPARTE", "PAL_SOBRA", 
			"PAL_SUPERA", "PAL_BAJO", "PAL_MINIMO", "PAL_TOPE", "PAL_CALCA", "PAL_AJENO", 
			"PAL_VINCULO", "PAL_OPCION", "PAL_OPUESTO", "PAL_SUBIR", "PAL_BAJAR", 
			"PAL_REGISTRO", "PAL_CAMPO", "PAL_REFERENCIA", "PAL_AUMENTA", "PAL_REDUCE", 
			"PAL_ESCALA", "PAL_DIVIDE", "PAL_SALTO", "CONTIENE", "LISTO", "HECHO", 
			"ABRE", "CIERRA", "SEPARA", "INICIO_PONCHO", "FIN_PONCHO", "CADENA_INICIO", 
			"NUMERO", "IDENTIFICADOR", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS", 
			"CADENA_CIERRA", "TEXTO_CADENA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GramaticaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeccionRegistrosContext seccionRegistros() {
			return getRuleContext(SeccionRegistrosContext.class,0);
		}
		public SeccionGlobalesContext seccionGlobales() {
			return getRuleContext(SeccionGlobalesContext.class,0);
		}
		public SeccionFuncionesContext seccionFunciones() {
			return getRuleContext(SeccionFuncionesContext.class,0);
		}
		public BloquePrincipalContext bloquePrincipal() {
			return getRuleContext(BloquePrincipalContext.class,0);
		}
		public ComentariosFinalesContext comentariosFinales() {
			return getRuleContext(ComentariosFinalesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			seccionRegistros();
			setState(111);
			seccionGlobales();
			setState(112);
			seccionFunciones();
			setState(113);
			bloquePrincipal();
			setState(114);
			comentariosFinales();
			setState(115);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionRegistrosContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<DeclaracionRegistroContext> declaracionRegistro() {
			return getRuleContexts(DeclaracionRegistroContext.class);
		}
		public DeclaracionRegistroContext declaracionRegistro(int i) {
			return getRuleContext(DeclaracionRegistroContext.class,i);
		}
		public SeccionRegistrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionRegistros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterSeccionRegistros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitSeccionRegistros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitSeccionRegistros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionRegistrosContext seccionRegistros() throws RecognitionException {
		SeccionRegistrosContext _localctx = new SeccionRegistrosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seccionRegistros);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(119);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(117);
						comentario();
						}
						break;
					case PAL_REGISTRO:
						{
						setState(118);
						declaracionRegistro();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionRegistroContext extends ParserRuleContext {
		public TerminalNode PAL_REGISTRO() { return getToken(GramaticaParser.PAL_REGISTRO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public List<CampoRegistroContext> campoRegistro() {
			return getRuleContexts(CampoRegistroContext.class);
		}
		public CampoRegistroContext campoRegistro(int i) {
			return getRuleContext(CampoRegistroContext.class,i);
		}
		public DeclaracionRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionRegistro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionRegistroContext declaracionRegistro() throws RecognitionException {
		DeclaracionRegistroContext _localctx = new DeclaracionRegistroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionRegistro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PAL_REGISTRO);
			setState(125);
			match(IDENTIFICADOR);
			setState(126);
			match(CONTIENE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018427388030L) != 0)) {
				{
				{
				setState(127);
				campoRegistro();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CampoRegistroContext extends ParserRuleContext {
		public TipoGeneralContext tipoGeneral() {
			return getRuleContext(TipoGeneralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public CampoRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoRegistro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterCampoRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitCampoRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitCampoRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoRegistroContext campoRegistro() throws RecognitionException {
		CampoRegistroContext _localctx = new CampoRegistroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_campoRegistro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			tipoGeneral();
			setState(136);
			match(IDENTIFICADOR);
			setState(137);
			match(HECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionGlobalesContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<DeclaracionGlobalContext> declaracionGlobal() {
			return getRuleContexts(DeclaracionGlobalContext.class);
		}
		public DeclaracionGlobalContext declaracionGlobal(int i) {
			return getRuleContext(DeclaracionGlobalContext.class,i);
		}
		public SeccionGlobalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionGlobales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterSeccionGlobales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitSeccionGlobales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitSeccionGlobales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionGlobalesContext seccionGlobales() throws RecognitionException {
		SeccionGlobalesContext _localctx = new SeccionGlobalesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seccionGlobales);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(139);
						comentario();
						}
						break;
					case PAL_NUMERO:
					case PAL_REAL:
					case PAL_PRECISO:
					case PAL_SIGNO:
					case PAL_TEXTO:
					case PAL_ESTADO:
					case IDENTIFICADOR:
						{
						setState(140);
						declaracionGlobal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionFuncionesContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<DeclaracionFuncionContext> declaracionFuncion() {
			return getRuleContexts(DeclaracionFuncionContext.class);
		}
		public DeclaracionFuncionContext declaracionFuncion(int i) {
			return getRuleContext(DeclaracionFuncionContext.class,i);
		}
		public SeccionFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterSeccionFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitSeccionFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitSeccionFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionFuncionesContext seccionFunciones() throws RecognitionException {
		SeccionFuncionesContext _localctx = new SeccionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seccionFunciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(146);
						comentario();
						}
						break;
					case PAL_NUMERO:
					case PAL_REAL:
					case PAL_PRECISO:
					case PAL_SIGNO:
					case PAL_TEXTO:
					case PAL_ESTADO:
					case PAL_VACIO:
					case IDENTIFICADOR:
						{
						setState(147);
						declaracionFuncion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentariosFinalesContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ComentariosFinalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentariosFinales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterComentariosFinales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitComentariosFinales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitComentariosFinales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentariosFinalesContext comentariosFinales() throws RecognitionException {
		ComentariosFinalesContext _localctx = new ComentariosFinalesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comentariosFinales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(153);
				comentario();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(GramaticaParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(GramaticaParser.COMENTARIO_BLOQUE, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionGlobalContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArregloContext declaracionArreglo() {
			return getRuleContext(DeclaracionArregloContext.class,0);
		}
		public DeclaracionGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionGlobal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionGlobalContext declaracionGlobal() throws RecognitionException {
		DeclaracionGlobalContext _localctx = new DeclaracionGlobalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionGlobal);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				declaracionArreglo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			tipoRetorno();
			setState(166);
			match(IDENTIFICADOR);
			setState(167);
			match(ABRE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611756387171565694L) != 0)) {
				{
				setState(168);
				parametros();
				}
			}

			setState(171);
			match(CIERRA);
			setState(172);
			match(CONTIENE);
			setState(173);
			bloque();
			setState(174);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> SEPARA() { return getTokens(GramaticaParser.SEPARA); }
		public TerminalNode SEPARA(int i) {
			return getToken(GramaticaParser.SEPARA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			parametro();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(177);
				match(SEPARA);
				setState(178);
				parametro();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoGeneralContext tipoGeneral() {
			return getRuleContext(TipoGeneralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode PAL_REFERENCIA() { return getToken(GramaticaParser.PAL_REFERENCIA, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_REFERENCIA) {
				{
				setState(184);
				match(PAL_REFERENCIA);
				}
			}

			setState(187);
			tipoGeneral();
			setState(188);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloquePrincipalContext extends ParserRuleContext {
		public TerminalNode PAL_VACIO() { return getToken(GramaticaParser.PAL_VACIO, 0); }
		public TerminalNode PAL_RAIZ() { return getToken(GramaticaParser.PAL_RAIZ, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public BloquePrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquePrincipal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterBloquePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitBloquePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitBloquePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloquePrincipalContext bloquePrincipal() throws RecognitionException {
		BloquePrincipalContext _localctx = new BloquePrincipalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloquePrincipal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PAL_VACIO);
			setState(191);
			match(PAL_RAIZ);
			setState(192);
			match(ABRE);
			setState(193);
			match(CIERRA);
			setState(194);
			match(CONTIENE);
			setState(195);
			bloque();
			setState(196);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -2305836412128997569L) != 0)) {
				{
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(198);
					comentario();
					}
					break;
				case PAL_NUMERO:
				case PAL_REAL:
				case PAL_PRECISO:
				case PAL_SIGNO:
				case PAL_TEXTO:
				case PAL_ESTADO:
				case PAL_PROYECTAR:
				case PAL_PROYECTAR_LINEA:
				case PAL_CAPTAR:
				case PAL_VALIDAR:
				case PAL_REPETIR:
				case PAL_INICIAR:
				case PAL_LOOP:
				case PAL_LIGHT:
				case PAL_PARAR:
				case PAL_SALTAR:
				case PAL_DAR:
				case PAL_SUBIR:
				case PAL_BAJAR:
				case IDENTIFICADOR:
					{
					setState(199);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArregloContext declaracionArreglo() {
			return getRuleContext(DeclaracionArregloContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public AsignacionCompuestaContext asignacionCompuesta() {
			return getRuleContext(AsignacionCompuestaContext.class,0);
		}
		public ActualizacionContext actualizacion() {
			return getRuleContext(ActualizacionContext.class,0);
		}
		public InstruccionImprimirContext instruccionImprimir() {
			return getRuleContext(InstruccionImprimirContext.class,0);
		}
		public InstruccionCaptarContext instruccionCaptar() {
			return getRuleContext(InstruccionCaptarContext.class,0);
		}
		public EstructuraCondicionalContext estructuraCondicional() {
			return getRuleContext(EstructuraCondicionalContext.class,0);
		}
		public EstructuraMientrasContext estructuraMientras() {
			return getRuleContext(EstructuraMientrasContext.class,0);
		}
		public EstructuraHacerMientrasContext estructuraHacerMientras() {
			return getRuleContext(EstructuraHacerMientrasContext.class,0);
		}
		public EstructuraParaContext estructuraPara() {
			return getRuleContext(EstructuraParaContext.class,0);
		}
		public EstructuraSwitchContext estructuraSwitch() {
			return getRuleContext(EstructuraSwitchContext.class,0);
		}
		public InstruccionRetornoContext instruccionRetorno() {
			return getRuleContext(InstruccionRetornoContext.class,0);
		}
		public InstruccionControlFlujoContext instruccionControlFlujo() {
			return getRuleContext(InstruccionControlFlujoContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruccion);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				declaracionArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				asignacion();
				setState(208);
				match(HECHO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				asignacionCompuesta();
				setState(211);
				match(HECHO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				actualizacion();
				setState(214);
				match(HECHO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				instruccionImprimir();
				setState(217);
				match(HECHO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				instruccionCaptar();
				setState(220);
				match(HECHO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				estructuraCondicional();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				estructuraMientras();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				estructuraHacerMientras();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(225);
				estructuraPara();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(226);
				estructuraSwitch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(227);
				instruccionRetorno();
				setState(228);
				match(HECHO);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(230);
				instruccionControlFlujo();
				setState(231);
				match(HECHO);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(233);
				llamadaFuncion();
				setState(234);
				match(HECHO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public TipoGeneralContext tipoGeneral() {
			return getRuleContext(TipoGeneralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InicializadorListaContext inicializadorLista() {
			return getRuleContext(InicializadorListaContext.class,0);
		}
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			tipoGeneral();
			setState(239);
			match(IDENTIFICADOR);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(240);
				match(PAL_ASIGNA);
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PAL_VERDAD:
				case PAL_MENTIRA:
				case PAL_QUITA:
				case PAL_OPUESTO:
				case PAL_SALTO:
				case ABRE:
				case CADENA_INICIO:
				case NUMERO:
				case IDENTIFICADOR:
					{
					setState(241);
					expresion();
					}
					break;
				case CONTIENE:
					{
					setState(242);
					inicializadorLista();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(247);
			match(HECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionArregloContext extends ParserRuleContext {
		public TipoGeneralContext tipoGeneral() {
			return getRuleContext(TipoGeneralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode INICIO_PONCHO() { return getToken(GramaticaParser.INICIO_PONCHO, 0); }
		public TerminalNode FIN_PONCHO() { return getToken(GramaticaParser.FIN_PONCHO, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public InicializadorListaContext inicializadorLista() {
			return getRuleContext(InicializadorListaContext.class,0);
		}
		public DeclaracionArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionArregloContext declaracionArreglo() throws RecognitionException {
		DeclaracionArregloContext _localctx = new DeclaracionArregloContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracionArreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			tipoGeneral();
			setState(250);
			match(IDENTIFICADOR);
			setState(251);
			match(INICIO_PONCHO);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(252);
				match(NUMERO);
				}
			}

			setState(255);
			match(FIN_PONCHO);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(256);
				match(PAL_ASIGNA);
				setState(257);
				inicializadorLista();
				}
			}

			setState(260);
			match(HECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializadorListaContext extends ParserRuleContext {
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public List<TerminalNode> SEPARA() { return getTokens(GramaticaParser.SEPARA); }
		public TerminalNode SEPARA(int i) {
			return getToken(GramaticaParser.SEPARA, i);
		}
		public InicializadorListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializadorLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInicializadorLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInicializadorLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInicializadorLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializadorListaContext inicializadorLista() throws RecognitionException {
		InicializadorListaContext _localctx = new InicializadorListaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inicializadorLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(CONTIENE);
			setState(263);
			expresion();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(264);
				match(SEPARA);
				setState(265);
				expresion();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public DestinoAsignacionContext destinoAsignacion() {
			return getRuleContext(DestinoAsignacionContext.class,0);
		}
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			destinoAsignacion();
			setState(274);
			match(PAL_ASIGNA);
			setState(275);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionCompuestaContext extends ParserRuleContext {
		public DestinoAsignacionContext destinoAsignacion() {
			return getRuleContext(DestinoAsignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAL_AUMENTA() { return getToken(GramaticaParser.PAL_AUMENTA, 0); }
		public TerminalNode PAL_REDUCE() { return getToken(GramaticaParser.PAL_REDUCE, 0); }
		public TerminalNode PAL_ESCALA() { return getToken(GramaticaParser.PAL_ESCALA, 0); }
		public TerminalNode PAL_DIVIDE() { return getToken(GramaticaParser.PAL_DIVIDE, 0); }
		public AsignacionCompuestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionCompuesta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAsignacionCompuesta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAsignacionCompuesta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAsignacionCompuesta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionCompuestaContext asignacionCompuesta() throws RecognitionException {
		AsignacionCompuestaContext _localctx = new AsignacionCompuestaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignacionCompuesta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			destinoAsignacion();
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2111062325329920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestinoAsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public AccesoArregloContext accesoArreglo() {
			return getRuleContext(AccesoArregloContext.class,0);
		}
		public AccesoCampoContext accesoCampo() {
			return getRuleContext(AccesoCampoContext.class,0);
		}
		public DestinoAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinoAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDestinoAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDestinoAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDestinoAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinoAsignacionContext destinoAsignacion() throws RecognitionException {
		DestinoAsignacionContext _localctx = new DestinoAsignacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_destinoAsignacion);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				accesoArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				accesoCampo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionImprimirContext extends ParserRuleContext {
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode PAL_PROYECTAR() { return getToken(GramaticaParser.PAL_PROYECTAR, 0); }
		public TerminalNode PAL_PROYECTAR_LINEA() { return getToken(GramaticaParser.PAL_PROYECTAR_LINEA, 0); }
		public List<TerminalNode> SEPARA() { return getTokens(GramaticaParser.SEPARA); }
		public TerminalNode SEPARA(int i) {
			return getToken(GramaticaParser.SEPARA, i);
		}
		public InstruccionImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionImprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInstruccionImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInstruccionImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccionImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionImprimirContext instruccionImprimir() throws RecognitionException {
		InstruccionImprimirContext _localctx = new InstruccionImprimirContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instruccionImprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==PAL_PROYECTAR || _la==PAL_PROYECTAR_LINEA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			match(ABRE);
			setState(288);
			expresion();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(289);
				match(SEPARA);
				setState(290);
				expresion();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionCaptarContext extends ParserRuleContext {
		public TerminalNode PAL_CAPTAR() { return getToken(GramaticaParser.PAL_CAPTAR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public DestinoEntradaContext destinoEntrada() {
			return getRuleContext(DestinoEntradaContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public InstruccionCaptarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionCaptar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInstruccionCaptar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInstruccionCaptar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccionCaptar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionCaptarContext instruccionCaptar() throws RecognitionException {
		InstruccionCaptarContext _localctx = new InstruccionCaptarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instruccionCaptar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(PAL_CAPTAR);
			setState(299);
			match(ABRE);
			setState(300);
			destinoEntrada();
			setState(301);
			match(CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestinoEntradaContext extends ParserRuleContext {
		public DestinoAsignacionContext destinoAsignacion() {
			return getRuleContext(DestinoAsignacionContext.class,0);
		}
		public DestinoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDestinoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDestinoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDestinoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinoEntradaContext destinoEntrada() throws RecognitionException {
		DestinoEntradaContext _localctx = new DestinoEntradaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_destinoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			destinoAsignacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstructuraCondicionalContext extends ParserRuleContext {
		public TerminalNode PAL_VALIDAR() { return getToken(GramaticaParser.PAL_VALIDAR, 0); }
		public List<TerminalNode> ABRE() { return getTokens(GramaticaParser.ABRE); }
		public TerminalNode ABRE(int i) {
			return getToken(GramaticaParser.ABRE, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> CIERRA() { return getTokens(GramaticaParser.CIERRA); }
		public TerminalNode CIERRA(int i) {
			return getToken(GramaticaParser.CIERRA, i);
		}
		public List<TerminalNode> CONTIENE() { return getTokens(GramaticaParser.CONTIENE); }
		public TerminalNode CONTIENE(int i) {
			return getToken(GramaticaParser.CONTIENE, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> LISTO() { return getTokens(GramaticaParser.LISTO); }
		public TerminalNode LISTO(int i) {
			return getToken(GramaticaParser.LISTO, i);
		}
		public List<TerminalNode> PAL_SIGUIENTE() { return getTokens(GramaticaParser.PAL_SIGUIENTE); }
		public TerminalNode PAL_SIGUIENTE(int i) {
			return getToken(GramaticaParser.PAL_SIGUIENTE, i);
		}
		public TerminalNode PAL_ALTERNO() { return getToken(GramaticaParser.PAL_ALTERNO, 0); }
		public EstructuraCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterEstructuraCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitEstructuraCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitEstructuraCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraCondicionalContext estructuraCondicional() throws RecognitionException {
		EstructuraCondicionalContext _localctx = new EstructuraCondicionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_estructuraCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(PAL_VALIDAR);
			setState(306);
			match(ABRE);
			setState(307);
			expresion();
			setState(308);
			match(CIERRA);
			setState(309);
			match(CONTIENE);
			setState(310);
			bloque();
			setState(311);
			match(LISTO);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_SIGUIENTE) {
				{
				{
				setState(312);
				match(PAL_SIGUIENTE);
				setState(313);
				match(ABRE);
				setState(314);
				expresion();
				setState(315);
				match(CIERRA);
				setState(316);
				match(CONTIENE);
				setState(317);
				bloque();
				setState(318);
				match(LISTO);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ALTERNO) {
				{
				setState(325);
				match(PAL_ALTERNO);
				setState(326);
				match(CONTIENE);
				setState(327);
				bloque();
				setState(328);
				match(LISTO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstructuraMientrasContext extends ParserRuleContext {
		public TerminalNode PAL_REPETIR() { return getToken(GramaticaParser.PAL_REPETIR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public EstructuraMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterEstructuraMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitEstructuraMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitEstructuraMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraMientrasContext estructuraMientras() throws RecognitionException {
		EstructuraMientrasContext _localctx = new EstructuraMientrasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_estructuraMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PAL_REPETIR);
			setState(333);
			match(ABRE);
			setState(334);
			expresion();
			setState(335);
			match(CIERRA);
			setState(336);
			match(CONTIENE);
			setState(337);
			bloque();
			setState(338);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstructuraHacerMientrasContext extends ParserRuleContext {
		public TerminalNode PAL_INICIAR() { return getToken(GramaticaParser.PAL_INICIAR, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public TerminalNode PAL_REPETIR() { return getToken(GramaticaParser.PAL_REPETIR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public EstructuraHacerMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraHacerMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterEstructuraHacerMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitEstructuraHacerMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitEstructuraHacerMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraHacerMientrasContext estructuraHacerMientras() throws RecognitionException {
		EstructuraHacerMientrasContext _localctx = new EstructuraHacerMientrasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_estructuraHacerMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(PAL_INICIAR);
			setState(341);
			match(CONTIENE);
			setState(342);
			bloque();
			setState(343);
			match(LISTO);
			setState(344);
			match(PAL_REPETIR);
			setState(345);
			match(ABRE);
			setState(346);
			expresion();
			setState(347);
			match(CIERRA);
			setState(348);
			match(HECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstructuraParaContext extends ParserRuleContext {
		public TerminalNode PAL_LOOP() { return getToken(GramaticaParser.PAL_LOOP, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public List<TerminalNode> HECHO() { return getTokens(GramaticaParser.HECHO); }
		public TerminalNode HECHO(int i) {
			return getToken(GramaticaParser.HECHO, i);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public InicializacionParaContext inicializacionPara() {
			return getRuleContext(InicializacionParaContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ActualizacionParaContext actualizacionPara() {
			return getRuleContext(ActualizacionParaContext.class,0);
		}
		public EstructuraParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterEstructuraPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitEstructuraPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitEstructuraPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraParaContext estructuraPara() throws RecognitionException {
		EstructuraParaContext _localctx = new EstructuraParaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_estructuraPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(PAL_LOOP);
			setState(351);
			match(ABRE);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018427388030L) != 0)) {
				{
				setState(352);
				inicializacionPara();
				}
			}

			setState(355);
			match(HECHO);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8108733329378902016L) != 0)) {
				{
				setState(356);
				expresion();
				}
			}

			setState(359);
			match(HECHO);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611699212566921216L) != 0)) {
				{
				setState(360);
				actualizacionPara();
				}
			}

			setState(363);
			match(CIERRA);
			setState(364);
			match(CONTIENE);
			setState(365);
			bloque();
			setState(366);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacionParaContext extends ParserRuleContext {
		public DeclaracionParaContext declaracionPara() {
			return getRuleContext(DeclaracionParaContext.class,0);
		}
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public InicializacionParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacionPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInicializacionPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInicializacionPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInicializacionPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacionParaContext inicializacionPara() throws RecognitionException {
		InicializacionParaContext _localctx = new InicializacionParaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inicializacionPara);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_NUMERO:
			case PAL_REAL:
			case PAL_PRECISO:
			case PAL_SIGNO:
			case PAL_TEXTO:
			case PAL_ESTADO:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				declaracionPara();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				asignacionSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionParaContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDeclaracionPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDeclaracionPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionParaContext declaracionPara() throws RecognitionException {
		DeclaracionParaContext _localctx = new DeclaracionParaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declaracionPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			tipoVariable();
			setState(373);
			match(IDENTIFICADOR);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(374);
				match(PAL_ASIGNA);
				setState(375);
				expresion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionSimpleContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAsignacionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAsignacionSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAsignacionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionSimpleContext asignacionSimple() throws RecognitionException {
		AsignacionSimpleContext _localctx = new AsignacionSimpleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_asignacionSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(IDENTIFICADOR);
			setState(379);
			match(PAL_ASIGNA);
			setState(380);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionParaContext extends ParserRuleContext {
		public ActualizacionContext actualizacion() {
			return getRuleContext(ActualizacionContext.class,0);
		}
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public AsignacionCompuestaContext asignacionCompuesta() {
			return getRuleContext(AsignacionCompuestaContext.class,0);
		}
		public ActualizacionParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacionPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterActualizacionPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitActualizacionPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitActualizacionPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionParaContext actualizacionPara() throws RecognitionException {
		ActualizacionParaContext _localctx = new ActualizacionParaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actualizacionPara);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				actualizacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				asignacionSimple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				asignacionCompuesta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionContext extends ParserRuleContext {
		public DestinoAsignacionContext destinoAsignacion() {
			return getRuleContext(DestinoAsignacionContext.class,0);
		}
		public TerminalNode PAL_SUBIR() { return getToken(GramaticaParser.PAL_SUBIR, 0); }
		public TerminalNode PAL_BAJAR() { return getToken(GramaticaParser.PAL_BAJAR, 0); }
		public ActualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterActualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitActualizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitActualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_actualizacion);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				destinoAsignacion();
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==PAL_SUBIR || _la==PAL_BAJAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PAL_SUBIR:
			case PAL_BAJAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==PAL_SUBIR || _la==PAL_BAJAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				destinoAsignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstructuraSwitchContext extends ParserRuleContext {
		public TerminalNode PAL_LIGHT() { return getToken(GramaticaParser.PAL_LIGHT, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public TerminalNode CONTIENE() { return getToken(GramaticaParser.CONTIENE, 0); }
		public TerminalNode LISTO() { return getToken(GramaticaParser.LISTO, 0); }
		public List<CasoSwitchContext> casoSwitch() {
			return getRuleContexts(CasoSwitchContext.class);
		}
		public CasoSwitchContext casoSwitch(int i) {
			return getRuleContext(CasoSwitchContext.class,i);
		}
		public DefectoSwitchContext defectoSwitch() {
			return getRuleContext(DefectoSwitchContext.class,0);
		}
		public EstructuraSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterEstructuraSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitEstructuraSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitEstructuraSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraSwitchContext estructuraSwitch() throws RecognitionException {
		EstructuraSwitchContext _localctx = new EstructuraSwitchContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_estructuraSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(PAL_LIGHT);
			setState(395);
			match(ABRE);
			setState(396);
			expresion();
			setState(397);
			match(CIERRA);
			setState(398);
			match(CONTIENE);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_CERRADO) {
				{
				{
				setState(399);
				casoSwitch();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_DEFENSE) {
				{
				setState(405);
				defectoSwitch();
				}
			}

			setState(408);
			match(LISTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoSwitchContext extends ParserRuleContext {
		public TerminalNode PAL_CERRADO() { return getToken(GramaticaParser.PAL_CERRADO, 0); }
		public ValorCasoContext valorCaso() {
			return getRuleContext(ValorCasoContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(GramaticaParser.ENTONCES, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CasoSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterCasoSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitCasoSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitCasoSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoSwitchContext casoSwitch() throws RecognitionException {
		CasoSwitchContext _localctx = new CasoSwitchContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_casoSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(PAL_CERRADO);
			setState(411);
			valorCaso();
			setState(412);
			match(ENTONCES);
			setState(413);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefectoSwitchContext extends ParserRuleContext {
		public TerminalNode PAL_DEFENSE() { return getToken(GramaticaParser.PAL_DEFENSE, 0); }
		public TerminalNode ENTONCES() { return getToken(GramaticaParser.ENTONCES, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DefectoSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defectoSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterDefectoSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitDefectoSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDefectoSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefectoSwitchContext defectoSwitch() throws RecognitionException {
		DefectoSwitchContext _localctx = new DefectoSwitchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_defectoSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(PAL_DEFENSE);
			setState(416);
			match(ENTONCES);
			setState(417);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorCasoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public CadenaLiteralContext cadenaLiteral() {
			return getRuleContext(CadenaLiteralContext.class,0);
		}
		public TerminalNode PAL_VERDAD() { return getToken(GramaticaParser.PAL_VERDAD, 0); }
		public TerminalNode PAL_MENTIRA() { return getToken(GramaticaParser.PAL_MENTIRA, 0); }
		public ValorCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterValorCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitValorCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitValorCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorCasoContext valorCaso() throws RecognitionException {
		ValorCasoContext _localctx = new ValorCasoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_valorCaso);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(NUMERO);
				}
				break;
			case CADENA_INICIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				cadenaLiteral();
				}
				break;
			case PAL_VERDAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(PAL_VERDAD);
				}
				break;
			case PAL_MENTIRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(PAL_MENTIRA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionRetornoContext extends ParserRuleContext {
		public TerminalNode PAL_DAR() { return getToken(GramaticaParser.PAL_DAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInstruccionRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInstruccionRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccionRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionRetornoContext instruccionRetorno() throws RecognitionException {
		InstruccionRetornoContext _localctx = new InstruccionRetornoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_instruccionRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(PAL_DAR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8108733329378902016L) != 0)) {
				{
				setState(426);
				expresion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionControlFlujoContext extends ParserRuleContext {
		public TerminalNode PAL_PARAR() { return getToken(GramaticaParser.PAL_PARAR, 0); }
		public TerminalNode PAL_SALTAR() { return getToken(GramaticaParser.PAL_SALTAR, 0); }
		public InstruccionControlFlujoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionControlFlujo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterInstruccionControlFlujo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitInstruccionControlFlujo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccionControlFlujo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionControlFlujoContext instruccionControlFlujo() throws RecognitionException {
		InstruccionControlFlujoContext _localctx = new InstruccionControlFlujoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instruccionControlFlujo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==PAL_PARAR || _la==PAL_SALTAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(IDENTIFICADOR);
			setState(432);
			match(ABRE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8108733329378902016L) != 0)) {
				{
				setState(433);
				argumentos();
				}
			}

			setState(436);
			match(CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> SEPARA() { return getTokens(GramaticaParser.SEPARA); }
		public TerminalNode SEPARA(int i) {
			return getToken(GramaticaParser.SEPARA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			expresion();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(439);
				match(SEPARA);
				setState(440);
				expresion();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			expresionLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLogicaContext extends ParserRuleContext {
		public List<ExpresionRelacionalContext> expresionRelacional() {
			return getRuleContexts(ExpresionRelacionalContext.class);
		}
		public ExpresionRelacionalContext expresionRelacional(int i) {
			return getRuleContext(ExpresionRelacionalContext.class,i);
		}
		public List<TerminalNode> PAL_VINCULO() { return getTokens(GramaticaParser.PAL_VINCULO); }
		public TerminalNode PAL_VINCULO(int i) {
			return getToken(GramaticaParser.PAL_VINCULO, i);
		}
		public List<TerminalNode> PAL_OPCION() { return getTokens(GramaticaParser.PAL_OPCION); }
		public TerminalNode PAL_OPCION(int i) {
			return getToken(GramaticaParser.PAL_OPCION, i);
		}
		public ExpresionLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			expresionRelacional();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_VINCULO || _la==PAL_OPCION) {
				{
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==PAL_VINCULO || _la==PAL_OPCION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				expresionRelacional();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionRelacionalContext extends ParserRuleContext {
		public List<ExpresionAditivaContext> expresionAditiva() {
			return getRuleContexts(ExpresionAditivaContext.class);
		}
		public ExpresionAditivaContext expresionAditiva(int i) {
			return getRuleContext(ExpresionAditivaContext.class,i);
		}
		public List<TerminalNode> PAL_SUPERA() { return getTokens(GramaticaParser.PAL_SUPERA); }
		public TerminalNode PAL_SUPERA(int i) {
			return getToken(GramaticaParser.PAL_SUPERA, i);
		}
		public List<TerminalNode> PAL_BAJO() { return getTokens(GramaticaParser.PAL_BAJO); }
		public TerminalNode PAL_BAJO(int i) {
			return getToken(GramaticaParser.PAL_BAJO, i);
		}
		public List<TerminalNode> PAL_MINIMO() { return getTokens(GramaticaParser.PAL_MINIMO); }
		public TerminalNode PAL_MINIMO(int i) {
			return getToken(GramaticaParser.PAL_MINIMO, i);
		}
		public List<TerminalNode> PAL_TOPE() { return getTokens(GramaticaParser.PAL_TOPE); }
		public TerminalNode PAL_TOPE(int i) {
			return getToken(GramaticaParser.PAL_TOPE, i);
		}
		public List<TerminalNode> PAL_CALCA() { return getTokens(GramaticaParser.PAL_CALCA); }
		public TerminalNode PAL_CALCA(int i) {
			return getToken(GramaticaParser.PAL_CALCA, i);
		}
		public List<TerminalNode> PAL_AJENO() { return getTokens(GramaticaParser.PAL_AJENO); }
		public TerminalNode PAL_AJENO(int i) {
			return getToken(GramaticaParser.PAL_AJENO, i);
		}
		public ExpresionRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			expresionAditiva();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) {
				{
				{
				setState(457);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(458);
				expresionAditiva();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAditivaContext extends ParserRuleContext {
		public List<ExpresionMultiplicativaContext> expresionMultiplicativa() {
			return getRuleContexts(ExpresionMultiplicativaContext.class);
		}
		public ExpresionMultiplicativaContext expresionMultiplicativa(int i) {
			return getRuleContext(ExpresionMultiplicativaContext.class,i);
		}
		public List<TerminalNode> PAL_UNE() { return getTokens(GramaticaParser.PAL_UNE); }
		public TerminalNode PAL_UNE(int i) {
			return getToken(GramaticaParser.PAL_UNE, i);
		}
		public List<TerminalNode> PAL_QUITA() { return getTokens(GramaticaParser.PAL_QUITA); }
		public TerminalNode PAL_QUITA(int i) {
			return getToken(GramaticaParser.PAL_QUITA, i);
		}
		public ExpresionAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionAditivaContext expresionAditiva() throws RecognitionException {
		ExpresionAditivaContext _localctx = new ExpresionAditivaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expresionAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			expresionMultiplicativa();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_UNE || _la==PAL_QUITA) {
				{
				{
				setState(465);
				_la = _input.LA(1);
				if ( !(_la==PAL_UNE || _la==PAL_QUITA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(466);
				expresionMultiplicativa();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionMultiplicativaContext extends ParserRuleContext {
		public List<ExpresionUnariaContext> expresionUnaria() {
			return getRuleContexts(ExpresionUnariaContext.class);
		}
		public ExpresionUnariaContext expresionUnaria(int i) {
			return getRuleContext(ExpresionUnariaContext.class,i);
		}
		public List<TerminalNode> PAL_VECES() { return getTokens(GramaticaParser.PAL_VECES); }
		public TerminalNode PAL_VECES(int i) {
			return getToken(GramaticaParser.PAL_VECES, i);
		}
		public List<TerminalNode> PAL_REPARTE() { return getTokens(GramaticaParser.PAL_REPARTE); }
		public TerminalNode PAL_REPARTE(int i) {
			return getToken(GramaticaParser.PAL_REPARTE, i);
		}
		public List<TerminalNode> PAL_SOBRA() { return getTokens(GramaticaParser.PAL_SOBRA); }
		public TerminalNode PAL_SOBRA(int i) {
			return getToken(GramaticaParser.PAL_SOBRA, i);
		}
		public ExpresionMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionMultiplicativaContext expresionMultiplicativa() throws RecognitionException {
		ExpresionMultiplicativaContext _localctx = new ExpresionMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expresionMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			expresionUnaria();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6979321856L) != 0)) {
				{
				{
				setState(473);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6979321856L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(474);
				expresionUnaria();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionUnariaContext extends ParserRuleContext {
		public TerminalNode PAL_OPUESTO() { return getToken(GramaticaParser.PAL_OPUESTO, 0); }
		public ExpresionUnariaContext expresionUnaria() {
			return getRuleContext(ExpresionUnariaContext.class,0);
		}
		public TerminalNode PAL_QUITA() { return getToken(GramaticaParser.PAL_QUITA, 0); }
		public ExpresionPrimariaContext expresionPrimaria() {
			return getRuleContext(ExpresionPrimariaContext.class,0);
		}
		public ExpresionUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expresionUnaria);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_OPUESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(PAL_OPUESTO);
				setState(481);
				expresionUnaria();
				}
				break;
			case PAL_QUITA:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(PAL_QUITA);
				setState(483);
				expresionUnaria();
				}
				break;
			case PAL_VERDAD:
			case PAL_MENTIRA:
			case PAL_SALTO:
			case ABRE:
			case CADENA_INICIO:
			case NUMERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				expresionPrimaria();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionPrimariaContext extends ParserRuleContext {
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public AccesoArregloContext accesoArreglo() {
			return getRuleContext(AccesoArregloContext.class,0);
		}
		public AccesoCampoContext accesoCampo() {
			return getRuleContext(AccesoCampoContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpresionPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPrimaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterExpresionPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitExpresionPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitExpresionPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionPrimariaContext expresionPrimaria() throws RecognitionException {
		ExpresionPrimariaContext _localctx = new ExpresionPrimariaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expresionPrimaria);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(ABRE);
				setState(488);
				expresion();
				setState(489);
				match(CIERRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				accesoArreglo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				accesoCampo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoCampoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GramaticaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GramaticaParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> PAL_CAMPO() { return getTokens(GramaticaParser.PAL_CAMPO); }
		public TerminalNode PAL_CAMPO(int i) {
			return getToken(GramaticaParser.PAL_CAMPO, i);
		}
		public AccesoCampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoCampo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAccesoCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAccesoCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAccesoCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoCampoContext accesoCampo() throws RecognitionException {
		AccesoCampoContext _localctx = new AccesoCampoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_accesoCampo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(IDENTIFICADOR);
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				match(PAL_CAMPO);
				setState(499);
				match(IDENTIFICADOR);
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAL_CAMPO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoArregloContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode INICIO_PONCHO() { return getToken(GramaticaParser.INICIO_PONCHO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN_PONCHO() { return getToken(GramaticaParser.FIN_PONCHO, 0); }
		public AccesoArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAccesoArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAccesoArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAccesoArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoArregloContext accesoArreglo() throws RecognitionException {
		AccesoArregloContext _localctx = new AccesoArregloContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_accesoArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(IDENTIFICADOR);
			setState(505);
			match(INICIO_PONCHO);
			setState(506);
			expresion();
			setState(507);
			match(FIN_PONCHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public CadenaLiteralContext cadenaLiteral() {
			return getRuleContext(CadenaLiteralContext.class,0);
		}
		public TerminalNode PAL_VERDAD() { return getToken(GramaticaParser.PAL_VERDAD, 0); }
		public TerminalNode PAL_MENTIRA() { return getToken(GramaticaParser.PAL_MENTIRA, 0); }
		public TerminalNode PAL_SALTO() { return getToken(GramaticaParser.PAL_SALTO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(IDENTIFICADOR);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(NUMERO);
				}
				break;
			case CADENA_INICIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				cadenaLiteral();
				}
				break;
			case PAL_VERDAD:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(PAL_VERDAD);
				}
				break;
			case PAL_MENTIRA:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(PAL_MENTIRA);
				}
				break;
			case PAL_SALTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				match(PAL_SALTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaLiteralContext extends ParserRuleContext {
		public TerminalNode CADENA_INICIO() { return getToken(GramaticaParser.CADENA_INICIO, 0); }
		public TerminalNode CADENA_CIERRA() { return getToken(GramaticaParser.CADENA_CIERRA, 0); }
		public TerminalNode TEXTO_CADENA() { return getToken(GramaticaParser.TEXTO_CADENA, 0); }
		public CadenaLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadenaLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterCadenaLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitCadenaLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitCadenaLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaLiteralContext cadenaLiteral() throws RecognitionException {
		CadenaLiteralContext _localctx = new CadenaLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cadenaLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(CADENA_INICIO);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO_CADENA) {
				{
				setState(518);
				match(TEXTO_CADENA);
				}
			}

			setState(521);
			match(CADENA_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode PAL_NUMERO() { return getToken(GramaticaParser.PAL_NUMERO, 0); }
		public TerminalNode PAL_REAL() { return getToken(GramaticaParser.PAL_REAL, 0); }
		public TerminalNode PAL_PRECISO() { return getToken(GramaticaParser.PAL_PRECISO, 0); }
		public TerminalNode PAL_SIGNO() { return getToken(GramaticaParser.PAL_SIGNO, 0); }
		public TerminalNode PAL_TEXTO() { return getToken(GramaticaParser.PAL_TEXTO, 0); }
		public TerminalNode PAL_ESTADO() { return getToken(GramaticaParser.PAL_ESTADO, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoGeneralContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TipoGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoGeneral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterTipoGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitTipoGeneral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitTipoGeneral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoGeneralContext tipoGeneral() throws RecognitionException {
		TipoGeneralContext _localctx = new TipoGeneralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tipoGeneral);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_NUMERO:
			case PAL_REAL:
			case PAL_PRECISO:
			case PAL_SIGNO:
			case PAL_TEXTO:
			case PAL_ESTADO:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				tipoVariable();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoGeneralContext tipoGeneral() {
			return getRuleContext(TipoGeneralContext.class,0);
		}
		public TerminalNode PAL_VACIO() { return getToken(GramaticaParser.PAL_VACIO, 0); }
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterTipoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitTipoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitTipoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tipoRetorno);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_NUMERO:
			case PAL_REAL:
			case PAL_PRECISO:
			case PAL_SIGNO:
			case PAL_TEXTO:
			case PAL_ESTADO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				tipoGeneral();
				}
				break;
			case PAL_VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(PAL_VACIO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u0216\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001x\b\u0001\n\u0001\f\u0001{\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0081"+
		"\b\u0002\n\u0002\f\u0002\u0084\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u008e\b\u0004\n\u0004\f\u0004\u0091\t\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0095\b\u0005\n\u0005\f\u0005\u0098\t\u0005\u0001\u0006\u0005\u0006"+
		"\u009b\b\u0006\n\u0006\f\u0006\u009e\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00a4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00aa"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00b4\b\n\n\n\f\n\u00b7\t\n\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00c9\b\r\n\r\f\r\u00cc"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ed\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f4\b\u000f\u0003\u000f\u00f6"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00fe\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0103\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u010b\b\u0011\n\u0011\f\u0011\u010e\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u011d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0124\b\u0015\n\u0015\f\u0015\u0127"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0141\b\u0018\n\u0018\f\u0018\u0144\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014b\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0162\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0166\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u016a\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0173\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0179\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0182\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0189\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0191\b!\n!\f!\u0194\t!\u0001"+
		"!\u0003!\u0197\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01a8"+
		"\b$\u0001%\u0001%\u0003%\u01ac\b%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01b3\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u01ba"+
		"\b(\n(\f(\u01bd\t(\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u01c4\b*"+
		"\n*\f*\u01c7\t*\u0001+\u0001+\u0001+\u0005+\u01cc\b+\n+\f+\u01cf\t+\u0001"+
		",\u0001,\u0001,\u0005,\u01d4\b,\n,\f,\u01d7\t,\u0001-\u0001-\u0001-\u0005"+
		"-\u01dc\b-\n-\f-\u01df\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01e6"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u01f0"+
		"\b/\u00010\u00010\u00010\u00040\u01f5\b0\u000b0\f0\u01f6\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0003"+
		"2\u0204\b2\u00013\u00013\u00033\u0208\b3\u00013\u00013\u00014\u00014\u0001"+
		"5\u00015\u00035\u0210\b5\u00016\u00016\u00036\u0214\b6\u00016\u0000\u0000"+
		"7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\n\u0001\u0000"+
		"?@\u0001\u0000/2\u0001\u0000\t\n\u0001\u0000*+\u0001\u0000\u0016\u0017"+
		"\u0001\u0000\'(\u0001\u0000!&\u0002\u0000\u001c\u001c\u001e\u001e\u0002"+
		"\u0000\u001d\u001d\u001f \u0001\u0000\u0001\u0006\u0227\u0000n\u0001\u0000"+
		"\u0000\u0000\u0002y\u0001\u0000\u0000\u0000\u0004|\u0001\u0000\u0000\u0000"+
		"\u0006\u0087\u0001\u0000\u0000\u0000\b\u008f\u0001\u0000\u0000\u0000\n"+
		"\u0096\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e\u009f"+
		"\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00a5"+
		"\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000\u0000\u0016\u00b9"+
		"\u0001\u0000\u0000\u0000\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00ca"+
		"\u0001\u0000\u0000\u0000\u001c\u00ec\u0001\u0000\u0000\u0000\u001e\u00ee"+
		"\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000\"\u0106\u0001"+
		"\u0000\u0000\u0000$\u0111\u0001\u0000\u0000\u0000&\u0115\u0001\u0000\u0000"+
		"\u0000(\u011c\u0001\u0000\u0000\u0000*\u011e\u0001\u0000\u0000\u0000,"+
		"\u012a\u0001\u0000\u0000\u0000.\u012f\u0001\u0000\u0000\u00000\u0131\u0001"+
		"\u0000\u0000\u00002\u014c\u0001\u0000\u0000\u00004\u0154\u0001\u0000\u0000"+
		"\u00006\u015e\u0001\u0000\u0000\u00008\u0172\u0001\u0000\u0000\u0000:"+
		"\u0174\u0001\u0000\u0000\u0000<\u017a\u0001\u0000\u0000\u0000>\u0181\u0001"+
		"\u0000\u0000\u0000@\u0188\u0001\u0000\u0000\u0000B\u018a\u0001\u0000\u0000"+
		"\u0000D\u019a\u0001\u0000\u0000\u0000F\u019f\u0001\u0000\u0000\u0000H"+
		"\u01a7\u0001\u0000\u0000\u0000J\u01a9\u0001\u0000\u0000\u0000L\u01ad\u0001"+
		"\u0000\u0000\u0000N\u01af\u0001\u0000\u0000\u0000P\u01b6\u0001\u0000\u0000"+
		"\u0000R\u01be\u0001\u0000\u0000\u0000T\u01c0\u0001\u0000\u0000\u0000V"+
		"\u01c8\u0001\u0000\u0000\u0000X\u01d0\u0001\u0000\u0000\u0000Z\u01d8\u0001"+
		"\u0000\u0000\u0000\\\u01e5\u0001\u0000\u0000\u0000^\u01ef\u0001\u0000"+
		"\u0000\u0000`\u01f1\u0001\u0000\u0000\u0000b\u01f8\u0001\u0000\u0000\u0000"+
		"d\u0203\u0001\u0000\u0000\u0000f\u0205\u0001\u0000\u0000\u0000h\u020b"+
		"\u0001\u0000\u0000\u0000j\u020f\u0001\u0000\u0000\u0000l\u0213\u0001\u0000"+
		"\u0000\u0000no\u0003\u0002\u0001\u0000op\u0003\b\u0004\u0000pq\u0003\n"+
		"\u0005\u0000qr\u0003\u0018\f\u0000rs\u0003\f\u0006\u0000st\u0005\u0000"+
		"\u0000\u0001t\u0001\u0001\u0000\u0000\u0000ux\u0003\u000e\u0007\u0000"+
		"vx\u0003\u0004\u0002\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\u0003\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0005,\u0000\u0000}~\u0005>\u0000\u0000~\u0082\u00054\u0000\u0000\u007f"+
		"\u0081\u0003\u0006\u0003\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u00055\u0000\u0000\u0086\u0005"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0003j5\u0000\u0088\u0089\u0005>"+
		"\u0000\u0000\u0089\u008a\u00056\u0000\u0000\u008a\u0007\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0003\u000e\u0007\u0000\u008c\u008e\u0003\u0010\b\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0003\u000e\u0007\u0000\u0093"+
		"\u0095\u0003\u0012\t\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u000b"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0003\u000e\u0007\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\r\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0007\u0000\u0000\u0000\u00a0\u000f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0003\u001e\u000f\u0000\u00a2\u00a4\u0003"+
		" \u0010\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003l6\u0000"+
		"\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a9\u00057\u0000\u0000\u00a8\u00aa"+
		"\u0003\u0014\n\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"8\u0000\u0000\u00ac\u00ad\u00054\u0000\u0000\u00ad\u00ae\u0003\u001a\r"+
		"\u0000\u00ae\u00af\u00055\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b5\u0003\u0016\u000b\u0000\u00b1\u00b2\u00059\u0000\u0000\u00b2"+
		"\u00b4\u0003\u0016\u000b\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u0015\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005.\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003j5\u0000\u00bc\u00bd\u0005>"+
		"\u0000\u0000\u00bd\u0017\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0007"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0\u00c1\u00057\u0000"+
		"\u0000\u00c1\u00c2\u00058\u0000\u0000\u00c2\u00c3\u00054\u0000\u0000\u00c3"+
		"\u00c4\u0003\u001a\r\u0000\u00c4\u00c5\u00055\u0000\u0000\u00c5\u0019"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003\u000e\u0007\u0000\u00c7\u00c9"+
		"\u0003\u001c\u000e\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u001b"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ed"+
		"\u0003\u001e\u000f\u0000\u00ce\u00ed\u0003 \u0010\u0000\u00cf\u00d0\u0003"+
		"$\u0012\u0000\u00d0\u00d1\u00056\u0000\u0000\u00d1\u00ed\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0003&\u0013\u0000\u00d3\u00d4\u00056\u0000\u0000\u00d4"+
		"\u00ed\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003@ \u0000\u00d6\u00d7\u0005"+
		"6\u0000\u0000\u00d7\u00ed\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003*\u0015"+
		"\u0000\u00d9\u00da\u00056\u0000\u0000\u00da\u00ed\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0003,\u0016\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd\u00ed"+
		"\u0001\u0000\u0000\u0000\u00de\u00ed\u00030\u0018\u0000\u00df\u00ed\u0003"+
		"2\u0019\u0000\u00e0\u00ed\u00034\u001a\u0000\u00e1\u00ed\u00036\u001b"+
		"\u0000\u00e2\u00ed\u0003B!\u0000\u00e3\u00e4\u0003J%\u0000\u00e4\u00e5"+
		"\u00056\u0000\u0000\u00e5\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003"+
		"L&\u0000\u00e7\u00e8\u00056\u0000\u0000\u00e8\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0003N\'\u0000\u00ea\u00eb\u00056\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00cd\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ec\u00cf\u0001\u0000\u0000\u0000\u00ec"+
		"\u00d2\u0001\u0000\u0000\u0000\u00ec\u00d5\u0001\u0000\u0000\u0000\u00ec"+
		"\u00d8\u0001\u0000\u0000\u0000\u00ec\u00db\u0001\u0000\u0000\u0000\u00ec"+
		"\u00de\u0001\u0000\u0000\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e0\u0001\u0000\u0000\u0000\u00ec\u00e1\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e2\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed"+
		"\u001d\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003j5\u0000\u00ef\u00f5\u0005"+
		">\u0000\u0000\u00f0\u00f3\u0005\b\u0000\u0000\u00f1\u00f4\u0003R)\u0000"+
		"\u00f2\u00f4\u0003\"\u0011\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u00056\u0000\u0000\u00f8\u001f"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003j5\u0000\u00fa\u00fb\u0005>"+
		"\u0000\u0000\u00fb\u00fd\u0005:\u0000\u0000\u00fc\u00fe\u0005=\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0102\u0005;\u0000\u0000\u0100"+
		"\u0101\u0005\b\u0000\u0000\u0101\u0103\u0003\"\u0011\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u00056\u0000\u0000\u0105!\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u00054\u0000\u0000\u0107\u010c\u0003R)\u0000"+
		"\u0108\u0109\u00059\u0000\u0000\u0109\u010b\u0003R)\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u00055\u0000\u0000\u0110#\u0001\u0000\u0000\u0000\u0111\u0112\u0003("+
		"\u0014\u0000\u0112\u0113\u0005\b\u0000\u0000\u0113\u0114\u0003R)\u0000"+
		"\u0114%\u0001\u0000\u0000\u0000\u0115\u0116\u0003(\u0014\u0000\u0116\u0117"+
		"\u0007\u0001\u0000\u0000\u0117\u0118\u0003R)\u0000\u0118\'\u0001\u0000"+
		"\u0000\u0000\u0119\u011d\u0005>\u0000\u0000\u011a\u011d\u0003b1\u0000"+
		"\u011b\u011d\u0003`0\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d)\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0007\u0002\u0000\u0000\u011f\u0120\u0005"+
		"7\u0000\u0000\u0120\u0125\u0003R)\u0000\u0121\u0122\u00059\u0000\u0000"+
		"\u0122\u0124\u0003R)\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u00058\u0000\u0000\u0129+\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0005\u000b\u0000\u0000\u012b\u012c\u00057\u0000"+
		"\u0000\u012c\u012d\u0003.\u0017\u0000\u012d\u012e\u00058\u0000\u0000\u012e"+
		"-\u0001\u0000\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130/\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132\u0133\u00057"+
		"\u0000\u0000\u0133\u0134\u0003R)\u0000\u0134\u0135\u00058\u0000\u0000"+
		"\u0135\u0136\u00054\u0000\u0000\u0136\u0137\u0003\u001a\r\u0000\u0137"+
		"\u0142\u00055\u0000\u0000\u0138\u0139\u0005\u000e\u0000\u0000\u0139\u013a"+
		"\u00057\u0000\u0000\u013a\u013b\u0003R)\u0000\u013b\u013c\u00058\u0000"+
		"\u0000\u013c\u013d\u00054\u0000\u0000\u013d\u013e\u0003\u001a\r\u0000"+
		"\u013e\u013f\u00055\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140"+
		"\u0138\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"\u014a\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0005\r\u0000\u0000\u0146\u0147\u00054\u0000\u0000\u0147\u0148"+
		"\u0003\u001a\r\u0000\u0148\u0149\u00055\u0000\u0000\u0149\u014b\u0001"+
		"\u0000\u0000\u0000\u014a\u0145\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b1\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u000f"+
		"\u0000\u0000\u014d\u014e\u00057\u0000\u0000\u014e\u014f\u0003R)\u0000"+
		"\u014f\u0150\u00058\u0000\u0000\u0150\u0151\u00054\u0000\u0000\u0151\u0152"+
		"\u0003\u001a\r\u0000\u0152\u0153\u00055\u0000\u0000\u01533\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0005\u0010\u0000\u0000\u0155\u0156\u00054\u0000"+
		"\u0000\u0156\u0157\u0003\u001a\r\u0000\u0157\u0158\u00055\u0000\u0000"+
		"\u0158\u0159\u0005\u000f\u0000\u0000\u0159\u015a\u00057\u0000\u0000\u015a"+
		"\u015b\u0003R)\u0000\u015b\u015c\u00058\u0000\u0000\u015c\u015d\u0005"+
		"6\u0000\u0000\u015d5\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0011\u0000"+
		"\u0000\u015f\u0161\u00057\u0000\u0000\u0160\u0162\u00038\u001c\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u00056\u0000\u0000\u0164\u0166"+
		"\u0003R)\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u00056\u0000"+
		"\u0000\u0168\u016a\u0003>\u001f\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u00058\u0000\u0000\u016c\u016d\u00054\u0000\u0000\u016d\u016e"+
		"\u0003\u001a\r\u0000\u016e\u016f\u00055\u0000\u0000\u016f7\u0001\u0000"+
		"\u0000\u0000\u0170\u0173\u0003:\u001d\u0000\u0171\u0173\u0003<\u001e\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000"+
		"\u01739\u0001\u0000\u0000\u0000\u0174\u0175\u0003h4\u0000\u0175\u0178"+
		"\u0005>\u0000\u0000\u0176\u0177\u0005\b\u0000\u0000\u0177\u0179\u0003"+
		"R)\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179;\u0001\u0000\u0000\u0000\u017a\u017b\u0005>\u0000\u0000\u017b"+
		"\u017c\u0005\b\u0000\u0000\u017c\u017d\u0003R)\u0000\u017d=\u0001\u0000"+
		"\u0000\u0000\u017e\u0182\u0003@ \u0000\u017f\u0182\u0003<\u001e\u0000"+
		"\u0180\u0182\u0003&\u0013\u0000\u0181\u017e\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182"+
		"?\u0001\u0000\u0000\u0000\u0183\u0184\u0003(\u0014\u0000\u0184\u0185\u0007"+
		"\u0003\u0000\u0000\u0185\u0189\u0001\u0000\u0000\u0000\u0186\u0187\u0007"+
		"\u0003\u0000\u0000\u0187\u0189\u0003(\u0014\u0000\u0188\u0183\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189A\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\u0012\u0000\u0000\u018b\u018c\u00057\u0000\u0000"+
		"\u018c\u018d\u0003R)\u0000\u018d\u018e\u00058\u0000\u0000\u018e\u0192"+
		"\u00054\u0000\u0000\u018f\u0191\u0003D\"\u0000\u0190\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0197\u0003F#\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u00055\u0000\u0000\u0199"+
		"C\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0013\u0000\u0000\u019b\u019c"+
		"\u0003H$\u0000\u019c\u019d\u0005\u0015\u0000\u0000\u019d\u019e\u0003\u001a"+
		"\r\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0014\u0000"+
		"\u0000\u01a0\u01a1\u0005\u0015\u0000\u0000\u01a1\u01a2\u0003\u001a\r\u0000"+
		"\u01a2G\u0001\u0000\u0000\u0000\u01a3\u01a8\u0005=\u0000\u0000\u01a4\u01a8"+
		"\u0003f3\u0000\u01a5\u01a8\u0005\u001a\u0000\u0000\u01a6\u01a8\u0005\u001b"+
		"\u0000\u0000\u01a7\u01a3\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8I\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005\u0018\u0000"+
		"\u0000\u01aa\u01ac\u0003R)\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01acK\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0007\u0004\u0000\u0000\u01aeM\u0001\u0000\u0000\u0000\u01af\u01b0\u0005"+
		">\u0000\u0000\u01b0\u01b2\u00057\u0000\u0000\u01b1\u01b3\u0003P(\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u00058\u0000\u0000\u01b5"+
		"O\u0001\u0000\u0000\u0000\u01b6\u01bb\u0003R)\u0000\u01b7\u01b8\u0005"+
		"9\u0000\u0000\u01b8\u01ba\u0003R)\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcQ\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0003T*\u0000\u01bfS"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c5\u0003V+\u0000\u01c1\u01c2\u0007\u0005"+
		"\u0000\u0000\u01c2\u01c4\u0003V+\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6U\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cd\u0003X,\u0000\u01c9\u01ca\u0007"+
		"\u0006\u0000\u0000\u01ca\u01cc\u0003X,\u0000\u01cb\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ceW\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d5\u0003Z-\u0000\u01d1\u01d2"+
		"\u0007\u0007\u0000\u0000\u01d2\u01d4\u0003Z-\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6Y\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01dd\u0003\\.\u0000"+
		"\u01d9\u01da\u0007\b\u0000\u0000\u01da\u01dc\u0003\\.\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de[\u0001"+
		"\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005"+
		")\u0000\u0000\u01e1\u01e6\u0003\\.\u0000\u01e2\u01e3\u0005\u001e\u0000"+
		"\u0000\u01e3\u01e6\u0003\\.\u0000\u01e4\u01e6\u0003^/\u0000\u01e5\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e6]\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		"7\u0000\u0000\u01e8\u01e9\u0003R)\u0000\u01e9\u01ea\u00058\u0000\u0000"+
		"\u01ea\u01f0\u0001\u0000\u0000\u0000\u01eb\u01f0\u0003N\'\u0000\u01ec"+
		"\u01f0\u0003b1\u0000\u01ed\u01f0\u0003`0\u0000\u01ee\u01f0\u0003d2\u0000"+
		"\u01ef\u01e7\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ec\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0_\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f4\u0005>\u0000\u0000\u01f2\u01f3\u0005-\u0000\u0000\u01f3\u01f5\u0005"+
		">\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7a\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005>\u0000\u0000"+
		"\u01f9\u01fa\u0005:\u0000\u0000\u01fa\u01fb\u0003R)\u0000\u01fb\u01fc"+
		"\u0005;\u0000\u0000\u01fcc\u0001\u0000\u0000\u0000\u01fd\u0204\u0005>"+
		"\u0000\u0000\u01fe\u0204\u0005=\u0000\u0000\u01ff\u0204\u0003f3\u0000"+
		"\u0200\u0204\u0005\u001a\u0000\u0000\u0201\u0204\u0005\u001b\u0000\u0000"+
		"\u0202\u0204\u00053\u0000\u0000\u0203\u01fd\u0001\u0000\u0000\u0000\u0203"+
		"\u01fe\u0001\u0000\u0000\u0000\u0203\u01ff\u0001\u0000\u0000\u0000\u0203"+
		"\u0200\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203"+
		"\u0202\u0001\u0000\u0000\u0000\u0204e\u0001\u0000\u0000\u0000\u0205\u0207"+
		"\u0005<\u0000\u0000\u0206\u0208\u0005C\u0000\u0000\u0207\u0206\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0005B\u0000\u0000\u020ag\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0007\t\u0000\u0000\u020ci\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0003h4\u0000\u020e\u0210\u0005>\u0000\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210k\u0001\u0000"+
		"\u0000\u0000\u0211\u0214\u0003j5\u0000\u0212\u0214\u0005\u0007\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000"+
		"\u0214m\u0001\u0000\u0000\u00000wy\u0082\u008d\u008f\u0094\u0096\u009c"+
		"\u00a3\u00a9\u00b5\u00b9\u00c8\u00ca\u00ec\u00f3\u00f5\u00fd\u0102\u010c"+
		"\u011c\u0125\u0142\u014a\u0161\u0165\u0169\u0172\u0178\u0181\u0188\u0192"+
		"\u0196\u01a7\u01ab\u01b2\u01bb\u01c5\u01cd\u01d5\u01dd\u01e5\u01ef\u01f6"+
		"\u0203\u0207\u020f\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}