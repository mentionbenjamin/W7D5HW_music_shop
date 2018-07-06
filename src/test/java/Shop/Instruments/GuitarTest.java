package Shop.Instruments;

import Shop.Instruments.Guitar;
import Shop.Instruments.InstrumentFamilyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar Hero", InstrumentFamilyType.STRING, 100, 200);
    }

    @Test
    public void hasName(){
        assertEquals("Guitar Hero", guitar.getName());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", guitar.getFamily());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(100, guitar.getCostPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200, guitar.getSellPrice());
    }

    @Test
    public void instrumentHasSound(){
        assertEquals("Guitar Noise", guitar.makeSound());
    }

}
