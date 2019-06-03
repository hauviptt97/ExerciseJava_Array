import org.junit.Assert;
import org.junit.Test;

public class Exercise27Test {

    @Test
    public void test_getMaxElements(){
        Assert.assertArrayEquals(new Exercise27().getMaxElements(new Integer[]{1,7,6,4,3,8},2),new Integer[]{8,7});
        Assert.assertArrayEquals(new Exercise27().getMaxElements(new Integer[]{1,7,6,4,3,8},7),null);
    }
}
