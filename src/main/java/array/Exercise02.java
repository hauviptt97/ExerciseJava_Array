package array;

import java.util.Arrays;
import java.util.Collections;

public class Exercise02 {
    public int sumOfThreeGreatestNumbers(Integer[] numbers) {
        if (numbers.length < 3) {
            return 0;
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        return numbers[0] + numbers[1] + numbers[2];
    }
}
