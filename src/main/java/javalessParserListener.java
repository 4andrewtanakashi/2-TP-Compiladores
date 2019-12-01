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
	 * Enter a parse tree produced by {@link javalessParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(javalessParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(javalessParser.ParameterContext ctx);
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
	 * Enter a parse tree produced by {@link javalessParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(javalessParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(javalessParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link javalessParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(javalessParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(javalessParser.ReferenceTypeContext ctx);
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
	 * Enter a parse tree produced by {@link javalessParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(javalessParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(javalessParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(javalessParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(javalessParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(javalessParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(javalessParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(javalessParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(javalessParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(javalessParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(javalessParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(javalessParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(javalessParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(javalessParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(javalessParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(javalessParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(javalessParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(javalessParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(javalessParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javalessParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(javalessParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(javalessParser.SelectorContext ctx);
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
	 * Enter a parse tree produced by {@link javalessParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayDeclarator(javalessParser.NewArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javalessParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayDeclarator(javalessParser.NewArrayDeclaratorContext ctx);
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