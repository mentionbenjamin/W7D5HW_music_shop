package Instruments.Percussion;

import Instruments.InstrumentFamilyType;
import Instruments.Percussion.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Saxophone G621", InstrumentFamilyType.BRASS ,80,150);
    }

    @Test
    public void hasName(){
        assertEquals("Saxophone G621", drums.getName());
    }

    @Test
    public void hasFamily(){

    }

}
