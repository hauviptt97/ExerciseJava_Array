package string;

import org.junit.Assert;
import org.junit.Test;

public class Exercise08_String_Test {

    @Test
    public void test_standardized(){
        Assert.assertEquals(new Exercise08_String().standardized("toi La Bui . nguyen van ?  hau"),"Toi la bui. Nguyen van? Hau");
        Assert.assertEquals(new Exercise08_String().standardized("toi La ,Bui nguyen van . hau"),"Toi la, toi la, Bui nguyen van. Hau");
        Assert.assertEquals(new Exercise08_String().standardized("  "),"  ");
        Assert.assertEquals(new Exercise08_String().standardized(" a "),"A");
    }
}
