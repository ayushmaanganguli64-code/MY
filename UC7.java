public class BannerAppUC7 {

    
    static class CharacterPattern {

        private char letter;
        private String[] pattern;

        
        public CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        
        public char getLetter() {
            return letter;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        CharacterPattern[] patterns = {O, O, P, S};

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < patterns.length; j++) {

                String[] pattern = patterns[j].getPattern();
                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }
}
