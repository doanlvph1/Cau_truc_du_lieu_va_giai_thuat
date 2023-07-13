import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VietnameseCharacterCounter {

    public static void main(String[] args) {
        String input = "hfdawhwhcoomdd";
        List<String> vietnameseCharacters = findVietnameseCharacters(input);
        int a=vietnameseCharacters.size();
        System.out.println("Output: "+a + vietnameseCharacters);
    }

    public static List<String> findVietnameseCharacters(String input) {
        String[] vietnameseCharacters = { "aw", "aa", "dd", "ee", "oo", "ow", "w" };

        List<String> result = new ArrayList<>();
        for (String character : vietnameseCharacters) {
            if (input.contains(character)) {
                result.add(character);
            }
        }

        return result;
    }
}