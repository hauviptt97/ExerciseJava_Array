package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise13_String_Test {

    @Test
    public void test_isEqual(){
        Assert.assertEquals(new Exercise13_String().isEqual("qazczcxzc", "cxzazczxQ"),true);
        Assert.assertEquals(new Exercise13_String().isEqual("qazczcxzc", "cxzazczxQc"),false);
        Assert.assertEquals(new Exercise13_String().isEqual("qazczcxAc", "cxzazczxQ"),true);
        Assert.assertEquals(new Exercise13_String().isEqual("qazczcxAc", "cxzazczxH"),false);
    }
}
