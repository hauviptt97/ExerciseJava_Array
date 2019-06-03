package array;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {

    public String split(int[] numbers, int n) {

        List<List<Integer>> subArrays = new ArrayList<>();

        int lengthOfSubArray = numbers.length % n == 0 ? numbers.length / n : numbers.length / n + 1;

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {

            temp.add(numbers[i]);
            if (temp.size() == lengthOfSubArray) {
                subArrays.add(temp);
                temp = new ArrayList<>();
            }

        }

        if (numbers.length % n != 0) {
            subArrays.add(temp);
        }

        return subArrays.toString();
    }

}
