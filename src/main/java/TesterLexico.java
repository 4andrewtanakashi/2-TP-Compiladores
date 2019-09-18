import org.antlr.v4.runtime.Token;
import java.util.ArrayList;

public class TesterLexico {
    private ArrayList<Token> tokens;
    private String[] ruleNames;

    private ArrayList<String> palavrasReservadas;

    public TesterLexico(String[] ruleNames) {
        tokens = new ArrayList<Token>();
        this.ruleNames = ruleNames;

        palavrasReservadas = new ArrayList<String>();

        palavrasReservadas.add("abstract");
        palavrasReservadas.add("extends");
        palavrasReservadas.add("private");
        palavrasReservadas.add("protected");
        palavrasReservadas.add("public");
        palavrasReservadas.add("class");
        palavrasReservadas.add("this");
        palavrasReservadas.add("new");
        palavrasReservadas.add("null");
        palavrasReservadas.add("import");
        palavrasReservadas.add("package");
        palavrasReservadas.add("return");
        palavrasReservadas.add("super");
        palavrasReservadas.add("if");
        palavrasReservadas.add("while");
        palavrasReservadas.add("else");
        palavrasReservadas.add("instanceof");
        palavrasReservadas.add("int");
        palavrasReservadas.add("char");
        palavrasReservadas.add("void");
        palavrasReservadas.add("boolean");
        palavrasReservadas.add("static");
        palavrasReservadas.add("false");
        palavrasReservadas.add("true");
    }

    public void addToken(Token token) {
        tokens.add(token);
    }

    public String getRuleName(int typeToken) {
        return ruleNames[typeToken-1];
    }


    public boolean panicMode (String token) {
        String comparador;

        char tk = ' ';
        char pr = ' ';
        for (String palavrar : palavrasReservadas) {
            comparador = "";
            if (token.length() > palavrar.length()) {
                int j = 0;
                for (int i = 0; i < token.length(); ++i) {

                    tk = token.charAt(i);
                    pr = palavrar.charAt(j);

                    if ((tk == pr)) {
                        comparador += tk;

                        if (j < (palavrar.length()-1 ))
                            ++j;
                    }
                }
                if (comparador.equals(palavrar))
                    return true;
            } else if (token.equals(palavrar)) return false;
        }
       return false;
    }

    @Override
    public String toString() {
        String print = "Linha\tColuna\tTipoToken\tLexema\n";
        for (Token t : tokens) {
            print += t.getLine() + "\t\t" + t.getCharPositionInLine() + "\t\t" + getRuleName(t.getType()) + "\t\t\t" + t.getText() + "\n";
        }
        return print;
    }
}
