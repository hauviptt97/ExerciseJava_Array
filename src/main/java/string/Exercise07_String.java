package string;

public class Exercise07_String {
    public int indexOf(String input, String subString) {

        int sumEqual = 0;

        for (int i = 0; i < input.length(); i++) {

            while (sumEqual < subString.length() && input.charAt(i) == subString.charAt(sumEqual)) {
                sumEqual++;
            }

            if (sumEqual == subString.length()) {
                return i + 1 - sumEqual;
            }
        }

        return -1;
    }
}
