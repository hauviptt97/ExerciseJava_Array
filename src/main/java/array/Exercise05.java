package array;

public class Exercise05 {
    private boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int sumOfPrimeNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (isPrimeNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }

}
