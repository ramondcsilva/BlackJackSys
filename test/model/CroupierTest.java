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

/**
 *
 * @author ramon
 */
public class CroupierTest {
    
    public CroupierTest() {
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
     * Test of getCartaDoTopo method, of class Croupier.
     */
    @Test
    public void testGetCartaDoTopo() {
        System.out.println("getCartaDoTopo");
        Croupier instance = new Croupier();
        Carta expResult = null;
        Carta result = instance.getCartaDoTopo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartaDoTopo method, of class Croupier.
     */
    @Test
    public void testSetCartaDoTopo() {
        System.out.println("setCartaDoTopo");
        Carta cartaDoTopo = null;
        Croupier instance = new Croupier();
        instance.setCartaDoTopo(cartaDoTopo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
