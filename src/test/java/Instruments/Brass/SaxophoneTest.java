package Instruments.Brass;

import Instruments.InstrumentFamilyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Saxophone G621", InstrumentFamilyType.BRASS, 80, 150);
    }

    @Test
    public void hasName(){
        assertEquals("Saxophone G621", saxophone.getName());
    }

    @Test
    public void hasFamily(){
        assertEquals("Brass", saxophone.getFamily());
    }

}
