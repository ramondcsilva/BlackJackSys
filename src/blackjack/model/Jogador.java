package blackjack.model;

import java.util.Objects;

public class Jogador{
    private String user;
    private String password;
    private MaoDeCarta MaoAtual;
    private int totalDaMao;
    private int pontuacao;
    private int partidasVencidas;
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MaoDeCarta getMaoAtual() {
        return MaoAtual;
    }

    public void setMaoAtual(MaoDeCarta MaoAtual) {
        this.MaoAtual = MaoAtual;
    }

    public int getTotalDaMao() {
        return totalDaMao;
    }

    public void setTotalDaMao(int totalDaMao) {
        this.totalDaMao = totalDaMao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPartidasVencidas() {
        return partidasVencidas;
    }

    public void setPartidasVencidas(int partidasVencidas) {
        this.partidasVencidas = partidasVencidas;
    }

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