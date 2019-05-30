import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public List<Integer> getDuplicateElements(int[] numbers) {
        ArrayList<Integer> outputArray = new ArrayList<>();

        int current = numbers[0];

        int count = 1;

        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == current) {
                count++;
            } else {
                if (count > 1) {
                    outputArray.add(current);
                    count = 1;
                }

                current = numbers[i];
            }

            if (i == numbers.length - 1 && count > 1) {
                outputArray.add(current);
            }
        }

        return outputArray;
    }
}
