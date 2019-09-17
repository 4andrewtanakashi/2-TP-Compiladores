import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import java.io.IOException;
import java.util.List;

public class MainReader {
    public static void main (String...args) throws IOException {
        //Caminho que almejamos identificar leximas
        String filePath = "/home/ghamorim/trabComp/1-etapa/src/test/java/teste.javalessless";

        ANTLRInputStream input = new ANTLRFileStream(filePath);

        //Aqui é o cara que nos criamos
        javalessless scanner = new javalessless(input);

        List<? extends Token> tokens = scanner.getAllTokens();
        TesterLexico testerLexico = new TesterLexico(scanner.getRuleNames());
        EDTabela tabelaDeSimbolos = new EDTabela();

        Integer i = 0;
        try {
            for (Token t : tokens) {
                //System.out.println(t.getText() + " " + t.getType());
                testerLexico.addToken(t);
                if ((t.getType() >= 1 && t.getType() <= 11) || (t.getType() == 35)) {
                    throw new RuntimeException("Ocorreu um erro na linha: " + t.getLine() + ", coluna: " + t.getCharPositionInLine());
                }
                if ((t.getType() == scanner.Var) && (!tabelaDeSimbolos.containsValue(t.getText()))) {
                    tabelaDeSimbolos.put(i, t.getText());
                    ++i;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(testerLexico);
        System.out.println(tabelaDeSimbolos);
    }
}