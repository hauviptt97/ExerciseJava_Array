import org.junit.Assert;
import org.junit.Test;

public class Exercise25Test {
    @Test
    public void test_findGCDOfArray() {
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 9}), 3);
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 0}), 3);
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 8, 7}), 1);
    }
}
