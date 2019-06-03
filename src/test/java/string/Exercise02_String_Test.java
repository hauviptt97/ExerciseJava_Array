package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise02_String_Test {

    @Test
    public void test_getWords() {
        Assert.assertArrayEquals(new Exercise02_String().getWords("hau bui is the best!"), new String[]{"hau","bui","is","the",null});
        Assert.assertArrayEquals(new Exercise02_String().getWords("   "), null);
    }

}