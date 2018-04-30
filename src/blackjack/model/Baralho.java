package blackjack.model;

import blackjack.util.LinkedList;

public class Baralho{
    private LinkedList cartas;
    
    public Baralho(LinkedList cartas) {
        this.cartas = cartas;
    }
    
    public LinkedList getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList cartas) {
        this.cartas = cartas;
    }
}