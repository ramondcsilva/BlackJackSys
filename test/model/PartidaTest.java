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
import util.Stack;

/**
 *
 * @author ramon
 */
public class PartidaTest {
    
    public PartidaTest() {
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
     * Test of getRodada method, of class Partida.
     */
    @Test
    public void testGetRodada() {
        System.out.println("getRodada");
        Partida instance = new Partida();
        int expResult = 0;
        int result = instance.getRodada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRodada method, of class Partida.
     */
    @Test
    public void testSetRodada() {
        System.out.println("setRodada");
        int rodada = 0;
        Partida instance = new Partida();
        instance.setRodada(rodada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPonto method, of class Partida.
     */
    @Test
    public void testGetPonto() {
        System.out.println("getPonto");
        Partida instance = new Partida();
        int expResult = 0;
        int result = instance.getPonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPonto method, of class Partida.
     */
    @Test
    public void testSetPonto() {
        System.out.println("setPonto");
        int ponto = 0;
        Partida instance = new Partida();
        instance.setPonto(ponto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaralho method, of class Partida.
     */
    @Test
    public void testGetBaralho() {
        System.out.println("getBaralho");
        Partida instance = new Partida();
        Baralho expResult = null;
        Baralho result = instance.getBaralho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaralho method, of class Partida.
     */
    @Test
    public void testSetBaralho() {
        System.out.println("setBaralho");
        Baralho baralho = null;
        Partida instance = new Partida();
        instance.setBaralho(baralho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonte method, of class Partida.
     */
    @Test
    public void testGetMonte() {
        System.out.println("getMonte");
        Partida instance = new Partida();
        Stack expResult = null;
        Stack result = instance.getMonte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonte method, of class Partida.
     */
    @Test
    public void testSetMonte() {
        System.out.println("setMonte");
        Stack monte = null;
        Partida instance = new Partida();
        instance.setMonte(monte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogador method, of class Partida.
     */
    @Test
    public void testGetJogador_0args() {
        System.out.println("getJogador");
        Partida instance = new Partida();
        Jogador[] expResult = null;
        Jogador[] result = instance.getJogador();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogador method, of class Partida.
     */
    @Test
    public void testSetJogador_JogadorArr() {
        System.out.println("setJogador");
        Jogador[] jogador = null;
        Partida instance = new Partida();
        instance.setJogador(jogador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogador method, of class Partida.
     */
    @Test
    public void testGetJogador_int() {
        System.out.println("getJogador");
        int index = 0;
        Partida instance = new Partida();
        Jogador expResult = null;
        Jogador result = instance.getJogador(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogador method, of class Partida.
     */
    @Test
    public void testSetJogador_int_Jogador() {
        System.out.println("setJogador");
        int index = 0;
        Jogador jogador = null;
        Partida instance = new Partida();
        instance.setJogador(index, jogador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
