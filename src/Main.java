
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
            " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit" +
            " esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            " qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (!Character.isAlphabetic(character)) {
                continue;
            }

            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                int value = map.get(character);
                value++;
                map.put(character, value);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxChar = entry.getKey();
                maxValue = entry.getValue();
            }
            if (entry.getValue() < minValue) {
                minChar = entry.getKey();
                minValue = entry.getValue();
            }
        }
        System.out.println(minChar);
        System.out.println(maxChar);
    }
}
