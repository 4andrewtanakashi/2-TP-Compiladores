import org.antlr.v4.runtime.*;
import java.io.FileInputStream;
import java.io.IOException;

public class MainReader {

    public  static void  main (String args[]) throws IOException {
        try {

            String filePath = "/home/aluno/trab_comp/2-TP-Compiladores/src/test/java/teste2.javalessless";

            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(filePath) );

            //Aqui é o cara que nos criamos
            javalessLexer scanner = new javalessLexer(input);



            javalessParser parser = new javalessParser(new CommonTokenStream(scanner) );

            parser.addParseListener(new TP2());
            parser.compilationUnit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}