public class Exercise03 {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                sum -= number;
            }
        }
        return sum;
    }
}
