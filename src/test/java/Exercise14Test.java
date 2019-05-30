import org.junit.Assert;
import org.junit.Test;

public class Exercise14Test {

    @Test
    public void test_convertMatrixToArray() {
        Assert.assertArrayEquals(new Exercise14().convertMatrixToArray(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        }), new int[]{1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8});

        Assert.assertNotNull(new Exercise14().convertMatrixToArray(new int[1][2]));
    }

}
