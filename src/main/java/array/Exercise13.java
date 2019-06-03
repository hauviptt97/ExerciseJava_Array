package array;

public class Exercise13 {

    public int[][] rotateMatrix(int[][] numbers) {

        int n = numbers.length;
        int m = numbers[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][n - 1 - i] = numbers[i][j];
            }
        }

        return result;
    }


}
