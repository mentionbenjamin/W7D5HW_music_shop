package Instruments.Percussion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Drums E110", "Percussion", 100, 200);
    }

    @Test
    public void hasName(){
        assertEquals("Drums E110", drums.getName());
    }

}
