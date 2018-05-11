package model;

import util.Stack;

public class Partida {
    private Jogador[] jogador;
    private Stack monte;
    private Baralho baralho;
    private int rodada;
    private int ponto;

    public Partida() {
        this.rodada = 0;
        this.ponto = 0;
        this.jogador = new Jogador[5];
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

    /**
     * Get the value of baralho
     *
     * @return the value of baralho
     */
    public Baralho getBaralho() {
        return baralho;

    }

    /**
     * Set the value of baralho
     *
     * @param baralho new value of baralho
     */
    public void setBaralho(Baralho baralho) {
        this.baralho = baralho;
    }

    /**
     * Get the value of monte
     *
     * @return the value of monte
     */
    public Stack getMonte() {
        return monte;
    }

    /**
     * Set the value of monte
     *
     * @param monte new value of monte
     */
    public void setMonte(Stack monte) {
        this.monte = monte;
    }

    /**
     * Get the value of jogador
     *
     * @return the value of jogador
     */
    public Jogador[] getJogador() {
        return jogador;
    }

    /**
     * Set the value of jogador
     *
     * @param jogador new value of jogador
     */
    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }

    /**
     * Get the value of jogador at specified index
     *
     * @param index the index of jogador
     * @return the value of jogador at specified index
     */
    public Jogador getJogador(int index) {
        return this.jogador[index];
    }

    /**
     * Set the value of jogador at specified index.
     *
     * @param index the index of jogador
     * @param jogador new value of jogador at specified index
     */
    public void setJogador(int index, Jogador jogador) {
        this.jogador[index] = jogador;

    }

}
