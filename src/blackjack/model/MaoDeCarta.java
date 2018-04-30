package blackjack.model;

public class MaoDeCarta{
    private Carta cartaNaMao;

    public MaoDeCarta(Carta cartaNaMao){
        this.cartaNaMao = cartaNaMao;
    }
    
    public Carta getCartaNaMao(){
        return cartaNaMao;
    }

    public void setCartaNaMao(Carta cartaNaMao){
        this.cartaNaMao = cartaNaMao;
    }
}