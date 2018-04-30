package blackjack.controller;

import blackjack.model.*;
import blackjack.util.*;

public class BlackJackController {
    Baralho cartas;
    LinkedList baralho;

    public BlackJackController(){
        this.cartas = new Baralho(baralho);
        this.baralho = new LinkedList();
    }
    
    public void novaJogada(){
        
    }
    
    public void pararJogada(){
        
    }
    
    public void verCartasRestantes(){
        
    }
    
    public void verCartasRestantesOrdenadas(){
        
    }
    
    public void placarGeral(){
        
    }
    
    public void adicionaCartas(){
        for(int i = 0; i <= 60; i = i + 20){
            for(int j = 1; j <= 13; j++){
                Carta carta = new Carta(j,i);
                baralho.addLast(carta);
            }
        }
        cartas.setCartas(baralho);
    }
    
    public void imprime(){
        int i = 51;
        while(i >= 0){
            Carta b = (Carta)cartas.getCartas().get(i);
            
            switch (b.getNaipe()){
                case 0:
                    switch (b.getNumero()) {
                        case 1:
                            System.out.println("A♣  ");
                            break;
                        case 11:
                            System.out.print("J♣  ");
                            break;
                        case 12:
                            System.out.print("Q♣  ");
                            break;
                        case 13:
                            System.out.print("K♣  ");
                            break;
                        default:
                            System.out.print(b.getNumero()+"♣  ");
                            break;
                    }
                    break;
                case 20:
                    switch (b.getNumero()) {
                        case 1:
                            System.out.println("A♦  ");
                            break;
                        case 11:
                            System.out.print("J♦  ");
                            break;
                        case 12:
                            System.out.print("Q♦  ");
                            break;
                        case 13:
                            System.out.print("K♦  ");
                            break;
                        default:
                            System.out.print(b.getNumero()+"♦  ");
                            break;
                    }
                    break;
                case 40:
                    switch (b.getNumero()) {
                        case 1:
                            System.out.println("A♥  ");
                            break;
                        case 11:
                            System.out.print("J♥  ");
                            break;
                        case 12:
                            System.out.print("Q♥  ");
                            break;
                        case 13:
                            System.out.print("K♥  ");
                            break;
                        default:
                            System.out.print(b.getNumero()+"♥  ");
                            break;
                    }
                    break;
                case 60:
                    switch (b.getNumero()) {
                        case 1:
                            System.out.println("A♠  ");
                            break;
                        case 11:
                            System.out.print("J♠  ");
                            break;
                        case 12:
                            System.out.print("Q♠  ");
                            break;
                        case 13:
                            System.out.print("K♠  ");
                            break;
                        default:
                            System.out.print(b.getNumero()+"♠  ");
                            break;
                    }
                    break;
                default:
                    break;
            }
            i--;
        }
    } 
}
