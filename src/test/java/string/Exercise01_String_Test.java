package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise01_String_Test {

    @Test
    public void test_getLines() {
        Assert.assertArrayEquals(new Exercise01_String().getLines("sang ni t an bun. trua ni an com? chac ko no\n toi ve an them banh xeo"), new String[]{"sang ni t an bun", " trua ni an com", " chac ko no", " toi ve an them banh xeo"});
        Assert.assertArrayEquals(new Exercise01_String().getLines("   "), null);
    }

}