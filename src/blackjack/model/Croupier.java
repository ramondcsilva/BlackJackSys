package model;

/**
 *
 * @author jaca
 */
public class Croupier extends Jogador{
    private Carta cartaDoTopo;
    
    /**
     * Pega uma carta do objeto.
     * @return cartaDoTopo.
     */
    public Carta getCartaDoTopo() {
        return cartaDoTopo;
    }

    /**
     * Modifica a carta do objeto.
     * @param cartaDoTopo.
     */
    public void setCartaDoTopo(Carta cartaDoTopo) {
        this.cartaDoTopo = cartaDoTopo;
    }
}