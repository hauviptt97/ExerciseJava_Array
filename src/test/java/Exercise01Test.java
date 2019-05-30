import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Exercise01Test {
    @Test
    public void test_getDuplicateElements(){
        Assert.assertEquals(new Exercise01().getDuplicateElements(new int[]{1,1,3,1,5,6,1,3}), Arrays.asList(1, 3));
    }
}
