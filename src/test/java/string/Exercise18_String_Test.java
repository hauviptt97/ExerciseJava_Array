package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise18_String_Test {
    @Test
    public  void test_multiply(){
        Assert.assertEquals(new Exercise18_String().multiply("2241", "31335"),"70221735");
        Assert.assertEquals(new Exercise18_String().multiply("-2241", "31335"),"-70221735");
        Assert.assertEquals(new Exercise18_String().multiply("2241", "-31335"),"-70221735");
        Assert.assertEquals(new Exercise18_String().multiply("2--241", "31335"),"Invalid Number");
        Assert.assertEquals(new Exercise18_String().multiply("2241", "3-13j35"),"Invalid Number");
        Assert.assertEquals(new Exercise18_String().multiply("000000", "-31335"),"0");
        Assert.assertEquals(new Exercise18_String().multiply("2241", "00"),"0");
    }
}
