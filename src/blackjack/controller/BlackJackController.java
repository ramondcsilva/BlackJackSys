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
import util.Stack;
import util.LinkedList;
import model.*;

public class BlackJackController {

    Baralho cartas;
    LinkedList baralho;
    Stack resto;

    public BlackJackController() {
        this.cartas = new Baralho(baralho);
        this.baralho = new LinkedList();
        this.resto = new Stack();
    }


    public Object novaJogada() {
        Object carta = cartas.getCartas().toRemoveStart();
        resto.push(carta);
        return carta;
    }

    public void pararJogada() {
        if (!resto.isEmpty()) {
            while (resto.size() > 0) {
                Object n = resto.pop();
                baralho.addLast(n);
            }
        }
    }

    public void adicionaCartas() {
        cartas = new Baralho();
        baralho = cartas.getCartas();
    }

    public void embaralha() {
        /*   Stack n = cartas.stackRandom(34534);
       LinkedList l = new LinkedList();
       while(!n.isEmpty()){
           Object data = n.pop();
           l.addStart(data);
       }
       
       baralho = l;
         */
    }

    public void verCartasRestantes() {
        Iterator iterator = baralho.iterator();
        while (iterator.hasNext()) {
            Carta b = (Carta) iterator.next();
            if ((b.getNumero() == 1)) {
                System.out.println(b);
            } else {
                System.out.print(b);
            }
        }
    }

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

    public void placarGeral(Jogador vencedor) {
        int i = vencedor.getPontuacao();
        vencedor.setPontuacao(i + 50);
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

    public Object pushCarta() {
        Object carta = cartas.getCartas().toRemoveStart();
        resto.push(carta);
        return carta;
    }

    public void reiniciarBaralho(Stack n) {
        if (!n.isEmpty()) {
            while (n.size() > 0) {
                Object m = n.pop();
                baralho.addLast(m);
            }
        }
    }

    public void imprime() {
        int i = 51;

        while (i >= 0) {
            Carta b = (Carta) cartas.getCartas().get(i);
            System.out.print(b.toString() + " ");
            if ((i % 13) == 0) {
                System.out.println();
            }
            i--;
        }  
        Carta rand = cartas.pickRandom();
        System.out.println("Randomica: " + rand.toString());
    }
    
    public Object resgataCarta(int i, LinkedList resgate){
        Iterator iterator = resgate.iterator();
        while (iterator.hasNext()) {
            Carta z = (Carta) iterator.next();
            if((z.getNaipe()+z.getNumero())== i){    
                if ((z.getNumero() == 13)) {
                    System.out.println(z);
                } else {
                    System.out.print(z);
                }
                return z;
            }    
        }
        return null;
    }
}
