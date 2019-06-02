public class Exercise26 {

    private int revert(int number) {
        int revertNumber = 0;
        while (number != 0) {
            int temp = number % 10;
            revertNumber = revertNumber * 10 + temp;
            number /= 10;
        }
        return revertNumber;
    }

    public int sumOfElements(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += revert(number);
        }
        return sum;
    }
}
