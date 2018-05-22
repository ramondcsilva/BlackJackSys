/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import util.LinkedList;

public class BaralhoTest {

    private Baralho b;

    @Before
    public void setUp() {
        b = new Baralho();
    }

    @Test
    public void testBasic() {

        assertFalse(b.getCartas().isEmpty());
        assertEquals(b.getCartas().size(), 52);

        Carta c1 = new Carta(1, 0);
        Carta c2 = new Carta(2, 0);
        Carta cLast = new Carta(13, 39);
        Carta test = new Carta(14, 52);

        assertEquals(c1, b.getCartas().get(51));
        assertEquals(c2, b.getCartas().get(50));
        assertEquals(cLast, b.getCartas().get(0));

        assertTrue(b.getCartas().contains(c1));
        assertFalse(b.getCartas().contains(test));
        assertTrue(b.getCartas().contains(c2));
        assertTrue(b.getCartas().contains(cLast));

        LinkedList list = new LinkedList();
        list.addLast(c1);
        list.addLast(c2);
        list.addLast(cLast);

        Baralho temp = new Baralho();
        temp.setCartas(list);
        b.setCartas(list);
        assertTrue(b.getCartas().equals(temp.getCartas()));

        assertEquals(temp.getCartas().size(), 3);

        assertEquals(c1, temp.getCartas().get(0));
        assertEquals(c2, temp.getCartas().get(1));
        assertEquals(cLast, temp.getCartas().get(2));

        LinkedList n = new LinkedList();

        temp.setCartas(n);
        assertTrue(temp.getCartas().isEmpty());
        temp.fillBaralho();
        assertFalse(temp.getCartas().isEmpty());
        assertEquals(temp.getCartas().size(), 52);

        Carta c = temp.pickRandom();
        assertFalse(temp.getCartas().get(0).equals(c));

        temp.listRandom();
        assertEquals(temp.getCartas().size(),52);

        Object[] cartas = temp.arrayRandom();
        assertTrue(temp.getCartas().contains(cartas[0]));
        assertTrue(temp.getCartas().contains(cartas[51]));
        assertEquals(cartas.length,temp.getCartas().size());
    }
}
