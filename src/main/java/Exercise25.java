public class Exercise25 {

    private int findGCD(int number1, int number2) {
        if ((number1 * number2) == 0) {
            return number1 + number2;
        }

        while (number1 != number2) {
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }
        return number1;
    }

    public int findGCDOfArray(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            result = findGCD(numbers[i], numbers[i + 1]);
        }
        return result;
    }

}
