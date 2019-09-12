import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
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

        LinkedHashSet<String> tabelaDeSimbolos = new LinkedHashSet<String>();

        for (Token t : tokens) {
            System.out.println(t.getText());
            if (t.getType() == scanner.ABS) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.EXT) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.PRI) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.PRO) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.PUB) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.CLA) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.THIS) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.NEW) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.NUL) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.IMP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.PAC) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.RET) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.SUP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.IF) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.WHI) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.ELS) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.INS) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.INT) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.CHA) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.VOI) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.BOO) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.STA) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.FAL) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.TRU) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.Atrib) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.AtrArit) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.OpBool) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.OpUni) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.OpArit) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.VOP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.VCL) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.KOP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.KCL) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.AP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.FP) {
                tabelaDeSimbolos.add(t.getText());

            } else if (t.getType() == scanner.Var) {
                tabelaDeSimbolos.add(t.getText());

            }

        }
        for (String s : tabelaDeSimbolos) {
            System.out.println("TS " + s);
        }
    }
}