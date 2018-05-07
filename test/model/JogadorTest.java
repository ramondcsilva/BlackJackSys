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
public class JogadorTest {
    
    public JogadorTest() {
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
     * Test of getUser method, of class Jogador.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Jogador.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Jogador instance = new Jogador();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Jogador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Jogador.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Jogador instance = new Jogador();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaoAtual method, of class Jogador.
     */
    @Test
    public void testGetMaoAtual() {
        System.out.println("getMaoAtual");
        Jogador instance = new Jogador();
        MaoDeCarta expResult = null;
        MaoDeCarta result = instance.getMaoAtual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaoAtual method, of class Jogador.
     */
    @Test
    public void testSetMaoAtual() {
        System.out.println("setMaoAtual");
        MaoDeCarta MaoAtual = null;
        Jogador instance = new Jogador();
        instance.setMaoAtual(MaoAtual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDaMao method, of class Jogador.
     */
    @Test
    public void testGetTotalDaMao() {
        System.out.println("getTotalDaMao");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getTotalDaMao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalDaMao method, of class Jogador.
     */
    @Test
    public void testSetTotalDaMao() {
        System.out.println("setTotalDaMao");
        int totalDaMao = 0;
        Jogador instance = new Jogador();
        instance.setTotalDaMao(totalDaMao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPontuacao method, of class Jogador.
     */
    @Test
    public void testGetPontuacao() {
        System.out.println("getPontuacao");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getPontuacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPontuacao method, of class Jogador.
     */
    @Test
    public void testSetPontuacao() {
        System.out.println("setPontuacao");
        int pontuacao = 0;
        Jogador instance = new Jogador();
        instance.setPontuacao(pontuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartidasVencidas method, of class Jogador.
     */
    @Test
    public void testGetPartidasVencidas() {
        System.out.println("getPartidasVencidas");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getPartidasVencidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartidasVencidas method, of class Jogador.
     */
    @Test
    public void testSetPartidasVencidas() {
        System.out.println("setPartidasVencidas");
        int partidasVencidas = 0;
        Jogador instance = new Jogador();
        instance.setPartidasVencidas(partidasVencidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Jogador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Jogador instance = new Jogador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
