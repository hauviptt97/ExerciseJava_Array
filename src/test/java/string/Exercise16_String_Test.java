package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise16_String_Test {

    @Test
    public void test_add() {
        Assert.assertEquals(new Exercise16_String().add("9999999973", "128"), "10000000101");
        Assert.assertEquals(new Exercise16_String().add("128", "9999999973"), "10000000101");
        Assert.assertEquals(new Exercise16_String().add("9999999973", "128acsa"), "Invalid Number");
        Assert.assertEquals(new Exercise16_String().add("9zxc", "128"), "Invalid Number");
    }

}
