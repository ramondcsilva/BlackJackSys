package blackjack.model;

import blackjack.util.LinkedList;
import blackjack.util.Stack;
import java.util.Random;

public class Baralho {

    private LinkedList cartas;

    public Baralho(LinkedList cartas) {
        this.cartas = cartas;
    }

    public Baralho() {
        cartas = new LinkedList();
        fillBaralho();
    }

    public LinkedList getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList cartas) {
        this.cartas = cartas;
    }

    /**
     * Preenche o baralho com as cartas 52 cartas padrão, seus numeros e naipes,
     * em ordem;
     * 
     * Presume que a lista de cartas está inicializada. (TODO: Adicionar possivel try)
     */
    public final void fillBaralho() {
        /*saltos de 13 em 13 para manter uma contagem ininterrupta*/
        for (int i = 0; i < 52; i = i + 13) {
            for (int j = 1; j <= 13; j++) {
                Carta carta = new Carta(j, i);
                cartas.addLast(carta);
            }
        }
    }
    
    public Carta pickRandom(long seed){
        Random rand = new Random(seed);
        return (Carta) cartas.get(rand.nextInt(52));
    }
    
    
}

