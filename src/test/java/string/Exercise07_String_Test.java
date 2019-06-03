package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise07_String_Test {

    @Test
    public void test_indexOf(){
        Assert.assertEquals(new Exercise07_String().indexOf("asdfghjk","dfg"),2);
        Assert.assertEquals(new Exercise07_String().indexOf("asdfghjk","ghd"),-1);
    }
}
