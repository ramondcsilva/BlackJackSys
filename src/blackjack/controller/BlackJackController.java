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
package blackjack.controller;

import blackjack.util.*;
import blackjack.model.*;

public class BlackJackController {

    Baralho cartas;
    LinkedList baralho;
    Stack resto;
    
    public BlackJackController() {
        this.cartas = new Baralho(baralho);
        this.baralho = new LinkedList();
        this.resto = new Stack();
    }

    public Object novaJogada(){
        Object carta = cartas.getBaralho().toRemoveStart();
        resto.push(carta);
        return carta;
    }

    public void pararJogada(){
        if(!resto.isEmpty()){
            while(resto.size()>0){    
                Object n = resto.pop();
                baralho.addStart(n);
            }    
        }
    }

    public void verCartasRestantes() {
        Iterator iterator = baralho.iterator();

        while (iterator.hasNext()) {
            Carta b = (Carta) iterator.next();
            if (b.getNumero().equals("A")) {
                System.out.println(b);
            } else {
                System.out.print(b);
            }
        }
    }

    public void verCartasRestantesOrdenadas() {
        LinkedList ordenada = baralho;
        LinkedList n = new LinkedList();
        int[] array = new int[baralho.size()];
        int i = 0;
        
        while(i<ordenada.size()){
            Carta a = (Carta)ordenada.toRemoveStart();
            array[i++] = a.getId();
            ordenada.addLast(a);
        }
        quickSort(array,0,array.length-1);
        i = 0;
        while(i<array.length){
            Carta c = (Carta)baralho.get(array[i++]);
            n.addLast(c);
            if (c.getNumero().equals("A")) {
                System.out.println(c);
            } else {
                System.out.print(c);
            }
        }
        baralho = n;
    }

    public void placarGeral(Jogador vencedor) {
        int i = vencedor.getPontuacao();
        vencedor.setPontuacao(i + 50);
    }

    public void adicionaCartas() {
        String naipe = "";
        String numero = "";
        for (int i = 0; i <= 60; i = i + 20) {
            for (int j = 1; j <= 13; j++) {
                switch (i) {
                    case 0:
                        switch (j) {
                            case 1:
                                naipe = "♣";
                                numero = "A";
                                break;
                            case 11:
                                naipe = "♣";
                                numero = "J";
                                break;
                            case 12:
                                naipe = "♣";
                                numero = "Q";
                                break;
                            case 13:
                                naipe = "♣";
                                numero = "K";
                                break;
                            default:
                                naipe = "♣";
                                numero = String.valueOf(j);
                                break;
                        }
                        break;
                    case 20:
                        switch (j) {
                            case 1:
                                naipe = "♦";
                                numero = "A";
                                break;
                            case 11:
                                naipe = "♦";
                                numero = "J";
                                break;
                            case 12:
                                naipe = "♦";
                                numero = "Q";
                                break;
                            case 13:
                                naipe = "♦";
                                numero = "K";
                                break;
                            default:
                                naipe = "♦";
                                numero = String.valueOf(j);
                                break;
                        }
                        break;
                    case 40:
                        switch (j) {
                            case 1:
                                naipe = "♥";
                                numero = "A";
                                break;
                            case 11:
                                naipe = "♥";
                                numero = "J";
                                break;
                            case 12:
                                naipe = "♥";
                                numero = "Q";
                                break;
                            case 13:
                                naipe = "♥";
                                numero = "K";
                                break;
                            default:
                                naipe = "♥";
                                numero = String.valueOf(j);
                                break;
                        }
                        break;
                    case 60:
                        switch (j) {
                            case 1:
                                naipe = "♠";
                                numero = "A";
                                break;
                            case 11:
                                naipe = "♠";
                                numero = "J";
                                break;
                            case 12:
                                naipe = "♠";
                                numero = "Q";
                                break;
                            case 13:
                                naipe = "♠";
                                numero = "K";
                                break;
                            default:
                                naipe = "♠";
                                numero = String.valueOf(j);
                                break;
                        }
                        break;
                }
                Carta carta = new Carta(naipe, numero);
                carta.setId(baralho.size());
                baralho.addStart(carta);
            }
        }
        cartas.setBaralho(baralho);
    }

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

    public LinkedList getBaralho() {
        return baralho;
    }
    
    public void embaralha(){
    }
    
    public void reiniciarBaralho(Stack n){
        if(!n.isEmpty()){
            while(n.size()>0){    
                Object m = n.pop();
                baralho.addStart(m);
            }    
        }
    }
}
