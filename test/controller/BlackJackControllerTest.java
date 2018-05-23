package controller;

import model.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import util.*;

/**
 * @author ramon
 */
public class BlackJackControllerTest {
    private Jogador j0,j1,j2;
    BlackJackController BJController = new BlackJackController();
    
    @Before
    public void setUp() {
        j0 = new Jogador();
        j1 = new Jogador();
        j2 = new Jogador();
    }
    
    /**
     * Test of adicionaCartas method, of class BlackJackController.
     */
    @Test
    public void testAdicionaCartas() {
        assertEquals(BJController.baralho.size(),0);
        BJController.adicionaCartas();
        assertEquals(BJController.baralho.size(),52);
    }

    /**
     * Test of embaralha method, of class BlackJackController.
     */
    @Test
    public void testEmbaralha() {
        assertEquals(BJController.baralho.size(),0);
    
        BJController.adicionaCartas();
        Carta c = (Carta)BJController.baralho.get(0);
        Carta d = (Carta)BJController.baralho.get(0);
        assertTrue(d.equals(c));
        assertEquals(BJController.baralho.size(),52);
        
        BJController.embaralha();
        d = (Carta)BJController.baralho.get(0);
        assertFalse(d.equals(c));
    }

    /**
     * Test of verCartasRestantes method, of class BlackJackController.
     */
    @Test
    public void testVerCartasRestantes() {
        assertEquals(BJController.baralho.size(),0);
    
        BJController.adicionaCartas();
        Carta c = (Carta)BJController.baralho.get(0);
        Carta d = (Carta)BJController.baralho.get(0);
        assertTrue(d.equals(c));
        assertEquals(BJController.baralho.size(),52);
        
        BJController.embaralha();
        
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        
        d = (Carta)BJController.baralho.get(0);
        assertFalse(d.equals(c));
        assertEquals(BJController.baralho.size(),48);
    }

    /**
     * Test of verCartasRestantesOrdenadas method, of class BlackJackController.
     */
    @Test
    public void testVerCartasRestantesOrdenadas() {
        assertEquals(BJController.baralho.size(),0);
    
        BJController.adicionaCartas();
        Carta c = (Carta)BJController.baralho.get(0);
        Carta d = (Carta)BJController.baralho.get(0);
        assertTrue(d.equals(c));
        assertEquals(BJController.baralho.size(),52);
        
        BJController.embaralha();
        
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        
        d = (Carta)BJController.baralho.get(0);
        assertFalse(d.equals(c));
        assertEquals(BJController.baralho.size(),48);
        
        BJController.verCartasRestantesOrdenadas();
    }

    /**
     * Test of partidaGanha method, of class BlackJackController.
     */
    @Test
    public void testPartidaGanha() {
        BJController.partidaGanha(j0, 1);
        assertEquals(50,j0.getPontuacao());
        
        BJController.partidaGanha(j1, 2);
        BJController.partidaGanha(j2, 2);
        assertEquals(25,j1.getPontuacao());
        assertEquals(25,j2.getPontuacao());
    }

    /**
     * Test of pushCarta method, of class BlackJackController.
     */
    @Test
    public void testPushCarta() {
        BJController.adicionaCartas();
        BJController.embaralha();
        assertEquals(BJController.baralho.size(),52);
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        BJController.pushCarta();
        assertEquals(BJController.baralho.size(),48);
    }

    /**
     * Test of reiniciarBaralho method, of class BlackJackController.
     */
    @Test
    public void testReiniciarBaralho() {
        BJController.adicionaCartas();
        BJController.embaralha();
        assertEquals(BJController.baralho.size(),52);
        
        Carta c0 = (Carta)BJController.baralho.toRemoveStart();
        Carta c1 = (Carta)BJController.baralho.toRemoveStart();
        Carta c2 = (Carta)BJController.baralho.toRemoveStart();
        Carta c3 = (Carta)BJController.baralho.toRemoveStart();
        
        LinkedList resto = new LinkedList();
        resto.addStart(c0);
        resto.addStart(c1);
        resto.addStart(c2);
        resto.addStart(c3);
        
        assertEquals(BJController.baralho.size(),48);
        BJController.reiniciarBaralho(resto);
        assertEquals(BJController.baralho.size(),52);
    }

    /**
     * Test of resgataCarta method, of class BlackJackController.
     */
    @Test
    public void testResgataCarta() {
        BJController.adicionaCartas();
        
        LinkedList resgate = BJController.getBaralho();
        Carta c = (Carta) BJController.baralho.get(0);
        BJController.resgataCarta(0, resgate);
        assertTrue(c.equals(resgate.get(0)));
    }

    /**
     * Test of verificaValor method, of class BlackJackController.
     */
    @Test
    public void testVerificaValor() {
        BJController.adicionaCartas();
        Carta c = (Carta) BJController.pushCarta();
        Carta b = (Carta) BJController.pushCarta();
        
        assertEquals(c.getNumero(),13);
        assertEquals(b.getNumero(),12);
        
        int valor = BJController.verificaValor(c.getNumero(), b.getNumero());
        assertEquals(valor,10);
        
        valor = BJController.verificaValor(1, 13);
        
        assertEquals(valor,11);
    }

    /**
     * Test of transformaNumero method, of class BlackJackController.
     */
    @Test
    public void testTransformaNumero() {
        BJController.adicionaCartas();
        Carta c = (Carta) BJController.pushCarta();
        Carta b = (Carta) BJController.pushCarta();
        
        assertEquals(c.getNumero(),13);
        assertEquals(b.getNumero(),12);
        
        int valor = BJController.transformaNumero(b.getNumero());
        assertEquals(valor,10);
        
        valor = BJController.transformaNumero(c.getNumero());
        assertEquals(valor,10);
    }

    /**
     * Test of estouro method, of class BlackJackController.
     */
    @Test
    public void testEstouro() {
        j0.setTotalDaMao(21);
        j1.setTotalDaMao(22);
        
        assertFalse(BJController.estouro(j0.getTotalDaMao()));
        assertTrue(BJController.estouro(j1.getTotalDaMao()));
    }

    /**
     * Test of getBaralho method, of class BlackJackController.
     */
    @Test
    public void testGetBaralho() {
        assertEquals(BJController.getBaralho(),BJController.baralho);
    }

    /**
     * Test of getResto method, of class BlackJackController.
     */
    @Test
    public void testGetResto() {
        assertEquals(BJController.getResto(),BJController.resto);
    }
    
}
