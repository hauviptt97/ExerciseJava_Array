package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise09_String_Test {

    @Test
    public void test_compact(){
        Assert.assertEquals(new Exercise09_String().compact("abcccceeeeeefdd"),"abc4e6fd2");
        Assert.assertEquals(new Exercise09_String().compact("abbbbbbbbbbbbbccc"),"ab13c3");
        Assert.assertEquals(new Exercise09_String().compact("abbbbbbbbbbbbbc"),"ab13c");
    }
}
