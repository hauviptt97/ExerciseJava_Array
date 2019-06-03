package array;

import array.Exercise21;
import org.junit.Assert;
import org.junit.Test;

public class Exercise21Test {
    @Test
    public void test_caculateDet() {
        Assert.assertEquals(new Exercise21().caculateDet(new int[][]{
                {-2, 2, -3},
                {-1, 1, 3},
                {2, 0, -1}
        }), 18);

        Assert.assertEquals(new Exercise21().caculateDet(new int[][]{
                {2, 2},
                {3, 4}
        }), 2);

        Assert.assertEquals(new Exercise21().caculateDet(new int[][]{
                {1}
        }), 1);

        Assert.assertEquals(new Exercise21().caculateDet(new int[][]{
                {1},{3}
        }), 0);
    }
}
