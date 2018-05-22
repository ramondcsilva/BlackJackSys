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
