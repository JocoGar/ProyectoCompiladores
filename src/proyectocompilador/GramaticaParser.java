package proyectocompilador;

// Generated from GramaticaParser.g4 by ANTLR 4.13.2
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
		PAL_VACIO=7, PAL_ASIGNA=8, PAL_PROYECTAR=9, PAL_CAPTAR=10, PAL_VALIDAR=11, 
		PAL_ALTERNO=12, PAL_SIGUIENTE=13, PAL_REPETIR=14, PAL_INICIAR=15, PAL_LOOP=16, 
		PAL_PARAR=17, PAL_SALTAR=18, PAL_DAR=19, PAL_RAIZ=20, PAL_VERDAD=21, PAL_MENTIRA=22, 
		PAL_UNE=23, PAL_VECES=24, PAL_QUITA=25, PAL_REPARTE=26, PAL_SOBRA=27, 
		PAL_SUPERA=28, PAL_BAJO=29, PAL_MINIMO=30, PAL_TOPE=31, PAL_CALCA=32, 
		PAL_AJENO=33, PAL_VINCULO=34, PAL_OPCION=35, PAL_OPUESTO=36, PAL_SUBIR=37, 
		PAL_BAJAR=38, CONTIENE=39, LISTO=40, HECHO=41, ABRE=42, CIERRA=43, SEPARA=44, 
		CADENA_INICIO=45, NUMERO=46, IDENTIFICADOR=47, COMENTARIO_LINEA=48, COMENTARIO_BLOQUE=49, 
		WS=50, CADENA_CIERRA=51, TEXTO_CADENA=52;
	public static final int
		RULE_programa = 0, RULE_seccionGlobales = 1, RULE_seccionFunciones = 2, 
		RULE_comentariosFinales = 3, RULE_comentario = 4, RULE_declaracionGlobal = 5, 
		RULE_declaracionFuncion = 6, RULE_parametros = 7, RULE_parametro = 8, 
		RULE_bloquePrincipal = 9, RULE_bloque = 10, RULE_instruccion = 11, RULE_declaracionVariable = 12, 
		RULE_asignacion = 13, RULE_instruccionImprimir = 14, RULE_instruccionCaptar = 15, 
		RULE_estructuraCondicional = 16, RULE_estructuraMientras = 17, RULE_estructuraHacerMientras = 18, 
		RULE_estructuraPara = 19, RULE_inicializacionPara = 20, RULE_declaracionPara = 21, 
		RULE_asignacionSimple = 22, RULE_actualizacionPara = 23, RULE_actualizacion = 24, 
		RULE_instruccionRetorno = 25, RULE_instruccionControlFlujo = 26, RULE_llamadaFuncion = 27, 
		RULE_argumentos = 28, RULE_expresion = 29, RULE_expresionLogica = 30, 
		RULE_expresionRelacional = 31, RULE_expresionAditiva = 32, RULE_expresionMultiplicativa = 33, 
		RULE_expresionUnaria = 34, RULE_expresionPrimaria = 35, RULE_literal = 36, 
		RULE_cadenaLiteral = 37, RULE_tipoVariable = 38, RULE_tipoRetorno = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionGlobales", "seccionFunciones", "comentariosFinales", 
			"comentario", "declaracionGlobal", "declaracionFuncion", "parametros", 
			"parametro", "bloquePrincipal", "bloque", "instruccion", "declaracionVariable", 
			"asignacion", "instruccionImprimir", "instruccionCaptar", "estructuraCondicional", 
			"estructuraMientras", "estructuraHacerMientras", "estructuraPara", "inicializacionPara", 
			"declaracionPara", "asignacionSimple", "actualizacionPara", "actualizacion", 
			"instruccionRetorno", "instruccionControlFlujo", "llamadaFuncion", "argumentos", 
			"expresion", "expresionLogica", "expresionRelacional", "expresionAditiva", 
			"expresionMultiplicativa", "expresionUnaria", "expresionPrimaria", "literal", 
			"cadenaLiteral", "tipoVariable", "tipoRetorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'num'", "'real'", "'preciso'", "'signo'", "'text'", "'estado'", 
			"'empty'", "'asigna'", "'proyectar'", "'captar'", "'validar'", "'alterno'", 
			"'siguiente'", "'repetir'", "'iniciar'", "'loop'", "'parar'", "'saltar'", 
			"'dar'", "'raiz'", "'verdad'", "'mentira'", "'une'", "'veces'", "'quita'", 
			"'reparte'", "'sobra'", "'supera'", "'bajo'", "'minimo'", "'tope'", "'calca'", 
			"'ajeno'", "'vinculo'", "'opcion'", "'opuesto'", "'subir'", "'bajar'", 
			"'contiene'", "'listo'", "'hecho'", "'abre'", "'cierra'", "'separa'", 
			"'cadena'", null, null, null, null, null, "'fin_cadena'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAL_NUMERO", "PAL_REAL", "PAL_PRECISO", "PAL_SIGNO", "PAL_TEXTO", 
			"PAL_ESTADO", "PAL_VACIO", "PAL_ASIGNA", "PAL_PROYECTAR", "PAL_CAPTAR", 
			"PAL_VALIDAR", "PAL_ALTERNO", "PAL_SIGUIENTE", "PAL_REPETIR", "PAL_INICIAR", 
			"PAL_LOOP", "PAL_PARAR", "PAL_SALTAR", "PAL_DAR", "PAL_RAIZ", "PAL_VERDAD", 
			"PAL_MENTIRA", "PAL_UNE", "PAL_VECES", "PAL_QUITA", "PAL_REPARTE", "PAL_SOBRA", 
			"PAL_SUPERA", "PAL_BAJO", "PAL_MINIMO", "PAL_TOPE", "PAL_CALCA", "PAL_AJENO", 
			"PAL_VINCULO", "PAL_OPCION", "PAL_OPUESTO", "PAL_SUBIR", "PAL_BAJAR", 
			"CONTIENE", "LISTO", "HECHO", "ABRE", "CIERRA", "SEPARA", "CADENA_INICIO", 
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			seccionGlobales();
			setState(81);
			seccionFunciones();
			setState(82);
			bloquePrincipal();
			setState(83);
			comentariosFinales();
			setState(84);
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
	}

	public final SeccionGlobalesContext seccionGlobales() throws RecognitionException {
		SeccionGlobalesContext _localctx = new SeccionGlobalesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seccionGlobales);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(86);
						comentario();
						}
						break;
					case PAL_NUMERO:
					case PAL_REAL:
					case PAL_PRECISO:
					case PAL_SIGNO:
					case PAL_TEXTO:
					case PAL_ESTADO:
						{
						setState(87);
						declaracionGlobal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(92);
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
	}

	public final SeccionFuncionesContext seccionFunciones() throws RecognitionException {
		SeccionFuncionesContext _localctx = new SeccionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seccionFunciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(95);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(93);
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
						{
						setState(94);
						declaracionFuncion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	}

	public final ComentariosFinalesContext comentariosFinales() throws RecognitionException {
		ComentariosFinalesContext _localctx = new ComentariosFinalesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comentariosFinales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(100);
				comentario();
				}
				}
				setState(105);
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
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
	}

	public final DeclaracionGlobalContext declaracionGlobal() throws RecognitionException {
		DeclaracionGlobalContext _localctx = new DeclaracionGlobalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionGlobal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			declaracionVariable();
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
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			tipoRetorno();
			setState(111);
			match(IDENTIFICADOR);
			setState(112);
			match(ABRE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) {
				{
				setState(113);
				parametros();
				}
			}

			setState(116);
			match(CIERRA);
			setState(117);
			match(CONTIENE);
			setState(118);
			bloque();
			setState(119);
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
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			parametro();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(122);
				match(SEPARA);
				setState(123);
				parametro();
				}
				}
				setState(128);
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
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
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
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			tipoVariable();
			setState(130);
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
	}

	public final BloquePrincipalContext bloquePrincipal() throws RecognitionException {
		BloquePrincipalContext _localctx = new BloquePrincipalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloquePrincipal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PAL_VACIO);
			setState(133);
			match(PAL_RAIZ);
			setState(134);
			match(ABRE);
			setState(135);
			match(CIERRA);
			setState(136);
			match(CONTIENE);
			setState(137);
			bloque();
			setState(138);
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
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162419523198L) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(140);
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
				case PAL_CAPTAR:
				case PAL_VALIDAR:
				case PAL_REPETIR:
				case PAL_INICIAR:
				case PAL_LOOP:
				case PAL_PARAR:
				case PAL_SALTAR:
				case PAL_DAR:
				case IDENTIFICADOR:
					{
					setState(141);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
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
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruccion);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				asignacion();
				setState(149);
				match(HECHO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				instruccionImprimir();
				setState(152);
				match(HECHO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				instruccionCaptar();
				setState(155);
				match(HECHO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				estructuraCondicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				estructuraMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				estructuraHacerMientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				estructuraPara();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				instruccionRetorno();
				setState(162);
				match(HECHO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				instruccionControlFlujo();
				setState(165);
				match(HECHO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(167);
				llamadaFuncion();
				setState(168);
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
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			tipoVariable();
			setState(173);
			match(IDENTIFICADOR);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(174);
				match(PAL_ASIGNA);
				setState(175);
				expresion();
				}
			}

			setState(178);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
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
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IDENTIFICADOR);
			setState(181);
			match(PAL_ASIGNA);
			setState(182);
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
	public static class InstruccionImprimirContext extends ParserRuleContext {
		public TerminalNode PAL_PROYECTAR() { return getToken(GramaticaParser.PAL_PROYECTAR, 0); }
		public TerminalNode ABRE() { return getToken(GramaticaParser.ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(GramaticaParser.CIERRA, 0); }
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
	}

	public final InstruccionImprimirContext instruccionImprimir() throws RecognitionException {
		InstruccionImprimirContext _localctx = new InstruccionImprimirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruccionImprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(PAL_PROYECTAR);
			setState(185);
			match(ABRE);
			setState(186);
			expresion();
			setState(187);
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
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
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
	}

	public final InstruccionCaptarContext instruccionCaptar() throws RecognitionException {
		InstruccionCaptarContext _localctx = new InstruccionCaptarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruccionCaptar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PAL_CAPTAR);
			setState(190);
			match(ABRE);
			setState(191);
			match(IDENTIFICADOR);
			setState(192);
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
	}

	public final EstructuraCondicionalContext estructuraCondicional() throws RecognitionException {
		EstructuraCondicionalContext _localctx = new EstructuraCondicionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estructuraCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PAL_VALIDAR);
			setState(195);
			match(ABRE);
			setState(196);
			expresion();
			setState(197);
			match(CIERRA);
			setState(198);
			match(CONTIENE);
			setState(199);
			bloque();
			setState(200);
			match(LISTO);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_SIGUIENTE) {
				{
				{
				setState(201);
				match(PAL_SIGUIENTE);
				setState(202);
				match(ABRE);
				setState(203);
				expresion();
				setState(204);
				match(CIERRA);
				setState(205);
				match(CONTIENE);
				setState(206);
				bloque();
				setState(207);
				match(LISTO);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ALTERNO) {
				{
				setState(214);
				match(PAL_ALTERNO);
				setState(215);
				match(CONTIENE);
				setState(216);
				bloque();
				setState(217);
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
	}

	public final EstructuraMientrasContext estructuraMientras() throws RecognitionException {
		EstructuraMientrasContext _localctx = new EstructuraMientrasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_estructuraMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PAL_REPETIR);
			setState(222);
			match(ABRE);
			setState(223);
			expresion();
			setState(224);
			match(CIERRA);
			setState(225);
			match(CONTIENE);
			setState(226);
			bloque();
			setState(227);
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
	}

	public final EstructuraHacerMientrasContext estructuraHacerMientras() throws RecognitionException {
		EstructuraHacerMientrasContext _localctx = new EstructuraHacerMientrasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estructuraHacerMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(PAL_INICIAR);
			setState(230);
			match(CONTIENE);
			setState(231);
			bloque();
			setState(232);
			match(LISTO);
			setState(233);
			match(PAL_REPETIR);
			setState(234);
			match(ABRE);
			setState(235);
			expresion();
			setState(236);
			match(CIERRA);
			setState(237);
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
	}

	public final EstructuraParaContext estructuraPara() throws RecognitionException {
		EstructuraParaContext _localctx = new EstructuraParaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_estructuraPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(PAL_LOOP);
			setState(240);
			match(ABRE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488355454L) != 0)) {
				{
				setState(241);
				inicializacionPara();
				}
			}

			setState(244);
			match(HECHO);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250757376901120L) != 0)) {
				{
				setState(245);
				expresion();
				}
			}

			setState(248);
			match(HECHO);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141149805215744L) != 0)) {
				{
				setState(249);
				actualizacionPara();
				}
			}

			setState(252);
			match(CIERRA);
			setState(253);
			match(CONTIENE);
			setState(254);
			bloque();
			setState(255);
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
	}

	public final InicializacionParaContext inicializacionPara() throws RecognitionException {
		InicializacionParaContext _localctx = new InicializacionParaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inicializacionPara);
		try {
			setState(259);
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
				setState(257);
				declaracionPara();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
	}

	public final DeclaracionParaContext declaracionPara() throws RecognitionException {
		DeclaracionParaContext _localctx = new DeclaracionParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracionPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			tipoVariable();
			setState(262);
			match(IDENTIFICADOR);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(263);
				match(PAL_ASIGNA);
				setState(264);
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
	}

	public final AsignacionSimpleContext asignacionSimple() throws RecognitionException {
		AsignacionSimpleContext _localctx = new AsignacionSimpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_asignacionSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFICADOR);
			setState(268);
			match(PAL_ASIGNA);
			setState(269);
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
	}

	public final ActualizacionParaContext actualizacionPara() throws RecognitionException {
		ActualizacionParaContext _localctx = new ActualizacionParaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_actualizacionPara);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				actualizacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				asignacionSimple();
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
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
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
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_actualizacion);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(IDENTIFICADOR);
				setState(276);
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
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==PAL_SUBIR || _la==PAL_BAJAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
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
	}

	public final InstruccionRetornoContext instruccionRetorno() throws RecognitionException {
		InstruccionRetornoContext _localctx = new InstruccionRetornoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instruccionRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PAL_DAR);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250757376901120L) != 0)) {
				{
				setState(282);
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
	}

	public final InstruccionControlFlujoContext instruccionControlFlujo() throws RecognitionException {
		InstruccionControlFlujoContext _localctx = new InstruccionControlFlujoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instruccionControlFlujo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IDENTIFICADOR);
			setState(288);
			match(ABRE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250757376901120L) != 0)) {
				{
				setState(289);
				argumentos();
				}
			}

			setState(292);
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
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expresion();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(295);
				match(SEPARA);
				setState(296);
				expresion();
				}
				}
				setState(301);
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
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			expresionRelacional();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_VINCULO || _la==PAL_OPCION) {
				{
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==PAL_VINCULO || _la==PAL_OPCION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				expresionRelacional();
				}
				}
				setState(311);
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
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			expresionAditiva();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				expresionAditiva();
				}
				}
				setState(319);
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
	}

	public final ExpresionAditivaContext expresionAditiva() throws RecognitionException {
		ExpresionAditivaContext _localctx = new ExpresionAditivaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expresionAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			expresionMultiplicativa();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_UNE || _la==PAL_QUITA) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==PAL_UNE || _la==PAL_QUITA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				expresionMultiplicativa();
				}
				}
				setState(327);
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
	}

	public final ExpresionMultiplicativaContext expresionMultiplicativa() throws RecognitionException {
		ExpresionMultiplicativaContext _localctx = new ExpresionMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expresionMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			expresionUnaria();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 218103808L) != 0)) {
				{
				{
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 218103808L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				expresionUnaria();
				}
				}
				setState(335);
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
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expresionUnaria);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_OPUESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(PAL_OPUESTO);
				setState(337);
				expresionUnaria();
				}
				break;
			case PAL_VERDAD:
			case PAL_MENTIRA:
			case ABRE:
			case CADENA_INICIO:
			case NUMERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
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
	}

	public final ExpresionPrimariaContext expresionPrimaria() throws RecognitionException {
		ExpresionPrimariaContext _localctx = new ExpresionPrimariaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expresionPrimaria);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(ABRE);
				setState(342);
				expresion();
				setState(343);
				match(CIERRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public CadenaLiteralContext cadenaLiteral() {
			return getRuleContext(CadenaLiteralContext.class,0);
		}
		public TerminalNode PAL_VERDAD() { return getToken(GramaticaParser.PAL_VERDAD, 0); }
		public TerminalNode PAL_MENTIRA() { return getToken(GramaticaParser.PAL_MENTIRA, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(IDENTIFICADOR);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(NUMERO);
				}
				break;
			case CADENA_INICIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				cadenaLiteral();
				}
				break;
			case PAL_VERDAD:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(PAL_VERDAD);
				}
				break;
			case PAL_MENTIRA:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
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
	}

	public final CadenaLiteralContext cadenaLiteral() throws RecognitionException {
		CadenaLiteralContext _localctx = new CadenaLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cadenaLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CADENA_INICIO);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO_CADENA) {
				{
				setState(357);
				match(TEXTO_CADENA);
				}
			}

			setState(360);
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
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
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
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tipoRetorno);
		try {
			setState(366);
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
				setState(364);
				tipoVariable();
				}
				break;
			case PAL_VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
		"\u0004\u00014\u0171\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0001"+
		"\u0003\u0005\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b"+
		"\u0007\n\u0007\f\u0007\u0080\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n\u008f\b\n\n\n\f\n\u0092\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ab\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00b1\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00d2\b\u0010\n\u0010\f\u0010\u00d5\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dc\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f3\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00f7\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00fb\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0104\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u010a\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0112\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0118\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u011c\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0123\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u012a\b\u001c"+
		"\n\u001c\f\u001c\u012d\t\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0134\b\u001e\n\u001e\f\u001e\u0137\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u013c\b\u001f\n\u001f"+
		"\f\u001f\u013f\t\u001f\u0001 \u0001 \u0001 \u0005 \u0144\b \n \f \u0147"+
		"\t \u0001!\u0001!\u0001!\u0005!\u014c\b!\n!\f!\u014f\t!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0154\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u015c\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0163\b$\u0001"+
		"%\u0001%\u0003%\u0167\b%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u016f\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLN\u0000\b\u0001\u000001\u0001\u0000%&\u0001\u0000\u0011\u0012\u0001"+
		"\u0000\"#\u0001\u0000\u001c!\u0002\u0000\u0017\u0017\u0019\u0019\u0002"+
		"\u0000\u0018\u0018\u001a\u001b\u0001\u0000\u0001\u0006\u0175\u0000P\u0001"+
		"\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000"+
		"\u0000\u0006g\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nl\u0001"+
		"\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000"+
		"\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000"+
		"\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u00aa\u0001\u0000\u0000"+
		"\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000"+
		"\u0000\u001c\u00b8\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000"+
		"\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000"+
		"$\u00e5\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u0103"+
		"\u0001\u0000\u0000\u0000*\u0105\u0001\u0000\u0000\u0000,\u010b\u0001\u0000"+
		"\u0000\u0000.\u0111\u0001\u0000\u0000\u00000\u0117\u0001\u0000\u0000\u0000"+
		"2\u0119\u0001\u0000\u0000\u00004\u011d\u0001\u0000\u0000\u00006\u011f"+
		"\u0001\u0000\u0000\u00008\u0126\u0001\u0000\u0000\u0000:\u012e\u0001\u0000"+
		"\u0000\u0000<\u0130\u0001\u0000\u0000\u0000>\u0138\u0001\u0000\u0000\u0000"+
		"@\u0140\u0001\u0000\u0000\u0000B\u0148\u0001\u0000\u0000\u0000D\u0153"+
		"\u0001\u0000\u0000\u0000F\u015b\u0001\u0000\u0000\u0000H\u0162\u0001\u0000"+
		"\u0000\u0000J\u0164\u0001\u0000\u0000\u0000L\u016a\u0001\u0000\u0000\u0000"+
		"N\u016e\u0001\u0000\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0003\u0004"+
		"\u0002\u0000RS\u0003\u0012\t\u0000ST\u0003\u0006\u0003\u0000TU\u0005\u0000"+
		"\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VY\u0003\b\u0004\u0000WY\u0003"+
		"\n\u0005\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0003\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]`\u0003"+
		"\b\u0004\u0000^`\u0003\f\u0006\u0000_]\u0001\u0000\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u0005\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0007"+
		"\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000"+
		"\u0000k\t\u0001\u0000\u0000\u0000lm\u0003\u0018\f\u0000m\u000b\u0001\u0000"+
		"\u0000\u0000no\u0003N\'\u0000op\u0005/\u0000\u0000pr\u0005*\u0000\u0000"+
		"qs\u0003\u000e\u0007\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0005+\u0000\u0000uv\u0005\'\u0000"+
		"\u0000vw\u0003\u0014\n\u0000wx\u0005(\u0000\u0000x\r\u0001\u0000\u0000"+
		"\u0000y~\u0003\u0010\b\u0000z{\u0005,\u0000\u0000{}\u0003\u0010\b\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0003L&\u0000\u0082"+
		"\u0083\u0005/\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0007\u0000\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0087"+
		"\u0005*\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088\u0089\u0005\'"+
		"\u0000\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b\u0005(\u0000"+
		"\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008f\u0003\b\u0004\u0000"+
		"\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u00ab\u0003\u0018\f\u0000\u0094\u0095\u0003\u001a\r\u0000\u0095"+
		"\u0096\u0005)\u0000\u0000\u0096\u00ab\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0003\u001c\u000e\u0000\u0098\u0099\u0005)\u0000\u0000\u0099\u00ab\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0003\u001e\u000f\u0000\u009b\u009c\u0005"+
		")\u0000\u0000\u009c\u00ab\u0001\u0000\u0000\u0000\u009d\u00ab\u0003 \u0010"+
		"\u0000\u009e\u00ab\u0003\"\u0011\u0000\u009f\u00ab\u0003$\u0012\u0000"+
		"\u00a0\u00ab\u0003&\u0013\u0000\u00a1\u00a2\u00032\u0019\u0000\u00a2\u00a3"+
		"\u0005)\u0000\u0000\u00a3\u00ab\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003"+
		"4\u001a\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a6\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u00036\u001b\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u0093\u0001\u0000\u0000\u0000\u00aa"+
		"\u0094\u0001\u0000\u0000\u0000\u00aa\u0097\u0001\u0000\u0000\u0000\u00aa"+
		"\u009a\u0001\u0000\u0000\u0000\u00aa\u009d\u0001\u0000\u0000\u0000\u00aa"+
		"\u009e\u0001\u0000\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a0\u0001\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003L&\u0000\u00ad\u00b0\u0005"+
		"/\u0000\u0000\u00ae\u00af\u0005\b\u0000\u0000\u00af\u00b1\u0003:\u001d"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005)\u0000\u0000"+
		"\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005/\u0000\u0000\u00b5"+
		"\u00b6\u0005\b\u0000\u0000\u00b6\u00b7\u0003:\u001d\u0000\u00b7\u001b"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9\u00ba\u0005"+
		"*\u0000\u0000\u00ba\u00bb\u0003:\u001d\u0000\u00bb\u00bc\u0005+\u0000"+
		"\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000"+
		"\u00be\u00bf\u0005*\u0000\u0000\u00bf\u00c0\u0005/\u0000\u0000\u00c0\u00c1"+
		"\u0005+\u0000\u0000\u00c1\u001f\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u000b\u0000\u0000\u00c3\u00c4\u0005*\u0000\u0000\u00c4\u00c5\u0003:\u001d"+
		"\u0000\u00c5\u00c6\u0005+\u0000\u0000\u00c6\u00c7\u0005\'\u0000\u0000"+
		"\u00c7\u00c8\u0003\u0014\n\u0000\u00c8\u00d3\u0005(\u0000\u0000\u00c9"+
		"\u00ca\u0005\r\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00cc"+
		"\u0003:\u001d\u0000\u00cc\u00cd\u0005+\u0000\u0000\u00cd\u00ce\u0005\'"+
		"\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d0\u0005(\u0000"+
		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00db\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\f\u0000\u0000"+
		"\u00d7\u00d8\u0005\'\u0000\u0000\u00d8\u00d9\u0003\u0014\n\u0000\u00d9"+
		"\u00da\u0005(\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc!\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00df\u0005"+
		"*\u0000\u0000\u00df\u00e0\u0003:\u001d\u0000\u00e0\u00e1\u0005+\u0000"+
		"\u0000\u00e1\u00e2\u0005\'\u0000\u0000\u00e2\u00e3\u0003\u0014\n\u0000"+
		"\u00e3\u00e4\u0005(\u0000\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u000f\u0000\u0000\u00e6\u00e7\u0005\'\u0000\u0000\u00e7\u00e8\u0003"+
		"\u0014\n\u0000\u00e8\u00e9\u0005(\u0000\u0000\u00e9\u00ea\u0005\u000e"+
		"\u0000\u0000\u00ea\u00eb\u0005*\u0000\u0000\u00eb\u00ec\u0003:\u001d\u0000"+
		"\u00ec\u00ed\u0005+\u0000\u0000\u00ed\u00ee\u0005)\u0000\u0000\u00ee%"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f2"+
		"\u0005*\u0000\u0000\u00f1\u00f3\u0003(\u0014\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0005)\u0000\u0000\u00f5\u00f7\u0003:\u001d\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005)\u0000\u0000\u00f9"+
		"\u00fb\u0003.\u0017\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005+\u0000\u0000\u00fd\u00fe\u0005\'\u0000\u0000\u00fe\u00ff\u0003"+
		"\u0014\n\u0000\u00ff\u0100\u0005(\u0000\u0000\u0100\'\u0001\u0000\u0000"+
		"\u0000\u0101\u0104\u0003*\u0015\u0000\u0102\u0104\u0003,\u0016\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104"+
		")\u0001\u0000\u0000\u0000\u0105\u0106\u0003L&\u0000\u0106\u0109\u0005"+
		"/\u0000\u0000\u0107\u0108\u0005\b\u0000\u0000\u0108\u010a\u0003:\u001d"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a+\u0001\u0000\u0000\u0000\u010b\u010c\u0005/\u0000\u0000\u010c"+
		"\u010d\u0005\b\u0000\u0000\u010d\u010e\u0003:\u001d\u0000\u010e-\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u00030\u0018\u0000\u0110\u0112\u0003,\u0016"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112/\u0001\u0000\u0000\u0000\u0113\u0114\u0005/\u0000\u0000\u0114"+
		"\u0118\u0007\u0001\u0000\u0000\u0115\u0116\u0007\u0001\u0000\u0000\u0116"+
		"\u0118\u0005/\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u01181\u0001\u0000\u0000\u0000\u0119\u011b\u0005"+
		"\u0013\u0000\u0000\u011a\u011c\u0003:\u001d\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c3\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0007\u0002\u0000\u0000\u011e5\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005/\u0000\u0000\u0120\u0122\u0005*\u0000\u0000\u0121\u0123"+
		"\u00038\u001c\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"+\u0000\u0000\u01257\u0001\u0000\u0000\u0000\u0126\u012b\u0003:\u001d"+
		"\u0000\u0127\u0128\u0005,\u0000\u0000\u0128\u012a\u0003:\u001d\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"9\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0003<\u001e\u0000\u012f;\u0001\u0000\u0000\u0000\u0130\u0135\u0003>"+
		"\u001f\u0000\u0131\u0132\u0007\u0003\u0000\u0000\u0132\u0134\u0003>\u001f"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136=\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0138\u013d\u0003@ \u0000\u0139\u013a\u0007\u0004\u0000\u0000\u013a\u013c"+
		"\u0003@ \u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e?\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u0145\u0003B!\u0000\u0141\u0142\u0007\u0005\u0000\u0000\u0142"+
		"\u0144\u0003B!\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146A\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014d\u0003D\"\u0000\u0149\u014a\u0007\u0006\u0000"+
		"\u0000\u014a\u014c\u0003D\"\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014eC\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005$\u0000\u0000\u0151\u0154"+
		"\u0003D\"\u0000\u0152\u0154\u0003F#\u0000\u0153\u0150\u0001\u0000\u0000"+
		"\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154E\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005*\u0000\u0000\u0156\u0157\u0003:\u001d\u0000\u0157\u0158"+
		"\u0005+\u0000\u0000\u0158\u015c\u0001\u0000\u0000\u0000\u0159\u015c\u0003"+
		"6\u001b\u0000\u015a\u015c\u0003H$\u0000\u015b\u0155\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000"+
		"\u0000\u015cG\u0001\u0000\u0000\u0000\u015d\u0163\u0005/\u0000\u0000\u015e"+
		"\u0163\u0005.\u0000\u0000\u015f\u0163\u0003J%\u0000\u0160\u0163\u0005"+
		"\u0015\u0000\u0000\u0161\u0163\u0005\u0016\u0000\u0000\u0162\u015d\u0001"+
		"\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000\u0000\u0162\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0163I\u0001\u0000\u0000\u0000\u0164\u0166\u0005-\u0000"+
		"\u0000\u0165\u0167\u00054\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u00053\u0000\u0000\u0169K\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0007\u0007\u0000\u0000\u016bM\u0001\u0000\u0000\u0000\u016c\u016f\u0003"+
		"L&\u0000\u016d\u016f\u0005\u0007\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016fO\u0001\u0000\u0000\u0000"+
		" XZ_agr~\u008e\u0090\u00aa\u00b0\u00d3\u00db\u00f2\u00f6\u00fa\u0103\u0109"+
		"\u0111\u0117\u011b\u0122\u012b\u0135\u013d\u0145\u014d\u0153\u015b\u0162"+
		"\u0166\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}