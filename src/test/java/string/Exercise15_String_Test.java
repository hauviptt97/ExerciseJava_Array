package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise15_String_Test {

    @Test
    public void test_getVerifyNumber() {
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("893850597419"), 4);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("8385059741941"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("838505974"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("8385597194"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("83850527.19s"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zczxczxczxcc"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zczxczxcc"), -1);
        Assert.assertEquals(new Exercise15_String().getVerifyNumber("zczxczxccwqeqwd"), -1);
    }

}
