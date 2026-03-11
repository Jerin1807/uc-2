import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    // Static Inner Class to encapsulate character & pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
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

    public static void main(String[] args) {

        // Create character pattern map
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "  PPPPP  ",
                "  P    P ",
                "  PPPPP  ",
                "  P      ",
                "  P      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "  SSSSS ",
                " S      ",
                "  SSSSS ",
                "      S ",
                "  SSSSS "
        }));

        String word = "OOPS";
        int height = 5;

        StringBuilder[] bannerLines = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner dynamically using stored mappings
        for (char ch : word.toCharArray()) {
            CharacterPattern cp = patternMap.get(ch);

            for (int i = 0; i < height; i++) {
                bannerLines[i]
                        .append(cp.getPattern()[i])
                        .append("   ");
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }
}