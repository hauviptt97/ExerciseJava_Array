package array;

public class Exercise08 {
    public int subtractionOfMinValueAndMaxValue(int[] numbers) {

        if (numbers.length < 2) {
            return 0;
        }

        int minNumber = numbers[0], maxNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber - minNumber;
    }
}
