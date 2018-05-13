package model;

import java.util.Objects;

public class Jogador{
    private String user;
    private String password;
    private MaoDeCarta MaoAtual;
    private int totalDaMao;
    private int pontuacao;
    private int partidasVencidas;
    
    public Jogador(){
        this.totalDaMao = 0;
        this.pontuacao = 0;
        this.partidasVencidas = 0;
        this.MaoAtual = new MaoDeCarta();
    }
    /**
     * Pega o user do objeto.
     * @return o nome do jogador.
     */    
    public String getUser() {
        return user;
    }
    /**
     * Modifica o user do objeto.
     * @param o nome do jogador
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Pega a senha do objeto.
     * @return a senha do jogador.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica o senha do objeto.
     * @param a nova senha do jogador
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Pega a maoDeCarta do objeto.
     * @return a mão de carta do jogador.
     */
    public MaoDeCarta getMaoAtual() {
        return MaoAtual;
    }

    /**
     * Modifica o maoAtual do objeto.
     * @param a mão atual do jogador
     */
    public void setMaoAtual(MaoDeCarta MaoAtual) {
        this.MaoAtual = MaoAtual;
    }

    /**
     * Pega a pontuação total do jogador.
     * @return a pontuação total do jogador
     */
    public int getTotalDaMao() {
        return totalDaMao;
    }

    /**
     * Modifica a pontuação total do jogador.
     * @param pontos a serem adicionados
     */
    public void setTotalDaMao(int totalMao) {
        this.totalDaMao = totalDaMao + totalMao;
    }
    /**
     * Pega o pontuação do objeto.
     * @return a pontuação.
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Modifica a pontuação do objeto.
     * @param pontuacao 
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Pega o partidasVencidas do objeto.
     * @return o numero de partidas vencidas.
     */
    public int getPartidasVencidas() {
        return partidasVencidas;
    }   
    /**
     * Modifica o numero de partidas vencidas do objeto.
     * @param o numero de partidas vencidas
     */
    public void setPartidasVencidas(int partidasVencidas) {
        this.partidasVencidas = partidasVencidas;
    }

    /**
     * Compara objetos.
     * @param obj
     * @return Boolean.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return user;
    }

}