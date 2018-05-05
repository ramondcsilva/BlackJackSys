/*
 *  ******************************************************************************
 *  Autor: 
 *  Componente curricular: Módulo Integrador de Programação
 *  Concluido em: 
 *  Declaro que este código foi elaborado por mim de forma individual e não contém
 *  nenhum trecho de código de outro colega ou de outro autor, tais como provindos
 *  de livros e apostilas, e páginas ou documentos eletrônicos da Internet.
 *  Qualquer trecho de código de outra autoria que não a minha está destacado com
 *  uma citação para o autor e a fonte do código, e estou ciente que estes trechos
 *  não serão considerados para fins de avaliação.
 *  ******************************************************************************
 */
package blackjack.controller;

import blackjack.model.*;
import blackjack.util.*;

public class BlackJackController {

    Baralho cartas;
    LinkedList baralho;

    public BlackJackController() {
        this.cartas = new Baralho(baralho);
        this.baralho = new LinkedList();
    }

    public void novaJogada() {

    }

    public void pararJogada() {

    }

    public void verCartasRestantes() {

    }

    public void verCartasRestantesOrdenadas() {

    }

    public void placarGeral() {

    }

    public void adicionaCartas() {
        cartas = new Baralho();
        baralho = cartas.getCartas();
    }

    public void imprime() {
        int i = 51;
        while (i >= 0) {
            Carta b = (Carta) cartas.getCartas().get(i);
            System.out.print(b.toString() + " ");
            if ((i%13)==0)
                System.out.println();
            i--;
        }
        Carta rand = cartas.pickRandom(4);
        System.out.println("Randomica: " + rand.toString());
    }
}
