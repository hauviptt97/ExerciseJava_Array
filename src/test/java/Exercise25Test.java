import org.junit.Assert;
import org.junit.Test;

public class Exercise25Test {
    @Test
    public void test_findGCDOfArray() {
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 9}), 3);
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 0}), 3);
        Assert.assertEquals(new Exercise25().findGCDOfArray(new int[]{3, 6, 8, 7}), 1);
    }

    @Test
    public void test_findGCD(){
        Assert.assertEquals(new Exercise25().findGCD(12,22),2);
        Assert.assertEquals(new Exercise25().findGCD(0,25),25);
        Assert.assertEquals(new Exercise25().findGCD(20,0),20);
        Assert.assertEquals(new Exercise25().findGCD(0,0),0);
    }
}
