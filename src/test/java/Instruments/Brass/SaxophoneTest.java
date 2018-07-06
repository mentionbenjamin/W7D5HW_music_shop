package Instruments.Brass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Saxophone G621", "Brass", 80, 150);
    }

    @Test
    public void hasName(){
        assertEquals("Saxophone G621", saxophone.getName());
    }

}
