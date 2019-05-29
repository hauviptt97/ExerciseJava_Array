import org.junit.Assert;
import org.junit.Test;

public class Exercise11Test {

    @Test
    public void test_revert() {
        Assert.assertEquals(new Exercise11().revert(new int[]{1, 2, 4, 5, 6, 7, 8, 10}), "[7, 10, 8, 5, 6, 1, 4, 2]");
    }
}
