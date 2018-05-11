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
     * @return naipe.
     */    
    public String getUser() {
        return user;
    }
    /**
     * Modifica o user do objeto.
     * @param user 
     */
    public void setUser(String user) {
        this.user = user;
    }
    /**
     * Pega o password do objeto.
     * @return naipe.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Modifica o password do objeto.
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Pega a maoDeCarta do objeto.
     * @return naipe.
     */
    public MaoDeCarta getMaoAtual() {
        return MaoAtual;
    }
    /**
     * Modifica o maoAtual do objeto.
     * @param MaoAtual 
     */
    public void setMaoAtual(MaoDeCarta MaoAtual) {
        this.MaoAtual = MaoAtual;
    }
    /**
     * Pega o totalDaMao do objeto.
     * @return naipe.
     */
    public int getTotalDaMao() {
        return totalDaMao;
    }
    /**
     * Modifica o totalDaMao do objeto.
     * @param totalMao
     */
    public void setTotalDaMao(int totalMao) {
        this.totalDaMao = totalDaMao + totalMao;
    }
    /**
     * Pega o pontuação do objeto.
     * @return naipe.
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
     * @return naipe.
     */
    public int getPartidasVencidas() {
        return partidasVencidas;
    }   
    /**
     * Modifica a partidasVencidas do objeto.
     * @param partidasVencidas 
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