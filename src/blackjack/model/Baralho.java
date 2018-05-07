package model;


import util.LinkedList;
import util.Stack;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baralho {

    private LinkedList cartas;

    public Baralho(LinkedList cartas) {
        this.cartas = cartas;
    }

    public Baralho() {
        cartas = new LinkedList();
        fillBaralho();
    }

    public LinkedList getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList cartas) {
        this.cartas = cartas;
    }

    /**
     * Preenche o baralho com as cartas 52 cartas padrão, seus numeros e naipes,
     * em ordem;
     * Presume que a lista de cartas está inicializada. (TODO: Adicionar
     * possivel try)
     */
    public final void fillBaralho() {
        /*saltos de 13 em 13 para manter uma contagem ininterrupta*/
        for (int i = 0; i < 52; i = i + 13) {
            for (int j = 1; j <= 13; j++) {
                Carta carta = new Carta(j, i);

                cartas.addStart(carta);
            }
        }
    }
    /**
     * Escolhe uma carta aleatória baseada no numero fornecido pela ThreadLocalRandom
     * que gera uma série de numeros aleatórios a partir de valores internos da Thread
     * 
     * @return uma carta aleatoria do baralho
     */


    public Carta pickRandom() {
        return (Carta) cartas.get(ThreadLocalRandom.current().nextInt(52));
    }

    /**
     * Cria uma pilha com as cartas desse baralho embaralhadas, usa um método de
     * geração de lista de numeros aleatórios com o intervalo de indice das
     * cartas e troca as posicões das cartas baseando-se nessa sequencia de
     * numeros, se a mesma semente for usada, a mesma sequencia de numeros
     * acontecerá.
     * @param seed semente geradora de sequencia
     * @return pilha com cartas embaralhadas
     */


    public Stack stackRandom(long seed) {
        int[] rand = ThreadLocalRandom.current().ints(52, 0, 52).toArray();
        Carta[] arr = (Carta[]) cartas.toArray();
        Stack ret = new Stack();
        for (int i = 0; i < arr.length; i++) {
            Carta aux = arr[i];
            arr[i] = arr[rand[i]];
            arr[rand[i]] = aux;
        }
        for (Carta arr1 : arr) {
            ret.push(arr1);
        }
        return ret;
    }
}

