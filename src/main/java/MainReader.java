import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import java.io.IOException;
import java.util.List;

public class MainReader {
    public static void main (String...args) throws IOException {
        //Caminho que almejamos identificar leximas
        String filePath = "/home/shi/Documents/compiladores/trabalho_pratico/1-tp/src/test/java/teste.javalessless";

        ANTLRInputStream input = new ANTLRFileStream(filePath);

        //Aqui é o cara que nos criamos
        javalessless scanner = new javalessless(input);

        List<? extends Token> tokens = scanner.getAllTokens();
        TesterLexico testerLexico = new TesterLexico(scanner.getRuleNames());
        EDTabela tabelaDeSimbolos = new EDTabela();

        Integer i = 0;
        
        for (Token t : tokens) {
            testerLexico.addToken(t);
            if ((t.getType() >= 1 && t.getType() <= 12)) {
                System.out.println("identificador não reconhecido :" + t.getText());
                System.out.println("Ocorreu um erro na linha: " + t.getLine() + ", coluna: " + t.getCharPositionInLine());
                System.out.println();
            }  else if ((t.getType() == scanner.Var) && (testerLexico.panicMode(t.getText()))) {
                System.out.println("identificador não reconhecido :" + t.getText());
                System.out.println("Ocorreu um erro na linha: " + t.getLine() + ", coluna: " + t.getCharPositionInLine());
                System.out.println();

            } else if ((t.getType() == scanner.Var) && (!tabelaDeSimbolos.containsValue(t.getText()))) {
                tabelaDeSimbolos.put(i, t.getText());
                ++i;

            }
        }
    
        System.out.println(testerLexico);
        System.out.println("\n Tabela de Síbolos");
        System.out.println(tabelaDeSimbolos);
    }
}