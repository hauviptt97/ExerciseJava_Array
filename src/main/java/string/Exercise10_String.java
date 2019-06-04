package string;

public class Exercise10_String {

    public String convert(String input) {

        StringBuilder result = new StringBuilder();


        char currentChar = 0;

        int i = 0;
        while (i < input.length()) {

            currentChar = input.charAt(i);

            result.append(currentChar);

            String temp = "0";

            i++;

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
