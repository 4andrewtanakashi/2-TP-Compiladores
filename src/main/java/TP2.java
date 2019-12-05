public class TP2 extends javalessParserBaseListener {


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCompilationUnit(javalessParser.CompilationUnitContext ctx) {
        System.out.println("{enterCompilationUnit");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCompilationUnit(javalessParser.CompilationUnitContext ctx) {
        System.out.println("exitCompilationUnit}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPackageSyntax(javalessParser.PackageSyntaxContext ctx) {
        System.out.println("    {enterPackageSyntax");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPackageSyntax(javalessParser.PackageSyntaxContext ctx) {
        System.out.println("    exitPackageSyntax}");

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterImportSyntax(javalessParser.ImportSyntaxContext ctx) {
        System.out.println("    {enterImportSyntax");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitImportSyntax(javalessParser.ImportSyntaxContext ctx) {
        System.out.println("    exitImportSyntax}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeDeclaration(javalessParser.TypeDeclarationContext ctx) {
        System.out.println("    {enterTypeDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeDeclaration(javalessParser.TypeDeclarationContext ctx) {
        System.out.println("    exitTypeDeclaration}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterClassDeclaration(javalessParser.ClassDeclarationContext ctx) {
        System.out.println("        {enterClassDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClassDeclaration(javalessParser.ClassDeclarationContext ctx) {
        System.out.println("        exitClassDeclaration}");

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterClassBody(javalessParser.ClassBodyContext ctx) {
        System.out.println("            {enterClassBody");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClassBody(javalessParser.ClassBodyContext ctx) {
        System.out.println("            exitClassBody}");

    }

    @Override public void enterClassBodyDeclaration(javalessParser.ClassBodyDeclarationContext ctx) {
        System.out.println("                {enterClassBodyDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClassBodyDeclaration(javalessParser.ClassBodyDeclarationContext ctx) {
        System.out.println("                exitClassBodyDeclaration}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMemberDecl(javalessParser.MemberDeclContext ctx) {
        System.out.println("                    {enterMemberDecl");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMemberDecl(javalessParser.MemberDeclContext ctx) {
        System.out.println("                    exitMemberDecl}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodDeclaration(javalessParser.MethodDeclarationContext ctx) {
        System.out.println("                    {enterMethodDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodDeclaration(javalessParser.MethodDeclarationContext ctx) {
        System.out.println("                    exitMethodDeclaration}");

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBlock(javalessParser.BlockContext ctx) {
        System.out.println("                            {enterBlock");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBlock(javalessParser.BlockContext ctx) {
        System.out.println("                            exitBlock}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBlockStatement(javalessParser.BlockStatementContext ctx) {
        System.out.println("                                {enterBlockStatement");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBlockStatement(javalessParser.BlockStatementContext ctx) {
        System.out.println("                                exitBlockStatement}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodBody(javalessParser.MethodBodyContext ctx) {
        System.out.println("                        {enterMethodBody");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodBody(javalessParser.MethodBodyContext ctx) {
        System.out.println("                        enterMethodBody}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLocalTypeDeclaration(javalessParser.LocalTypeDeclarationContext ctx) {
        System.out.println("                                            " +
                "{enterLocalTypeDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLocalTypeDeclaration(javalessParser.LocalTypeDeclarationContext ctx) {
        System.out.println("                                            " +
                "exitLocalTypeDeclaration}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(javalessParser.StatementContext ctx) {
        System.out.println("                                        " +
                "{enterStatement");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(javalessParser.StatementContext ctx) {
        System.out.println("                                        " +
                "exitStatement}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParExpression(javalessParser.ParExpressionContext ctx) {
        System.out.println("                                        " +
                "       {enterParExpression");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParExpression(javalessParser.ParExpressionContext ctx) {
        System.out.println("                                        " +
                "       exitParExpression}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodCall(javalessParser.MethodCallContext ctx) {
        System.out.println("                                                " +
                "       {enterMethodCall");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodCall(javalessParser.MethodCallContext ctx) {
        System.out.println("                                                " +
                "       exitMethodCall}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpressionList(javalessParser.ExpressionListContext ctx) {
        System.out.println("                                                    " +
                "       {enterExpressionList");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpressionList(javalessParser.ExpressionListContext ctx) {
        System.out.println("                                                    " +
                "       exitExpressionList}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameters(javalessParser.FormalParametersContext ctx) {
        System.out.println("                        {enterFormalParameters");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameters(javalessParser.FormalParametersContext ctx) {
        System.out.println("                        exitFormalParameters}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameterList(javalessParser.FormalParameterListContext ctx) {
        System.out.println("                            {enterFormalParameterList");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameterList(javalessParser.FormalParameterListContext ctx) {
        System.out.println("                            exitFormalParameterList}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameter(javalessParser.FormalParameterContext ctx) {
        System.out.println("                                {enterFormalParameter");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameter(javalessParser.FormalParameterContext ctx) {
        System.out.println("                                exitFormalParameter}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLocalVariableDeclarationStatement(javalessParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("                                    {localVariableDeclarationStatement");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLocalVariableDeclarationStatement(javalessParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("                                    exitLocalVariableDeclarationStatement}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclarators(javalessParser.VariableDeclaratorsContext ctx) {
        System.out.println("                                        " +
                "{variableDeclarators");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclarators(javalessParser.VariableDeclaratorsContext ctx) {
        System.out.println("                                        " +
                "exitVariableDeclarators}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclarator(javalessParser.VariableDeclaratorContext ctx) {
        System.out.println("                                            " +
                "{enterVariableDeclarator");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclarator(javalessParser.VariableDeclaratorContext ctx) {
        System.out.println("                                            " +
                "exitVariableDeclarator}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclaratorId(javalessParser.VariableDeclaratorIdContext ctx) {
        System.out.println("                                            " +
                "{enterVariableDeclaratorId");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclaratorId(javalessParser.VariableDeclaratorIdContext ctx) {
        System.out.println("                                            " +
                "exitVariableDeclaratorId}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableInitializer(javalessParser.VariableInitializerContext ctx) {
        System.out.println("                                                " +
                "{enterVariableInitializer");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableInitializer(javalessParser.VariableInitializerContext ctx) {
        System.out.println("                                                " +
                "exitVariableInitializer}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterArrayInitializer(javalessParser.ArrayInitializerContext ctx) {
        System.out.println("                                                    " +
                "{enterArrayInitializer");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArrayInitializer(javalessParser.ArrayInitializerContext ctx) {
        System.out.println("                                                    " +
                "exitArrayInitializer}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterArguments(javalessParser.ArgumentsContext ctx) {
        System.out.println("                                                        " +
                "       {enterArguments");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArguments(javalessParser.ArgumentsContext ctx) {
        System.out.println("                                                        " +
                "       exitArguments}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBasicType(javalessParser.BasicTypeContext ctx) {
        System.out.println("                                        {enterBasicType");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBasicType(javalessParser.BasicTypeContext ctx) {
        System.out.println("                                        exitBasicType}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpression(javalessParser.ExpressionContext ctx) {
        System.out.println("                                            " +
                "       {enterExpression");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression(javalessParser.ExpressionContext ctx) {
        System.out.println("                                            " +
                "       exitExpression}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrimary(javalessParser.PrimaryContext ctx) {
        System.out.println("                                                " +
                "       {enterPrimary");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrimary(javalessParser.PrimaryContext ctx) {
        System.out.println("                                                " +
                "       exitPrimary}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCreator(javalessParser.CreatorContext ctx) {
        System.out.println("                                                " +
                "       {enterCreator");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCreator(javalessParser.CreatorContext ctx) {
        System.out.println("                                                " +
                "       exitCreator}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConstructorDeclaration(javalessParser.ConstructorDeclarationContext ctx) {
        System.out.println("                        {enterConstructorDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConstructorDeclaration(javalessParser.ConstructorDeclarationContext ctx) {
        System.out.println("                        exitConstructorDeclaration}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFieldDeclaration(javalessParser.FieldDeclarationContext ctx) {
        System.out.println("                        {enterFieldDeclaration");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFieldDeclaration(javalessParser.FieldDeclarationContext ctx) {
        System.out.println("                        exitFieldDeclaration}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterArrayCreatorRest(javalessParser.ArrayCreatorRestContext ctx) {
        System.out.println("                                                    " +
                "       {enterArrayCreatorRest");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArrayCreatorRest(javalessParser.ArrayCreatorRestContext ctx) {
        System.out.println("                                                    " +
                "       exitArrayCreatorRest}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterClassCreatorRest(javalessParser.ClassCreatorRestContext ctx) {
        System.out.println("                                                    " +
                "       {enterClassCreatorRest");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClassCreatorRest(javalessParser.ClassCreatorRestContext ctx) {
        System.out.println("                                                    " +
                "       exitClassCreatorRest}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeTypeOrVoid(javalessParser.TypeTypeOrVoidContext ctx) {
        System.out.println("                            {enterTypeTypeOrVoid");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeTypeOrVoid(javalessParser.TypeTypeOrVoidContext ctx) {
        System.out.println("                            exitTypeTypeOrVoid}");

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterModifiers(javalessParser.ModifiersContext ctx) {
        System.out.println("                                                " +
                "{enterModifiers");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitModifiers(javalessParser.ModifiersContext ctx) {
        System.out.println("                                                " +
                "exitModifiers}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeType(javalessParser.TypeTypeContext ctx) {
        System.out.println("                                    {enterTypeType");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeType(javalessParser.TypeTypeContext ctx) {
        System.out.println("                                    exitTypeType}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSuperSuffix(javalessParser.SuperSuffixContext ctx) {
        System.out.println("                                                " +
                "       {enterSuperSuffix");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSuperSuffix(javalessParser.SuperSuffixContext ctx) {
        System.out.println("                                                " +
                "       exitSuperSuffix}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterQualifiedIdentifier(javalessParser.QualifiedIdentifierContext ctx) {
        System.out.println("    {enterQualifiedIdentifier");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitQualifiedIdentifier(javalessParser.QualifiedIdentifierContext ctx) {
        System.out.println("    exitQualifiedIdentifier}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLiteral(javalessParser.LiteralContext ctx) {
        System.out.println("                                                    " +
                "       {enterLiteral");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLiteral(javalessParser.LiteralContext ctx) {
        System.out.println("                                                    " +
                "       exitLiteral}");
    }


}
