import java.util.Arrays;
import java.util.Collections;

public class Exercise04 {
    public Integer[] sort(Integer[] numbers) {
        Integer[] result = new Integer[numbers.length];
        int evenNumberIndex = 0;
        int oddNumberIndex = numbers.length - 1;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result[evenNumberIndex++] = number;
            } else {
                result[oddNumberIndex--] = number;
            }
        }

        Arrays.sort(result, 0, evenNumberIndex);
        Arrays.sort(result, evenNumberIndex + 1, numbers.length, Collections.reverseOrder());

        return result;
    }

}