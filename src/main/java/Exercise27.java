import java.util.Arrays;
import java.util.Collections;

public class Exercise27 {

    public Integer[] getMaxElements(Integer[] numbers, int k) {

        if (k > numbers.length) {
            return null;
        }

        Integer[] result = new Integer[k];
        int count = 0;

        Arrays.sort(numbers, Collections.reverseOrder());

        while (count < k) {
            result[count] = numbers[count];
            count++;
        }

        return result;
    }
}
