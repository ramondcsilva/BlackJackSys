package model;

/**
 *
 * @author jaca
 */
public class Croupier extends Jogador{
    private Carta cartaDoTopo;

    /**
     *
     * @return
     */
    public Carta getCartaDoTopo() {
        return cartaDoTopo;
    }

    /**
     *
     * @param cartaDoTopo
     */
    public void setCartaDoTopo(Carta cartaDoTopo) {
        this.cartaDoTopo = cartaDoTopo;
    }
}