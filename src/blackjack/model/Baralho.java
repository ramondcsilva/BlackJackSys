package blackjack.model;

import blackjack.util.LinkedList;

public class Baralho{
    private LinkedList baralho;
    
    public Baralho(LinkedList cartas) {
        this.baralho = cartas;
    }
    
    public LinkedList getBaralho() {
        return baralho;
    }

    public void setBaralho(LinkedList baralho) {
        this.baralho = baralho;
    }
}