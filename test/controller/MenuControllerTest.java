package controller;

import model.Jogador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuControllerTest {
    private Jogador j0, j1, j2, j3;
    MenuController menuController = new MenuController();
    
    @Before
    public void setUp() {
        
    }
    
    /**
     * Test of cadastrarJogador method, of class MenuController.
     */
    @Test
    public void testCadastrarJogador() {
        assertEquals(0,menuController.jogadores.size());
        j0 = menuController.cadastrarJogador("primeiro", "29348293");
        j1 = menuController.cadastrarJogador("segundo", "k3k43k4k34");
        assertEquals(2,menuController.jogadores.size());
        j2 = menuController.cadastrarJogador("terceiro", "sdfj34j3fjf3");
        assertEquals(3,menuController.jogadores.size());
    }

    /**
     * Test of removerJogador method, of class MenuController.
     */
    @Test
    public void testRemoverJogador() {
        j0 = menuController.cadastrarJogador("primeiro", "29348293");
        j1 = menuController.cadastrarJogador("segundo", "k3k43k4k34");
        j2 = menuController.cadastrarJogador("terceiro", "sdfj34j3fjf3");
        
        assertTrue(menuController.removerJogador("primeiro"));
        assertTrue(menuController.removerJogador("segundo"));
        assertEquals(1,menuController.jogadores.size());
        assertTrue(menuController.removerJogador("terceiro"));
        assertFalse(menuController.removerJogador("ramon"));
        assertEquals(0,menuController.jogadores.size());
        assertTrue(menuController.jogadores.isEmpty());
    }

    /**
     * Test of buscaJogador method, of class MenuController.
     */
    @Test
    public void testBuscaJogador() {
        j0 = menuController.cadastrarJogador("primeiro", "29348293");
        j1 = menuController.cadastrarJogador("segundo", "k3k43k4k34");
        j2 = menuController.cadastrarJogador("terceiro", "sdfj34j3fjf3");
        j3 = menuController.cadastrarJogador("tfadfasldf", "s5605060j3fjf3");
        
        assertTrue(menuController.jogadores.contains(j2));
        assertTrue(menuController.jogadores.contains(j3));
        assertTrue(menuController.jogadores.contains(j0));
        assertTrue(menuController.jogadores.contains(j1));
        
        assertTrue(menuController.removerJogador("primeiro"));
        assertFalse(menuController.jogadores.contains(j0));
    }
}
