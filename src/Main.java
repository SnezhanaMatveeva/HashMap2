
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
            char c = text.charAt(i);
            /*if (c==' '|| c==','|| c=='.'){
                continue;
            }*/
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int value = map.get(c);
                value++;
                map.put(c, value);
            }
        }
        int maxValue = -1;
        char maxChar = ' ';
        for (Character character : map.keySet()) {

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxChar = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println(maxChar);

    }


}
