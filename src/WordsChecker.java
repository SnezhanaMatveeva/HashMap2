import java.util.Arrays;
import java.util.List;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        List<String> list = Arrays.asList(text.split("\\P{IsAlphabetic}+"));
        if (list.contains(word)) {
            return true;
        }
        return false;
    }
}
