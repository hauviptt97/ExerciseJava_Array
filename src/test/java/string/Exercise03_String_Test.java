package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise03_String_Test {
    @Test
    public void test_isRevertString(){
        Assert.assertEquals(new Exercise03_String().isRevertString("abcdcba"),true);
        Assert.assertEquals(new Exercise03_String().isRevertString("   "),false);
        Assert.assertEquals(new Exercise03_String().isRevertString("abcdcb"),false);
        Assert.assertEquals(new Exercise03_String().isRevertString("abccba"),true);
    }
}