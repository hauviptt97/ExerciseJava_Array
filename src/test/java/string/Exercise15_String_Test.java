package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise15_String_Test {

    @Test
    public void test_getVerifyNumber() {
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("893850597419"), 4);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("89385059741941"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("8938505974"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("89385t5974194"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("8938505274194"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("893850527.19s"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zxczxczxczxcc"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zxczxczxcc"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zxczxczxccwqeqwd"), -1);
    }

}
