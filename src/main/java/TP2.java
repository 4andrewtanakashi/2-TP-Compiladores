public class TP2 extends javalessParserBaseListener {

    @Override
    public void enterCompilationUnit(javalessParser.CompilationUnitContext ctx) {
        super.enterCompilationUnit(ctx);
        System.out.println("Entrou na enterCompilationUnit: " + ctx.getText());

    }
}
