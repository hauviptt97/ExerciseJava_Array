package array;

import array.Exercise03;
import org.junit.Assert;
import org.junit.Test;

public class Exercise03Test {
    @Test
    public void test_sum(){
        Assert.assertEquals(new Exercise03().sum(new int[]{1,2,3,4,5,6,7}),-4);
    }
}
