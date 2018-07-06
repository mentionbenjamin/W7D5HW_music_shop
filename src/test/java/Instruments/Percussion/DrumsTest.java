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
        drums = new Drums("Drums 3000", InstrumentFamilyType.PERCUSSION, 150, 300);
    }

    @Test
    public void hasName(){
        assertEquals("Drums 3000", drums.getName());
    }

    @Test
    public void hasFamily(){
        assertEquals("Percussion", drums.getFamily());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(150, drums.getCostPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300, drums.getSellPrice());
    }

}
