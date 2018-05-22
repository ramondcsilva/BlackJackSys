/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import util.LinkedList;

/**
 *
 * @author ramon
 */
public class MaoDeCartaTest {
    private MaoDeCarta m;
    
    @Before
    public void setUp() {
        m = new MaoDeCarta();
    }

    @Test
    public void testBasic() {
        m.getCartas().addLast("a");
        m.getCartas().addLast("b");
        m.getCartas().addLast("c");
        
        assertEquals("a",m.getCartas().get(0));
        assertEquals("b",m.getCartas().get(1));
        assertEquals("c",m.getCartas().get(2));
        
        assertTrue(m.getCartas().contains("b"));
        assertFalse(m.getCartas().contains("d"));
        assertTrue(m.getCartas().contains("c"));
        assertTrue(m.getCartas().contains("a"));
        
        LinkedList list = new LinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        
        MaoDeCarta temp = new MaoDeCarta();
        temp.setCartas(list);
        m.setCartas(list);
        assertTrue(temp.equals(m));
        
        assertEquals("a",temp.getCartas().get(0));
        assertEquals("b",temp.getCartas().get(1));
        assertEquals("c",temp.getCartas().get(2));
        
        assertTrue(temp.getCartas().contains("b"));
        assertFalse(temp.getCartas().contains("y"));
        assertTrue(temp.getCartas().contains("c"));
        assertTrue(temp.getCartas().contains("a"));
        
        temp.clearCartas();
        assertTrue(m.getCartas().isEmpty());
        assertTrue(temp.getCartas().isEmpty());
        
        Carta carta = new Carta(1,2);
        
        temp.addCarta(carta);
        assertSame(carta,temp.getCartas().get(0));
    }
}
