import org.junit.Assert;
import org.junit.Test;

public class Exercise06Test {
    @Test
    public void test_sort() {
        Assert.assertEquals(new Exercise06().sort(new Integer[]{2, 7, 6, 4, 11, 10, 1, 14, 3}), "[2, 11, 4, 6, 7, 10, 3, 14, 1]");
    }

}
