package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise14_String_Test {

    @Test
    public void test_isValidBarcode() {
        Assert.assertTrue(new Exercise14_String().isValidBarcode("8938505974194"));
        Assert.assertFalse(new Exercise14_String().isValidBarcode("89385059741941"));
        Assert.assertFalse(new Exercise14_String().isValidBarcode("8938505974"));
        Assert.assertFalse(new Exercise14_String().isValidBarcode("89385t5974194"));
        Assert.assertFalse(new Exercise14_String().isValidBarcode("8938505274194"));
        Assert.assertFalse(new Exercise14_String().isValidBarcode("893850527.19s"));
    }
}
