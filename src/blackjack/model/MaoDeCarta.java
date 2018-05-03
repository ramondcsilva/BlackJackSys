package blackjack.model;

import blackjack.util.LinkedList;

public class MaoDeCarta{
    private LinkedList artasNaMao;

    public MaoDeCarta(LinkedList artasNaMao) {
        this.artasNaMao = artasNaMao;
    }

    public LinkedList getArtasNaMao() {
        return artasNaMao;
    }

    public void setArtasNaMao(LinkedList artasNaMao) {
        this.artasNaMao = artasNaMao;
    }
}