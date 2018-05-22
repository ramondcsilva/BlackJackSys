package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CroupierTest {
    private MaoDeCarta mao;
    
    @Before
    public void setUp() {
        mao = new MaoDeCarta();
    }
    
    @Test
    public void testBasic() {
        Carta a = new Carta(3,4);
        Carta b = new Carta(7,6);
        Carta c = new Carta(4,5);
        
        assertTrue(mao.getCartas().isEmpty());
        
        mao.addCarta(a);
        mao.addCarta(b);
        assertEquals(mao.getCartas().size(),2);
        assertTrue(mao.getCartas().contains(a));
        assertTrue(mao.getCartas().contains(b));
        assertFalse(mao.getCartas().contains(c));
        assertFalse(mao.getCartas().isEmpty());
        
        mao.addCarta(c);
        assertTrue(mao.getCartas().contains(c));
        assertEquals(mao.getCartas().size(),3);
        
        MaoDeCarta temp = new MaoDeCarta();
        
        temp.addCarta(a);
        temp.addCarta(b);
        assertEquals(temp.getCartas().size(),2);
        assertTrue(temp.getCartas().contains(a));
        assertTrue(temp.getCartas().contains(b));
        assertFalse(temp.getCartas().contains(c));
        assertFalse(temp.getCartas().isEmpty());
        
        temp.addCarta(c);
        assertTrue(temp.getCartas().contains(c));
        assertEquals(temp.getCartas().size(),3);
        mao = temp;
        
        assertTrue(mao.equals(temp));
    }
}