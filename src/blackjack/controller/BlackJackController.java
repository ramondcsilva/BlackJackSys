/*  ******************************************************************************
 *  Autor: Sergio e Ramon
 *  Componente curricular: Módulo Integrador de Programação
 *  Concluido em: 
 *  Declaro que este código foi elaborado por mim de forma individual e não contém
 *  nenhum trecho de código de outro colega ou de outro autor, tais como provindos
 *  de livros e apostilas, e páginas ou documentos eletrônicos da Internet.
 *  Qualquer trecho de código de outra autoria que não a minha está destacado com
 *  uma citação para o autor e a fonte do código, e estou ciente que estes trechos
 *  não serão considerados para fins de avaliação.
 *  ******************************************************************************/
package controller;

import util.Iterator;
import util.LinkedList;
import model.*;

public class BlackJackController {
    Baralho cartas;
    LinkedList baralho;

    public BlackJackController() {
        this.baralho = new LinkedList();
        this.cartas = new Baralho(baralho);
    }

    /**
     * Adiciona todas as cartas ao Baralho.
     */
    public void adicionaCartas() {
        cartas = new Baralho();
        baralho = cartas.getCartas();
    }

    /**
     * Embaralha o baralho.
     */
    public void embaralha() {
        baralho = cartas.listRandom();
    }
    /**
     * Lista as cartas do baralho a partir de seu iterator.
     */
    public void verCartasRestantes() {
        Iterator iterator = baralho.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            Carta carta = (Carta) iterator.next();
            if (i%13 == 0) {
                switch (carta.getNaipe()) {
                    case 0:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("A");
                                break;
                            case 11:
                                System.out.print("J");
                                break;
                            case 12:
                                System.out.print("Q");
                                break;
                            case 13:
                                System.out.print("K");
                                break;
                            default:
                                System.out.print(carta.getNumero());
                        }
                        System.out.println("♣");
                        break;
                    case 13:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                break;
                            case 11:
                                System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                break;
                            case 12:
                                System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                break;
                            case 13:
                                System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                break;
                            default:
                                System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                        }
                        System.out.println("\u001B[31m"+"♦"+"\u001B[0m");
                        break;
                    case 26:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                break;
                            case 11:
                                System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                break;
                            case 12:
                                System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                break;
                            case 13:
                                System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                break;
                            default:
                                System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                        }
                        System.out.println("\u001B[31m"+"♥"+"\u001B[0m");
                        break;
                    case 39:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("A");
                                break;
                            case 11:
                                System.out.print("J");
                                break;
                            case 12:
                                System.out.print("Q");
                                break;
                            case 13:
                                System.out.print("K");
                                break;
                            default:
                                System.out.print(carta.getNumero());
                        }
                        System.out.println("♠");
                        break;
                }
            } else {
                switch (carta.getNaipe()) {
                    case 0:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("A");
                                break;
                            case 11:
                                System.out.print("J");
                                break;
                            case 12:
                                System.out.print("Q");
                                break;
                            case 13:
                                System.out.print("K");
                                break;
                            default:
                                System.out.print(carta.getNumero());
                        }
                        System.out.print("♣");
                        break;
                    case 13:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                break;
                            case 11:
                                System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                break;
                            case 12:
                                System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                break;
                            case 13:
                                System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                break;
                            default:
                                System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                        }
                        System.out.print("\u001B[31m"+"♦"+"\u001B[0m");
                        break;
                    case 26:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                break;
                            case 11:
                                System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                break;
                            case 12:
                                System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                break;
                            case 13:
                                System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                break;
                            default:
                                System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                        }
                        System.out.print("\u001B[31m"+"♥"+"\u001B[0m");
                        break;
                    case 39:
                        switch (carta.getNumero()) {
                            case 1:
                                System.out.print("A");
                                break;
                            case 11:
                                System.out.print("J");
                                break;
                            case 12:
                                System.out.print("Q");
                                break;
                            case 13:
                                System.out.print("K");
                                break;
                            default:
                                System.out.print(carta.getNumero());
                        }
                        System.out.print("♠");
                        break;
                }
            }
        }
    }
    /**
     * Adiciona todo baralho em um vetor, ordenando com o QuickSort,
     * imprimindo as cartas do baralho ordenadas a partir de seu identificador (Naipe+Numero)
     *  resgatadas.
     */
    public void verCartasRestantesOrdenadas() {
        LinkedList ordenada = baralho;
        int[] array = new int[baralho.size()];
        int i = 0;
        
        while (i < array.length) {
            Carta a = (Carta) ordenada.toRemoveStart();
            array[i++] = (a.getNaipe() + a.getNumero());
            ordenada.addLast(a);
        }
        quickSort(array, 0, baralho.size() - 1);
        i = 0;
        while (i < array.length) {
            resgataCarta(array[i],ordenada);
            i++;
            
        }
    }

    public void partidaGanha(Jogador vencedor, int vencedores) {
        int i = vencedor.getPontuacao();
        vencedor.setPontuacao(i + (50/vencedores));
    }
    
    /**
     * Metodo de ordenação QuickSort, Dividir para conquista
     * , selecionando um pivot, e separa o conjunto de dados em	três	
     * sub-conjuntos:  valores menores que o pivot,	
     * , valores iguais ao pivot	
     * , valores maiores que o pivot.
     * , repetindo o mesmo procedimento nos demais	
     * subconjuntos (exceto o de iguais).	
     * QuickSort
     * @param v
     * @param esquerda
     * @param direita 
     */
    public static void quickSort(int v[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        while (esq <= dir) {
            while (v[esq] < pivo) {
                esq = esq + 1;
            }
            while (v[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda) {
            quickSort(v, esquerda, dir);
        }
        if (esq < direita) {
            quickSort(v, esq, direita);
        }
    }

    /**
     * Pega a carta do topo do baralho.
     * @return carta
     */
    public Object pushCarta() {
        Object carta = baralho.toRemoveStart();
        return carta;
    }
    
    /**
     * Retorna todas cartas utilizadas do Stack para o baralho principal.
     * @param n 
     */
    public void reiniciarBaralho(LinkedList n) {
        if (!n.isEmpty()) {
            while (n.size() > 0) {
                Object m = n.toRemoveStart();
                baralho.addLast(m);
            }
        }
    }

    /**
     * Procura um objeto carta a partir de seu identificador (Naipe+Numero),
     * na LinkedList do parametro.
     * @param i
     * @param resgate
     * @return carta encontrada.
     */
    public Object resgataCarta(int i, LinkedList resgate){
        Iterator iterator = resgate.iterator();
        while (iterator.hasNext()) {
            Carta carta = (Carta) iterator.next();
            if((carta.getNaipe()+carta.getNumero())== i){    
                if ((carta.getNumero() == 13)) {
                    switch (carta.getNaipe()) {
                        case 0:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("A");
                                    break;
                                case 11:
                                    System.out.print("J");
                                    break;
                                case 12:
                                    System.out.print("Q");
                                    break;
                                case 13:
                                    System.out.print("K");
                                    break;
                                default:
                                    System.out.print(carta.getNumero());
                            }
                            System.out.println("♣");
                            break;
                        case 13:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                    break;
                                case 11:
                                    System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                    break;
                                case 12:
                                    System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                    break;
                                case 13:
                                    System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                    break;
                                default:
                                    System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                            }
                            System.out.println("\u001B[31m"+"♦"+"\u001B[0m");
                            break;
                        case 26:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                    break;
                                case 11:
                                    System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                    break;
                                case 12:
                                    System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                    break;
                                case 13:
                                    System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                    break;
                                default:
                                    System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                            }
                            System.out.println("\u001B[31m"+"♥"+"\u001B[0m");
                            break;
                        case 39:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("A");
                                    break;
                                case 11:
                                    System.out.print("J");
                                    break;
                                case 12:
                                    System.out.print("Q");
                                    break;
                                case 13:
                                    System.out.print("K");
                                    break;
                                default:
                                    System.out.print(carta.getNumero());
                            }
                            System.out.println("♠");
                            break;
                    }
                } else {
                    switch (carta.getNaipe()) {
                        case 0:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("A");
                                    break;
                                case 11:
                                    System.out.print("J");
                                    break;
                                case 12:
                                    System.out.print("Q");
                                    break;
                                case 13:
                                    System.out.print("K");
                                    break;
                                default:
                                    System.out.print(carta.getNumero());
                            }
                            System.out.print("♣");
                            break;
                        case 13:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                    break;
                                case 11:
                                    System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                    break;
                                case 12:
                                    System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                    break;
                                case 13:
                                    System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                    break;
                                default:
                                    System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                            }
                            System.out.print("\u001B[31m"+"♦"+"\u001B[0m");
                            break;
                        case 26:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("\u001B[31m"+"A"+"\u001B[0m");
                                    break;
                                case 11:
                                    System.out.print("\u001B[31m"+"J"+"\u001B[0m");
                                    break;
                                case 12:
                                    System.out.print("\u001B[31m"+"Q"+"\u001B[0m");
                                    break;
                                case 13:
                                    System.out.print("\u001B[31m"+"K"+"\u001B[0m");
                                    break;
                                default:
                                    System.out.print("\u001B[31m"+carta.getNumero()+"\u001B[0m");
                            }
                            System.out.print("\u001B[31m"+"♥"+"\u001B[0m");
                            break;
                        case 39:
                            switch (carta.getNumero()) {
                                case 1:
                                    System.out.print("A");
                                    break;
                                case 11:
                                    System.out.print("J");
                                    break;
                                case 12:
                                    System.out.print("Q");
                                    break;
                                case 13:
                                    System.out.print("K");
                                    break;
                                default:
                                    System.out.print(carta.getNumero());
                            }
                            System.out.print("♠");
                            break;
                    }
                }
                return carta;
            }    
        }
        return null;
    }
    
    /**
     * Verifica o caso de pegar um Ás e um letra(Valete,Damas,Rei).
     * Obtendo o valor 21.
     * @param numeroDaCarta
     * @param numeroDaCarta2
     * @return pontuacao 21
     */
    public int verificaValor(int numeroDaCarta, int numeroDaCarta2){
        int valor = 0;
        switch(numeroDaCarta){
            case 10:
            case 11:
            case 12:
            case 13:
                valor = 10;
            break;
        }
        switch(numeroDaCarta2){
            case 10:
            case 11:
            case 12:
            case 13:
                valor = 10;
            break;
        }
        if(numeroDaCarta != 10 && valor==10 || numeroDaCarta2 != 10 && valor==10){
            switch(numeroDaCarta){
                case 1:
                    valor = 11;
                    break;
            }
            switch(numeroDaCarta2){
                case 1:
                    valor = 11;
                    break;
            }
        }
        return valor;
    }
    
    /**
     * Transformas as cartas especiais para um mesmo valor.
     * @param numero
     * @return valor da carta. 
     */
    public int transformaNumero(int numero){
        int valor = numero;
        switch(numero){
            case 10:
            case 11:
            case 12:
            case 13:
                valor = 10;
            break;
        }
        return valor;
    }
    
    /**
     * Verifica se o total de pontos ultrapassou 21.
     * @param totalpontos
     * @return Boolean
     */
    public boolean estouro(int totalpontos){
        if(totalpontos > 21){
            return true;
        }
        return false;
    }
    
    /**
     * Pega a LinkedList do BlackJackController.
     * @return LinkedList do baralho.
     */
    public LinkedList getBaralho() {
        return baralho;
    }
    
}
