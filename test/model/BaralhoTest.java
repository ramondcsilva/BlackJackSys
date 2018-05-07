/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.LinkedList;
import util.Stack;

/**
 *
 * @author ramon
 */
public class BaralhoTest {
    
    public BaralhoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCartas method, of class Baralho.
     */
    @Test
    public void testGetCartas() {
        System.out.println("getCartas");
        Baralho instance = new Baralho();
        LinkedList expResult = null;
        LinkedList result = instance.getCartas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartas method, of class Baralho.
     */
    @Test
    public void testSetCartas() {
        System.out.println("setCartas");
        LinkedList cartas = null;
        Baralho instance = new Baralho();
        instance.setCartas(cartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillBaralho method, of class Baralho.
     */
    @Test
    public void testFillBaralho() {
        System.out.println("fillBaralho");
        Baralho instance = new Baralho();
        instance.fillBaralho();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickRandom method, of class Baralho.
     */
    @Test
    public void testPickRandom() {
        System.out.println("pickRandom");
        Baralho instance = new Baralho();
        Carta expResult = null;
        Carta result = instance.pickRandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stackRandom method, of class Baralho.
     */
    @Test
    public void testStackRandom() {
        System.out.println("stackRandom");
        long seed = 0L;
        Baralho instance = new Baralho();
        Stack expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
