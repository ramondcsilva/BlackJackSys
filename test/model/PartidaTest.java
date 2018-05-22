package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartidaTest {
    private Partida p;
    
    @Before
    public void setUp() {
        p = new Partida();
    }

    @Test
    public void testBasic() {
        p.setPonto(34);
        p.setRodada(6);
        assertEquals(p.getPonto(),34);
        assertEquals(p.getRodada(),6);
        
        Jogador j0 =  new Jogador();
        Jogador j1 = new Jogador();
        
        p.setJogador(0, j0);
        p.setJogador(1, j1);
        assertEquals(p.getJogador(0),j0);
        assertEquals(p.getJogador(1),j1);
        
        Jogador[] jogadores = new Jogador[2];
        
        jogadores[0] = j0;
        jogadores[1] = j1;
        
        p.setJogador(jogadores);
        Assert.assertArrayEquals(jogadores,p.getJogador());
        
        Partida temp = new Partida();
        
        temp.setPonto(34);
        temp.setRodada(6);
        assertEquals(temp.getPonto(),34);
        assertEquals(temp.getRodada(),6);
        
        temp.setJogador(0, j0);
        temp.setJogador(1, j1);
        assertEquals(temp.getJogador(0),j0);
        assertEquals(temp.getJogador(1),j1);
        
        temp.setJogador(jogadores);
        Assert.assertArrayEquals(p.getJogador(),temp.getJogador());
        
        temp.setPonto(30);
        temp.setRodada(3);
        assertFalse(temp.equals(p));
    }
}