// Generated from /Users/mohamedelfergani/Documents/GitHub/My-CS320-Assignments/Assignment_2/tree.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class treeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, NUMBER=16, 
		TYPE=17, SIGN=18, VAR=19, OPERATOR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "NUMBER", "TYPE", 
			"SIGN", "VAR", "OPERATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'class'", "'{'", "'}'", "'()'", "'print'", "'='", "'identifier'", 
			"'if'", "'('", "'=='", "')'", "'endif'", "'return'", null, null, "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "NUMBER", "TYPE", "SIGN", "VAR", "OPERATOR", 
			"WS"
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


	public treeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tree.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\6\20i\n\20\r\20\16\20j\3\20\3\20\3\21\6\21p\n\21"+
		"\r\21\16\21q\3\22\3\22\3\22\3\22\3\23\6\23y\n\23\r\23\16\23z\3\24\3\24"+
		"\7\24\177\n\24\f\24\16\24\u0082\13\24\3\25\6\25\u0085\n\25\r\25\16\25"+
		"\u0086\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\26\3\26\2\2\27\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27\3\2\t\b\2\"\"))..\60<C\\c|\3\2\62;\3\2??\4\2C\\"+
		"c|\5\2\62;C\\c|\5\2,-//\61\61\5\2\13\f\17\17\"\"\2\u0094\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\65\3\2\2\2"+
		"\t\67\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23O\3\2\2"+
		"\2\25R\3\2\2\2\27T\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35_\3\2\2\2\37f\3\2"+
		"\2\2!o\3\2\2\2#s\3\2\2\2%x\3\2\2\2\'|\3\2\2\2)\u0084\3\2\2\2+\u0089\3"+
		"\2\2\2-.\7=\2\2.\4\3\2\2\2/\60\7e\2\2\60\61\7n\2\2\61\62\7c\2\2\62\63"+
		"\7u\2\2\63\64\7u\2\2\64\6\3\2\2\2\65\66\7}\2\2\66\b\3\2\2\2\678\7\177"+
		"\2\28\n\3\2\2\29:\7*\2\2:;\7+\2\2;\f\3\2\2\2<=\7r\2\2=>\7t\2\2>?\7k\2"+
		"\2?@\7p\2\2@A\7v\2\2A\16\3\2\2\2BC\7?\2\2C\20\3\2\2\2DE\7k\2\2EF\7f\2"+
		"\2FG\7g\2\2GH\7p\2\2HI\7v\2\2IJ\7k\2\2JK\7h\2\2KL\7k\2\2LM\7g\2\2MN\7"+
		"t\2\2N\22\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\24\3\2\2\2RS\7*\2\2S\26\3\2\2\2T"+
		"U\7?\2\2UV\7?\2\2V\30\3\2\2\2WX\7+\2\2X\32\3\2\2\2YZ\7g\2\2Z[\7p\2\2["+
		"\\\7f\2\2\\]\7k\2\2]^\7h\2\2^\34\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7v\2\2bc"+
		"\7w\2\2cd\7t\2\2de\7p\2\2e\36\3\2\2\2fh\7$\2\2gi\t\2\2\2hg\3\2\2\2ij\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7$\2\2m \3\2\2\2np\t\3\2\2on\3"+
		"\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\"\3\2\2\2st\7k\2\2tu\7p\2\2uv\7"+
		"v\2\2v$\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{&\3"+
		"\2\2\2|\u0080\t\5\2\2}\177\t\6\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081(\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\t\7\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087*\3\2\2\2\u0088\u008a\t\b\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\b\26\2\2\u008e,\3\2\2\2\t\2jqz\u0080\u0086"+
		"\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}