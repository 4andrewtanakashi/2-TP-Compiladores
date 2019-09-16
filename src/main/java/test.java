public class test {
    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'abstract'", "'extends'", "'private'", "'protected'", "'public'",
                "'class'", "'this'", "'new'", "'null'", "'import'", "'package'", "'return'",
                "'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", "'char'",
                "'void'", "'boolean'", "'static'", "'false'", "'true'", null, null, "'='",
                "'+='", null, null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", null,
                "';'", "'.'", "','"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    public static boolean verificSimilarity(String var) {
        int j = 1;
        int similar = 0;
        int indexLiteralNames = 1;
        char[] varChar = var.toCharArray();
        while (indexLiteralNames < 25) {
            String wordReserved = _LITERAL_NAMES[3].substring(1, _LITERAL_NAMES[3].length()-1);
            for(char c: wordReserved.toCharArray()) {
                if (j < varChar.length) {
                    System.out.print(c);
                    if (c == varChar[j] || c == varChar[j-1]) {
                        System.out.println("To aqui2");
                        similar++;
                        while (c == varChar[j]) {
                            j++;
                        }
                    }
                }
                else {
                    if (j == varChar.length) {
                        if (c == varChar[j-1]) similar++;
                        else similar--;
                    }
                    else similar++;
                }
                j++;
            }
            System.out.println(similar);
            if ((similar > 0) && ((wordReserved.length() / similar) > 0.70)) return true;
            similar = 0;
            indexLiteralNames++;
        }
        return false;
    }

    public static void main(String[] args) {
        String nome = "wheielei";
        if(verificSimilarity(nome)) {
            System.out.println("AEW");
        }
        else System.out.println("AFF");
    }

}
