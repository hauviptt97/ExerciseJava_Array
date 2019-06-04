package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise10_String_Test {

    @Test
    public void test_convert() {
        Assert.assertEquals(new Exercise10_String().convert("a10b5c"), "aaaaaaaaaabbbbbc");
        Assert.assertEquals(new Exercise10_String().convert("a32cb5c20"), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacbbbbbcccccccccccccccccccc");
    }
}
