package model;

public class Partida {
    private Jogador[] jogador;
    private int rodada;
    private int ponto;

    public Partida() {
        this.rodada = 0;
        this.ponto = 0;
        this.jogador = new Jogador[5];
    }
    /**
     * Pega a rodada da Partida.
     * @return rodada. 
     */
    public int getRodada() {
        return rodada;
    }
    /**
     * Modifica a rodada da Partida.
     * @param rodada 
     */
    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    /**
     * Pega o ponto da Partida.
     * @return ponto.
     */    
    public int getPonto() {
        return ponto;
    }
    
    /**
     * Modifica o ponto da Partida.
     * @param ponto 
     */
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    /**
     * Pega o Jogador da partida.
     * @return jogador.
     */
    public Jogador[] getJogador() {
        return jogador;
    }

    /**
     * Modifica o jogador da Partida.
     * @param jogador
     */
    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }

    /**
     * Modifica o jogador especifico da partida.
     * @param index
     * @return jogador.
     */
    public Jogador getJogador(int index) {
        return this.jogador[index];
    }

    /**
     * Modifica o jogador da partida a partir de um index.
     * @param index
     * @param jogador
     */
    public void setJogador(int index, Jogador jogador) {
        this.jogador[index] = jogador;
    }
}