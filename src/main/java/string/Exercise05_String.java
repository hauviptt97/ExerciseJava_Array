package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise05_String {

    private String[] getWords(String input) {

        if (!input.trim().isEmpty()) {

            String[] temp = input.split("[ ]+");

            String[] words = new String[temp.length];
            int count = 0;

            for (String word : temp) {
                if (word.matches("[\\w]+")) {
                    words[count++] = word;
                }
            }
            return words;
        }
        return null;
    }

    public List<String> getDuplicateWords(String input) {

        String[] words = getWords(input);

        if (words != null) {
            ArrayList<String> outputArray = new ArrayList<>();

            String current = words[0];

            int count = 1;

            Arrays.sort(words);

            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].equals(words[i + 1])) {
                    outputArray.add(words[i]);
                }
            }

            return outputArray;
        }
        return null;
    }
}