// Generated from /home/shi/Documents/compiladores/trabalho_pratico/2-tp/src/main/java/javalessParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javalessParser extends Parser {
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
		WS=52, COMMENT=53, LINE_COMMENT=54, LOWW=55, UPPW=56, WORD=57, SUPER=58, 
		IDENTIFIER=59;
	public static final int
		RULE_compilationUnit = 0, RULE_packageSyntax = 1, RULE_importSyntax = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_classBody = 5, 
		RULE_memberDecl = 6, RULE_block = 7, RULE_blockStatement = 8, RULE_localTypeDeclaration = 9, 
		RULE_statement = 10, RULE_parExpression = 11, RULE_methodCall = 12, RULE_expressionList = 13, 
		RULE_localVariableDeclarationStatement = 14, RULE_variableDeclarators = 15, 
		RULE_variableDeclarator = 16, RULE_variableDeclaratorId = 17, RULE_variableInitializer = 18, 
		RULE_arrayInitializer = 19, RULE_arguments = 20, RULE_basicType = 21, 
		RULE_expression = 22, RULE_primary = 23, RULE_creator = 24, RULE_arrayCreatorRest = 25, 
		RULE_classCreatorRest = 26, RULE_typeTypeOrVoid = 27, RULE_modifiers = 28, 
		RULE_typeType = 29, RULE_superSuffix = 30, RULE_qualifiedIdentifier = 31, 
		RULE_literal = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageSyntax", "importSyntax", "typeDeclaration", 
			"classDeclaration", "classBody", "memberDecl", "block", "blockStatement", 
			"localTypeDeclaration", "statement", "parExpression", "methodCall", "expressionList", 
			"localVariableDeclarationStatement", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "arguments", 
			"basicType", "expression", "primary", "creator", "arrayCreatorRest", 
			"classCreatorRest", "typeTypeOrVoid", "modifiers", "typeType", "superSuffix", 
			"qualifiedIdentifier", "literal"
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
			"LOWW", "UPPW", "WORD", "SUPER", "IDENTIFIER"
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
	public String getGrammarFileName() { return "javalessParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javalessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(javalessParser.EOF, 0); }
		public PackageSyntaxContext packageSyntax() {
			return getRuleContext(PackageSyntaxContext.class,0);
		}
		public List<ImportSyntaxContext> importSyntax() {
			return getRuleContexts(ImportSyntaxContext.class);
		}
		public ImportSyntaxContext importSyntax(int i) {
			return getRuleContext(ImportSyntaxContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAC) {
				{
				setState(66);
				packageSyntax();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMP) {
				{
				{
				setState(69);
				importSyntax();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << STA) | (1L << EndL))) != 0)) {
				{
				{
				setState(75);
				typeDeclaration();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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

	public static class PackageSyntaxContext extends ParserRuleContext {
		public TerminalNode PAC() { return getToken(javalessParser.PAC, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public PackageSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterPackageSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitPackageSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitPackageSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageSyntaxContext packageSyntax() throws RecognitionException {
		PackageSyntaxContext _localctx = new PackageSyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PAC);
			setState(84);
			qualifiedIdentifier();
			setState(85);
			match(EndL);
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

	public static class ImportSyntaxContext extends ParserRuleContext {
		public TerminalNode IMP() { return getToken(javalessParser.IMP, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public TerminalNode STA() { return getToken(javalessParser.STA, 0); }
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public TerminalNode TIM() { return getToken(javalessParser.TIM, 0); }
		public ImportSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterImportSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitImportSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitImportSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSyntaxContext importSyntax() throws RecognitionException {
		ImportSyntaxContext _localctx = new ImportSyntaxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IMP);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STA) {
				{
				setState(88);
				match(STA);
				}
			}

			setState(91);
			qualifiedIdentifier();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTR) {
				{
				setState(92);
				match(PTR);
				setState(93);
				match(TIM);
				}
			}

			setState(96);
			match(EndL);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case PRI:
			case PRO:
			case PUB:
			case CLA:
			case STA:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(98);
					modifiers();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(104);
				classDeclaration();
				}
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(EndL);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLA() { return getToken(javalessParser.CLA, 0); }
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXT() { return getToken(javalessParser.EXT, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CLA);
			setState(109);
			match(Identifier);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXT) {
				{
				setState(110);
				match(EXT);
				setState(111);
				typeType();
				}
			}

			setState(114);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode KOP() { return getToken(javalessParser.KOP, 0); }
		public TerminalNode KCL() { return getToken(javalessParser.KCL, 0); }
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(KOP);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << STA) | (1L << KOP) | (1L << EndL))) != 0)) {
				{
				{
				setState(117);
				memberDecl();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(KCL);
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

	public static class MemberDeclContext extends ParserRuleContext {
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STA() { return getToken(javalessParser.STA, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDecl);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(EndL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STA) {
					{
					setState(126);
					match(STA);
					}
				}

				setState(129);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(130);
					modifiers();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				classDeclaration();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode KOP() { return getToken(javalessParser.KOP, 0); }
		public TerminalNode KCL() { return getToken(javalessParser.KCL, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(KOP);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << RET) | (1L << SUP) | (1L << IF) | (1L << WHI) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << STA) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << KOP) | (1L << AP) | (1L << EndL) | (1L << SUPER))) != 0)) {
				{
				{
				setState(140);
				blockStatement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(KCL);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				localVariableDeclarationStatement();
				setState(149);
				match(EndL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				localTypeDeclaration();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case PRI:
			case PRO:
			case PUB:
			case CLA:
			case STA:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(155);
					modifiers();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(161);
				classDeclaration();
				}
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(EndL);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(javalessParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELS() { return getToken(javalessParser.ELS, 0); }
		public TerminalNode WHI() { return getToken(javalessParser.WHI, 0); }
		public TerminalNode RET() { return getToken(javalessParser.RET, 0); }
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(IF);
				setState(167);
				parExpression();
				setState(168);
				statement();
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(169);
					match(ELS);
					setState(170);
					statement();
					}
					break;
				}
				}
				break;
			case WHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(WHI);
				setState(174);
				parExpression();
				setState(175);
				statement();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(RET);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << SUPER))) != 0)) {
					{
					setState(178);
					expression(0);
					}
				}

				setState(181);
				match(EndL);
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case VOI:
			case BOO:
			case Identifier:
			case Numl:
			case CharLiteral:
			case StringLiteral:
			case BoolLiteral:
			case PLU:
			case SUB:
			case PPL:
			case SSB:
			case NOT:
			case AP:
			case SUPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				((StatementContext)_localctx).statementExpression = expression(0);
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(EndL);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(AP);
			setState(187);
			expression(0);
			setState(188);
			match(FP);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javalessParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(javalessParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(AP);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << SUPER))) != 0)) {
					{
					setState(192);
					expressionList();
					}
				}

				setState(195);
				match(FP);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(THIS);
				setState(197);
				match(AP);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << SUPER))) != 0)) {
					{
					setState(198);
					expressionList();
					}
				}

				setState(201);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(SUPER);
				setState(203);
				match(AP);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << SUPER))) != 0)) {
					{
					setState(204);
					expressionList();
					}
				}

				setState(207);
				match(FP);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expression(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(211);
				match(COMA);
				setState(212);
				expression(0);
				}
				}
				setState(217);
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			typeType();
			setState(219);
			variableDeclarators();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			variableDeclarator();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(222);
				match(COMA);
				setState(223);
				variableDeclarator();
				}
				}
				setState(228);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode Atrib() { return getToken(javalessParser.Atrib, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			variableDeclaratorId();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atrib) {
				{
				setState(230);
				match(Atrib);
				setState(231);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Identifier);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOP) {
				{
				{
				setState(235);
				match(VOP);
				setState(236);
				match(VCL);
				}
				}
				setState(241);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableInitializer);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				arrayInitializer();
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case VOI:
			case BOO:
			case Identifier:
			case Numl:
			case CharLiteral:
			case StringLiteral:
			case BoolLiteral:
			case PLU:
			case SUB:
			case PPL:
			case SSB:
			case NOT:
			case AP:
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode KOP() { return getToken(javalessParser.KOP, 0); }
		public TerminalNode KCL() { return getToken(javalessParser.KCL, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KOP);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << KOP) | (1L << AP) | (1L << SUPER))) != 0)) {
				{
				setState(247);
				variableInitializer();
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						match(COMA);
						setState(249);
						variableInitializer();
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(255);
					match(COMA);
					}
				}

				}
			}

			setState(260);
			match(KCL);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(AP);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << SUPER))) != 0)) {
				{
				setState(263);
				expression(0);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(264);
					match(COMA);
					setState(265);
					expression(0);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			match(FP);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BOO() { return getToken(javalessParser.BOO, 0); }
		public TerminalNode CHA() { return getToken(javalessParser.CHA, 0); }
		public TerminalNode INT() { return getToken(javalessParser.INT, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHA) | (1L << BOO))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(javalessParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLU() { return getToken(javalessParser.PLU, 0); }
		public TerminalNode SUB() { return getToken(javalessParser.SUB, 0); }
		public TerminalNode PPL() { return getToken(javalessParser.PPL, 0); }
		public TerminalNode SSB() { return getToken(javalessParser.SSB, 0); }
		public TerminalNode NOT() { return getToken(javalessParser.NOT, 0); }
		public TerminalNode TIM() { return getToken(javalessParser.TIM, 0); }
		public TerminalNode LTE() { return getToken(javalessParser.LTE, 0); }
		public TerminalNode LT() { return getToken(javalessParser.LT, 0); }
		public TerminalNode EQL() { return getToken(javalessParser.EQL, 0); }
		public TerminalNode AND() { return getToken(javalessParser.AND, 0); }
		public TerminalNode Atrib() { return getToken(javalessParser.Atrib, 0); }
		public TerminalNode AtrArit() { return getToken(javalessParser.AtrArit, 0); }
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(javalessParser.THIS, 0); }
		public TerminalNode SUP() { return getToken(javalessParser.SUP, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode VOP() { return getToken(javalessParser.VOP, 0); }
		public TerminalNode VCL() { return getToken(javalessParser.VCL, 0); }
		public TerminalNode INS() { return getToken(javalessParser.INS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(278);
				primary();
				}
				break;
			case 2:
				{
				setState(279);
				methodCall();
				}
				break;
			case 3:
				{
				setState(280);
				match(NEW);
				setState(281);
				creator();
				}
				break;
			case 4:
				{
				setState(282);
				match(AP);
				setState(283);
				typeType();
				setState(284);
				match(FP);
				setState(285);
				expression(11);
				}
				break;
			case 5:
				{
				setState(287);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				expression(9);
				}
				break;
			case 6:
				{
				setState(289);
				((ExpressionContext)_localctx).prefix = match(NOT);
				setState(290);
				expression(8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						match(TIM);
						setState(295);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLU || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==LTE) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						match(EQL);
						setState(304);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(307);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(309);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Atrib || _la==AtrArit) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						expression(1);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(312);
						((ExpressionContext)_localctx).bop = match(PTR);
						setState(318);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(313);
							match(Identifier);
							}
							break;
						case 2:
							{
							setState(314);
							methodCall();
							}
							break;
						case 3:
							{
							setState(315);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(316);
							match(SUP);
							setState(317);
							superSuffix();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(321);
						match(VOP);
						setState(322);
						expression(0);
						setState(323);
						match(VCL);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(326);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PPL || _la==SSB) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(328);
						((ExpressionContext)_localctx).bop = match(INS);
						setState(329);
						typeType();
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javalessParser.THIS, 0); }
		public TerminalNode SUP() { return getToken(javalessParser.SUP, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public TerminalNode CLA() { return getToken(javalessParser.CLA, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(THIS);
				}
				break;
			case SUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(SUP);
				}
				break;
			case NUL:
			case Numl:
			case CharLiteral:
			case StringLiteral:
			case BoolLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(Identifier);
				}
				break;
			case INT:
			case CHA:
			case VOI:
			case BOO:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				typeTypeOrVoid();
				setState(341);
				match(PTR);
				setState(342);
				match(CLA);
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

	public static class CreatorContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_creator);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				basicType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				basicType();
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOP:
					{
					setState(348);
					arrayCreatorRest();
					}
					break;
				case AP:
					{
					setState(349);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(VOP);
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCL:
				{
				setState(355);
				match(VCL);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOP) {
					{
					{
					setState(356);
					match(VOP);
					setState(357);
					match(VCL);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				arrayInitializer();
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case VOI:
			case BOO:
			case Identifier:
			case Numl:
			case CharLiteral:
			case StringLiteral:
			case BoolLiteral:
			case PLU:
			case SUB:
			case PPL:
			case SSB:
			case NOT:
			case AP:
			case SUPER:
				{
				setState(364);
				expression(0);
				setState(365);
				match(VCL);
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366);
						match(VOP);
						setState(367);
						expression(0);
						setState(368);
						match(VCL);
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(375);
						match(VOP);
						setState(376);
						match(VCL);
						}
						} 
					}
					setState(381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			arguments();
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(385);
				classBody();
				}
				break;
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOI() { return getToken(javalessParser.VOI, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeTypeOrVoid);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHA:
			case BOO:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				typeType();
				}
				break;
			case VOI:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(VOI);
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

	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode PRI() { return getToken(javalessParser.PRI, 0); }
		public TerminalNode PUB() { return getToken(javalessParser.PUB, 0); }
		public TerminalNode PRO() { return getToken(javalessParser.PRO, 0); }
		public TerminalNode STA() { return getToken(javalessParser.STA, 0); }
		public TerminalNode ABS() { return getToken(javalessParser.ABS, 0); }
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) ) {
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

	public static class TypeTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			basicType();
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					match(VOP);
					setState(396);
					match(VCL);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(javalessParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_superSuffix);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				arguments();
				}
				break;
			case PTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(PTR);
				setState(404);
				match(IDENTIFIER);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(405);
					arguments();
					}
					break;
				}
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(javalessParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(javalessParser.Identifier, i);
		}
		public List<TerminalNode> PTR() { return getTokens(javalessParser.PTR); }
		public TerminalNode PTR(int i) {
			return getToken(javalessParser.PTR, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Identifier);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					match(PTR);
					setState(412);
					match(Identifier);
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Numl() { return getToken(javalessParser.Numl, 0); }
		public TerminalNode CharLiteral() { return getToken(javalessParser.CharLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(javalessParser.StringLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(javalessParser.BoolLiteral, 0); }
		public TerminalNode NUL() { return getToken(javalessParser.NUL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUL) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\7\2O\n\2\f\2"+
		"\16\2R\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\5\4"+
		"a\n\4\3\4\3\4\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6"+
		"\3\6\5\6s\n\6\3\6\3\6\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\7\3\7\3\b\3\b"+
		"\5\b\u0082\n\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\5\b\u008c"+
		"\n\b\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u009c\n\n\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13\3"+
		"\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\5\16\u00d3\n\16\3\17\3\17\3\17\7"+
		"\17\u00d8\n\17\f\17\16\17\u00db\13\17\3\20\3\20\3\20\3\21\3\21\3\21\7"+
		"\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\22\3\22\3\22\5\22\u00eb\n\22\3"+
		"\23\3\23\3\23\7\23\u00f0\n\23\f\23\16\23\u00f3\13\23\3\24\3\24\5\24\u00f7"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\25"+
		"\5\25\u0103\n\25\5\25\u0105\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u010d"+
		"\n\26\f\26\16\26\u0110\13\26\5\26\u0112\n\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0126\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0141\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u014d"+
		"\n\30\f\30\16\30\u0150\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u015b\n\31\3\32\3\32\3\32\3\32\5\32\u0161\n\32\5\32\u0163\n\32"+
		"\3\33\3\33\3\33\3\33\7\33\u0169\n\33\f\33\16\33\u016c\13\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0175\n\33\f\33\16\33\u0178\13\33\3\33"+
		"\3\33\7\33\u017c\n\33\f\33\16\33\u017f\13\33\5\33\u0181\n\33\3\34\3\34"+
		"\5\34\u0185\n\34\3\35\3\35\5\35\u0189\n\35\3\36\3\36\3\37\3\37\3\37\7"+
		"\37\u0190\n\37\f\37\16\37\u0193\13\37\3 \3 \3 \3 \5 \u0199\n \5 \u019b"+
		"\n \3!\3!\3!\7!\u01a0\n!\f!\16!\u01a3\13!\3\"\3\"\3\"\2\3.#\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\n\4\2\24\25"+
		"\27\27\4\2&\')*\3\2&\'\3\2$%\3\2 !\3\2)*\5\2\3\3\5\7\30\30\4\2\13\13\34"+
		"\37\2\u01d0\2E\3\2\2\2\4U\3\2\2\2\6Y\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\fv"+
		"\3\2\2\2\16\u008b\3\2\2\2\20\u008d\3\2\2\2\22\u009b\3\2\2\2\24\u00a5\3"+
		"\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2"+
		"\2\2\36\u00dc\3\2\2\2 \u00df\3\2\2\2\"\u00e7\3\2\2\2$\u00ec\3\2\2\2&\u00f6"+
		"\3\2\2\2(\u00f8\3\2\2\2*\u0108\3\2\2\2,\u0115\3\2\2\2.\u0125\3\2\2\2\60"+
		"\u015a\3\2\2\2\62\u0162\3\2\2\2\64\u0164\3\2\2\2\66\u0182\3\2\2\28\u0188"+
		"\3\2\2\2:\u018a\3\2\2\2<\u018c\3\2\2\2>\u019a\3\2\2\2@\u019c\3\2\2\2B"+
		"\u01a4\3\2\2\2DF\5\4\3\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\5\6\4\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KP\3\2\2\2LJ\3\2\2\2MO\5\b\5\2NM\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\2\2\3T\3\3"+
		"\2\2\2UV\7\r\2\2VW\5@!\2WX\7\63\2\2X\5\3\2\2\2Y[\7\f\2\2Z\\\7\30\2\2["+
		"Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]`\5@!\2^_\7\64\2\2_a\7(\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bc\7\63\2\2c\7\3\2\2\2df\5:\36\2ed\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jm\5\n\6\2km\7\63\2\2lg\3\2"+
		"\2\2lk\3\2\2\2m\t\3\2\2\2no\7\b\2\2or\7\33\2\2pq\7\4\2\2qs\5<\37\2rp\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tu\5\f\7\2u\13\3\2\2\2vz\7.\2\2wy\5\16\b\2x"+
		"w\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7/\2\2~"+
		"\r\3\2\2\2\177\u008c\7\63\2\2\u0080\u0082\7\30\2\2\u0081\u0080\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008c\5\20\t\2\u0084\u0086"+
		"\5:\36\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\n"+
		"\6\2\u008b\177\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0087\3\2\2\2\u008c\17"+
		"\3\2\2\2\u008d\u0091\7.\2\2\u008e\u0090\5\22\n\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7/\2\2\u0095\21\3\2\2\2\u0096\u0097"+
		"\5\36\20\2\u0097\u0098\7\63\2\2\u0098\u009c\3\2\2\2\u0099\u009c\5\26\f"+
		"\2\u009a\u009c\5\24\13\2\u009b\u0096\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\23\3\2\2\2\u009d\u009f\5:\36\2\u009e\u009d\3\2\2"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\5\n\6\2\u00a4\u00a6\7\63\2\2"+
		"\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00bb"+
		"\5\20\t\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ad\5\26\f"+
		"\2\u00ab\u00ac\7\22\2\2\u00ac\u00ae\5\26\f\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00bb\3\2\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\5"+
		"\30\r\2\u00b1\u00b2\5\26\f\2\u00b2\u00bb\3\2\2\2\u00b3\u00b5\7\16\2\2"+
		"\u00b4\u00b6\5.\30\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00bb\7\63\2\2\u00b8\u00bb\5.\30\2\u00b9\u00bb\7\63\2\2"+
		"\u00ba\u00a7\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b3"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2\2\u00bc"+
		"\u00bd\7\60\2\2\u00bd\u00be\5.\30\2\u00be\u00bf\7\61\2\2\u00bf\31\3\2"+
		"\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c4\5\34\17\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d3\7\61"+
		"\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c9\7\60\2\2\u00c8\u00ca\5\34\17\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\7\61"+
		"\2\2\u00cc\u00cd\7<\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0\5\34\17\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\61"+
		"\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d9\5.\30\2\u00d5\u00d6\7\65\2\2\u00d6\u00d8\5.\30"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\35\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5<\37\2\u00dd"+
		"\u00de\5 \21\2\u00de\37\3\2\2\2\u00df\u00e4\5\"\22\2\u00e0\u00e1\7\65"+
		"\2\2\u00e1\u00e3\5\"\22\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e7\u00ea\5$\23\2\u00e8\u00e9\7 \2\2\u00e9\u00eb\5&\24\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00f1\7\33\2\2\u00ed"+
		"\u00ee\7,\2\2\u00ee\u00f0\7-\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f7\5(\25\2\u00f5\u00f7\5.\30\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u0104\7.\2\2\u00f9\u00fe\5&\24\2"+
		"\u00fa\u00fb\7\65\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fa\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\7\65\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0105\3\2\2\2\u0104\u00f9\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7/\2\2\u0107)\3\2\2\2\u0108\u0111\7\60\2\2"+
		"\u0109\u010e\5.\30\2\u010a\u010b\7\65\2\2\u010b\u010d\5.\30\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\61\2\2\u0114+\3\2\2\2\u0115\u0116"+
		"\t\2\2\2\u0116-\3\2\2\2\u0117\u0118\b\30\1\2\u0118\u0126\5\60\31\2\u0119"+
		"\u0126\5\32\16\2\u011a\u011b\7\n\2\2\u011b\u0126\5\62\32\2\u011c\u011d"+
		"\7\60\2\2\u011d\u011e\5<\37\2\u011e\u011f\7\61\2\2\u011f\u0120\5.\30\r"+
		"\u0120\u0126\3\2\2\2\u0121\u0122\t\3\2\2\u0122\u0126\5.\30\13\u0123\u0124"+
		"\7+\2\2\u0124\u0126\5.\30\n\u0125\u0117\3\2\2\2\u0125\u0119\3\2\2\2\u0125"+
		"\u011a\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u014e\3\2\2\2\u0127\u0128\f\t\2\2\u0128\u0129\7(\2\2\u0129"+
		"\u014d\5.\30\n\u012a\u012b\f\b\2\2\u012b\u012c\t\4\2\2\u012c\u014d\5."+
		"\30\t\u012d\u012e\f\7\2\2\u012e\u012f\t\5\2\2\u012f\u014d\5.\30\b\u0130"+
		"\u0131\f\5\2\2\u0131\u0132\7#\2\2\u0132\u014d\5.\30\6\u0133\u0134\f\4"+
		"\2\2\u0134\u0135\7\"\2\2\u0135\u014d\5.\30\5\u0136\u0137\f\3\2\2\u0137"+
		"\u0138\t\6\2\2\u0138\u014d\5.\30\3\u0139\u013a\f\21\2\2\u013a\u0140\7"+
		"\64\2\2\u013b\u0141\7\33\2\2\u013c\u0141\5\32\16\2\u013d\u0141\7\t\2\2"+
		"\u013e\u013f\7\17\2\2\u013f\u0141\5> \2\u0140\u013b\3\2\2\2\u0140\u013c"+
		"\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u014d\3\2\2\2\u0142"+
		"\u0143\f\20\2\2\u0143\u0144\7,\2\2\u0144\u0145\5.\30\2\u0145\u0146\7-"+
		"\2\2\u0146\u014d\3\2\2\2\u0147\u0148\f\f\2\2\u0148\u014d\t\7\2\2\u0149"+
		"\u014a\f\6\2\2\u014a\u014b\7\23\2\2\u014b\u014d\5<\37\2\u014c\u0127\3"+
		"\2\2\2\u014c\u012a\3\2\2\2\u014c\u012d\3\2\2\2\u014c\u0130\3\2\2\2\u014c"+
		"\u0133\3\2\2\2\u014c\u0136\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u0142\3\2"+
		"\2\2\u014c\u0147\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f/\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u015b\5\30\r\2\u0152\u015b\7\t\2\2\u0153\u015b\7\17\2\2\u0154\u015b"+
		"\5B\"\2\u0155\u015b\7\33\2\2\u0156\u0157\58\35\2\u0157\u0158\7\64\2\2"+
		"\u0158\u0159\7\b\2\2\u0159\u015b\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0152"+
		"\3\2\2\2\u015a\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a"+
		"\u0156\3\2\2\2\u015b\61\3\2\2\2\u015c\u0163\5,\27\2\u015d\u0160\5,\27"+
		"\2\u015e\u0161\5\64\33\2\u015f\u0161\5\66\34\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2"+
		"\2\2\u0163\63\3\2\2\2\u0164\u0180\7,\2\2\u0165\u016a\7-\2\2\u0166\u0167"+
		"\7,\2\2\u0167\u0169\7-\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u0181\5(\25\2\u016e\u016f\5.\30\2\u016f\u0176\7-\2\2\u0170"+
		"\u0171\7,\2\2\u0171\u0172\5.\30\2\u0172\u0173\7-\2\2\u0173\u0175\3\2\2"+
		"\2\u0174\u0170\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u017d\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7,\2\2\u017a"+
		"\u017c\7-\2\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0165\3\2\2\2\u0180\u016e\3\2\2\2\u0181\65\3\2\2\2\u0182\u0184\5*\26"+
		"\2\u0183\u0185\5\f\7\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\67"+
		"\3\2\2\2\u0186\u0189\5<\37\2\u0187\u0189\7\26\2\2\u0188\u0186\3\2\2\2"+
		"\u0188\u0187\3\2\2\2\u01899\3\2\2\2\u018a\u018b\t\b\2\2\u018b;\3\2\2\2"+
		"\u018c\u0191\5,\27\2\u018d\u018e\7,\2\2\u018e\u0190\7-\2\2\u018f\u018d"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"=\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u019b\5*\26\2\u0195\u0196\7\64\2\2"+
		"\u0196\u0198\7=\2\2\u0197\u0199\5*\26\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019b"+
		"?\3\2\2\2\u019c\u01a1\7\33\2\2\u019d\u019e\7\64\2\2\u019e\u01a0\7\33\2"+
		"\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2A\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\t\t\2\2\u01a5"+
		"C\3\2\2\2\64EJP[`glrz\u0081\u0087\u008b\u0091\u009b\u00a0\u00a5\u00ad"+
		"\u00b5\u00ba\u00c3\u00c9\u00cf\u00d2\u00d9\u00e4\u00ea\u00f1\u00f6\u00fe"+
		"\u0102\u0104\u010e\u0111\u0125\u0140\u014c\u014e\u015a\u0160\u0162\u016a"+
		"\u0176\u017d\u0180\u0184\u0188\u0191\u0198\u019a\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}