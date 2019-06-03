package array;

import array.Exercise13;
import org.junit.Assert;
import org.junit.Test;

public class Exercise13Test {
    @Test
    public void test_rotateMatrix() {
        Assert.assertArrayEquals(new Exercise13().rotateMatrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        }), new int[][]{
                {10, 7, 4, 1},
                {11, 8, 5, 2},
                {12, 9, 6, 3}});
    }
}
