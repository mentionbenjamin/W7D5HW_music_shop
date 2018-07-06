package Instruments.String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar P203", "String", 120, 180);
    }

    @Test
    public void hasName(){
        assertEquals("Guitar P203", guitar.getName());
    }

}
