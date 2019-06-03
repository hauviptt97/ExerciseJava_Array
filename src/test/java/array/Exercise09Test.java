package array;

import array.Exercise09;
import org.junit.Assert;
import org.junit.Test;

public class Exercise09Test {

    @Test
    public void test_binarySearch() {
        Assert.assertEquals(new Exercise09().binarySearch(new int[]{11, 12, 22, 25, 28, 64, 75}, 25), 3);
        Assert.assertEquals(new Exercise09().binarySearch(new int[]{11, 12, 22, 25, 28, 64}, 64), 5);
        Assert.assertEquals(new Exercise09().binarySearch(new int[]{11, 12, 22, 25, 28, 64}, 15), -1);
    }

}
