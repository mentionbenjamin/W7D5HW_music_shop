package Shop.Instruments;

import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentFamilyType;
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
        assertEquals(100, guitar.getCostPrice(), 0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200, guitar.getSellPrice(), 0);
    }

    @Test
    public void instrumentHasSound(){
        assertEquals("Guitar Noise", guitar.makeSound());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(100, guitar.calculateMarkup(), 0);
    }


}
