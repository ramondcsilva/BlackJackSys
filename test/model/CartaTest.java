package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class CartaTest {
    private Carta c;
    
    @Before
    public void setUp() throws Exception {
        c = new Carta(1,2);
    }

    @Test
    public void testBasic(){
        assertEquals(1,c.getNumero());
        assertEquals(2,c.getNaipe());
        
        c.setNumero(3);
        c.setNaipe(4);
        assertEquals(3,c.getNumero());
        assertEquals(4,c.getNaipe());
        
        Carta temp = new Carta(3,4);
        assertTrue(temp.equals(c));
        
        c.setNumero(7);
        c.setNaipe(2);
        assertFalse(temp.equals(c));
        
        c.setNaipe(4);
        c.setNumero(3);
        assertTrue(temp.equals(c));
    }
}
