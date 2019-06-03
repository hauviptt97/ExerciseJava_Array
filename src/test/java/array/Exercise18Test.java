package array;

import array.Exercise18;
import org.junit.Assert;
import org.junit.Test;

public class Exercise18Test {

    @Test
    public void test_sortMatrix() {
        Assert.assertArrayEquals(new Exercise18().sortMatrix(new int[][]{
                {3, 2, 6},
                {4, 8, 1},
                {7, 5, 9}
        }), new int[][]{
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        });
    }
}
