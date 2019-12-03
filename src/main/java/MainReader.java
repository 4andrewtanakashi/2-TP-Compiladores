import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class MainReader {

    public  static void  main (String args[]) throws IOException {
        try {

            String filePath = "/home/shi/Documents/compiladores/trabalho_pratico/2-tp/src/test/java/teste2.javalessless";

            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(filePath) );

            //Aqui é o cara que nos criamos
            javalessLexer scanner = new javalessLexer(input);



            javalessParser parser = new javalessParser(new CommonTokenStream(scanner) );
            //BaseErrorListener errorListener = new javalessErrorListerner();

            parser.addParseListener(new TP2());
            //parser.addErrorListener(errorListener);

            parser.compilationUnit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}