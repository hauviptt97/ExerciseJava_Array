package string;

public class Exercise07_String {
    public int indexOf(String input, String subString) {

        char[] chars = input.toCharArray();

        char[] subChars = subString.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == subChars[0]) {
                int sumEqual = 1;

                while (sumEqual < subChars.length && subChars[sumEqual] == chars[i + sumEqual]) {
                    sumEqual++;
                }

                if (sumEqual == subString.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
