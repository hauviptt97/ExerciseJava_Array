package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise12_String_Test {
    @Test
    public void test_compact(){
        Assert.assertEquals(new Exercise12_String().compact("abbbbbbccccd eeffffddbc"),"abcd efdbc");
        Assert.assertEquals(new Exercise12_String().compact("abbbbbbccccd eeffffddbcc"),"abcd efdbc");
    }
}
