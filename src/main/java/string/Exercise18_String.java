package string;

public class Exercise18_String {

    public String multiply(String input1, String input2) {
        if (!input1.matches("\\d+") || !input2.matches("\\d+")) {
            return "Invalid Number";
        }

        while (input1.length() != input2.length()) {

            if (input1.length() < input2.length()) {
                input1 = "0" + input1;
            } else {
                input2 = "0" + input2;
            }

        }

        StringBuilder sum = new StringBuilder();

        int mulTemp, temp = 0;

        for (int i = input2.length() - 1; i >= 0; i--) {

            int number1 = input1.charAt(i) - '0';
            int number2 = input2.charAt(i) - '0';

            mulTemp = number1 + number2 + temp;

            temp = mulTemp / 10;

            if (i != 0) {
                mulTemp %= 10;
            }

            sum.insert(0, mulTemp);
        }

        return sum.toString();
    }

    private String add(String input1, String input2) {

        if (!input1.matches("\\d+") || !input2.matches("\\d+")) {
            return "Invalid Number";
        }

        while (input1.length() != input2.length()) {

            if (input1.length() < input2.length()) {
                input1 = "0" + input1;
            } else {
                input2 = "0" + input2;
            }

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


    public static void main(String[] args) {
        System.out.println(new Exercise18_String());
    }

}
