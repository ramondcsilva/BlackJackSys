package model;

import util.Stack;

/**
 *
 * @author jaca
 */
public class Partida {
    private Jogador[] jogador;
    private Stack monte;
    private int rodada;
    private int ponto;

    public Partida() {
        this.rodada = 0;
        this.ponto = 0;
        this.jogador = new Jogador[5];
    }

    /**
     * Instancia uma Partida com um monte composto de uma pilha embaralhada por
     * um baralho externo bem como configura o baralho interno
     *
     * @param baralho o baralho a ser utilizado
     */
    public Partida(Baralho baralho) {
        this.monte = baralho.stackRandom();
    }

    /**
     * Inicializa uma partida com identificadores de rodada, pontos e os Jogadores
     * participantes.
     * 
     * @param rodada
     * @param ponto
     * @param jogador
     */
    public Partida(int rodada, int ponto, Jogador[] jogador) {
        this.rodada = rodada;
        this.ponto = ponto;
        this.jogador = jogador;
    }

    /**
     * Captura o valor de Rodada
     * 
     * @return o valor de Rodada
     */
    public int getRodada() {
        return rodada;
    }

    /**
     * Configura o novo valor de Rodada
     * 
     * @param rodada novo valor de Rodada
     */
    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    /**
     * Captura o valor de Pontos da Partida
     * 
     * @return o valor de Pontos da Partida
     */
    public int getPonto() {
        return ponto;
    }

    /**
     * Configura o valor dos Pontos da Partida
     * 
     * @param ponto novo valor dos Pontos da Partida
     */
    public void setPonto(int ponto) {
        this.ponto = ponto;
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
