package string;

public class Exercise02_String {

    public String[] getWords(String input) {

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

}