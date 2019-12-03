public class TP2 extends javalessParserBaseListener {


    @Override
    public void enterCompilationUnit(javalessParser.CompilationUnitContext ctx) {
        System.out.println( "{");
        //if (ctx.packageSyntax() != null)
            //System.out.println("Name:" + ctx.packageSyntax().getText());

//        if (ctx.packageSyntax() != null) {
//            if (ctx.importSyntax().size() > 0) {
//                for (javalessParser.ImportSyntaxContext var : ctx.importSyntax()) {
//                    System.out.println();
//                }
//            }
//        }
    }

    @Override public void exitCompilationUnit(javalessParser.CompilationUnitContext ctx) {
        System.out.println("}");
    }
}
