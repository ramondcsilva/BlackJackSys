package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogadorTest {
    private Jogador j;

    @Before
    public void setUp() {
        j = new Jogador();
    }
    
    @Test
    public void testBasic(){
        j.setUser("Ramon");
        j.setPassword("12345678");
        assertEquals(j.getUser(),"Ramon");
        assertEquals(j.getPassword(),"12345678");
        j.setPontuacao(86);
        j.setPartidasVencidas(3);
        j.setTotalDaMao(17);
        
        Carta a = new Carta(3,4);
        Carta b = new Carta(7,6);
        
        MaoDeCarta mao = new MaoDeCarta();
        
        mao.addCarta(a);
        mao.addCarta(b);
        j.setMaoAtual(mao);
        
        assertEquals(j.getPontuacao(),86);
        assertEquals(j.getPartidasVencidas(),3);
        assertEquals(j.getTotalDaMao(),17);
        assertTrue(j.getMaoAtual().equals(mao));
        Jogador temp =  new Jogador();
        
        temp.setUser("Ramon");
        temp.setPassword("12345678");
        assertEquals(j.getUser(),temp.getUser());
        assertEquals(j.getPassword(),temp.getPassword());
        temp.setPontuacao(86);
        temp.setPartidasVencidas(3);
        temp.setTotalDaMao(17);
        assertEquals(temp.getPontuacao(),86);
        assertEquals(temp.getPartidasVencidas(),3);
        assertEquals(temp.getTotalDaMao(),17);
        temp.setMaoAtual(mao);
        assertTrue(temp.equals(j));
        
        temp.setUser("Junior");
        temp.setPassword("34334525");
        temp.setPontuacao(56);
        temp.setPartidasVencidas(8);
        temp.setTotalDaMao(19);
        assertFalse(temp.equals(j));
        
        temp.setUser("Ramon");
        temp.setPassword("12345678");
        temp.setPontuacao(86);
        temp.setPartidasVencidas(-8);
        temp.setTotalDaMao(-19);
        assertTrue(temp.equals(j));
    }
}