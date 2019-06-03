package array;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public String getLongestIncreasingSubarray(int[] numbers) {

        int maxLength = 0, currentLength = 0, maxIndex = 0;

        List<Integer> result = new ArrayList<>();


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else {
                if (maxLength < currentLength) {
                    maxLength = currentLength;
                    maxIndex = i - maxLength;
                }
                currentLength = 0;
            }
        }

        if (maxLength < currentLength) {
            maxLength = currentLength;
            maxIndex = numbers.length - maxLength;
        }

        for (int i = maxIndex - 1; i < maxLength + maxIndex; i++) {
            result.add(numbers[i]);
        }

        return result.toString();
    }
}
