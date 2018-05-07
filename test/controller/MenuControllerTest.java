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

/**
 *
 * @author ramon
 */
public class MenuControllerTest {
    
    public MenuControllerTest() {
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
     * Test of cadastrarJogador method, of class MenuController.
     */
    @Test
    public void testCadastrarJogador() {
        System.out.println("cadastrarJogador");
        String user = "";
        String password = "";
        MenuController instance = new MenuController();
        Jogador expResult = null;
        Jogador result = instance.cadastrarJogador(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerJogador method, of class MenuController.
     */
    @Test
    public void testRemoverJogador() {
        System.out.println("removerJogador");
        String user = "";
        MenuController instance = new MenuController();
        boolean expResult = false;
        boolean result = instance.removerJogador(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarJogo method, of class MenuController.
     */
    @Test
    public void testIniciarJogo() {
        System.out.println("iniciarJogo");
        int quantidadeJogadores = 0;
        MenuController instance = new MenuController();
        instance.iniciarJogo(quantidadeJogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogadores method, of class MenuController.
     */
    @Test
    public void testGetJogadores() {
        System.out.println("getJogadores");
        MenuController instance = new MenuController();
        LinkedList expResult = null;
        LinkedList result = instance.getJogadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
