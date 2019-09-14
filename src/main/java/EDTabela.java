import java.util.LinkedHashMap;

public class EDTabela extends LinkedHashMap<Integer, String> {

    public String getValue (int i) {
        Integer index = i;
        return  get(i);
    }

    @Override
    public String toString() {

        String tabela = "ID: \t values: \n";
        for (int i = 0; i < size(); ++i) {
             tabela += (i + " " + "\t" + " "  +
                     "\t" + " " + getValue(i) + "\n");
        }

        return tabela;
    }
}
