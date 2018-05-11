package model;

import util.LinkedList;
import util.Stack;
import java.util.concurrent.ThreadLocalRandom;


public class Baralho {

    private LinkedList cartas;

    /**
     * Inicializa a lista de cartas com uma lista externa
     *
     * @param cartas lista de cartas do baralho
     */
    public Baralho(LinkedList cartas) {
        this.cartas = cartas;
    }

    /**
     * Inicializa o baralho com as cartas padrão ordenadas
     *
     */
    public Baralho() {
        cartas = new LinkedList();
        fillBaralho();
    }

    /**
     * Captura a lista de cartas do Baralho
     * 
     * @return lista de cartas
     */
    public LinkedList getCartas() {
        return cartas;
    }

    /**
     * Configura a lista de Cartas do baralho
     * 
     * @param cartas lista de cartas
     */
    public void setCartas(LinkedList cartas) {
        this.cartas = cartas;
    }

    /**
     * Preenche o baralho com as cartas 52 cartas padrão, seus numeros e naipes,
     * em ordem; Presume que a lista de cartas está inicializada. (TODO:
     * Adicionar possivel try)
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
     * Escolhe uma carta aleatória baseada no numero fornecido pela
     * ThreadLocalRandom que gera uma série de numeros aleatórios a partir de
     * valores internos da Thread
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
     * numeros
     *
     * @return array de objetos carta em ordem aleatória
     */
    public Object[] arrayRandom() {
        int[] rand = ThreadLocalRandom.current().ints(52, 0, 52).toArray();
        Object[] arr = cartas.toArray();
        for (int i = 0; i < arr.length; i++) {
            Object aux = arr[i];
            arr[i] = arr[rand[i]];
            arr[rand[i]] = aux;
        }
        return arr;
    }

    /**
     * Cria uma pilha com as cartas desse baralho embaralhadas, usa um método de
     * geração de lista de numeros aleatórios com o intervalo de indice das
     * cartas e troca as posicões das cartas baseando-se nessa sequencia de
     * numeros
     *
     * @return pilha com cartas embaralhadas
     */
    public Stack stackRandom() {
        Object[] arr = arrayRandom();
        Stack ret = new Stack();
        for (Object crt : arr) {
            ret.push(crt);
        }
        return ret;
    }

    /**
     * Cria uma lista com as cartas desse baralho embaralhadas, usa um método de
     * geração de lista de numeros aleatórios com o intervalo de indice das
     * cartas e troca as posicões das cartas baseando-se nessa sequencia de
     * numeros
     *
     * @return lista com cartas embaralhadas
     */
    public LinkedList listRandom() {
        Object[] arr = arrayRandom();
        LinkedList ret = new LinkedList();
        for (Object crt : arr) {
            ret.addLast(crt);
        }
        return ret;
    }
}
