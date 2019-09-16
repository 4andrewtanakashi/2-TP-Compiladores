import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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
        for (Token t : tokens) {
            //System.out.println(t.getText() + " " + t.getType());
            testerLexico.addToken(t);
             if ((t.getType() == scanner.Var) && (!tabelaDeSimbolos.containsValue(t.getText()))) {
                tabelaDeSimbolos.put(i, t.getText());
                ++i;
            }

        }
        System.out.println(testerLexico);
        System.out.println(tabelaDeSimbolos);
    }
}