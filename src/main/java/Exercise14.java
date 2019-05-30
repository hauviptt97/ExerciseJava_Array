import java.util.Arrays;

public class Exercise14 {
    public int[] convertMatrixToArray(int[][] numbers) {

        if (numbers == null || numbers.length == 0 || numbers[0].length == 0) {
            return null;
        }

        int m = numbers.length;
        int n = numbers[0].length;

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        int[] result = new int[m * n];
        int count = 0;

        while (count < result.length) {

            for (int j = left; j <= right; j++) {
                result[count++] = numbers[top][j];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[count++] = numbers[i][right];
            }
            right--;

            if (bottom < top) {
                break;
            }

            for (int j = right; j >= left; j--) {
                result[count++] = numbers[bottom][j];
            }
            bottom--;

            if (right < left) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                result[count++] = numbers[i][left];
            }
            left++;

        }

        return result;
    }


}
