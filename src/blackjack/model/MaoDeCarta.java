package blackjack.model;

import blackjack.util.Stack;

public class MaoDeCarta{
    private Stack artasNaMao;

    public MaoDeCarta(Stack artasNaMao) {
        this.artasNaMao = artasNaMao;
    }

    public Stack getArtasNaMao() {
        return artasNaMao;
    }

    public void setArtasNaMao(Stack artasNaMao) {
        this.artasNaMao = artasNaMao;
    }

}