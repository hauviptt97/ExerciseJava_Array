import org.junit.Assert;
import org.junit.Test;

public class Exercise23Test {

    @Test
    public void test_sum() {
        Assert.assertEquals(new Exercise23().sum(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1, 20}), 27);
    }
}
