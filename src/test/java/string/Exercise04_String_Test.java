package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise04_String_Test {
    @Test
    public void test_sum(){
        Assert.assertEquals(new Exercise04_String().sum("abc 123 def 33 mn 3.221"),380);
        Assert.assertEquals(new Exercise04_String().sum("  "),0);
    }

}