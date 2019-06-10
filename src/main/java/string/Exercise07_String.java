package string;

public class Exercise07_String {
    public int indexOf(String input, String subString) {

        int sumEqual = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == subString.charAt(sumEqual)) {
                sumEqual++;

                if (sumEqual == subString.length()) {
                    return i - subString.length() + 1;
                }

            } else {
                i -= sumEqual;
                sumEqual = 0;
            }

        }

        return -1;
    }
}
