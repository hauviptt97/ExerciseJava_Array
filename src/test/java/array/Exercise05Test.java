package array;

import array.Exercise05;
import org.junit.Assert;
import org.junit.Test;

public class Exercise05Test {
    @Test
    public void test_sumOfPrimeNumbers() {
        Assert.assertEquals(new Exercise05().sumOfPrimeNumbers(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8}), 22);
    }
}
