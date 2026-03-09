import java.util.HashMap;

public class BannerAppUC8 {

    public static HashMap<Character, String[]> createPatternMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void printBanner(String word, HashMap<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                String[] pattern = map.get(ch);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}
