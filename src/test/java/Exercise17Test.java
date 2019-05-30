import org.junit.Assert;
import org.junit.Test;

public class Exercise17Test {

    @Test
    public void test_convertNumberToMatrix() {
        Assert.assertArrayEquals(new Exercise17().convertNumberToMatrix(3),
                new int[][]{
                        {1, 2, 3},
                        {8, 9, 4},
                        {7, 6, 5}
                });
    }
}
