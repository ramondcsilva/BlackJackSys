package blackjack.model;

import blackjack.util.LinkedList;

public class Partida{
    private int rodada;
    private int ponto;
    private LinkedList jogadores;

    public Partida(int rodada, int ponto, LinkedList jogadores) {
        this.rodada = rodada;
        this.ponto = ponto;
        this.jogadores = jogadores;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public LinkedList getJogadores() {
        return jogadores;
    }

    public void setJogadores(LinkedList jogadores) {
        this.jogadores = jogadores;
    }
}