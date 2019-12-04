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
		WS=52, COMMENT=53, LINE_COMMENT=54, LOWW=55, UPPW=56, WORD=57;
	public static final int
		RULE_compilationUnit = 0, RULE_packageSyntax = 1, RULE_importSyntax = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_classBody = 5, 
		RULE_classBodyDeclaration = 6, RULE_memberDecl = 7, RULE_methodDeclaration = 8, 
		RULE_block = 9, RULE_blockStatement = 10, RULE_methodBody = 11, RULE_localTypeDeclaration = 12, 
		RULE_statement = 13, RULE_parExpression = 14, RULE_methodCall = 15, RULE_expressionList = 16, 
		RULE_formalParameters = 17, RULE_formalParameterList = 18, RULE_formalParameter = 19, 
		RULE_localVariableDeclarationStatement = 20, RULE_variableDeclarators = 21, 
		RULE_variableDeclarator = 22, RULE_variableDeclaratorId = 23, RULE_variableInitializer = 24, 
		RULE_arrayInitializer = 25, RULE_arguments = 26, RULE_basicType = 27, 
		RULE_expression = 28, RULE_primary = 29, RULE_creator = 30, RULE_constructorDeclaration = 31, 
		RULE_fieldDeclaration = 32, RULE_arrayCreatorRest = 33, RULE_classCreatorRest = 34, 
		RULE_typeTypeOrVoid = 35, RULE_modifiers = 36, RULE_typeType = 37, RULE_superSuffix = 38, 
		RULE_qualifiedIdentifier = 39, RULE_literal = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageSyntax", "importSyntax", "typeDeclaration", 
			"classDeclaration", "classBody", "classBodyDeclaration", "memberDecl", 
			"methodDeclaration", "block", "blockStatement", "methodBody", "localTypeDeclaration", 
			"statement", "parExpression", "methodCall", "expressionList", "formalParameters", 
			"formalParameterList", "formalParameter", "localVariableDeclarationStatement", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "arguments", "basicType", 
			"expression", "primary", "creator", "constructorDeclaration", "fieldDeclaration", 
			"arrayCreatorRest", "classCreatorRest", "typeTypeOrVoid", "modifiers", 
			"typeType", "superSuffix", "qualifiedIdentifier", "literal"
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAC) {
				{
				setState(82);
				packageSyntax();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMP) {
				{
				{
				setState(85);
				importSyntax();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << STA) | (1L << EndL))) != 0)) {
				{
				{
				setState(91);
				typeDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
			setState(99);
			match(PAC);
			setState(100);
			qualifiedIdentifier();
			setState(101);
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
			setState(103);
			match(IMP);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STA) {
				{
				setState(104);
				match(STA);
				}
			}

			setState(107);
			qualifiedIdentifier();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTR) {
				{
				setState(108);
				match(PTR);
				setState(109);
				match(TIM);
				}
			}

			setState(112);
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
			setState(122);
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
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(114);
					modifiers();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(120);
				classDeclaration();
				}
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(124);
			match(CLA);
			setState(125);
			match(Identifier);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXT) {
				{
				setState(126);
				match(EXT);
				setState(127);
				typeType();
				}
			}

			setState(130);
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
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
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
			setState(132);
			match(KOP);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << STA) | (1L << Identifier) | (1L << KOP) | (1L << EndL))) != 0)) {
				{
				{
				setState(133);
				classBodyDeclaration();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STA() { return getToken(javalessParser.STA, 0); }
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(EndL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STA) {
					{
					setState(142);
					match(STA);
					}
				}

				setState(145);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(146);
					modifiers();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				memberDecl();
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

	public static class MemberDeclContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
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
		enterRule(_localctx, 14, RULE_memberDecl);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			typeTypeOrVoid();
			setState(162);
			match(Identifier);
			setState(163);
			formalParameters();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOP) {
				{
				{
				setState(164);
				match(VOP);
				setState(165);
				match(VCL);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			methodBody();
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(KOP);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << CLA) | (1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << RET) | (1L << SUP) | (1L << IF) | (1L << WHI) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << STA) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << KOP) | (1L << AP) | (1L << EndL))) != 0)) {
				{
				{
				setState(174);
				blockStatement();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		enterRule(_localctx, 20, RULE_blockStatement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				localVariableDeclarationStatement();
				setState(183);
				match(EndL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodBody);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				block();
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		enterRule(_localctx, 24, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(201);
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
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << PRI) | (1L << PRO) | (1L << PUB) | (1L << STA))) != 0)) {
					{
					{
					setState(193);
					modifiers();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(199);
				classDeclaration();
				}
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(IF);
				setState(205);
				parExpression();
				setState(206);
				statement();
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(207);
					match(ELS);
					setState(208);
					statement();
					}
					break;
				}
				}
				break;
			case WHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(WHI);
				setState(212);
				parExpression();
				setState(213);
				statement();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(RET);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP))) != 0)) {
					{
					setState(216);
					expression(0);
					}
				}

				setState(219);
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
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(221);
				match(EndL);
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
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
		enterRule(_localctx, 28, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(AP);
			setState(227);
			expression(0);
			setState(228);
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
		public TerminalNode SUP() { return getToken(javalessParser.SUP, 0); }
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
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(Identifier);
				setState(231);
				match(AP);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP))) != 0)) {
					{
					setState(232);
					expressionList();
					}
				}

				setState(235);
				match(FP);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(THIS);
				setState(237);
				match(AP);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP))) != 0)) {
					{
					setState(238);
					expressionList();
					}
				}

				setState(241);
				match(FP);
				}
				break;
			case SUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(SUP);
				setState(243);
				match(AP);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP))) != 0)) {
					{
					setState(244);
					expressionList();
					}
				}

				setState(247);
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
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expression(0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(251);
				match(COMA);
				setState(252);
				expression(0);
				}
				}
				setState(257);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(AP);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHA) | (1L << BOO) | (1L << Identifier))) != 0)) {
				{
				setState(259);
				formalParameterList();
				}
			}

			setState(262);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			formalParameter();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(265);
				match(COMA);
				setState(266);
				formalParameter();
				}
				}
				setState(271);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			typeType();
			setState(273);
			variableDeclaratorId();
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
		enterRule(_localctx, 40, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			typeType();
			setState(276);
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
		enterRule(_localctx, 42, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			variableDeclarator();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(279);
				match(COMA);
				setState(280);
				variableDeclarator();
				}
				}
				setState(285);
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
		enterRule(_localctx, 44, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			variableDeclaratorId();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atrib) {
				{
				setState(287);
				match(Atrib);
				setState(288);
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
		enterRule(_localctx, 46, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Identifier);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOP) {
				{
				{
				setState(292);
				match(VOP);
				setState(293);
				match(VCL);
				}
				}
				setState(298);
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
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(KOP);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << KOP) | (1L << AP))) != 0)) {
				{
				setState(304);
				variableInitializer();
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(COMA);
						setState(306);
						variableInitializer();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(312);
					match(COMA);
					}
				}

				}
			}

			setState(317);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 52, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(AP);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << VOI) | (1L << BOO) | (1L << Identifier) | (1L << Numl) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << BoolLiteral) | (1L << PLU) | (1L << SUB) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP))) != 0)) {
				{
				setState(320);
				expressionList();
				}
			}

			setState(323);
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
		enterRule(_localctx, 54, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(328);
				primary();
				}
				break;
			case 2:
				{
				setState(329);
				methodCall();
				}
				break;
			case 3:
				{
				setState(330);
				match(NEW);
				setState(331);
				creator();
				}
				break;
			case 4:
				{
				setState(332);
				match(AP);
				setState(333);
				typeType();
				setState(334);
				match(FP);
				setState(335);
				expression(11);
				}
				break;
			case 5:
				{
				setState(337);
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
				setState(338);
				expression(9);
				}
				break;
			case 6:
				{
				setState(339);
				((ExpressionContext)_localctx).prefix = match(NOT);
				setState(340);
				expression(8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(344);
						match(TIM);
						setState(345);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(347);
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
						setState(348);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(350);
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
						setState(351);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(353);
						match(EQL);
						setState(354);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(356);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(357);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(359);
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
						setState(360);
						expression(1);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(362);
						((ExpressionContext)_localctx).bop = match(PTR);
						setState(368);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(363);
							match(Identifier);
							}
							break;
						case 2:
							{
							setState(364);
							methodCall();
							}
							break;
						case 3:
							{
							setState(365);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(366);
							match(SUP);
							setState(367);
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
						setState(370);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(371);
						match(VOP);
						setState(372);
						expression(0);
						setState(373);
						match(VCL);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(376);
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
						setState(377);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(378);
						((ExpressionContext)_localctx).bop = match(INS);
						setState(379);
						typeType();
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 58, RULE_primary);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				parExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(SUP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				typeTypeOrVoid();
				setState(391);
				match(PTR);
				setState(392);
				match(CLA);
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
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
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
		enterRule(_localctx, 60, RULE_creator);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				basicType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				basicType();
				setState(400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOP:
					{
					setState(398);
					arrayCreatorRest();
					}
					break;
				case AP:
					{
					setState(399);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(Identifier);
				setState(405);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOP:
					{
					setState(403);
					arrayCreatorRest();
					}
					break;
				case AP:
					{
					setState(404);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(Identifier);
			setState(410);
			formalParameters();
			setState(411);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode EndL() { return getToken(javalessParser.EndL, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			typeType();
			setState(414);
			variableDeclarators();
			setState(415);
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
		enterRule(_localctx, 66, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(VOP);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCL:
				{
				setState(418);
				match(VCL);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOP) {
					{
					{
					setState(419);
					match(VOP);
					setState(420);
					match(VCL);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
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
				{
				setState(427);
				expression(0);
				setState(428);
				match(VCL);
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(429);
						match(VOP);
						setState(430);
						expression(0);
						setState(431);
						match(VCL);
						}
						} 
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						match(VOP);
						setState(439);
						match(VCL);
						}
						} 
					}
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 68, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			arguments();
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(448);
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
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
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
		enterRule(_localctx, 70, RULE_typeTypeOrVoid);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(VOI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(Identifier);
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
		enterRule(_localctx, 72, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
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
		enterRule(_localctx, 74, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHA:
			case BOO:
				{
				setState(458);
				basicType();
				}
				break;
			case Identifier:
				{
				setState(459);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(VOP);
					setState(463);
					match(VCL);
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
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
		enterRule(_localctx, 76, RULE_superSuffix);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				arguments();
				}
				break;
			case PTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(PTR);
				setState(471);
				match(Identifier);
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(472);
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
		enterRule(_localctx, 78, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(Identifier);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(PTR);
					setState(479);
					match(Identifier);
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		enterRule(_localctx, 80, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\5\4q\n\4\3\4\3\4\3\5\7\5"+
		"v\n\5\f\5\16\5y\13\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3"+
		"\6\3\6\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\3\b\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b\5\b\u009c\n\b\3\t\3"+
		"\t\3\t\3\t\5\t\u00a2\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac"+
		"\13\n\3\n\3\n\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f\3\r\3\r\5\r\u00c2\n\r\3\16\7\16"+
		"\u00c5\n\16\f\16\16\16\u00c8\13\16\3\16\3\16\5\16\u00cc\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00d4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00dc\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\5\21\u00ec\n\21\3\21\3\21\3\21\3\21\5\21\u00f2\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f8\n\21\3\21\5\21\u00fb\n\21\3\22\3\22\3"+
		"\22\7\22\u0100\n\22\f\22\16\22\u0103\13\22\3\23\3\23\5\23\u0107\n\23\3"+
		"\23\3\23\3\24\3\24\3\24\7\24\u010e\n\24\f\24\16\24\u0111\13\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f"+
		"\13\27\3\30\3\30\3\30\5\30\u0124\n\30\3\31\3\31\3\31\7\31\u0129\n\31\f"+
		"\31\16\31\u012c\13\31\3\32\3\32\5\32\u0130\n\32\3\33\3\33\3\33\3\33\7"+
		"\33\u0136\n\33\f\33\16\33\u0139\13\33\3\33\5\33\u013c\n\33\5\33\u013e"+
		"\n\33\3\33\3\33\3\34\3\34\5\34\u0144\n\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0158"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0173"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u017f\n\36"+
		"\f\36\16\36\u0182\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u018d\n\37\3 \3 \3 \3 \5 \u0193\n \3 \3 \3 \5 \u0198\n \5 \u019a\n"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u01a8\n#\f#\16#\u01ab\13"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u01b4\n#\f#\16#\u01b7\13#\3#\3#\7#\u01bb\n#"+
		"\f#\16#\u01be\13#\5#\u01c0\n#\3$\3$\5$\u01c4\n$\3%\3%\3%\5%\u01c9\n%\3"+
		"&\3&\3\'\3\'\5\'\u01cf\n\'\3\'\3\'\7\'\u01d3\n\'\f\'\16\'\u01d6\13\'\3"+
		"(\3(\3(\3(\5(\u01dc\n(\5(\u01de\n(\3)\3)\3)\7)\u01e3\n)\f)\16)\u01e6\13"+
		")\3*\3*\3*\2\3:+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPR\2\n\4\2\24\25\27\27\4\2&\')*\3\2&\'\3\2$%\3\2 !\3"+
		"\2)*\5\2\3\3\5\7\30\30\4\2\13\13\34\37\2\u0215\2U\3\2\2\2\4e\3\2\2\2\6"+
		"i\3\2\2\2\b|\3\2\2\2\n~\3\2\2\2\f\u0086\3\2\2\2\16\u009b\3\2\2\2\20\u00a1"+
		"\3\2\2\2\22\u00a3\3\2\2\2\24\u00af\3\2\2\2\26\u00bd\3\2\2\2\30\u00c1\3"+
		"\2\2\2\32\u00cb\3\2\2\2\34\u00e2\3\2\2\2\36\u00e4\3\2\2\2 \u00fa\3\2\2"+
		"\2\"\u00fc\3\2\2\2$\u0104\3\2\2\2&\u010a\3\2\2\2(\u0112\3\2\2\2*\u0115"+
		"\3\2\2\2,\u0118\3\2\2\2.\u0120\3\2\2\2\60\u0125\3\2\2\2\62\u012f\3\2\2"+
		"\2\64\u0131\3\2\2\2\66\u0141\3\2\2\28\u0147\3\2\2\2:\u0157\3\2\2\2<\u018c"+
		"\3\2\2\2>\u0199\3\2\2\2@\u019b\3\2\2\2B\u019f\3\2\2\2D\u01a3\3\2\2\2F"+
		"\u01c1\3\2\2\2H\u01c8\3\2\2\2J\u01ca\3\2\2\2L\u01ce\3\2\2\2N\u01dd\3\2"+
		"\2\2P\u01df\3\2\2\2R\u01e7\3\2\2\2TV\5\4\3\2UT\3\2\2\2UV\3\2\2\2VZ\3\2"+
		"\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[`\3\2\2\2\\Z\3"+
		"\2\2\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3"+
		"\2\2\2cd\7\2\2\3d\3\3\2\2\2ef\7\r\2\2fg\5P)\2gh\7\63\2\2h\5\3\2\2\2ik"+
		"\7\f\2\2jl\7\30\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mp\5P)\2no\7\64\2\2o"+
		"q\7(\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\63\2\2s\7\3\2\2\2tv\5J&\2u"+
		"t\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z}\5\n\6\2"+
		"{}\7\63\2\2|w\3\2\2\2|{\3\2\2\2}\t\3\2\2\2~\177\7\b\2\2\177\u0082\7\33"+
		"\2\2\u0080\u0081\7\4\2\2\u0081\u0083\5L\'\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\f\7\2\u0085\13\3\2\2"+
		"\2\u0086\u008a\7.\2\2\u0087\u0089\5\16\b\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7/\2\2\u008e\r\3\2\2\2\u008f\u009c\7\63\2\2"+
		"\u0090\u0092\7\30\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u009c\5\24\13\2\u0094\u0096\5J&\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009c\5\20\t\2\u009b\u008f\3\2\2\2\u009b"+
		"\u0091\3\2\2\2\u009b\u0097\3\2\2\2\u009c\17\3\2\2\2\u009d\u00a2\5\22\n"+
		"\2\u009e\u00a2\5@!\2\u009f\u00a2\5B\"\2\u00a0\u00a2\5\n\6\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\21\3\2\2\2\u00a3\u00a4\5H%\2\u00a4\u00a5\7\33\2\2\u00a5\u00aa\5$\23\2"+
		"\u00a6\u00a7\7,\2\2\u00a7\u00a9\7-\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\5\30\r\2\u00ae\23\3\2\2\2\u00af\u00b3\7.\2"+
		"\2\u00b0\u00b2\5\26\f\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7/\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba"+
		"\7\63\2\2\u00ba\u00be\3\2\2\2\u00bb\u00be\5\34\17\2\u00bc\u00be\5\32\16"+
		"\2\u00bd\u00b8\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\27"+
		"\3\2\2\2\u00bf\u00c2\5\24\13\2\u00c0\u00c2\7\63\2\2\u00c1\u00bf\3\2\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c5\5J&\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\5\n\6\2\u00ca\u00cc\7\63"+
		"\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00e3"+
		"\5\24\13\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\5\36\20\2\u00d0\u00d3\5\34"+
		"\17\2\u00d1\u00d2\7\22\2\2\u00d2\u00d4\5\34\17\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\7\21\2\2\u00d6\u00d7\5"+
		"\36\20\2\u00d7\u00d8\5\34\17\2\u00d8\u00e3\3\2\2\2\u00d9\u00db\7\16\2"+
		"\2\u00da\u00dc\5:\36\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00e3\7\63\2\2\u00de\u00df\5:\36\2\u00df\u00e0\7\63\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00e3\7\63\2\2\u00e2\u00cd\3\2\2\2\u00e2\u00ce"+
		"\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\5:\36"+
		"\2\u00e6\u00e7\7\61\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\7\33\2\2\u00e9\u00eb"+
		"\7\60\2\2\u00ea\u00ec\5\"\22\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00fb\7\61\2\2\u00ee\u00ef\7\t\2\2\u00ef\u00f1"+
		"\7\60\2\2\u00f0\u00f2\5\"\22\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00fb\7\61\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f7"+
		"\7\60\2\2\u00f6\u00f8\5\"\22\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\61\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00ee"+
		"\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fb!\3\2\2\2\u00fc\u0101\5:\36\2\u00fd"+
		"\u00fe\7\65\2\2\u00fe\u0100\5:\36\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102#\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0106\7\60\2\2\u0105\u0107\5&\24\2\u0106\u0105\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\61\2\2\u0109%\3"+
		"\2\2\2\u010a\u010f\5(\25\2\u010b\u010c\7\65\2\2\u010c\u010e\5(\25\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\'\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\5L\'\2\u0113\u0114"+
		"\5\60\31\2\u0114)\3\2\2\2\u0115\u0116\5L\'\2\u0116\u0117\5,\27\2\u0117"+
		"+\3\2\2\2\u0118\u011d\5.\30\2\u0119\u011a\7\65\2\2\u011a\u011c\5.\30\2"+
		"\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e-\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0123\5\60\31\2\u0121"+
		"\u0122\7 \2\2\u0122\u0124\5\62\32\2\u0123\u0121\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124/\3\2\2\2\u0125\u012a\7\33\2\2\u0126\u0127\7,\2\2\u0127\u0129"+
		"\7-\2\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\61\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0130\5\64\33"+
		"\2\u012e\u0130\5:\36\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\63"+
		"\3\2\2\2\u0131\u013d\7.\2\2\u0132\u0137\5\62\32\2\u0133\u0134\7\65\2\2"+
		"\u0134\u0136\5\62\32\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\7\65\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3"+
		"\2\2\2\u013d\u0132\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7/\2\2\u0140\65\3\2\2\2\u0141\u0143\7\60\2\2\u0142\u0144\5\"\22"+
		"\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\7\61\2\2\u0146\67\3\2\2\2\u0147\u0148\t\2\2\2\u01489\3\2\2\2\u0149\u014a"+
		"\b\36\1\2\u014a\u0158\5<\37\2\u014b\u0158\5 \21\2\u014c\u014d\7\n\2\2"+
		"\u014d\u0158\5> \2\u014e\u014f\7\60\2\2\u014f\u0150\5L\'\2\u0150\u0151"+
		"\7\61\2\2\u0151\u0152\5:\36\r\u0152\u0158\3\2\2\2\u0153\u0154\t\3\2\2"+
		"\u0154\u0158\5:\36\13\u0155\u0156\7+\2\2\u0156\u0158\5:\36\n\u0157\u0149"+
		"\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014c\3\2\2\2\u0157\u014e\3\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0180\3\2\2\2\u0159\u015a\f\t"+
		"\2\2\u015a\u015b\7(\2\2\u015b\u017f\5:\36\n\u015c\u015d\f\b\2\2\u015d"+
		"\u015e\t\4\2\2\u015e\u017f\5:\36\t\u015f\u0160\f\7\2\2\u0160\u0161\t\5"+
		"\2\2\u0161\u017f\5:\36\b\u0162\u0163\f\5\2\2\u0163\u0164\7#\2\2\u0164"+
		"\u017f\5:\36\6\u0165\u0166\f\4\2\2\u0166\u0167\7\"\2\2\u0167\u017f\5:"+
		"\36\5\u0168\u0169\f\3\2\2\u0169\u016a\t\6\2\2\u016a\u017f\5:\36\3\u016b"+
		"\u016c\f\21\2\2\u016c\u0172\7\64\2\2\u016d\u0173\7\33\2\2\u016e\u0173"+
		"\5 \21\2\u016f\u0173\7\t\2\2\u0170\u0171\7\17\2\2\u0171\u0173\5N(\2\u0172"+
		"\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u017f\3\2\2\2\u0174\u0175\f\20\2\2\u0175\u0176\7,\2\2\u0176"+
		"\u0177\5:\36\2\u0177\u0178\7-\2\2\u0178\u017f\3\2\2\2\u0179\u017a\f\f"+
		"\2\2\u017a\u017f\t\7\2\2\u017b\u017c\f\6\2\2\u017c\u017d\7\23\2\2\u017d"+
		"\u017f\5L\'\2\u017e\u0159\3\2\2\2\u017e\u015c\3\2\2\2\u017e\u015f\3\2"+
		"\2\2\u017e\u0162\3\2\2\2\u017e\u0165\3\2\2\2\u017e\u0168\3\2\2\2\u017e"+
		"\u016b\3\2\2\2\u017e\u0174\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017b\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		";\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u018d\5\36\20\2\u0184\u018d\7\t\2"+
		"\2\u0185\u018d\7\17\2\2\u0186\u018d\5R*\2\u0187\u018d\7\33\2\2\u0188\u0189"+
		"\5H%\2\u0189\u018a\7\64\2\2\u018a\u018b\7\b\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0183\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2"+
		"\2\2\u018c\u0187\3\2\2\2\u018c\u0188\3\2\2\2\u018d=\3\2\2\2\u018e\u019a"+
		"\58\35\2\u018f\u0192\58\35\2\u0190\u0193\5D#\2\u0191\u0193\5F$\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u019a\3\2\2\2\u0194\u0197\7\33"+
		"\2\2\u0195\u0198\5D#\2\u0196\u0198\5F$\2\u0197\u0195\3\2\2\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u018e\3\2\2\2\u0199\u018f\3\2\2\2\u0199"+
		"\u0194\3\2\2\2\u019a?\3\2\2\2\u019b\u019c\7\33\2\2\u019c\u019d\5$\23\2"+
		"\u019d\u019e\5\24\13\2\u019eA\3\2\2\2\u019f\u01a0\5L\'\2\u01a0\u01a1\5"+
		",\27\2\u01a1\u01a2\7\63\2\2\u01a2C\3\2\2\2\u01a3\u01bf\7,\2\2\u01a4\u01a9"+
		"\7-\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a8\7-\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01c0\5\64\33\2\u01ad\u01ae\5:\36\2\u01ae"+
		"\u01b5\7-\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1\5:\36\2\u01b1\u01b2\7-\2"+
		"\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bc\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01b9\7,\2\2\u01b9\u01bb\7-\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2"+
		"\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01bf\u01a4\3\2\2\2\u01bf\u01ad\3\2\2\2\u01c0E\3\2\2\2\u01c1"+
		"\u01c3\5\66\34\2\u01c2\u01c4\5\f\7\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4G\3\2\2\2\u01c5\u01c9\5L\'\2\u01c6\u01c9\7\26\2\2\u01c7\u01c9"+
		"\7\33\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2"+
		"\u01c9I\3\2\2\2\u01ca\u01cb\t\b\2\2\u01cbK\3\2\2\2\u01cc\u01cf\58\35\2"+
		"\u01cd\u01cf\7\33\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d4"+
		"\3\2\2\2\u01d0\u01d1\7,\2\2\u01d1\u01d3\7-\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5M\3\2\2\2"+
		"\u01d6\u01d4\3\2\2\2\u01d7\u01de\5\66\34\2\u01d8\u01d9\7\64\2\2\u01d9"+
		"\u01db\7\33\2\2\u01da\u01dc\5\66\34\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01de"+
		"O\3\2\2\2\u01df\u01e4\7\33\2\2\u01e0\u01e1\7\64\2\2\u01e1\u01e3\7\33\2"+
		"\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5Q\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\t\t\2\2\u01e8"+
		"S\3\2\2\2:UZ`kpw|\u0082\u008a\u0091\u0097\u009b\u00a1\u00aa\u00b3\u00bd"+
		"\u00c1\u00c6\u00cb\u00d3\u00db\u00e2\u00eb\u00f1\u00f7\u00fa\u0101\u0106"+
		"\u010f\u011d\u0123\u012a\u012f\u0137\u013b\u013d\u0143\u0157\u0172\u017e"+
		"\u0180\u018c\u0192\u0197\u0199\u01a9\u01b5\u01bc\u01bf\u01c3\u01c8\u01ce"+
		"\u01d4\u01db\u01dd\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}