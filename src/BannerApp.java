import java.util.*;
public class BannerApp {

    public static void main(String[] args){
        System.out.println("______useCase1 First __________");
        useCase1();
        System.out.println("______useCase2 second __________");
        useCase2();
        System.out.println("______useCase3 Third method __________");
        useCase3();
        System.out.println("______useCase4 Fourth __________");
        useCase4();
        System.out.println("______useCase5 Fifth __________");
        useCase5();
    }



    private static void useCase1(){
        String data = "OOPS";

        System.out.println(data);
    }

    private static void useCase2(){
        String[] O = {
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        };

        String[] P = {
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };

        String[] S = {
                " **** ",
                "*     ",
                " **** ",
                "     *",
                " **** "
        };

        // Store all letters in a 2D structure for easy traversal
        String[][] banner = {O, O, P, S};

        // Using for loop to print banner row by row
        for (int i = 0; i < O.length; i++) {
            String[] row = new String[banner.length];

            // Enhanced for loop to collect each letter's row
            for (int j = 0; j < banner.length; j++) {
                row[j] = banner[j][i];
            }

            // String.join() to concatenate each row
            System.out.println(String.join("   ", row));
        };

    }


    private static void useCase3() {
        String[][] patterns = {
                getFPattern(),
                getFPattern(),
                getSPattern(),
                getTPattern()

        };

        printBanner(patterns);
    }

    private static String[] getFPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    private static String[] getSPattern(){
        return new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    private static String[] getTPattern(){
        return new String[]{
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        };
    }

    public static void printBanner (String[][] patterns){
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (String[] letter : patterns) {
                line = line + letter[row] + " ";
            }

            System.out.println(line);
        }
    }

    private static void useCase4() {

        BannerCharacter[] characters = {
                new BannerCharacter('O', getFPattern()),
                new BannerCharacter('O', getFPattern()),
                new BannerCharacter('P', getSPattern()),
                new BannerCharacter('S', getTPattern())
        };

        printBannerUC4(characters);
    }

    // Inner Class for Encapsulation
    static class BannerCharacter {
        private char character;
        private String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static void printBannerUC4(BannerCharacter[] characters) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (BannerCharacter ch : characters) {
                line.append(ch.getPattern()[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    private static void useCase5() {
        Map<Character, String[]> patternMap = buildPatternMap();
        String word = "OOPS";
        printBannerUC5(word, patternMap);
    }

    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new java.util.HashMap<>();
        map.put('O', getFPattern());
        map.put('P', getSPattern());
        map.put('S', getTPattern());
        return map;
    }

    private static void printBannerUC5(String word, Map<Character, String[]> map) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

}

