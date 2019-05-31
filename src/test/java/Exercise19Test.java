import org.junit.Assert;
import org.junit.Test;

public class Exercise19Test {

    @Test
    public void test_sortMatrix() {
        Assert.assertArrayEquals(new Exercise19().sortMatrix(new int[][]{
                {1, 3, 2},
                {4, 6, 5},
                {9, 8, 7}
        }), new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        });
    }

}
