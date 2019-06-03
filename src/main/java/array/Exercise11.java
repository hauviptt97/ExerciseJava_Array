package array;

import java.util.Arrays;

public class Exercise11 {
    public String revert(int[] numbers) {

        int previousEven = 0;
        int previousOdd = 0;

        for (int i = 0; i < numbers.length / 2; i++) {

            for (int j = numbers.length - 1; j >= numbers.length / 2; j--) {

                if (numbers[i] % 2 == 0) {

                    if (numbers[j] % 2 == 0 && numbers[j] != previousEven) {
                        previousEven = numbers[i];
                        numbers[i] = numbers[i] + numbers[j];
                        numbers[j] = numbers[i] - numbers[j];
                        numbers[i] = numbers[i] - numbers[j];
                        break;
                    }
                }

                if (numbers[i] % 2 != 0) {
                    if (numbers[j] % 2 != 0 && numbers[j] != previousOdd) {
                        previousOdd = numbers[i];
                        numbers[i] = numbers[i] + numbers[j];
                        numbers[j] = numbers[i] - numbers[j];
                        numbers[i] = numbers[i] - numbers[j];
                        break;
                    }
                }

            }
        }

        return Arrays.toString(numbers);
    }
}
