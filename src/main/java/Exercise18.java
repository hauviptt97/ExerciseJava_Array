import java.util.Arrays;

public class Exercise18 {

    public int[][] sortMatrix(int[][] numbers) {

        int m = numbers.length;
        int n = numbers[0].length;

        int[] temp = new int[m * n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[count++] = numbers[i][j];
            }
        }

        Arrays.sort(temp);

        count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                numbers[i][j] = temp[count++];
            }
        }

        return numbers;
    }
}