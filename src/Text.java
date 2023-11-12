public class Text {

    private static final char[] vowels = {
            'E','e', 'U', 'u', 'O', 'o', 'A', 'a', 'I', 'i', 'Y', 'y'
    };
    protected static String solutionText(String stroka){
        char[] text = stroka.toCharArray();
        for (int n = 0; n < text.length; n++) {
            for (int i = 0; i < text.length; i++) {
                for (int j = 0; j < 12; j++) {
                    if (text[i] == vowels[j]) {
                        text[i] = '-';
                    }
                }
            }
        }
        return new String(text);
    }
}
