import org.antlr.v4.runtime.Token;
import java.util.ArrayList;

public class TesterLexico {
    private ArrayList<Token> tokens;
    private String[] ruleNames;

    public TesterLexico(String[] ruleNames) {
        tokens = new ArrayList<Token>();
        this.ruleNames = ruleNames;
    }

    public void addToken(Token token) {
        tokens.add(token);
    }

    public String getRuleName(int typeToken) {
        return ruleNames[typeToken-1];
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
