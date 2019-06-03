package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise06_String_Test {
    @Test
    public void test_convert(){
        Assert.assertEquals(new Exercise06_String().convert("abCdEFG"),"ABcDefg");
        Assert.assertEquals(new Exercise06_String().convert("    "),"");
    }

}