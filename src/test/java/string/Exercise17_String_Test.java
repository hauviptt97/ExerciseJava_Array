package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise17_String_Test {
    @Test
    public void test_sub(){
        Assert.assertEquals(new Exercise17_String().sub("153","34"),"119");
        Assert.assertEquals(new Exercise17_String().sub("25","126"),"-101");
        Assert.assertEquals(new Exercise17_String().sub("455145","842547"),"-387402");
        Assert.assertEquals(new Exercise17_String().sub("455145cxc","842547"),"Invalid Number");
        Assert.assertEquals(new Exercise17_String().sub("455145","84254asdasc7"),"Invalid Number");
    }
}

