package string;

public class Exercise07_String {
    public int indexOf(String input, String subString) {

        int i = 0;
        while (i < input.length()) {

            int sumEqual = 0;

            while (sumEqual < subString.length() && input.charAt(i) == subString.charAt(sumEqual)) {
                sumEqual++;
                i++;
            }

            if (sumEqual == subString.length()) {
                return i - sumEqual;
            }

            i++;
        }

        return -1;
    }
}
