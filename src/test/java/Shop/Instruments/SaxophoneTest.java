package Shop.Instruments;

import Shop.Instruments.InstrumentFamilyType;
import Shop.Instruments.Saxophone;
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
        assertEquals(80, saxophone.getCostPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150, saxophone.getSellPrice());
    }

    @Test
    public void instrumentHasSound(){
        assertEquals("Sax Noise", saxophone.makeSound());
    }

}
