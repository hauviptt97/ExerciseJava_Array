package array;

import array.Exercise08;
import org.junit.Assert;
import org.junit.Test;

public class Exercise08Test {
    @Test
    public void test_subtractionOfMinValueAndMaxValue() {
        Assert.assertEquals(new Exercise08().subtractionOfMinValueAndMaxValue(new int[]{2, 11, 4, 6, 7, 10, 3, 14, 1}), 13);
        Assert.assertEquals(new Exercise08().subtractionOfMinValueAndMaxValue(new int[]{1}), 0);
    }
}
