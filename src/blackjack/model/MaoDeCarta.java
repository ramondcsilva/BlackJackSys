package model;

import util.LinkedList;

/**
 *
 * @author jaca
 */
public class MaoDeCarta {

    private LinkedList cartas;

    /**
     *
     * @param cartaNaMao
     */
    public MaoDeCarta(LinkedList cartaNaMao) {
        this.cartas = cartaNaMao;
    }

    /**
     * Entrega a lista de cartas na mão do jogador a quem a mão de cartas
     * pertence
     * @return LinkedList de cartas em mãos
     */
    public LinkedList getCartas() {
        return cartas;
    }

    /**
     * Configura a lista de cartas para a lista passada por parametro. Recebe e
     * armazena a referencia à lista passada no parametro da função;
     * @param cartas lista de cartas para a mão atual
     */
    public void setCartas(LinkedList cartas) {
        this.cartas = cartas;
    }

    /**
     * Adiciona uma carta à lista de cartas da mão do jogador quando este
     * solicita uma nova carta, ou ao receber alguma;
     * @param carta a ser adicionada à mão
     */
    public void addCarta(Carta carta) {
        this.cartas.addStart(carta);
    }

    /**
     * Limpa a mão de cartas do jogador;
     */
    public void clearCartas() {
        while(cartas.toRemoveLast() != null);
    }


}
