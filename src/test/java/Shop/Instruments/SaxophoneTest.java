package Shop.Instruments;

import MusicShop.Instruments.InstrumentFamilyType;
import MusicShop.Instruments.Saxophone;
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

    @Test
    public void hasCostPrice(){
        assertEquals(80, saxophone.getCostPrice(), 0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150, saxophone.getSellPrice(), 0);
    }

    @Test
    public void instrumentHasSound(){
        assertEquals("Saxophone Noise", saxophone.makeSound());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(70, saxophone.calculateMarkup(), 0);
    }


}
