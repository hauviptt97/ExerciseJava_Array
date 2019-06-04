package string;

public class Exercise10_String {

    public String convert(String input) {

        StringBuilder result = new StringBuilder();

        String temp = "";

        char currentChar = 0;

        int i = 0;
        while (i < input.length()) {

            if (Character.isLetter(input.charAt(i))) {

                currentChar = input.charAt(i);

                result.append(currentChar);

                temp = "0";

                i++;
            }

            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                temp += input.charAt(i);
                i++;
            }

            int count = Integer.parseInt(temp) - 1;

            while (count > 0) {
                result.append(currentChar);
                count--;
            }

        }
        return result.toString();
    }
}
