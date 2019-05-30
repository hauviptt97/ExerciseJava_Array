import java.util.Arrays;

public class Exercise12 {
    public String add(int[] numbers, int x) {

        int[] result = new int[numbers.length + 1];
        int count = result.length - 1;

        for (int i = numbers.length - 1; i >= 0; i--) {

            if (x > numbers[i]) {
                result[count--] = x;
                x = numbers[0];
                i++;
            } else {
                result[count--] = numbers[i];
            }

        }
        return Arrays.toString(result);
    }


}
