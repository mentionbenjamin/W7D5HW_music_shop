package Instruments.String;

import Instruments.InstrumentFamilyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar Hero", InstrumentFamilyType.STRING, 80, 150);
    }

    @Test
    public void hasName(){
        assertEquals("Guitar Hero", guitar.getName());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", guitar.getFamily());
    }

}
