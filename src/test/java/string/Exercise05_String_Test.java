package string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Exercise05_String_Test {
    @Test
    public void test_getDuplicateWords(){
        Assert.assertEquals(new Exercise05_String().getDuplicateWords("hau bui is the best hau ga ga"), Arrays.asList("ga","hau"));
        Assert.assertEquals(new Exercise05_String().getDuplicateWords("  "), null);
    }
}