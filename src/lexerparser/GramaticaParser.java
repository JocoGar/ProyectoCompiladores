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
		PAL_VACIO=7, PAL_ASIGNA=8, PAL_PROYECTAR=9, PAL_CAPTAR=10, PAL_VALIDAR=11, 
		PAL_ALTERNO=12, PAL_SIGUIENTE=13, PAL_REPETIR=14, PAL_INICIAR=15, PAL_LOOP=16, 
		PAL_LIGHT=17, PAL_CERRADO=18, PAL_DEFENSE=19, ENTONCES=20, PAL_PARAR=21, 
		PAL_SALTAR=22, PAL_DAR=23, PAL_RAIZ=24, PAL_VERDAD=25, PAL_MENTIRA=26, 
		PAL_UNE=27, PAL_VECES=28, PAL_QUITA=29, PAL_REPARTE=30, PAL_SOBRA=31, 
		PAL_SUPERA=32, PAL_BAJO=33, PAL_MINIMO=34, PAL_TOPE=35, PAL_CALCA=36, 
		PAL_AJENO=37, PAL_VINCULO=38, PAL_OPCION=39, PAL_OPUESTO=40, PAL_SUBIR=41, 
		PAL_BAJAR=42, CONTIENE=43, LISTO=44, HECHO=45, ABRE=46, CIERRA=47, SEPARA=48, 
		INICIO_PONCHO=49, FIN_PONCHO=50, CADENA_INICIO=51, NUMERO=52, IDENTIFICADOR=53, 
		COMENTARIO_LINEA=54, COMENTARIO_BLOQUE=55, WS=56, CADENA_CIERRA=57, TEXTO_CADENA=58;
	public static final int
		RULE_programa = 0, RULE_seccionGlobales = 1, RULE_seccionFunciones = 2, 
		RULE_comentariosFinales = 3, RULE_comentario = 4, RULE_declaracionGlobal = 5, 
		RULE_declaracionFuncion = 6, RULE_parametros = 7, RULE_parametro = 8, 
		RULE_bloquePrincipal = 9, RULE_bloque = 10, RULE_instruccion = 11, RULE_declaracionVariable = 12, 
		RULE_declaracionArreglo = 13, RULE_asignacion = 14, RULE_asignacionArreglo = 15, 
		RULE_instruccionImprimir = 16, RULE_instruccionCaptar = 17, RULE_destinoEntrada = 18, 
		RULE_estructuraCondicional = 19, RULE_estructuraMientras = 20, RULE_estructuraHacerMientras = 21, 
		RULE_estructuraPara = 22, RULE_inicializacionPara = 23, RULE_declaracionPara = 24, 
		RULE_asignacionSimple = 25, RULE_actualizacionPara = 26, RULE_actualizacion = 27, 
		RULE_estructuraSwitch = 28, RULE_casoSwitch = 29, RULE_defectoSwitch = 30, 
		RULE_valorCaso = 31, RULE_instruccionRetorno = 32, RULE_instruccionControlFlujo = 33, 
		RULE_llamadaFuncion = 34, RULE_argumentos = 35, RULE_expresion = 36, RULE_expresionLogica = 37, 
		RULE_expresionRelacional = 38, RULE_expresionAditiva = 39, RULE_expresionMultiplicativa = 40, 
		RULE_expresionUnaria = 41, RULE_expresionPrimaria = 42, RULE_accesoArreglo = 43, 
		RULE_literal = 44, RULE_cadenaLiteral = 45, RULE_tipoVariable = 46, RULE_tipoRetorno = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionGlobales", "seccionFunciones", "comentariosFinales", 
			"comentario", "declaracionGlobal", "declaracionFuncion", "parametros", 
			"parametro", "bloquePrincipal", "bloque", "instruccion", "declaracionVariable", 
			"declaracionArreglo", "asignacion", "asignacionArreglo", "instruccionImprimir", 
			"instruccionCaptar", "destinoEntrada", "estructuraCondicional", "estructuraMientras", 
			"estructuraHacerMientras", "estructuraPara", "inicializacionPara", "declaracionPara", 
			"asignacionSimple", "actualizacionPara", "actualizacion", "estructuraSwitch", 
			"casoSwitch", "defectoSwitch", "valorCaso", "instruccionRetorno", "instruccionControlFlujo", 
			"llamadaFuncion", "argumentos", "expresion", "expresionLogica", "expresionRelacional", 
			"expresionAditiva", "expresionMultiplicativa", "expresionUnaria", "expresionPrimaria", 
			"accesoArreglo", "literal", "cadenaLiteral", "tipoVariable", "tipoRetorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'num'", "'real'", "'preciso'", "'signo'", "'text'", "'estado'", 
			"'empty'", "'asigna'", "'proyectar'", "'captar'", "'validar'", "'alterno'", 
			"'siguiente'", "'repetir'", "'iniciar'", "'loop'", "'light'", "'cerrado'", 
			"'defense'", "'entonces'", "'parar'", "'saltar'", "'dar'", "'raiz'", 
			"'verdad'", "'mentira'", "'une'", "'veces'", "'quita'", "'reparte'", 
			"'sobra'", "'supera'", "'bajo'", "'minimo'", "'tope'", "'calca'", "'ajeno'", 
			"'vinculo'", "'opcion'", "'opuesto'", "'subir'", "'bajar'", "'contiene'", 
			"'listo'", "'hecho'", "'abre'", "'cierra'", "'separa'", "'inicio_poncho'", 
			"'fin_poncho'", "'cadena'", null, null, null, null, null, "'fin_cadena'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAL_NUMERO", "PAL_REAL", "PAL_PRECISO", "PAL_SIGNO", "PAL_TEXTO", 
			"PAL_ESTADO", "PAL_VACIO", "PAL_ASIGNA", "PAL_PROYECTAR", "PAL_CAPTAR", 
			"PAL_VALIDAR", "PAL_ALTERNO", "PAL_SIGUIENTE", "PAL_REPETIR", "PAL_INICIAR", 
			"PAL_LOOP", "PAL_LIGHT", "PAL_CERRADO", "PAL_DEFENSE", "ENTONCES", "PAL_PARAR", 
			"PAL_SALTAR", "PAL_DAR", "PAL_RAIZ", "PAL_VERDAD", "PAL_MENTIRA", "PAL_UNE", 
			"PAL_VECES", "PAL_QUITA", "PAL_REPARTE", "PAL_SOBRA", "PAL_SUPERA", "PAL_BAJO", 
			"PAL_MINIMO", "PAL_TOPE", "PAL_CALCA", "PAL_AJENO", "PAL_VINCULO", "PAL_OPCION", 
			"PAL_OPUESTO", "PAL_SUBIR", "PAL_BAJAR", "CONTIENE", "LISTO", "HECHO", 
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
			setState(96);
			seccionGlobales();
			setState(97);
			seccionFunciones();
			setState(98);
			bloquePrincipal();
			setState(99);
			comentariosFinales();
			setState(100);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitSeccionGlobales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionGlobalesContext seccionGlobales() throws RecognitionException {
		SeccionGlobalesContext _localctx = new SeccionGlobalesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seccionGlobales);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(104);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(102);
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
						setState(103);
						declaracionGlobal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(108);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitSeccionFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionFuncionesContext seccionFunciones() throws RecognitionException {
		SeccionFuncionesContext _localctx = new SeccionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seccionFunciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(111);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(109);
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
						setState(110);
						declaracionFuncion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitComentariosFinales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentariosFinalesContext comentariosFinales() throws RecognitionException {
		ComentariosFinalesContext _localctx = new ComentariosFinalesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comentariosFinales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(116);
				comentario();
				}
				}
				setState(121);
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
		enterRule(_localctx, 8, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 10, RULE_declaracionGlobal);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
		enterRule(_localctx, 12, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			tipoRetorno();
			setState(129);
			match(IDENTIFICADOR);
			setState(130);
			match(ABRE);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) {
				{
				setState(131);
				parametros();
				}
			}

			setState(134);
			match(CIERRA);
			setState(135);
			match(CONTIENE);
			setState(136);
			bloque();
			setState(137);
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
		enterRule(_localctx, 14, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			parametro();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(140);
				match(SEPARA);
				setState(141);
				parametro();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			tipoVariable();
			setState(148);
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
		enterRule(_localctx, 18, RULE_bloquePrincipal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PAL_VACIO);
			setState(151);
			match(PAL_RAIZ);
			setState(152);
			match(ABRE);
			setState(153);
			match(CIERRA);
			setState(154);
			match(CONTIENE);
			setState(155);
			bloque();
			setState(156);
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
		enterRule(_localctx, 20, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63056991867883134L) != 0)) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(158);
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
				case PAL_LIGHT:
				case PAL_PARAR:
				case PAL_SALTAR:
				case PAL_DAR:
				case PAL_SUBIR:
				case PAL_BAJAR:
				case IDENTIFICADOR:
					{
					setState(159);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
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
		public AsignacionArregloContext asignacionArreglo() {
			return getRuleContext(AsignacionArregloContext.class,0);
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
		enterRule(_localctx, 22, RULE_instruccion);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				declaracionArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				asignacion();
				setState(168);
				match(HECHO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				asignacionArreglo();
				setState(171);
				match(HECHO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				actualizacion();
				setState(174);
				match(HECHO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				instruccionImprimir();
				setState(177);
				match(HECHO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				instruccionCaptar();
				setState(180);
				match(HECHO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				estructuraCondicional();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				estructuraMientras();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				estructuraHacerMientras();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(185);
				estructuraPara();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(186);
				estructuraSwitch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(187);
				instruccionRetorno();
				setState(188);
				match(HECHO);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(190);
				instruccionControlFlujo();
				setState(191);
				match(HECHO);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				llamadaFuncion();
				setState(194);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			tipoVariable();
			setState(199);
			match(IDENTIFICADOR);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(200);
				match(PAL_ASIGNA);
				setState(201);
				expresion();
				}
			}

			setState(204);
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
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode INICIO_PONCHO() { return getToken(GramaticaParser.INICIO_PONCHO, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public TerminalNode FIN_PONCHO() { return getToken(GramaticaParser.FIN_PONCHO, 0); }
		public TerminalNode HECHO() { return getToken(GramaticaParser.HECHO, 0); }
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
		enterRule(_localctx, 26, RULE_declaracionArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			tipoVariable();
			setState(207);
			match(IDENTIFICADOR);
			setState(208);
			match(INICIO_PONCHO);
			setState(209);
			match(NUMERO);
			setState(210);
			match(FIN_PONCHO);
			setState(211);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDENTIFICADOR);
			setState(214);
			match(PAL_ASIGNA);
			setState(215);
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
	public static class AsignacionArregloContext extends ParserRuleContext {
		public AccesoArregloContext accesoArreglo() {
			return getRuleContext(AccesoArregloContext.class,0);
		}
		public TerminalNode PAL_ASIGNA() { return getToken(GramaticaParser.PAL_ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).enterAsignacionArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaParserListener ) ((GramaticaParserListener)listener).exitAsignacionArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitAsignacionArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionArregloContext asignacionArreglo() throws RecognitionException {
		AsignacionArregloContext _localctx = new AsignacionArregloContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacionArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			accesoArreglo();
			setState(218);
			match(PAL_ASIGNA);
			setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitInstruccionImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionImprimirContext instruccionImprimir() throws RecognitionException {
		InstruccionImprimirContext _localctx = new InstruccionImprimirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instruccionImprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PAL_PROYECTAR);
			setState(222);
			match(ABRE);
			setState(223);
			expresion();
			setState(224);
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
		enterRule(_localctx, 34, RULE_instruccionCaptar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(PAL_CAPTAR);
			setState(227);
			match(ABRE);
			setState(228);
			destinoEntrada();
			setState(229);
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
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public AccesoArregloContext accesoArreglo() {
			return getRuleContext(AccesoArregloContext.class,0);
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
		enterRule(_localctx, 36, RULE_destinoEntrada);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				accesoArreglo();
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
		enterRule(_localctx, 38, RULE_estructuraCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PAL_VALIDAR);
			setState(236);
			match(ABRE);
			setState(237);
			expresion();
			setState(238);
			match(CIERRA);
			setState(239);
			match(CONTIENE);
			setState(240);
			bloque();
			setState(241);
			match(LISTO);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_SIGUIENTE) {
				{
				{
				setState(242);
				match(PAL_SIGUIENTE);
				setState(243);
				match(ABRE);
				setState(244);
				expresion();
				setState(245);
				match(CIERRA);
				setState(246);
				match(CONTIENE);
				setState(247);
				bloque();
				setState(248);
				match(LISTO);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ALTERNO) {
				{
				setState(255);
				match(PAL_ALTERNO);
				setState(256);
				match(CONTIENE);
				setState(257);
				bloque();
				setState(258);
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
		enterRule(_localctx, 40, RULE_estructuraMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(PAL_REPETIR);
			setState(263);
			match(ABRE);
			setState(264);
			expresion();
			setState(265);
			match(CIERRA);
			setState(266);
			match(CONTIENE);
			setState(267);
			bloque();
			setState(268);
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
		enterRule(_localctx, 42, RULE_estructuraHacerMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(PAL_INICIAR);
			setState(271);
			match(CONTIENE);
			setState(272);
			bloque();
			setState(273);
			match(LISTO);
			setState(274);
			match(PAL_REPETIR);
			setState(275);
			match(ABRE);
			setState(276);
			expresion();
			setState(277);
			match(CIERRA);
			setState(278);
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
		enterRule(_localctx, 44, RULE_estructuraPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(PAL_LOOP);
			setState(281);
			match(ABRE);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254741118L) != 0)) {
				{
				setState(282);
				inicializacionPara();
				}
			}

			setState(285);
			match(HECHO);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15834067589136384L) != 0)) {
				{
				setState(286);
				expresion();
				}
			}

			setState(289);
			match(HECHO);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9013796324507648L) != 0)) {
				{
				setState(290);
				actualizacionPara();
				}
			}

			setState(293);
			match(CIERRA);
			setState(294);
			match(CONTIENE);
			setState(295);
			bloque();
			setState(296);
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
		enterRule(_localctx, 46, RULE_inicializacionPara);
		try {
			setState(300);
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
				setState(298);
				declaracionPara();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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
		enterRule(_localctx, 48, RULE_declaracionPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			tipoVariable();
			setState(303);
			match(IDENTIFICADOR);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_ASIGNA) {
				{
				setState(304);
				match(PAL_ASIGNA);
				setState(305);
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
		enterRule(_localctx, 50, RULE_asignacionSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IDENTIFICADOR);
			setState(309);
			match(PAL_ASIGNA);
			setState(310);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitActualizacionPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionParaContext actualizacionPara() throws RecognitionException {
		ActualizacionParaContext _localctx = new ActualizacionParaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actualizacionPara);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				actualizacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitActualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actualizacion);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(IDENTIFICADOR);
				setState(317);
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
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==PAL_SUBIR || _la==PAL_BAJAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
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
		enterRule(_localctx, 56, RULE_estructuraSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(PAL_LIGHT);
			setState(323);
			match(ABRE);
			setState(324);
			expresion();
			setState(325);
			match(CIERRA);
			setState(326);
			match(CONTIENE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_CERRADO) {
				{
				{
				setState(327);
				casoSwitch();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAL_DEFENSE) {
				{
				setState(333);
				defectoSwitch();
				}
			}

			setState(336);
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
		enterRule(_localctx, 58, RULE_casoSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(PAL_CERRADO);
			setState(339);
			valorCaso();
			setState(340);
			match(ENTONCES);
			setState(341);
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
		enterRule(_localctx, 60, RULE_defectoSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PAL_DEFENSE);
			setState(344);
			match(ENTONCES);
			setState(345);
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
		enterRule(_localctx, 62, RULE_valorCaso);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(NUMERO);
				}
				break;
			case CADENA_INICIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				cadenaLiteral();
				}
				break;
			case PAL_VERDAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(PAL_VERDAD);
				}
				break;
			case PAL_MENTIRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
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
		enterRule(_localctx, 64, RULE_instruccionRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(PAL_DAR);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15834067589136384L) != 0)) {
				{
				setState(354);
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
		enterRule(_localctx, 66, RULE_instruccionControlFlujo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 68, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IDENTIFICADOR);
			setState(360);
			match(ABRE);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15834067589136384L) != 0)) {
				{
				setState(361);
				argumentos();
				}
			}

			setState(364);
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
		enterRule(_localctx, 70, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			expresion();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARA) {
				{
				{
				setState(367);
				match(SEPARA);
				setState(368);
				expresion();
				}
				}
				setState(373);
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
		enterRule(_localctx, 72, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 74, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expresionRelacional();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_VINCULO || _la==PAL_OPCION) {
				{
				{
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==PAL_VINCULO || _la==PAL_OPCION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(378);
				expresionRelacional();
				}
				}
				setState(383);
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
		enterRule(_localctx, 76, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expresionAditiva();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) {
				{
				{
				setState(385);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				expresionAditiva();
				}
				}
				setState(391);
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
		enterRule(_localctx, 78, RULE_expresionAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			expresionMultiplicativa();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAL_UNE || _la==PAL_QUITA) {
				{
				{
				setState(393);
				_la = _input.LA(1);
				if ( !(_la==PAL_UNE || _la==PAL_QUITA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				expresionMultiplicativa();
				}
				}
				setState(399);
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
		enterRule(_localctx, 80, RULE_expresionMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			expresionUnaria();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3489660928L) != 0)) {
				{
				{
				setState(401);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3489660928L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(402);
				expresionUnaria();
				}
				}
				setState(407);
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
		enterRule(_localctx, 82, RULE_expresionUnaria);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAL_OPUESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(PAL_OPUESTO);
				setState(409);
				expresionUnaria();
				}
				break;
			case PAL_QUITA:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(PAL_QUITA);
				setState(411);
				expresionUnaria();
				}
				break;
			case PAL_VERDAD:
			case PAL_MENTIRA:
			case ABRE:
			case CADENA_INICIO:
			case NUMERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
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
		enterRule(_localctx, 84, RULE_expresionPrimaria);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(ABRE);
				setState(416);
				expresion();
				setState(417);
				match(CIERRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				accesoArreglo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
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
		enterRule(_localctx, 86, RULE_accesoArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(IDENTIFICADOR);
			setState(425);
			match(INICIO_PONCHO);
			setState(426);
			expresion();
			setState(427);
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
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(IDENTIFICADOR);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(NUMERO);
				}
				break;
			case CADENA_INICIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				cadenaLiteral();
				}
				break;
			case PAL_VERDAD:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(PAL_VERDAD);
				}
				break;
			case PAL_MENTIRA:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitCadenaLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaLiteralContext cadenaLiteral() throws RecognitionException {
		CadenaLiteralContext _localctx = new CadenaLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cadenaLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(CADENA_INICIO);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO_CADENA) {
				{
				setState(437);
				match(TEXTO_CADENA);
				}
			}

			setState(440);
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
		enterRule(_localctx, 92, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaParserVisitor ) return ((GramaticaParserVisitor<? extends T>)visitor).visitTipoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tipoRetorno);
		try {
			setState(446);
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
				setState(444);
				tipoVariable();
				}
				break;
			case PAL_VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
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
		"\u0004\u0001:\u01c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"i\b\u0001\n\u0001\f\u0001l\t\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"p\b\u0002\n\u0002\f\u0002s\t\u0002\u0001\u0003\u0005\u0003v\b\u0003\n"+
		"\u0003\f\u0003y\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u007f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0085\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008f\b\u0007"+
		"\n\u0007\f\u0007\u0092\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n\u00a1\b\n\n\n\f\n\u00a4\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c5\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cb\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ea\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fb"+
		"\b\u0013\n\u0013\f\u0013\u00fe\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0105\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u011c\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0120\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0124\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u012d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0133\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u013b\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0141\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0149"+
		"\b\u001c\n\u001c\f\u001c\u014c\t\u001c\u0001\u001c\u0003\u001c\u014f\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0160\b\u001f\u0001"+
		" \u0001 \u0003 \u0164\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u016b\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u0172\b#\n#\f#"+
		"\u0175\t#\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u017c\b%\n%\f%\u017f"+
		"\t%\u0001&\u0001&\u0001&\u0005&\u0184\b&\n&\f&\u0187\t&\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u018c\b\'\n\'\f\'\u018f\t\'\u0001(\u0001(\u0001(\u0005"+
		"(\u0194\b(\n(\f(\u0197\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u019e"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01a7\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01b3\b,\u0001-\u0001-\u0003-\u01b7\b-\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0003/\u01bf\b/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^\u0000\b\u0001\u000067\u0001\u0000)*\u0001\u0000"+
		"\u0015\u0016\u0001\u0000&\'\u0001\u0000 %\u0002\u0000\u001b\u001b\u001d"+
		"\u001d\u0002\u0000\u001c\u001c\u001e\u001f\u0001\u0000\u0001\u0006\u01ca"+
		"\u0000`\u0001\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004q"+
		"\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\bz\u0001\u0000"+
		"\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000"+
		"\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000"+
		"\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000"+
		"\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000"+
		"\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00d5\u0001\u0000\u0000\u0000"+
		"\u001e\u00d9\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\""+
		"\u00e2\u0001\u0000\u0000\u0000$\u00e9\u0001\u0000\u0000\u0000&\u00eb\u0001"+
		"\u0000\u0000\u0000(\u0106\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000"+
		"\u0000,\u0118\u0001\u0000\u0000\u0000.\u012c\u0001\u0000\u0000\u00000"+
		"\u012e\u0001\u0000\u0000\u00002\u0134\u0001\u0000\u0000\u00004\u013a\u0001"+
		"\u0000\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u0142\u0001\u0000\u0000"+
		"\u0000:\u0152\u0001\u0000\u0000\u0000<\u0157\u0001\u0000\u0000\u0000>"+
		"\u015f\u0001\u0000\u0000\u0000@\u0161\u0001\u0000\u0000\u0000B\u0165\u0001"+
		"\u0000\u0000\u0000D\u0167\u0001\u0000\u0000\u0000F\u016e\u0001\u0000\u0000"+
		"\u0000H\u0176\u0001\u0000\u0000\u0000J\u0178\u0001\u0000\u0000\u0000L"+
		"\u0180\u0001\u0000\u0000\u0000N\u0188\u0001\u0000\u0000\u0000P\u0190\u0001"+
		"\u0000\u0000\u0000R\u019d\u0001\u0000\u0000\u0000T\u01a6\u0001\u0000\u0000"+
		"\u0000V\u01a8\u0001\u0000\u0000\u0000X\u01b2\u0001\u0000\u0000\u0000Z"+
		"\u01b4\u0001\u0000\u0000\u0000\\\u01ba\u0001\u0000\u0000\u0000^\u01be"+
		"\u0001\u0000\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0003\u0004\u0002"+
		"\u0000bc\u0003\u0012\t\u0000cd\u0003\u0006\u0003\u0000de\u0005\u0000\u0000"+
		"\u0001e\u0001\u0001\u0000\u0000\u0000fi\u0003\b\u0004\u0000gi\u0003\n"+
		"\u0005\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u0003\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mp\u0003\b\u0004"+
		"\u0000np\u0003\f\u0006\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r\u0005\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tv\u0003\b\u0004\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0007\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0007\u0000\u0000\u0000{\t\u0001"+
		"\u0000\u0000\u0000|\u007f\u0003\u0018\f\u0000}\u007f\u0003\u001a\r\u0000"+
		"~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u000b\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003^/\u0000\u0081\u0082\u00055\u0000"+
		"\u0000\u0082\u0084\u0005.\u0000\u0000\u0083\u0085\u0003\u000e\u0007\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087"+
		"\u0088\u0005+\u0000\u0000\u0088\u0089\u0003\u0014\n\u0000\u0089\u008a"+
		"\u0005,\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u0090\u0003"+
		"\u0010\b\u0000\u008c\u008d\u00050\u0000\u0000\u008d\u008f\u0003\u0010"+
		"\b\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003\\.\u0000\u0094\u0095\u00055\u0000\u0000\u0095"+
		"\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0007\u0000\u0000\u0097"+
		"\u0098\u0005\u0018\u0000\u0000\u0098\u0099\u0005.\u0000\u0000\u0099\u009a"+
		"\u0005/\u0000\u0000\u009a\u009b\u0005+\u0000\u0000\u009b\u009c\u0003\u0014"+
		"\n\u0000\u009c\u009d\u0005,\u0000\u0000\u009d\u0013\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0003\b\u0004\u0000\u009f\u00a1\u0003\u0016\u000b\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00c5\u0003\u0018\f\u0000\u00a6"+
		"\u00c5\u0003\u001a\r\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8\u00a9"+
		"\u0005-\u0000\u0000\u00a9\u00c5\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003"+
		"\u001e\u000f\u0000\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u00036\u001b\u0000\u00ae\u00af\u0005-\u0000\u0000"+
		"\u00af\u00c5\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1"+
		"\u00b2\u0005-\u0000\u0000\u00b2\u00c5\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0003\"\u0011\u0000\u00b4\u00b5\u0005-\u0000\u0000\u00b5\u00c5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00c5\u0003&\u0013\u0000\u00b7\u00c5\u0003(\u0014"+
		"\u0000\u00b8\u00c5\u0003*\u0015\u0000\u00b9\u00c5\u0003,\u0016\u0000\u00ba"+
		"\u00c5\u00038\u001c\u0000\u00bb\u00bc\u0003@ \u0000\u00bc\u00bd\u0005"+
		"-\u0000\u0000\u00bd\u00c5\u0001\u0000\u0000\u0000\u00be\u00bf\u0003B!"+
		"\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0003D\"\u0000\u00c2\u00c3\u0005-\u0000\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00a5\u0001\u0000\u0000\u0000\u00c4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00a7\u0001\u0000\u0000\u0000\u00c4\u00aa"+
		"\u0001\u0000\u0000\u0000\u00c4\u00ad\u0001\u0000\u0000\u0000\u00c4\u00b0"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b3\u0001\u0000\u0000\u0000\u00c4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b7\u0001\u0000\u0000\u0000\u00c4\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4\u00be"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u0017"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\\.\u0000\u00c7\u00ca\u0005"+
		"5\u0000\u0000\u00c8\u00c9\u0005\b\u0000\u0000\u00c9\u00cb\u0003H$\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005-\u0000\u0000\u00cd"+
		"\u0019\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\\.\u0000\u00cf\u00d0"+
		"\u00055\u0000\u0000\u00d0\u00d1\u00051\u0000\u0000\u00d1\u00d2\u00054"+
		"\u0000\u0000\u00d2\u00d3\u00052\u0000\u0000\u00d3\u00d4\u0005-\u0000\u0000"+
		"\u00d4\u001b\u0001\u0000\u0000\u0000\u00d5\u00d6\u00055\u0000\u0000\u00d6"+
		"\u00d7\u0005\b\u0000\u0000\u00d7\u00d8\u0003H$\u0000\u00d8\u001d\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0003V+\u0000\u00da\u00db\u0005\b\u0000"+
		"\u0000\u00db\u00dc\u0003H$\u0000\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\t\u0000\u0000\u00de\u00df\u0005.\u0000\u0000\u00df\u00e0"+
		"\u0003H$\u0000\u00e0\u00e1\u0005/\u0000\u0000\u00e1!\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0005.\u0000\u0000"+
		"\u00e4\u00e5\u0003$\u0012\u0000\u00e5\u00e6\u0005/\u0000\u0000\u00e6#"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u00055\u0000\u0000\u00e8\u00ea\u0003"+
		"V+\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea%\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u000b\u0000\u0000"+
		"\u00ec\u00ed\u0005.\u0000\u0000\u00ed\u00ee\u0003H$\u0000\u00ee\u00ef"+
		"\u0005/\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f1\u0003\u0014"+
		"\n\u0000\u00f1\u00fc\u0005,\u0000\u0000\u00f2\u00f3\u0005\r\u0000\u0000"+
		"\u00f3\u00f4\u0005.\u0000\u0000\u00f4\u00f5\u0003H$\u0000\u00f5\u00f6"+
		"\u0005/\u0000\u0000\u00f6\u00f7\u0005+\u0000\u0000\u00f7\u00f8\u0003\u0014"+
		"\n\u0000\u00f8\u00f9\u0005,\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u0104\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0101\u0005+\u0000\u0000"+
		"\u0101\u0102\u0003\u0014\n\u0000\u0102\u0103\u0005,\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u00ff\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005\u000e\u0000\u0000\u0107\u0108\u0005.\u0000\u0000\u0108\u0109\u0003"+
		"H$\u0000\u0109\u010a\u0005/\u0000\u0000\u010a\u010b\u0005+\u0000\u0000"+
		"\u010b\u010c\u0003\u0014\n\u0000\u010c\u010d\u0005,\u0000\u0000\u010d"+
		")\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u000f\u0000\u0000\u010f\u0110"+
		"\u0005+\u0000\u0000\u0110\u0111\u0003\u0014\n\u0000\u0111\u0112\u0005"+
		",\u0000\u0000\u0112\u0113\u0005\u000e\u0000\u0000\u0113\u0114\u0005.\u0000"+
		"\u0000\u0114\u0115\u0003H$\u0000\u0115\u0116\u0005/\u0000\u0000\u0116"+
		"\u0117\u0005-\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u0010\u0000\u0000\u0119\u011b\u0005.\u0000\u0000\u011a\u011c\u0003.\u0017"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0005-\u0000\u0000"+
		"\u011e\u0120\u0003H$\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0005-\u0000\u0000\u0122\u0124\u00034\u001a\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005/\u0000\u0000\u0126\u0127\u0005+\u0000\u0000"+
		"\u0127\u0128\u0003\u0014\n\u0000\u0128\u0129\u0005,\u0000\u0000\u0129"+
		"-\u0001\u0000\u0000\u0000\u012a\u012d\u00030\u0018\u0000\u012b\u012d\u0003"+
		"2\u0019\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000"+
		"\u0000\u0000\u012d/\u0001\u0000\u0000\u0000\u012e\u012f\u0003\\.\u0000"+
		"\u012f\u0132\u00055\u0000\u0000\u0130\u0131\u0005\b\u0000\u0000\u0131"+
		"\u0133\u0003H$\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u01331\u0001\u0000\u0000\u0000\u0134\u0135\u00055\u0000"+
		"\u0000\u0135\u0136\u0005\b\u0000\u0000\u0136\u0137\u0003H$\u0000\u0137"+
		"3\u0001\u0000\u0000\u0000\u0138\u013b\u00036\u001b\u0000\u0139\u013b\u0003"+
		"2\u0019\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000"+
		"\u0000\u0000\u013b5\u0001\u0000\u0000\u0000\u013c\u013d\u00055\u0000\u0000"+
		"\u013d\u0141\u0007\u0001\u0000\u0000\u013e\u013f\u0007\u0001\u0000\u0000"+
		"\u013f\u0141\u00055\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u01417\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0011\u0000\u0000\u0143\u0144\u0005.\u0000\u0000\u0144\u0145\u0003"+
		"H$\u0000\u0145\u0146\u0005/\u0000\u0000\u0146\u014a\u0005+\u0000\u0000"+
		"\u0147\u0149\u0003:\u001d\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u014f\u0003<\u001e\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005,\u0000\u0000\u01519\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u0012\u0000\u0000\u0153\u0154\u0003>\u001f"+
		"\u0000\u0154\u0155\u0005\u0014\u0000\u0000\u0155\u0156\u0003\u0014\n\u0000"+
		"\u0156;\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0013\u0000\u0000\u0158"+
		"\u0159\u0005\u0014\u0000\u0000\u0159\u015a\u0003\u0014\n\u0000\u015a="+
		"\u0001\u0000\u0000\u0000\u015b\u0160\u00054\u0000\u0000\u015c\u0160\u0003"+
		"Z-\u0000\u015d\u0160\u0005\u0019\u0000\u0000\u015e\u0160\u0005\u001a\u0000"+
		"\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u0160?\u0001\u0000\u0000\u0000\u0161\u0163\u0005\u0017\u0000\u0000"+
		"\u0162\u0164\u0003H$\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164A\u0001\u0000\u0000\u0000\u0165\u0166\u0007"+
		"\u0002\u0000\u0000\u0166C\u0001\u0000\u0000\u0000\u0167\u0168\u00055\u0000"+
		"\u0000\u0168\u016a\u0005.\u0000\u0000\u0169\u016b\u0003F#\u0000\u016a"+
		"\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005/\u0000\u0000\u016dE\u0001"+
		"\u0000\u0000\u0000\u016e\u0173\u0003H$\u0000\u016f\u0170\u00050\u0000"+
		"\u0000\u0170\u0172\u0003H$\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174G\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0003J%\u0000\u0177I\u0001\u0000"+
		"\u0000\u0000\u0178\u017d\u0003L&\u0000\u0179\u017a\u0007\u0003\u0000\u0000"+
		"\u017a\u017c\u0003L&\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017eK\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u0180\u0185\u0003N\'\u0000\u0181\u0182\u0007\u0004"+
		"\u0000\u0000\u0182\u0184\u0003N\'\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186M\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018d\u0003P(\u0000\u0189\u018a"+
		"\u0007\u0005\u0000\u0000\u018a\u018c\u0003P(\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018eO\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0195\u0003R)\u0000\u0191"+
		"\u0192\u0007\u0006\u0000\u0000\u0192\u0194\u0003R)\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196Q\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005(\u0000"+
		"\u0000\u0199\u019e\u0003R)\u0000\u019a\u019b\u0005\u001d\u0000\u0000\u019b"+
		"\u019e\u0003R)\u0000\u019c\u019e\u0003T*\u0000\u019d\u0198\u0001\u0000"+
		"\u0000\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019eS\u0001\u0000\u0000\u0000\u019f\u01a0\u0005.\u0000\u0000"+
		"\u01a0\u01a1\u0003H$\u0000\u01a1\u01a2\u0005/\u0000\u0000\u01a2\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a7\u0003D\"\u0000\u01a4\u01a7\u0003"+
		"V+\u0000\u01a5\u01a7\u0003X,\u0000\u01a6\u019f\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7U\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u00055\u0000\u0000\u01a9\u01aa\u00051\u0000\u0000\u01aa\u01ab\u0003"+
		"H$\u0000\u01ab\u01ac\u00052\u0000\u0000\u01acW\u0001\u0000\u0000\u0000"+
		"\u01ad\u01b3\u00055\u0000\u0000\u01ae\u01b3\u00054\u0000\u0000\u01af\u01b3"+
		"\u0003Z-\u0000\u01b0\u01b3\u0005\u0019\u0000\u0000\u01b1\u01b3\u0005\u001a"+
		"\u0000\u0000\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b2\u01af\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3Y\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u00053\u0000\u0000\u01b5\u01b7\u0005:\u0000\u0000\u01b6"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u00059\u0000\u0000\u01b9[\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0007\u0007\u0000\u0000\u01bb]\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bf\u0003\\.\u0000\u01bd\u01bf\u0005\u0007\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf_\u0001\u0000\u0000\u0000%hjoqw~\u0084\u0090\u00a0\u00a2\u00c4"+
		"\u00ca\u00e9\u00fc\u0104\u011b\u011f\u0123\u012c\u0132\u013a\u0140\u014a"+
		"\u014e\u015f\u0163\u016a\u0173\u017d\u0185\u018d\u0195\u019d\u01a6\u01b2"+
		"\u01b6\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}