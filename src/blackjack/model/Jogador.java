package model;

import java.util.Objects;

public class Jogador{
    private String user;
    private String password;
    private MaoDeCarta MaoAtual;
    private int totalDaMao;
    private int pontuacao;
    private int partidasVencidas;
    
    /**
     * Captura o nome de Usuário
     * 
     * @return o nome do Usuário
     */
    public String getUser() {
        return user;
    }

    /**
     * Configura o nome de Usuário
     * 
     * @param user o novo nome de Usuário
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Captura a senha do Usuário
     * 
     * @return a senha do Usuário
     */
    public String getPassword() {
        return password;
    }

    /**
     * Configura a senha do Usuário
     * 
     * @param password a nova senha do Usuário
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna a Mão de Cartas atual do usuário
     * 
     * @return a mão de cartas atual
     */
    public MaoDeCarta getMaoAtual() {
        return MaoAtual;
    }

    /**
     * Configura a mão de cartas atual do Usuário
     * 
     * @param MaoAtual a nova mão de cartas do Jogador
     */
    public void setMaoAtual(MaoDeCarta MaoAtual) {
        this.MaoAtual = MaoAtual;
    }

    /**
     *
     * @return
     */
    public int getTotalDaMao() {
        return totalDaMao;
    }

    /**
     *
     * @param totalDaMao
     */
    public void setTotalDaMao(int totalDaMao) {
        this.totalDaMao = totalDaMao;
    }

    /**
     *
     * @return
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     *
     * @param pontuacao
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     *
     * @return
     */
    public int getPartidasVencidas() {
        return partidasVencidas;
    }

    /**
     *
     * @param partidasVencidas
     */
    public void setPartidasVencidas(int partidasVencidas) {
        this.partidasVencidas = partidasVencidas;
    }

    /**
     *
     * @param obj
     * @return
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
}