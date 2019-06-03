package array;

public class Exercise03 {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                sum -= number;
            }
        }
        return sum;
    }
}
