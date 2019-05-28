import java.util.Arrays;
import java.util.Collections;

public class Exercise06 {
    public String sort(Integer[] numbers) {

        //numbers=[2, 7, 6, 4, 11, 10, 1, 14, 3]

        Integer[] temp = new Integer[numbers.length];
        int evenNumberIndex = 0;
        int oddNumberIndex = numbers.length - 1;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                temp[evenNumberIndex++] = number;
            } else {
                temp[oddNumberIndex--] = number;
            }
        }

        Arrays.sort(temp, 0, evenNumberIndex);
        Arrays.sort(temp, evenNumberIndex, numbers.length, Collections.reverseOrder());

        // temp = [2, 4, 6, 10, 14, 11, 7, 3, 1]

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = temp[count++];
            } else {
                oddNumberIndex++;
                numbers[i] = temp[oddNumberIndex];
            }
        }

        // numbers = [2, 11, 4, 6, 7, 10, 3, 14, 1]

        return Arrays.toString(numbers);
    }
}
