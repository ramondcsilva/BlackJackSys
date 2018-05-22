package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    LinkedList lista;
    Object data1, data2, data3, data4, array[];

    @Before
    public void setUp() throws Exception {
        lista = new LinkedList();
        data1 = "Data1";
        data2 = "Data2";
        data3 = "Data3";
        data4 = "Data4";
        array = new Object[lista.size()];
    }

    @Test
    public void testEstaVazia() {
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testContains() {
        lista.addStart(data1);
        lista.addStart(data2);

        assertTrue(lista.contains(data1));
        assertFalse(lista.contains(data3));
        assertTrue(lista.contains(data2));
        assertFalse(lista.contains(data4));
    }

    @Test
    public void testTamanho() {
        assertEquals(0, lista.size());

        lista.addStart(data1);
        assertEquals(1, lista.size());

        lista.addStart(data2);
        lista.addStart(data3);
        assertEquals(3, lista.size());

        lista.toRemoveLast();
        assertEquals(2, lista.size());

        lista.toRemoveStart();
        lista.toRemoveLast();
        assertEquals(0, lista.size());
    }

    @Test
    public void testAdicionaInicioRemoveInicio() {
        lista.addStart(data1);
        lista.addStart(data2);
        lista.addStart(data3);
        assertFalse(lista.isEmpty());

        assertSame(data3, lista.toRemoveStart());
        assertFalse(lista.isEmpty());

        assertSame(data2, lista.toRemoveStart());
        assertFalse(lista.isEmpty());

        assertSame(data1, lista.toRemoveStart());
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testAdicionaInicioRemoveFinal() {
        lista.addStart(data1);
        lista.addStart(data2);
        lista.addStart(data3);
        assertFalse(lista.isEmpty());

        assertSame(data1, lista.toRemoveLast());
        assertFalse(lista.isEmpty());

        assertSame(data2, lista.toRemoveLast());
        assertFalse(lista.isEmpty());

        assertSame(data3, lista.toRemoveLast());
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testAdicionaFinalRemoveInicio() {
        lista.addLast(data1);
        lista.addLast(data2);
        lista.addLast(data3);
        assertFalse(lista.isEmpty());

        assertSame(data1, lista.toRemoveStart());
        assertFalse(lista.isEmpty());

        assertSame(data2, lista.toRemoveStart());
        assertFalse(lista.isEmpty());

        assertSame(data3, lista.toRemoveStart());
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testAdicionaFinalRemoveFinal() {
        lista.addLast(data1);
        lista.addLast(data2);
        lista.addLast(data3);
        assertFalse(lista.isEmpty());

        assertSame(data3, lista.toRemoveLast());
        assertFalse(lista.isEmpty());

        assertSame(data2, lista.toRemoveLast());
        assertFalse(lista.isEmpty());

        assertSame(data1, lista.toRemoveLast());
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testRemove() {
        lista.addStart(data1);
        lista.addStart(data2);
        lista.addStart(data3);

        assertFalse(lista.isEmpty());

        assertSame(true, lista.remove(data1));
        assertFalse(lista.isEmpty());

        assertSame(true, lista.remove(data2));
        assertFalse(lista.isEmpty());

        assertSame(true, lista.remove(data3));
        assertTrue(lista.isEmpty());

        assertSame(false, lista.remove(data4));
        assertTrue(lista.isEmpty());
    }

    @Test
    public void testRecupera() {
        lista.addLast(data1);
        lista.addLast(data2);
        lista.addStart(data3);
        assertEquals(data3, lista.get(0));
        assertEquals(data1, lista.get(1));
        assertEquals(data2, lista.get(2));

        lista.toRemoveLast();
        assertEquals(data3, lista.get(0));
        assertEquals(data1, lista.get(1));

        lista.toRemoveStart();
        assertEquals(data1, lista.get(0));
    }

    @Test
    public void testToArray() {
        lista.addLast(data1);
        lista.addLast(data2);
        lista.addLast(data3);
        array = lista.toArray();

        assertSame(array.length, lista.size());

        assertSame(array[0], lista.get(0));
        assertSame(array[1], lista.get(1));
        assertSame(array[2], lista.get(2));
    }

    @Test
    public void testIterador() {
        Iterator it = lista.iterator();
        assertFalse(it.hasNext());

        lista.addLast(data1);
        lista.addLast(data2);
        lista.addStart(data3);
        it = lista.iterator();
        assertTrue(it.hasNext());
        assertSame(data3, it.next());
        assertTrue(it.hasNext());
        assertSame(data1, it.next());
        assertTrue(it.hasNext());
        assertSame(data2, it.next());
        assertFalse(it.hasNext());
    }
}
