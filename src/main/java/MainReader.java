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
        String filePath = "/home/shi/Documents/compiladores/trabalho_pratico/1-tp/src/test/java/teste.javalessless";

        ANTLRInputStream input = new ANTLRFileStream(filePath);

        //Aqui é o cara que nos criamos
        javalessless scanner = new javalessless(input);

        List<? extends Token> tokens = scanner.getAllTokens();

        EDTabela tabelaDeSimbolos = new EDTabela();

        Integer i = 0;
        for (Token t : tokens) {
            System.out.println(t.getText()+" "+" "+t.getType());
             if ((t.getType() == scanner.Var) && (!tabelaDeSimbolos.containsValue(t.getText()))) {
                tabelaDeSimbolos.put(i, t.getText());
                ++i;
            }

        }

        System.out.println(tabelaDeSimbolos);
    }
}