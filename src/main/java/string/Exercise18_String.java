package string;

public class Exercise18_String {

    public String multiply(String input1, String input2) {

        if (!input1.matches("[-]{0,1}\\d+") || !input2.matches("[-]{0,1}\\d+")) {
            return "Invalid Number";
        }

        if (input1.matches("[0]+") || input2.matches("[0]+")) {
            return "0";
        }

        String number1 = input1.replace("-", "");
        String number2 = input2.replace("-", "");

        if (number1.length() < number2.length()) {
            String temp = number1;
            number1 = number2;
            number2 = temp;
        }

        String result = "0", zero = "";

        for (int i = number2.length() - 1; i >= 0; i--) {

            String currentProduct = calculate(number1, number2.charAt(i)) + zero;

            result = add(result, currentProduct);

            zero += "0";

        }

        return isNegativeNumber(input1) && !isNegativeNumber(input2) || isNegativeNumber(input2) && !isNegativeNumber(input1) ? "-" + result : result;

    }

    private String add(String input1, String input2) {

        while (input1.length() != input2.length()) {
            input1 = "0" + input1;
        }

        StringBuilder sum = new StringBuilder();

        int sumTemp, temp = 0;

        for (int i = input1.length() - 1; i >= 0; i--) {

            int number1 = input1.charAt(i) - '0';
            int number2 = input2.charAt(i) - '0';

            sumTemp = number1 + number2 + temp;

            temp = sumTemp / 10;

            if (i != 0) {
                sumTemp %= 10;
            }

            sum.insert(0, sumTemp);
        }

        return sum.toString();
    }

    private String calculate(String input1, char input2) {

        StringBuilder result = new StringBuilder();

        int product, temp = 0;

        for (int i = input1.length() - 1; i >= 0; i--) {

            int number1 = input1.charAt(i) - '0';
            int number2 = input2 - '0';

            product = number1 * number2 + temp;

            temp = product / 10;

            if (i != 0) {
                product %= 10;
            }

            result.insert(0, product);
        }

        return result.toString();
    }

    private boolean isNegativeNumber(String input) {
        return input.startsWith("-");
    }
}
