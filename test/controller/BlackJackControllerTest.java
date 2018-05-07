/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Jogador;
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
public class BlackJackControllerTest {
    
    public BlackJackControllerTest() {
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
     * Test of novaJogada method, of class BlackJackController.
     */
    @Test
    public void testNovaJogada() {
        System.out.println("novaJogada");
        BlackJackController instance = new BlackJackController();
        Object expResult = null;
        Object result = instance.novaJogada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pararJogada method, of class BlackJackController.
     */
    @Test
    public void testPararJogada() {
        System.out.println("pararJogada");
        BlackJackController instance = new BlackJackController();
        instance.pararJogada();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaCartas method, of class BlackJackController.
     */
    @Test
    public void testAdicionaCartas() {
        System.out.println("adicionaCartas");
        BlackJackController instance = new BlackJackController();
        instance.adicionaCartas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of embaralhamento method, of class BlackJackController.
     */
    @Test
    public void testEmbaralhamento() {
        System.out.println("embaralhamento");
        BlackJackController instance = new BlackJackController();
        instance.embaralhamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verCartasRestantes method, of class BlackJackController.
     */
    @Test
    public void testVerCartasRestantes() {
        System.out.println("verCartasRestantes");
        BlackJackController instance = new BlackJackController();
        instance.verCartasRestantes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verCartasRestantesOrdenadas method, of class BlackJackController.
     */
    @Test
    public void testVerCartasRestantesOrdenadas() {
        System.out.println("verCartasRestantesOrdenadas");
        BlackJackController instance = new BlackJackController();
        instance.verCartasRestantesOrdenadas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placarGeral method, of class BlackJackController.
     */
    @Test
    public void testPlacarGeral() {
        System.out.println("placarGeral");
        Jogador vencedor = null;
        BlackJackController instance = new BlackJackController();
        instance.placarGeral(vencedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class BlackJackController.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] v = null;
        int esquerda = 0;
        int direita = 0;
        BlackJackController.quickSort(v, esquerda, direita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushCarta method, of class BlackJackController.
     */
    @Test
    public void testPushCarta() {
        System.out.println("pushCarta");
        BlackJackController instance = new BlackJackController();
        Object expResult = null;
        Object result = instance.pushCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reiniciarBaralho method, of class BlackJackController.
     */
    @Test
    public void testReiniciarBaralho() {
        System.out.println("reiniciarBaralho");
        Stack n = null;
        BlackJackController instance = new BlackJackController();
        instance.reiniciarBaralho(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprime method, of class BlackJackController.
     */
    @Test
    public void testImprime() {
        System.out.println("imprime");
        BlackJackController instance = new BlackJackController();
        instance.imprime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resgataCarta method, of class BlackJackController.
     */
    @Test
    public void testResgataCarta() {
        System.out.println("resgataCarta");
        int i = 0;
        LinkedList resgate = null;
        BlackJackController instance = new BlackJackController();
        Object expResult = null;
        Object result = instance.resgataCarta(i, resgate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaralho method, of class BlackJackController.
     */
    @Test
    public void testGetBaralho() {
        System.out.println("getBaralho");
        BlackJackController instance = new BlackJackController();
        LinkedList expResult = null;
        LinkedList result = instance.getBaralho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
