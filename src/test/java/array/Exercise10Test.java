package array;

import org.junit.Assert;
import org.junit.Test;

public class Exercise10Test {

    @Test
    public void test_split() {
        Assert.assertEquals(new Exercise10().split(new int[]{2, 11, 4, 6, 7, 10, 3, 14, 1, 2, 11, 4, 6, 7, 10, 3, 14, 1, 1, 4}, 6), "[[2, 11, 4, 6], [7, 10, 3, 14], [1, 2, 11, 4], [6, 7, 10, 3], [14, 1, 1, 4], []]");
    }

}
