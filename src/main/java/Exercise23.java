public class Exercise23 {
    public int sum(int[] numbers) {
        int currentSum = 0;
        int maxSum = 0;

        for (int number : numbers) {

            if (number >= 0) {
                currentSum += number;
            } else {
                if (maxSum < currentSum) {
                    maxSum = currentSum;

                }
                currentSum = 0;
            }
        }

        return (currentSum > maxSum) ? currentSum : maxSum;
    }
}
