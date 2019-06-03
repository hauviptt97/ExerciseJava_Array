public class Exercise09 {

    public int binarySearch(int numbers[], int input) {

        int rightIndex = numbers.length;
        int leftIndex = 0;

        while (rightIndex >= leftIndex) {

            int midIndex = (leftIndex + rightIndex) / 2;

            if (numbers[midIndex] == input) {
                return midIndex;
            }

            if (numbers[midIndex] > input) {
                rightIndex = midIndex - 1;
            }

            leftIndex = midIndex + 1;
        }
        return -1;
    }

}
