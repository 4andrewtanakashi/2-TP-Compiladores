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
		VOI=20, BOO=21, STA=22, FAL=23, TRU=24, Error1=25, Error2=26, Error3=27, 
		Error4=28, Error5=29, Error6=30, Error7=31, Error8=32, Error9=33, Error10=34, 
		Error11=35, Identifier=36, NumR=37, Atrib=38, AtrArit=39, OpBool=40, OpUni=41, 
		OpArit=42, AND=43, EQL=44, LT=45, LTE=46, PLU=47, SUB=48, TIM=49, PPL=50, 
		SSB=51, NOT=52, VOP=53, VCL=54, KOP=55, KCL=56, AP=57, FP=58, Str=59, 
		EndL=60, PTR=61, COMA=62, NEWLINE=63, WS=64, Comment=65, LOWW=66, UPPW=67, 
		Numl=68, NNuml=69, WORD=70, MODV=71;
	public static final int
		RULE_compilationUnit = 0, RULE_packageSyntax = 1, RULE_importSyntax = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_classBody = 5, 
		RULE_memberDecl = 6, RULE_block = 7, RULE_blockStatement = 8, RULE_statement = 9, 
		RULE_formalParameters = 10, RULE_formalParameter = 11, RULE_parameter = 12, 
		RULE_parExpression = 13, RULE_localVariableDeclarationStatement = 14, 
		RULE_variableDeclarators = 15, RULE_variableDeclarator = 16, RULE_variableDeclaratorId = 17, 
		RULE_variableInitializer = 18, RULE_arrayInitializer = 19, RULE_arguments = 20, 
		RULE_type = 21, RULE_basicType = 22, RULE_referenceType = 23, RULE_expression = 24, 
		RULE_assignmentExpression = 25, RULE_conditionalAndExpression = 26, RULE_equalityExpression = 27, 
		RULE_relationalExpression = 28, RULE_additiveExpression = 29, RULE_multiplicativeExpression = 30, 
		RULE_unaryExpression = 31, RULE_simpleUnaryExpression = 32, RULE_postfixExpression = 33, 
		RULE_selector = 34, RULE_primary = 35, RULE_creator = 36, RULE_newArrayDeclarator = 37, 
		RULE_modifiers = 38, RULE_qualifiedIdentifier = 39, RULE_literal = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageSyntax", "importSyntax", "typeDeclaration", 
			"classDeclaration", "classBody", "memberDecl", "block", "blockStatement", 
			"statement", "formalParameters", "formalParameter", "parameter", "parExpression", 
			"localVariableDeclarationStatement", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "arguments", 
			"type", "basicType", "referenceType", "expression", "assignmentExpression", 
			"conditionalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"simpleUnaryExpression", "postfixExpression", "selector", "primary", 
			"creator", "newArrayDeclarator", "modifiers", "qualifiedIdentifier", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'private'", "'protected'", "'public'", 
			"'class'", "'this'", "'new'", "'null'", "'import'", "'package'", "'return'", 
			"'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", "'char'", 
			"'void'", "'boolean'", "'static'", "'false'", "'true'", null, "'abtract'", 
			null, "'privte'", "'cass'", null, null, null, "'instancof'", "'bool'", 
			null, null, null, "'='", "'+='", null, null, null, "'&&'", "'=='", "'>'", 
			"'<='", "'+'", "'-'", "'*'", "'++'", "'--'", "'!'", "'['", "']'", "'{'", 
			"'}'", "'('", "')'", null, "';'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", 
			"IMP", "PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", 
			"VOI", "BOO", "STA", "FAL", "TRU", "Error1", "Error2", "Error3", "Error4", 
			"Error5", "Error6", "Error7", "Error8", "Error9", "Error10", "Error11", 
			"Identifier", "NumR", "Atrib", "AtrArit", "OpBool", "OpUni", "OpArit", 
			"AND", "EQL", "LT", "LTE", "PLU", "SUB", "TIM", "PPL", "SSB", "NOT", 
			"VOP", "VCL", "KOP", "KCL", "AP", "FP", "Str", "EndL", "PTR", "COMA", 
			"NEWLINE", "WS", "Comment", "LOWW", "UPPW", "Numl", "NNuml", "WORD", 
			"MODV"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << CLA) | (1L << STA))) != 0) || _la==MODV) {
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTR) {
				{
				setState(108);
				match(PTR);
				}
			}

			setState(111);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABS || _la==STA || _la==MODV) {
				{
				{
				setState(113);
				modifiers();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			classDeclaration();
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
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
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
			setState(121);
			match(CLA);
			setState(122);
			match(Identifier);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXT) {
				{
				setState(123);
				match(EXT);
				setState(124);
				qualifiedIdentifier();
				}
			}

			setState(127);
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
			setState(129);
			match(KOP);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STA || _la==KOP) {
				{
				{
				setState(130);
				memberDecl();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STA() { return getToken(javalessParser.STA, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STA) {
				{
				setState(138);
				match(STA);
				}
			}

			setState(141);
			block();
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode KCL() { return getToken(javalessParser.KCL, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(KOP);
			setState(144);
			blockStatement();
			setState(145);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				localVariableDeclarationStatement();
				setState(148);
				match(EndL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				statement();
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
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(IF);
				setState(155);
				parExpression();
				setState(156);
				statement();
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(157);
					match(ELS);
					setState(158);
					statement();
					}
					break;
				}
				}
				break;
			case WHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(WHI);
				setState(162);
				parExpression();
				setState(163);
				statement();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(RET);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << FAL) | (1L << TRU) | (1L << Identifier) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << Str))) != 0)) {
					{
					setState(166);
					expression();
					}
				}

				setState(169);
				match(EndL);
				}
				break;
			case EndL:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(EndL);
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case FAL:
			case TRU:
			case Identifier:
			case PPL:
			case SSB:
			case NOT:
			case AP:
			case Str:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				((StatementContext)_localctx).statementExpression = expression();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
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
		enterRule(_localctx, 20, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(AP);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHA) | (1L << BOO) | (1L << Identifier))) != 0)) {
				{
				setState(175);
				formalParameter();
				}
			}

			setState(178);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(javalessParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(javalessParser.COMA, i);
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
		enterRule(_localctx, 22, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			parameter();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(181);
				match(COMA);
				setState(182);
				parameter();
				}
				}
				setState(187);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			type();
			setState(189);
			match(Identifier);
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
		enterRule(_localctx, 26, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(AP);
			setState(192);
			expression();
			setState(193);
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(195);
			type();
			setState(196);
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
			setState(198);
			variableDeclarator();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(199);
				match(COMA);
				setState(200);
				variableDeclarator();
				}
				}
				setState(205);
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
			setState(206);
			variableDeclaratorId();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atrib) {
				{
				setState(207);
				match(Atrib);
				setState(208);
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
			setState(211);
			match(Identifier);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOP) {
				{
				{
				setState(212);
				match(VOP);
				setState(213);
				match(VCL);
				}
				}
				setState(218);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				arrayInitializer();
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case FAL:
			case TRU:
			case Identifier:
			case PPL:
			case SSB:
			case NOT:
			case AP:
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				expression();
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
			setState(223);
			match(KOP);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << FAL) | (1L << TRU) | (1L << Identifier) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << KOP) | (1L << AP) | (1L << Str))) != 0)) {
				{
				setState(224);
				variableInitializer();
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225);
						match(COMA);
						setState(226);
						variableInitializer();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(232);
					match(COMA);
					}
				}

				}
			}

			setState(237);
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
			setState(239);
			match(AP);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << FAL) | (1L << TRU) | (1L << Identifier) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << Str))) != 0)) {
				{
				setState(240);
				expression();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(241);
					match(COMA);
					setState(242);
					expression();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				basicType();
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
		enterRule(_localctx, 44, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
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
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_referenceType);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHA:
			case BOO:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				basicType();
				setState(259);
				match(VOP);
				setState(260);
				match(VCL);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOP) {
					{
					{
					setState(261);
					match(VOP);
					setState(262);
					match(VCL);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				qualifiedIdentifier();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOP) {
					{
					{
					setState(269);
					match(VOP);
					setState(270);
					match(VCL);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			assignmentExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Atrib() { return getToken(javalessParser.Atrib, 0); }
		public TerminalNode AtrArit() { return getToken(javalessParser.AtrArit, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			conditionalAndExpression();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atrib || _la==AtrArit) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==Atrib || _la==AtrArit) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				assignmentExpression();
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(javalessParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(javalessParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			equalityExpression();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(286);
				match(AND);
				setState(287);
				equalityExpression();
				}
				}
				setState(292);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			relationalExpression();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << NUL) | (1L << SUP) | (1L << INT) | (1L << CHA) | (1L << FAL) | (1L << TRU) | (1L << Identifier) | (1L << PPL) | (1L << SSB) | (1L << NOT) | (1L << AP) | (1L << Str))) != 0)) {
				{
				{
				setState(294);
				relationalExpression();
				}
				}
				setState(299);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode INS() { return getToken(javalessParser.INS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode LT() { return getToken(javalessParser.LT, 0); }
		public TerminalNode LTE() { return getToken(javalessParser.LTE, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			additiveExpression();
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case LTE:
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==LTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				additiveExpression();
				}
				break;
			case INS:
				{
				setState(303);
				match(INS);
				setState(304);
				referenceType();
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case ELS:
			case INT:
			case CHA:
			case FAL:
			case TRU:
			case Identifier:
			case Atrib:
			case AtrArit:
			case AND:
			case PPL:
			case SSB:
			case NOT:
			case VCL:
			case KCL:
			case AP:
			case FP:
			case Str:
			case EndL:
			case COMA:
				break;
			default:
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLU() { return getTokens(javalessParser.PLU); }
		public TerminalNode PLU(int i) {
			return getToken(javalessParser.PLU, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			multiplicativeExpression();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLU:
						{
						setState(308);
						match(PLU);
						}
						break;
					case THIS:
					case NEW:
					case NUL:
					case SUP:
					case INT:
					case CHA:
					case FAL:
					case TRU:
					case Identifier:
					case PPL:
					case SSB:
					case NOT:
					case AP:
					case Str:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(312);
					multiplicativeExpression();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> TIM() { return getTokens(javalessParser.TIM); }
		public TerminalNode TIM(int i) {
			return getToken(javalessParser.TIM, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			unaryExpression();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIM) {
				{
				{
				setState(319);
				match(TIM);
				setState(320);
				unaryExpression();
				}
				}
				setState(325);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode PPL() { return getToken(javalessParser.PPL, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SSB() { return getToken(javalessParser.SSB, 0); }
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryExpression);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPL:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(PPL);
				setState(327);
				unaryExpression();
				}
				break;
			case SSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(SSB);
				setState(329);
				unaryExpression();
				}
				break;
			case THIS:
			case NEW:
			case NUL:
			case SUP:
			case INT:
			case CHA:
			case FAL:
			case TRU:
			case Identifier:
			case NOT:
			case AP:
			case Str:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				simpleUnaryExpression();
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

	public static class SimpleUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(javalessParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode AP() { return getToken(javalessParser.AP, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode FP() { return getToken(javalessParser.FP, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterSimpleUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitSimpleUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitSimpleUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUnaryExpressionContext simpleUnaryExpression() throws RecognitionException {
		SimpleUnaryExpressionContext _localctx = new SimpleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_simpleUnaryExpression);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(NOT);
				setState(334);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(AP);
				setState(336);
				basicType();
				setState(337);
				match(FP);
				setState(338);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(AP);
				setState(341);
				referenceType();
				setState(342);
				match(FP);
				setState(343);
				simpleUnaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				postfixExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode PPL() { return getToken(javalessParser.PPL, 0); }
		public TerminalNode SSB() { return getToken(javalessParser.SSB, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			primary();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOP || _la==PTR) {
				{
				{
				setState(349);
				selector();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			((PostfixExpressionContext)_localctx).postfix = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PPL || _la==SSB) ) {
				((PostfixExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
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

	public static class SelectorContext extends ParserRuleContext {
		public Token bop;
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode VOP() { return getToken(javalessParser.VOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VCL() { return getToken(javalessParser.VCL, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selector);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((SelectorContext)_localctx).bop = match(PTR);
				setState(358);
				qualifiedIdentifier();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(359);
					arguments();
					}
				}

				}
				break;
			case VOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(VOP);
				setState(363);
				expression();
				setState(364);
				match(VCL);
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

	public static class PrimaryContext extends ParserRuleContext {
		public Token bop;
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javalessParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUP() { return getToken(javalessParser.SUP, 0); }
		public TerminalNode Identifier() { return getToken(javalessParser.Identifier, 0); }
		public TerminalNode PTR() { return getToken(javalessParser.PTR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(javalessParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_primary);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(THIS);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(370);
					arguments();
					}
				}

				}
				break;
			case SUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(SUP);
				setState(380);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AP:
					{
					setState(374);
					arguments();
					}
					break;
				case PTR:
					{
					setState(375);
					((PrimaryContext)_localctx).bop = match(PTR);
					setState(376);
					match(Identifier);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AP) {
						{
						setState(377);
						arguments();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NUL:
			case INT:
			case CHA:
			case FAL:
			case TRU:
			case Str:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				match(NEW);
				setState(384);
				creator();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				qualifiedIdentifier();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(386);
					arguments();
					}
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

	public static class CreatorContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public NewArrayDeclaratorContext newArrayDeclarator() {
			return getRuleContext(NewArrayDeclaratorContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
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
		enterRule(_localctx, 72, RULE_creator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHA:
			case BOO:
				{
				setState(391);
				basicType();
				}
				break;
			case Identifier:
				{
				setState(392);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(395);
				arguments();
				}
				break;
			case 2:
				{
				setState(396);
				match(VOP);
				setState(397);
				match(VCL);
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(VOP);
						setState(399);
						match(VCL);
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KOP) {
					{
					setState(405);
					arrayInitializer();
					}
				}

				}
				break;
			case 3:
				{
				setState(408);
				newArrayDeclarator();
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

	public static class NewArrayDeclaratorContext extends ParserRuleContext {
		public List<TerminalNode> VOP() { return getTokens(javalessParser.VOP); }
		public TerminalNode VOP(int i) {
			return getToken(javalessParser.VOP, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> VCL() { return getTokens(javalessParser.VCL); }
		public TerminalNode VCL(int i) {
			return getToken(javalessParser.VCL, i);
		}
		public NewArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArrayDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).enterNewArrayDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javalessParserListener ) ((javalessParserListener)listener).exitNewArrayDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javalessParserVisitor ) return ((javalessParserVisitor<? extends T>)visitor).visitNewArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayDeclaratorContext newArrayDeclarator() throws RecognitionException {
		NewArrayDeclaratorContext _localctx = new NewArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newArrayDeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(VOP);
			setState(412);
			expression();
			setState(413);
			match(VCL);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					match(VOP);
					setState(415);
					expression();
					setState(416);
					match(VCL);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					match(VOP);
					setState(424);
					match(VCL);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode MODV() { return getToken(javalessParser.MODV, 0); }
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
		enterRule(_localctx, 76, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( !(_la==ABS || _la==STA || _la==MODV) ) {
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
			setState(432);
			match(Identifier);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					match(PTR);
					setState(434);
					match(Identifier);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public TerminalNode INT() { return getToken(javalessParser.INT, 0); }
		public TerminalNode CHA() { return getToken(javalessParser.CHA, 0); }
		public TerminalNode TRU() { return getToken(javalessParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(javalessParser.FAL, 0); }
		public TerminalNode NUL() { return getToken(javalessParser.NUL, 0); }
		public TerminalNode Str() { return getToken(javalessParser.Str, 0); }
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
			setState(440);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUL) | (1L << INT) | (1L << CHA) | (1L << FAL) | (1L << TRU) | (1L << Str))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\5\4l\n\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\7\5u\n"+
		"\5\f\5\16\5x\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\6\3\6\3\7\3"+
		"\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7\3\b\5\b\u008e\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a2\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\3"+
		"\13\3\13\3\13\5\13\u00af\n\13\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00cc\n\21\f\21\16\21\u00cf\13\21"+
		"\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\3\23\7\23\u00d9\n\23\f\23\16"+
		"\23\u00dc\13\23\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25\7\25\u00e6"+
		"\n\25\f\25\16\25\u00e9\13\25\3\25\5\25\u00ec\n\25\5\25\u00ee\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\7\26\u00f6\n\26\f\26\16\26\u00f9\13\26\5\26"+
		"\u00fb\n\26\3\26\3\26\3\27\3\27\5\27\u0101\n\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\7\31\u010a\n\31\f\31\16\31\u010d\13\31\3\31\3\31\3\31\7"+
		"\31\u0112\n\31\f\31\16\31\u0115\13\31\5\31\u0117\n\31\3\32\3\32\3\33\3"+
		"\33\3\33\5\33\u011e\n\33\3\34\3\34\3\34\7\34\u0123\n\34\f\34\16\34\u0126"+
		"\13\34\3\35\3\35\7\35\u012a\n\35\f\35\16\35\u012d\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0134\n\36\3\37\3\37\3\37\5\37\u0139\n\37\3\37\7\37\u013c"+
		"\n\37\f\37\16\37\u013f\13\37\3 \3 \3 \7 \u0144\n \f \16 \u0147\13 \3!"+
		"\3!\3!\3!\3!\5!\u014e\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u015d\n\"\3#\3#\7#\u0161\n#\f#\16#\u0164\13#\3#\3#\3$\3$\3"+
		"$\5$\u016b\n$\3$\3$\3$\3$\5$\u0171\n$\3%\3%\3%\5%\u0176\n%\3%\3%\3%\3"+
		"%\3%\5%\u017d\n%\5%\u017f\n%\3%\3%\3%\3%\3%\5%\u0186\n%\5%\u0188\n%\3"+
		"&\3&\5&\u018c\n&\3&\3&\3&\3&\3&\7&\u0193\n&\f&\16&\u0196\13&\3&\5&\u0199"+
		"\n&\3&\5&\u019c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01a5\n\'\f\'\16\'"+
		"\u01a8\13\'\3\'\3\'\7\'\u01ac\n\'\f\'\16\'\u01af\13\'\3(\3(\3)\3)\3)\7"+
		")\u01b6\n)\f)\16)\u01b9\13)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\b\4\2\24\25\27\27\3\2("+
		")\3\2/\60\3\2\64\65\5\2\3\3\30\30II\6\2\13\13\24\25\31\32==\2\u01d4\2"+
		"U\3\2\2\2\4e\3\2\2\2\6i\3\2\2\2\bv\3\2\2\2\n{\3\2\2\2\f\u0083\3\2\2\2"+
		"\16\u008d\3\2\2\2\20\u0091\3\2\2\2\22\u0099\3\2\2\2\24\u00ae\3\2\2\2\26"+
		"\u00b0\3\2\2\2\30\u00b6\3\2\2\2\32\u00be\3\2\2\2\34\u00c1\3\2\2\2\36\u00c5"+
		"\3\2\2\2 \u00c8\3\2\2\2\"\u00d0\3\2\2\2$\u00d5\3\2\2\2&\u00df\3\2\2\2"+
		"(\u00e1\3\2\2\2*\u00f1\3\2\2\2,\u0100\3\2\2\2.\u0102\3\2\2\2\60\u0116"+
		"\3\2\2\2\62\u0118\3\2\2\2\64\u011a\3\2\2\2\66\u011f\3\2\2\28\u0127\3\2"+
		"\2\2:\u012e\3\2\2\2<\u0135\3\2\2\2>\u0140\3\2\2\2@\u014d\3\2\2\2B\u015c"+
		"\3\2\2\2D\u015e\3\2\2\2F\u0170\3\2\2\2H\u0187\3\2\2\2J\u018b\3\2\2\2L"+
		"\u019d\3\2\2\2N\u01b0\3\2\2\2P\u01b2\3\2\2\2R\u01ba\3\2\2\2TV\5\4\3\2"+
		"UT\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[`\3\2\2\2\\Z\3\2\2\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\2\2\3d\3\3\2\2\2ef\7\r\2\2fg\5"+
		"P)\2gh\7>\2\2h\5\3\2\2\2ik\7\f\2\2jl\7\30\2\2kj\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mo\5P)\2np\7?\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7>\2\2r\7\3\2"+
		"\2\2su\5N(\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2"+
		"\2yz\5\n\6\2z\t\3\2\2\2{|\7\b\2\2|\177\7&\2\2}~\7\4\2\2~\u0080\5P)\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\f\7\2\u0082"+
		"\13\3\2\2\2\u0083\u0087\79\2\2\u0084\u0086\5\16\b\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7:\2\2\u008b\r\3\2\2\2\u008c"+
		"\u008e\7\30\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\5\20\t\2\u0090\17\3\2\2\2\u0091\u0092\79\2\2\u0092"+
		"\u0093\5\22\n\2\u0093\u0094\7:\2\2\u0094\21\3\2\2\2\u0095\u0096\5\36\20"+
		"\2\u0096\u0097\7>\2\2\u0097\u009a\3\2\2\2\u0098\u009a\5\24\13\2\u0099"+
		"\u0095\3\2\2\2\u0099\u0098\3\2\2\2\u009a\23\3\2\2\2\u009b\u00af\5\20\t"+
		"\2\u009c\u009d\7\20\2\2\u009d\u009e\5\34\17\2\u009e\u00a1\5\24\13\2\u009f"+
		"\u00a0\7\22\2\2\u00a0\u00a2\5\24\13\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00af\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\5\34\17"+
		"\2\u00a5\u00a6\5\24\13\2\u00a6\u00af\3\2\2\2\u00a7\u00a9\7\16\2\2\u00a8"+
		"\u00aa\5\62\32\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00af\7>\2\2\u00ac\u00af\7>\2\2\u00ad\u00af\5\62\32\2\u00ae"+
		"\u009b\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b2"+
		"\7;\2\2\u00b1\u00b3\5\30\r\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\27\3\2\2\2\u00b6\u00bb\5\32\16"+
		"\2\u00b7\u00b8\7@\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0\7&\2\2\u00c0\33"+
		"\3\2\2\2\u00c1\u00c2\7;\2\2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7<\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\5,\27\2\u00c6\u00c7\5 \21\2\u00c7\37\3\2\2\2\u00c8"+
		"\u00cd\5\"\22\2\u00c9\u00ca\7@\2\2\u00ca\u00cc\5\"\22\2\u00cb\u00c9\3"+
		"\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"!\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\5$\23\2\u00d1\u00d2\7(\2\2\u00d2"+
		"\u00d4\5&\24\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4#\3\2\2\2"+
		"\u00d5\u00da\7&\2\2\u00d6\u00d7\7\67\2\2\u00d7\u00d9\78\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"%\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\5(\25\2\u00de\u00e0\5\62\32"+
		"\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00ed"+
		"\79\2\2\u00e2\u00e7\5&\24\2\u00e3\u00e4\7@\2\2\u00e4\u00e6\5&\24\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7@\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e2\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7:\2\2\u00f0"+
		")\3\2\2\2\u00f1\u00fa\7;\2\2\u00f2\u00f7\5\62\32\2\u00f3\u00f4\7@\2\2"+
		"\u00f4\u00f6\5\62\32\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7<"+
		"\2\2\u00fd+\3\2\2\2\u00fe\u0101\5\60\31\2\u00ff\u0101\5.\30\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101-\3\2\2\2\u0102\u0103\t\2\2\2\u0103"+
		"/\3\2\2\2\u0104\u0105\5.\30\2\u0105\u0106\7\67\2\2\u0106\u010b\78\2\2"+
		"\u0107\u0108\7\67\2\2\u0108\u010a\78\2\2\u0109\u0107\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0117\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0113\5P)\2\u010f\u0110\7\67\2\2\u0110\u0112\78\2"+
		"\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0104\3\2\2\2\u0116"+
		"\u010e\3\2\2\2\u0117\61\3\2\2\2\u0118\u0119\5\64\33\2\u0119\63\3\2\2\2"+
		"\u011a\u011d\5\66\34\2\u011b\u011c\t\3\2\2\u011c\u011e\5\64\33\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\65\3\2\2\2\u011f\u0124\58\35"+
		"\2\u0120\u0121\7-\2\2\u0121\u0123\58\35\2\u0122\u0120\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012b\5:\36\2\u0128\u012a\5:\36\2\u0129\u0128\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"9\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133\5<\37\2\u012f\u0130\t\4\2\2"+
		"\u0130\u0134\5<\37\2\u0131\u0132\7\23\2\2\u0132\u0134\5\60\31\2\u0133"+
		"\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134;\3\2\2\2"+
		"\u0135\u013d\5> \2\u0136\u0139\7\61\2\2\u0137\u0139\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\5> \2\u013b"+
		"\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e=\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0145\5@!\2\u0141\u0142"+
		"\7\63\2\2\u0142\u0144\5@!\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146?\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u0149\7\64\2\2\u0149\u014e\5@!\2\u014a\u014b\7\65\2\2\u014b\u014e"+
		"\5@!\2\u014c\u014e\5B\"\2\u014d\u0148\3\2\2\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014eA\3\2\2\2\u014f\u0150\7\66\2\2\u0150\u015d\5@!\2\u0151"+
		"\u0152\7;\2\2\u0152\u0153\5.\30\2\u0153\u0154\7<\2\2\u0154\u0155\5@!\2"+
		"\u0155\u015d\3\2\2\2\u0156\u0157\7;\2\2\u0157\u0158\5\60\31\2\u0158\u0159"+
		"\7<\2\2\u0159\u015a\5B\"\2\u015a\u015d\3\2\2\2\u015b\u015d\5D#\2\u015c"+
		"\u014f\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0156\3\2\2\2\u015c\u015b\3\2"+
		"\2\2\u015dC\3\2\2\2\u015e\u0162\5H%\2\u015f\u0161\5F$\2\u0160\u015f\3"+
		"\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\t\5\2\2\u0166E\3\2\2\2"+
		"\u0167\u0168\7?\2\2\u0168\u016a\5P)\2\u0169\u016b\5*\26\2\u016a\u0169"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016d\7\67\2\2"+
		"\u016d\u016e\5\62\32\2\u016e\u016f\78\2\2\u016f\u0171\3\2\2\2\u0170\u0167"+
		"\3\2\2\2\u0170\u016c\3\2\2\2\u0171G\3\2\2\2\u0172\u0188\5\34\17\2\u0173"+
		"\u0175\7\t\2\2\u0174\u0176\5*\26\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0188\3\2\2\2\u0177\u017e\7\17\2\2\u0178\u017f\5*\26\2\u0179"+
		"\u017a\7?\2\2\u017a\u017c\7&\2\2\u017b\u017d\5*\26\2\u017c\u017b\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u0179"+
		"\3\2\2\2\u017f\u0188\3\2\2\2\u0180\u0188\5R*\2\u0181\u0182\7\n\2\2\u0182"+
		"\u0188\5J&\2\u0183\u0185\5P)\2\u0184\u0186\5*\26\2\u0185\u0184\3\2\2\2"+
		"\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0172\3\2\2\2\u0187\u0173"+
		"\3\2\2\2\u0187\u0177\3\2\2\2\u0187\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187"+
		"\u0183\3\2\2\2\u0188I\3\2\2\2\u0189\u018c\5.\30\2\u018a\u018c\5P)\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u019b\3\2\2\2\u018d\u019c\5*"+
		"\26\2\u018e\u018f\7\67\2\2\u018f\u0194\78\2\2\u0190\u0191\7\67\2\2\u0191"+
		"\u0193\78\2\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0199\5(\25\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u019c\5L\'\2\u019b\u018d\3\2\2\2\u019b\u018e\3\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019cK\3\2\2\2\u019d\u019e\7\67\2\2\u019e\u019f\5\62\32"+
		"\2\u019f\u01a6\78\2\2\u01a0\u01a1\7\67\2\2\u01a1\u01a2\5\62\32\2\u01a2"+
		"\u01a3\78\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a8\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ad\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7\67\2\2\u01aa\u01ac\78\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"M\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\t\6\2\2\u01b1O\3\2\2\2\u01b2"+
		"\u01b7\7&\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b6\7&\2\2\u01b5\u01b3\3\2\2"+
		"\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8Q"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\t\7\2\2\u01bbS\3\2\2\2\66UZ`"+
		"kov\177\u0087\u008d\u0099\u00a1\u00a9\u00ae\u00b2\u00bb\u00cd\u00d3\u00da"+
		"\u00df\u00e7\u00eb\u00ed\u00f7\u00fa\u0100\u010b\u0113\u0116\u011d\u0124"+
		"\u012b\u0133\u0138\u013d\u0145\u014d\u015c\u0162\u016a\u0170\u0175\u017c"+
		"\u017e\u0185\u0187\u018b\u0194\u0198\u019b\u01a6\u01ad\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}