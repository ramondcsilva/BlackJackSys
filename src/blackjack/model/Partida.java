package model;

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
     * @return o valor de Rodada
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