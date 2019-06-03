package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise05_String {

    private List<String> getWords(String input) {
        List<String> words = new ArrayList<>();

        if (!input.trim().isEmpty()) {

            String[] temp = input.split("[ ]+");

            for (String word : temp) {
                if (word.matches("[\\w]+")) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    public List<String> getDuplicateWords(String input) {

        List<String> words = getWords(input);
        if (words.size() > 1) {
            ArrayList<String> outputArray = new ArrayList<>();

            Collections.sort(words);

            for (int i = 0; i < words.size() - 1; i++) {
                if (words.get(i).equals(words.get(i + 1))) {
                    outputArray.add(words.get(i));
                }
            }
            return outputArray;
        }
        return words;
    }
}