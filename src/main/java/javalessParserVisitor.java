// Generated from /home/shi/Documents/compiladores/trabalho_pratico/2-tp/src/main/java/javalessParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javalessParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javalessParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javalessParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(javalessParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#packageSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageSyntax(javalessParser.PackageSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#importSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSyntax(javalessParser.ImportSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(javalessParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(javalessParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(javalessParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(javalessParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(javalessParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(javalessParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(javalessParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(javalessParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(javalessParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(javalessParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(javalessParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(javalessParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(javalessParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(javalessParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(javalessParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(javalessParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(javalessParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(javalessParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(javalessParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(javalessParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(javalessParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(javalessParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(javalessParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(javalessParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(javalessParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(javalessParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(javalessParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(javalessParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(javalessParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(javalessParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(javalessParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(javalessParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(javalessParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(javalessParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(javalessParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(javalessParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(javalessParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javalessParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(javalessParser.LiteralContext ctx);
}