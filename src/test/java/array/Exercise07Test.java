package array;

import array.Exercise07;
import org.junit.Assert;
import org.junit.Test;

public class Exercise07Test {
    @Test
    public void test_getLongestIncreasingSubarray() {
        Assert.assertEquals(new Exercise07().getLongestIncreasingSubarray(new int[]{5, 6, 3, 5, 7, 8, 9, 1, 2}), "[3, 5, 7, 8, 9]");
        Assert.assertEquals(new Exercise07().getLongestIncreasingSubarray(new int[]{1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 6, 7, 7, 5, 5, 6, 6, 6, 6}), "[1, 2, 3, 4, 5]");
        Assert.assertEquals(new Exercise07().getLongestIncreasingSubarray(new int[]{2, 3, 1, 0, 4, 5, 6}), "[0, 4, 5, 6]");
    }
}
