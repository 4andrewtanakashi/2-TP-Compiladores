import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.List;

public class MainReader {

    public  static void  main (String args[]) throws IOException {
        String filePath = "/home/shi/Documents/compiladores/trabalho_pratico/1-tp/src/test/java/teste2.javalessless";

        ANTLRInputStream input = new ANTLRFileStream(filePath);

        //Aqui é o cara que nos criamos
        javalessLexer scanner = new javalessLexer(input);
        javalessParser parser = new javalessParser((TokenStream) scanner);
    }

}