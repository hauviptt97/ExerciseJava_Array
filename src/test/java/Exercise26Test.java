import org.junit.Assert;
import org.junit.Test;

public class Exercise26Test {

    @Test
    public void test_sumOfElements(){
        Assert.assertEquals(new Exercise26().sumOfElements(new int[]{1,21,30,42,4,5}),49);
    }
}
