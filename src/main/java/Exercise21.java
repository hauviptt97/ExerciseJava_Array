public class Exercise21 {

    public int caculateDet(int[][] numbers) {

        int det = 0;

        for (int i = 0; i < numbers.length; i++) {
            int a = 1;
            int b = 1;

            for (int x = i, y = 0; y < numbers.length; x = (x + 1) % numbers.length, y++) {
                a *= numbers[y][x];
                b *= numbers[numbers.length - 1 - y][x];
            }

            det += a - b;
        }
        return det;
    }

}
