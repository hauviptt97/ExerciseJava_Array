package array;

import array.Exercise04;
import org.junit.Assert;
import org.junit.Test;

public class Exercise04Test {
    @Test
    public void test_sort(){
        Assert.assertArrayEquals(new Exercise04().sort(new Integer[]{1,2,3,4,5,6,7,8}),new Integer[]{2,4,6,8,7,5,3,1});
    }

}