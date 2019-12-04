// Generated from /home/shi/Documents/compiladores/trabalho_pratico/2-tp/src/main/java/javalessLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javalessLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, EXT=2, PRI=3, PRO=4, PUB=5, CLA=6, THIS=7, NEW=8, NUL=9, IMP=10, 
		PAC=11, RET=12, SUP=13, IF=14, WHI=15, ELS=16, INS=17, INT=18, CHA=19, 
		VOI=20, BOO=21, STA=22, FAL=23, TRU=24, Identifier=25, Numl=26, CharLiteral=27, 
		StringLiteral=28, BoolLiteral=29, Atrib=30, AtrArit=31, AND=32, EQL=33, 
		LT=34, LTE=35, PLU=36, SUB=37, TIM=38, PPL=39, SSB=40, NOT=41, VOP=42, 
		VCL=43, KOP=44, KCL=45, AP=46, FP=47, Str=48, EndL=49, PTR=50, COMA=51, 
		WS=52, COMMENT=53, LINE_COMMENT=54, LOWW=55, UPPW=56, WORD=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", "IMP", 
			"PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", "VOI", 
			"BOO", "STA", "FAL", "TRU", "Identifier", "Numl", "CharLiteral", "StringLiteral", 
			"BoolLiteral", "Atrib", "AtrArit", "AND", "EQL", "LT", "LTE", "PLU", 
			"SUB", "TIM", "PPL", "SSB", "NOT", "VOP", "VCL", "KOP", "KCL", "AP", 
			"FP", "Str", "EndL", "PTR", "COMA", "WS", "COMMENT", "LINE_COMMENT", 
			"LOWW", "UPPW", "WORD", "ExponentPart", "Digits", "LetterOrDigit", "Letter", 
			"EscapeSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'private'", "'protected'", "'public'", 
			"'class'", "'this'", "'new'", "'null'", "'import'", "'package'", "'return'", 
			"'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", "'char'", 
			"'void'", "'boolean'", "'static'", "'false'", "'true'", null, null, null, 
			null, null, "'='", "'+='", "'&&'", "'=='", "'>'", "'<='", "'+'", "'-'", 
			"'*'", "'++'", "'--'", "'!'", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			null, "';'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", 
			"IMP", "PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", 
			"VOI", "BOO", "STA", "FAL", "TRU", "Identifier", "Numl", "CharLiteral", 
			"StringLiteral", "BoolLiteral", "Atrib", "AtrArit", "AND", "EQL", "LT", 
			"LTE", "PLU", "SUB", "TIM", "PPL", "SSB", "NOT", "VOP", "VCL", "KOP", 
			"KCL", "AP", "FP", "Str", "EndL", "PTR", "COMA", "WS", "COMMENT", "LINE_COMMENT", 
			"LOWW", "UPPW", "WORD"
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


	public javalessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "javalessLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\7\32\u011d\n\32\f\32\16\32\u0120\13\32\3\33\3\33"+
		"\3\33\5\33\u0125\n\33\3\33\6\33\u0128\n\33\r\33\16\33\u0129\3\33\5\33"+
		"\u012d\n\33\5\33\u012f\n\33\3\33\5\33\u0132\n\33\3\34\3\34\3\34\5\34\u0137"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u013e\n\35\f\35\16\35\u0141\13\35"+
		"\3\35\3\35\3\36\3\36\5\36\u0147\n\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\7\61\u0175\n\61\f\61\16"+
		"\61\u0178\13\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65\u0183"+
		"\n\65\r\65\16\65\u0184\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u018d\n\66\f"+
		"\66\16\66\u0190\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67"+
		"\u019b\n\67\f\67\16\67\u019e\13\67\3\67\3\67\38\38\39\39\3:\3:\6:\u01a8"+
		"\n:\r:\16:\u01a9\3;\3;\5;\u01ae\n;\3;\3;\3<\3<\7<\u01b4\n<\f<\16<\u01b7"+
		"\13<\3<\5<\u01ba\n<\3=\3=\5=\u01be\n=\3>\3>\3>\3>\5>\u01c4\n>\3?\3?\3"+
		"?\3?\5?\u01ca\n?\3?\5?\u01cd\n?\3?\5?\u01d0\n?\3\u018e\2@\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y"+
		"\2{\2}\2\3\2\24\3\2\63;\4\2NNnn\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\4"+
		"\2$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\3\2\62;\4\2\62"+
		";aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\2\u01e4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\3\177\3\2\2\2\5\u0088\3\2\2\2\7\u0090\3\2\2\2\t\u0098\3\2"+
		"\2\2\13\u00a2\3\2\2\2\r\u00a9\3\2\2\2\17\u00af\3\2\2\2\21\u00b4\3\2\2"+
		"\2\23\u00b8\3\2\2\2\25\u00bd\3\2\2\2\27\u00c4\3\2\2\2\31\u00cc\3\2\2\2"+
		"\33\u00d3\3\2\2\2\35\u00d9\3\2\2\2\37\u00dc\3\2\2\2!\u00e2\3\2\2\2#\u00e7"+
		"\3\2\2\2%\u00f2\3\2\2\2\'\u00f6\3\2\2\2)\u00fb\3\2\2\2+\u0100\3\2\2\2"+
		"-\u0108\3\2\2\2/\u010f\3\2\2\2\61\u0115\3\2\2\2\63\u011a\3\2\2\2\65\u012e"+
		"\3\2\2\2\67\u0133\3\2\2\29\u013a\3\2\2\2;\u0146\3\2\2\2=\u0148\3\2\2\2"+
		"?\u014a\3\2\2\2A\u014d\3\2\2\2C\u0150\3\2\2\2E\u0153\3\2\2\2G\u0155\3"+
		"\2\2\2I\u0158\3\2\2\2K\u015a\3\2\2\2M\u015c\3\2\2\2O\u015e\3\2\2\2Q\u0161"+
		"\3\2\2\2S\u0164\3\2\2\2U\u0166\3\2\2\2W\u0168\3\2\2\2Y\u016a\3\2\2\2["+
		"\u016c\3\2\2\2]\u016e\3\2\2\2_\u0170\3\2\2\2a\u0172\3\2\2\2c\u017b\3\2"+
		"\2\2e\u017d\3\2\2\2g\u017f\3\2\2\2i\u0182\3\2\2\2k\u0188\3\2\2\2m\u0196"+
		"\3\2\2\2o\u01a1\3\2\2\2q\u01a3\3\2\2\2s\u01a7\3\2\2\2u\u01ab\3\2\2\2w"+
		"\u01b1\3\2\2\2y\u01bd\3\2\2\2{\u01c3\3\2\2\2}\u01cf\3\2\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7d\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e\2\2\u0086\u0087\7v\2\2"+
		"\u0087\4\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7z\2\2\u008a\u008b\7v"+
		"\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\u008f"+
		"\7u\2\2\u008f\6\3\2\2\2\u0090\u0091\7r\2\2\u0091\u0092\7t\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7x\2\2\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7g\2\2\u0097\b\3\2\2\2\u0098\u0099\7r\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u009e\7e\2\2"+
		"\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7f\2\2\u00a1\n\3\2"+
		"\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7e\2\2\u00a8\f\3\2\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7j\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7u\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7y\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7n\2\2\u00bc\24\3\2\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7q\2\2"+
		"\u00c1\u00c2\7t\2\2\u00c2\u00c3\7v\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7"+
		"r\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7m\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb\7g\2\2\u00cb\30\3\2\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7p\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8\34\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7h\2\2\u00db\36\3\2\2"+
		"\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7k\2\2\u00df\u00e0"+
		"\7n\2\2\u00e0\u00e1\7g\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\"\3\2\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7q\2\2\u00f0\u00f1\7h\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7k\2"+
		"\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7"+
		"e\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7t\2\2\u00fa("+
		"\3\2\2\2\u00fb\u00fc\7x\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7f\2\2\u00ff*\3\2\2\2\u0100\u0101\7d\2\2\u0101\u0102\7q\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2\2\u0105\u0106\7c\2\2"+
		"\u0106\u0107\7p\2\2\u0107,\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2"+
		"\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7e\2\2\u010e.\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112"+
		"\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114\60\3\2\2\2\u0115\u0116"+
		"\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118\7w\2\2\u0118\u0119\7g\2\2\u0119"+
		"\62\3\2\2\2\u011a\u011e\5{>\2\u011b\u011d\5y=\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\64\3\2\2"+
		"\2\u0120\u011e\3\2\2\2\u0121\u012f\7\62\2\2\u0122\u012c\t\2\2\2\u0123"+
		"\u0125\5w<\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012d\3\2\2"+
		"\2\u0126\u0128\7a\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\5w<\2\u012c"+
		"\u0124\3\2\2\2\u012c\u0127\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0121\3\2"+
		"\2\2\u012e\u0122\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\t\3\2\2\u0131"+
		"\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\66\3\2\2\2\u0133\u0136\7)\2\2"+
		"\u0134\u0137\n\4\2\2\u0135\u0137\5}?\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7)\2\2\u01398\3\2\2\2\u013a\u013f"+
		"\7$\2\2\u013b\u013e\n\5\2\2\u013c\u013e\5}?\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7$\2\2\u0143"+
		":\3\2\2\2\u0144\u0147\5\61\31\2\u0145\u0147\5/\30\2\u0146\u0144\3\2\2"+
		"\2\u0146\u0145\3\2\2\2\u0147<\3\2\2\2\u0148\u0149\7?\2\2\u0149>\3\2\2"+
		"\2\u014a\u014b\7-\2\2\u014b\u014c\7?\2\2\u014c@\3\2\2\2\u014d\u014e\7"+
		"(\2\2\u014e\u014f\7(\2\2\u014fB\3\2\2\2\u0150\u0151\7?\2\2\u0151\u0152"+
		"\7?\2\2\u0152D\3\2\2\2\u0153\u0154\7@\2\2\u0154F\3\2\2\2\u0155\u0156\7"+
		">\2\2\u0156\u0157\7?\2\2\u0157H\3\2\2\2\u0158\u0159\7-\2\2\u0159J\3\2"+
		"\2\2\u015a\u015b\7/\2\2\u015bL\3\2\2\2\u015c\u015d\7,\2\2\u015dN\3\2\2"+
		"\2\u015e\u015f\7-\2\2\u015f\u0160\7-\2\2\u0160P\3\2\2\2\u0161\u0162\7"+
		"/\2\2\u0162\u0163\7/\2\2\u0163R\3\2\2\2\u0164\u0165\7#\2\2\u0165T\3\2"+
		"\2\2\u0166\u0167\7]\2\2\u0167V\3\2\2\2\u0168\u0169\7_\2\2\u0169X\3\2\2"+
		"\2\u016a\u016b\7}\2\2\u016bZ\3\2\2\2\u016c\u016d\7\177\2\2\u016d\\\3\2"+
		"\2\2\u016e\u016f\7*\2\2\u016f^\3\2\2\2\u0170\u0171\7+\2\2\u0171`\3\2\2"+
		"\2\u0172\u0176\7$\2\2\u0173\u0175\n\6\2\2\u0174\u0173\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7$\2\2\u017ab\3\2\2\2\u017b\u017c\7=\2\2\u017c"+
		"d\3\2\2\2\u017d\u017e\7\60\2\2\u017ef\3\2\2\2\u017f\u0180\7.\2\2\u0180"+
		"h\3\2\2\2\u0181\u0183\t\7\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\b\65\2\2\u0187j\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7,\2\2\u018a"+
		"\u018e\3\2\2\2\u018b\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7,\2\2\u0192\u0193\7\61\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\b\66\2\2\u0195l\3\2\2\2\u0196\u0197\7\61\2\2\u0197\u0198"+
		"\7\61\2\2\u0198\u019c\3\2\2\2\u0199\u019b\n\b\2\2\u019a\u0199\3\2\2\2"+
		"\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\b\67\2\2\u01a0n\3\2\2\2\u01a1"+
		"\u01a2\4c|\2\u01a2p\3\2\2\2\u01a3\u01a4\4C\\\2\u01a4r\3\2\2\2\u01a5\u01a8"+
		"\5o8\2\u01a6\u01a8\5q9\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aat\3\2\2\2"+
		"\u01ab\u01ad\t\t\2\2\u01ac\u01ae\t\n\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5w<\2\u01b0v\3\2\2\2\u01b1\u01b9"+
		"\t\13\2\2\u01b2\u01b4\t\f\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01ba\t\13\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01ba\3\2\2\2"+
		"\u01bax\3\2\2\2\u01bb\u01be\5{>\2\u01bc\u01be\t\13\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01bc\3\2\2\2\u01bez\3\2\2\2\u01bf\u01c4\t\r\2\2\u01c0\u01c4"+
		"\n\16\2\2\u01c1\u01c2\t\17\2\2\u01c2\u01c4\t\20\2\2\u01c3\u01bf\3\2\2"+
		"\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4|\3\2\2\2\u01c5\u01c6"+
		"\7^\2\2\u01c6\u01d0\t\21\2\2\u01c7\u01cc\7^\2\2\u01c8\u01ca\t\22\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\t\23"+
		"\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\t\23\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c7\3\2\2\2\u01d0~\3\2\2\2"+
		"\33\2\u011e\u0124\u0129\u012c\u012e\u0131\u0136\u013d\u013f\u0146\u0176"+
		"\u0184\u018e\u019c\u01a7\u01a9\u01ad\u01b5\u01b9\u01bd\u01c3\u01c9\u01cc"+
		"\u01cf\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}