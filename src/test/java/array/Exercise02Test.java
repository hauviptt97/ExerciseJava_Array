package array;

import array.Exercise02;
import org.junit.Assert;
import org.junit.Test;

public class Exercise02Test {

    @Test
    public void test_sumOfThreeGreatestNumbers() {
        Assert.assertEquals(new Exercise02().sumOfThreeGreatestNumbers(new Integer[]{1, 1, 3, 1, 5, 6, 1, 3}), 14);
        Assert.assertEquals(new Exercise02().sumOfThreeGreatestNumbers(new Integer[]{1, 4}), 0);
    }
}
