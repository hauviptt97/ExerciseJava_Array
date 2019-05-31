public class Exercise22 {

    public int[][] generateSubArray(int[][] numbers, int x, int y) {

        if (x > numbers.length || y > numbers[0].length) {
            return null;
        }

        int[][] result = new int[numbers.length - 1][numbers[0].length - 1];

        int i1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            int j1 = 0;

            if (i == x) {
                continue;
            }

            for (int k = 0; k < numbers[0].length; k++) {

                if (k == y) {
                    continue;
                }

                result[i1][j1] = numbers[i][k];
                j1++;
            }

            i1++;
        }

        return result;
    }

}
