import org.junit.Assert;
import org.junit.Test;

public class Exercise03Test {
    @Test
    public void test_sum(){
        Assert.assertEquals(Exercise03.sum(new int[]{1,2,3,4,5,6,7}),-4);
    }
}
