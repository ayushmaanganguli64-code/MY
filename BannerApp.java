public class BannerApp {

    
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    
    public static String[] getPPattern() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " ******  "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", " *       ")
        };
    }

    
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", " *       "),
                String.join("", "  *****  "),
                String.join("", "        *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
        }

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}