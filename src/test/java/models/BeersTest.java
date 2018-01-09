package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BeersTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void instantiatesBeer_true() throws Exception {
        Beers beers = new Beers("thirsty");
        assertEquals(true, beers instanceof Beers);
    }

    @Test
    public void BeersInstantiateWithContent() throws Exception {
        Beers beers = new Beers("thirsty");
        assertEquals("thirsty", beers.getContent());
    }


}