import org.junit.Assert;
import org.junit.Test;

public class Exercise22Test {
    @Test
    public void test_generateSubArray() {
        Assert.assertArrayEquals(new Exercise22().generateSubArray(new int[][]{
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        }, 1, 1), new int[][]{
                {1, 3},
                {4, 6}
        });

        Assert.assertArrayEquals(new Exercise22().generateSubArray(new int[][]{
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        }, 5, 1), null);
    }
}
