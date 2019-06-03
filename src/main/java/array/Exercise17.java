package array;

public class Exercise17 {

    public int[][] convertNumberToMatrix(int n) {

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int[][] result = new int[n][n];
        int count = 1;

        while (count <= n * n) {

            for (int j = left; j <= right; j++) {
                result[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = count++;
            }
            right--;

            if (bottom < top) {
                break;
            }

            for (int j = right; j >= left; j--) {
                result[bottom][j] = count++;
            }
            bottom--;

            if (right < left) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                result[i][left] = count++;
            }
            left++;

        }

        return result;
    }

}


