package string;

public class Exercise07_String {
    public int indexOf(String input, String subString) {

        char[] chars = input.toCharArray();

        char[] subChars = subString.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == subChars[0]) {
                int sumEqual = 1;

                for (int j = 1; j < subChars.length; j++) {
                    if (subChars[j] != chars[i + j]) {
                        break;
                    } else {
                        sumEqual++;
                    }
                }

                if (sumEqual == subString.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
