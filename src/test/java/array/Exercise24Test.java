package array;

import array.Exercise24;
import org.junit.Assert;
import org.junit.Test;

public class Exercise24Test {
    @Test
    public void test_findLCMOfArray() {
        Assert.assertEquals(new Exercise24().findLCMOfArray(new int[]{3, 6, 9}), 18);
        Assert.assertEquals(new Exercise24().findLCMOfArray(new int[]{3, 6, 9, 0}), 0);
    }
}
