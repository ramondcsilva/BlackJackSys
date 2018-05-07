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

/**
 *
 * @author ramon
 */
public class MaoDeCartaTest {
    
    public MaoDeCartaTest() {
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
     * Test of getCartas method, of class MaoDeCarta.
     */
    @Test
    public void testGetCartas() {
        System.out.println("getCartas");
        MaoDeCarta instance = null;
        LinkedList expResult = null;
        LinkedList result = instance.getCartas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartas method, of class MaoDeCarta.
     */
    @Test
    public void testSetCartas() {
        System.out.println("setCartas");
        LinkedList cartas = null;
        MaoDeCarta instance = null;
        instance.setCartas(cartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCarta method, of class MaoDeCarta.
     */
    @Test
    public void testAddCarta() {
        System.out.println("addCarta");
        Carta carta = null;
        MaoDeCarta instance = null;
        instance.addCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearCartas method, of class MaoDeCarta.
     */
    @Test
    public void testClearCartas() {
        System.out.println("clearCartas");
        MaoDeCarta instance = null;
        instance.clearCartas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
