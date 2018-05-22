/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramon
 */
public class StackTest {
    Stack pilha;
    Object data1, data2, data3;

    @Before
    public void setUp() throws Exception {
        pilha = new Stack();
        data1 = "Data1";
        data2 = "Data2";
        data3 = "Data3";
    }

    @Test
    public void testPush() {
        pilha.push(data1);
        pilha.push(data2);
        
        assertSame(data2,pilha.peek());
        assertEquals(2,pilha.size());
        
        pilha.pop();
        assertSame(data1,pilha.peek());
        assertEquals(1,pilha.size());
        
        pilha.pop();
        pilha.push(data3);
        assertSame(data3,pilha.peek());
        assertFalse(pilha.isEmpty());
        
        pilha.pop();
        assertEquals(0,pilha.size());
        assertTrue(pilha.isEmpty());
    }

    @Test
    public void testPop() {
        pilha.push(data1);
        pilha.push(data3);
        pilha.push(data2);
        
        assertSame(data2,pilha.pop());
        assertEquals(2,pilha.size());
        
        assertSame(data3,pilha.pop());
        assertEquals(1,pilha.size());
        
        assertSame(data1,pilha.pop());
        assertTrue(pilha.isEmpty());
        assertEquals(0,pilha.size());
    }

    @Test
    public void testPeek() {
        pilha.push(data1);
        pilha.push(data2);
        
        assertSame(data2,pilha.peek());
        assertEquals(2,pilha.size());
        
        pilha.pop();
        assertSame(data1,pilha.peek());
        assertEquals(1,pilha.size());
        
        pilha.pop();
        assertSame(null,pilha.peek());
        assertTrue(pilha.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, pilha.size());

        pilha.push(data1);
        assertEquals(1, pilha.size());
        
        pilha.push(data2);
        pilha.push(data3);
        assertEquals(3, pilha.size());

        pilha.pop();
        assertEquals(2, pilha.size());

        pilha.pop();
        pilha.pop();
        assertEquals(0, pilha.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(pilha.isEmpty());
   }
}