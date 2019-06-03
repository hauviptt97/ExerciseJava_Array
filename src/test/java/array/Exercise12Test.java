package array;

import array.Exercise12;
import org.junit.Assert;
import org.junit.Test;

public class Exercise12Test {

    @Test
    public void test_add() {
        Assert.assertEquals(new Exercise12().add(new int[]{1, 2, 4, 5, 6, 7, 8, 10}, 9), "[1, 2, 4, 5, 6, 7, 8, 9, 10]");
    }
}
