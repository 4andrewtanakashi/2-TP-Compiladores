// Generated from /home/shi/Documents/compiladores/trabalho_pratico/2-tp/src/main/java/javalessParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javalessParser}.
 */
public interface javalessParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javalessParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(javalessParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(javalessParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#packageSyntax}.
	 * @param ctx the parse tree
	 */
	void enterPackageSyntax(javalessParser.PackageSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#packageSyntax}.
	 * @param ctx the parse tree
	 */
	void exitPackageSyntax(javalessParser.PackageSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void enterImportSyntax(javalessParser.ImportSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void exitImportSyntax(javalessParser.ImportSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(javalessParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(javalessParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(javalessParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(javalessParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(javalessParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(javalessParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(javalessParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(javalessParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(javalessParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(javalessParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(javalessParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(javalessParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(javalessParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(javalessParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(javalessParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(javalessParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(javalessParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(javalessParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(javalessParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(javalessParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(javalessParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(javalessParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(javalessParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(javalessParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(javalessParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(javalessParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(javalessParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(javalessParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(javalessParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(javalessParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(javalessParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(javalessParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(javalessParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(javalessParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(javalessParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(javalessParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(javalessParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(javalessParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(javalessParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(javalessParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(javalessParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(javalessParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(javalessParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(javalessParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(javalessParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(javalessParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(javalessParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(javalessParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(javalessParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(javalessParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(javalessParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(javalessParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(javalessParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(javalessParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(javalessParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(javalessParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(javalessParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(javalessParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(javalessParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(javalessParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(javalessParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(javalessParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(javalessParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(javalessParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(javalessParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(javalessParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(javalessParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(javalessParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(javalessParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(javalessParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(javalessParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(javalessParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(javalessParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(javalessParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(javalessParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(javalessParser.LiteralContext ctx);
}