import java.util.Arrays;

public class Exercise19 {

    public int[][] sortMatrix(int[][] numbers) {

        int m = numbers.length;
        int n = numbers[0].length;

        int[] temp = new int[m * n];
        int count = 0;

        for (int[] number : numbers) {
            for (int j = 0; j < n; j++) {
                temp[count++] = number[j];
            }
        }

        Arrays.sort(temp);

        numbers = convertArrayToMatrix(numbers.length, temp);

        return numbers;
    }

    private int[][] convertArrayToMatrix(int n, int[] numbers) {

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int[][] result = new int[n][n];
        int count = 0;

        while (count < numbers.length) {

            for (int j = left; j <= right; j++) {
                result[top][j] = numbers[count++];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = numbers[count++];
            }
            right--;

            if (bottom < top) {
                break;
            }

            for (int j = right; j >= left; j--) {
                result[bottom][j] = numbers[count++];
            }
            bottom--;

            if (right < left) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                result[i][left] = numbers[count++];
            }
            left++;

        }

        return result;
    }

}
