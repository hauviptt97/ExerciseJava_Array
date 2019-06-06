package string;

public class Exercise17_String {

    public String sub(String input1, String input2) {

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

        return input1.compareTo(input2) > 0 ? calculate(input1, input2) : "-" + calculate(input2, input1);
    }

    private String calculate(String bigNumber, String smallNumber) {

        StringBuilder sub = new StringBuilder();

        int subTemp, temp = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {

            int number1 = bigNumber.charAt(i) - '0';
            int number2 = smallNumber.charAt(i) - '0';

            subTemp = number1 - number2 - temp;

            temp = (subTemp < 0) ? 1 : 0;

            if (subTemp < 0 && i != 0) {
                subTemp += 10;
            }

            sub.insert(0, subTemp);
        }

        return sub.toString();
    }

}
