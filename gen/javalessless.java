// Generated from /home/aluno/Documentos/trabComp/1-etapa/src/main/java/javalessless.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javalessless extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, EXT=2, PRI=3, PRO=4, PUB=5, CLA=6, THIS=7, NEW=8, NUL=9, IMP=10, 
		PAC=11, RET=12, SUP=13, IF=14, WHI=15, ELS=16, INS=17, INT=18, CHA=19, 
		VOI=20, BOO=21, STA=22, FAL=23, TRU=24, Var=25, NumR=26, Atrib=27, AtrArit=28, 
		OpBool=29, OpUni=30, OpArit=31, VOP=32, VCL=33, KOP=34, KCL=35, AP=36, 
		FP=37, Str=38, EndL=39, PTR=40, COMA=41, NEWLINE=42, WS=43, Comment=44, 
		LOWW=45, UPPW=46, Numl=47, NNuml=48, WORD=49, MODV=50;
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
			"BOO", "STA", "FAL", "TRU", "Var", "NumR", "Atrib", "AtrArit", "OpBool", 
			"OpUni", "OpArit", "VOP", "VCL", "KOP", "KCL", "AP", "FP", "Str", "EndL", 
			"PTR", "COMA", "NEWLINE", "WS", "Comment", "LOWW", "UPPW", "Numl", "NNuml", 
			"WORD", "MODV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'private'", "'protected'", "'public'", 
			"'class'", "'this'", "'new'", "'null'", "'import'", "'package'", "'return'", 
			"'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", "'char'", 
			"'void'", "'boolean'", "'static'", "'false'", "'true'", null, null, "'='", 
			"'+='", null, null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", null, 
			"';'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", 
			"IMP", "PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", 
			"VOI", "BOO", "STA", "FAL", "TRU", "Var", "NumR", "Atrib", "AtrArit", 
			"OpBool", "OpUni", "OpArit", "VOP", "VCL", "KOP", "KCL", "AP", "FP", 
			"Str", "EndL", "PTR", "COMA", "NEWLINE", "WS", "Comment", "LOWW", "UPPW", 
			"Numl", "NNuml", "WORD", "MODV"
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


	public javalessless(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "javalessless.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u017c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\5\32\u0105\n\32\3\32\3\32\3\32\7\32\u010a\n\32\f\32\16\32\u010d"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0117\n\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0125\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u012c\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\7\'\u013e\n\'\f\'\16\'\u0141\13\'\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\5+\u014c\n+\3+\3+\6+\u0150\n+\r+\16+\u0151\3,\6,\u0155"+
		"\n,\r,\16,\u0156\3,\3,\3-\3-\3-\3-\7-\u015f\n-\f-\16-\u0162\13-\3-\3-"+
		"\3.\3.\3/\3/\3\60\6\60\u016b\n\60\r\60\16\60\u016c\3\61\3\61\3\61\3\62"+
		"\3\62\6\62\u0174\n\62\r\62\16\62\u0175\3\63\3\63\3\63\5\63\u017b\n\63"+
		"\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\7\4"+
		"\2&&aa\4\2,-//\4\2$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0190\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5p\3\2\2\2\7x\3\2\2\2\t\u0080\3\2\2"+
		"\2\13\u008a\3\2\2\2\r\u0091\3\2\2\2\17\u0097\3\2\2\2\21\u009c\3\2\2\2"+
		"\23\u00a0\3\2\2\2\25\u00a5\3\2\2\2\27\u00ac\3\2\2\2\31\u00b4\3\2\2\2\33"+
		"\u00bb\3\2\2\2\35\u00c1\3\2\2\2\37\u00c4\3\2\2\2!\u00ca\3\2\2\2#\u00cf"+
		"\3\2\2\2%\u00da\3\2\2\2\'\u00de\3\2\2\2)\u00e3\3\2\2\2+\u00e8\3\2\2\2"+
		"-\u00f0\3\2\2\2/\u00f7\3\2\2\2\61\u00fd\3\2\2\2\63\u0104\3\2\2\2\65\u0116"+
		"\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u0124\3\2\2\2=\u012b\3\2\2\2"+
		"?\u012d\3\2\2\2A\u012f\3\2\2\2C\u0131\3\2\2\2E\u0133\3\2\2\2G\u0135\3"+
		"\2\2\2I\u0137\3\2\2\2K\u0139\3\2\2\2M\u013b\3\2\2\2O\u0144\3\2\2\2Q\u0146"+
		"\3\2\2\2S\u0148\3\2\2\2U\u014f\3\2\2\2W\u0154\3\2\2\2Y\u015a\3\2\2\2["+
		"\u0165\3\2\2\2]\u0167\3\2\2\2_\u016a\3\2\2\2a\u016e\3\2\2\2c\u0173\3\2"+
		"\2\2e\u017a\3\2\2\2gh\7c\2\2hi\7d\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2lm\7c"+
		"\2\2mn\7e\2\2no\7v\2\2o\4\3\2\2\2pq\7g\2\2qr\7z\2\2rs\7v\2\2st\7g\2\2"+
		"tu\7p\2\2uv\7f\2\2vw\7u\2\2w\6\3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7"+
		"x\2\2|}\7c\2\2}~\7v\2\2~\177\7g\2\2\177\b\3\2\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2"+
		"\u0085\u0086\7e\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7f\2\2\u0089\n\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7w\2\2\u008c\u008d"+
		"\7d\2\2\u008d\u008e\7n\2\2\u008e\u008f\7k\2\2\u008f\u0090\7e\2\2\u0090"+
		"\f\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7n\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7u\2\2\u0096\16\3\2\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7u\2\2\u009b\20\3\2\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7g\2\2\u009e\u009f\7y\2\2\u009f\22\3\2\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7n\2\2"+
		"\u00a4\24\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7"+
		"r\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7v\2\2\u00ab\26"+
		"\3\2\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7m\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\30\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
		"v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7p\2\2\u00ba\32"+
		"\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7r\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7h\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce\"\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7u"+
		"\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7h\2\2\u00d9"+
		"$\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"&\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7t\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7x\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7f\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7u\2"+
		"\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7e\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\60\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7w\2\2\u0100"+
		"\u0101\7g\2\2\u0101\62\3\2\2\2\u0102\u0105\5c\62\2\u0103\u0105\t\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u010b\3\2\2\2\u0106\u010a"+
		"\5_\60\2\u0107\u010a\7a\2\2\u0108\u010a\5c\62\2\u0109\u0106\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\64\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f"+
		"\5_\60\2\u010f\u0110\7\60\2\2\u0110\u0111\5_\60\2\u0111\u0117\3\2\2\2"+
		"\u0112\u0113\5a\61\2\u0113\u0114\7\60\2\2\u0114\u0115\5_\60\2\u0115\u0117"+
		"\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0112\3\2\2\2\u0117\66\3\2\2\2\u0118"+
		"\u0119\7?\2\2\u01198\3\2\2\2\u011a\u011b\7-\2\2\u011b\u011c\7?\2\2\u011c"+
		":\3\2\2\2\u011d\u011e\7?\2\2\u011e\u0125\7?\2\2\u011f\u0125\7@\2\2\u0120"+
		"\u0121\7(\2\2\u0121\u0125\7(\2\2\u0122\u0123\7>\2\2\u0123\u0125\7?\2\2"+
		"\u0124\u011d\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125<\3\2\2\2\u0126\u012c\7#\2\2\u0127\u0128\7-\2\2\u0128\u012c"+
		"\7-\2\2\u0129\u012a\7/\2\2\u012a\u012c\7/\2\2\u012b\u0126\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c>\3\2\2\2\u012d\u012e\t\3\2\2"+
		"\u012e@\3\2\2\2\u012f\u0130\7]\2\2\u0130B\3\2\2\2\u0131\u0132\7_\2\2\u0132"+
		"D\3\2\2\2\u0133\u0134\7}\2\2\u0134F\3\2\2\2\u0135\u0136\7\177\2\2\u0136"+
		"H\3\2\2\2\u0137\u0138\7*\2\2\u0138J\3\2\2\2\u0139\u013a\7+\2\2\u013aL"+
		"\3\2\2\2\u013b\u013f\7$\2\2\u013c\u013e\n\4\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7$\2\2\u0143N\3\2\2\2\u0144\u0145"+
		"\7=\2\2\u0145P\3\2\2\2\u0146\u0147\7\60\2\2\u0147R\3\2\2\2\u0148\u0149"+
		"\7.\2\2\u0149T\3\2\2\2\u014a\u014c\7\17\2\2\u014b\u014a\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\7\f\2\2\u014e\u0150\7\17"+
		"\2\2\u014f\u014b\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152V\3\2\2\2\u0153\u0155\t\5\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b,\2\2\u0159X\3\2\2\2\u015a\u015b"+
		"\7\61\2\2\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2\2\u015d\u015f\n\6\2\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b-\2\2\u0164"+
		"Z\3\2\2\2\u0165\u0166\4c|\2\u0166\\\3\2\2\2\u0167\u0168\4C\\\2\u0168^"+
		"\3\2\2\2\u0169\u016b\4\62;\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d`\3\2\2\2\u016e\u016f\7/\2\2\u016f"+
		"\u0170\5_\60\2\u0170b\3\2\2\2\u0171\u0174\5[.\2\u0172\u0174\5]/\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176d\3\2\2\2\u0177\u017b\5\7\4\2\u0178\u017b"+
		"\5\13\6\2\u0179\u017b\5\t\5\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2"+
		"\u017a\u0179\3\2\2\2\u017bf\3\2\2\2\23\2\u0104\u0109\u010b\u0116\u0124"+
		"\u012b\u013f\u014b\u014f\u0151\u0156\u0160\u016c\u0173\u0175\u017a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}