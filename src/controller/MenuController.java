package blackjack.controller;

import blackjack.model.*;
import blackjack.util.*;

public class MenuController {
    
    private LinkedList jogadores;
    private int partida = 0;

    public MenuController() {
        this.jogadores = new LinkedList();
    }
    
    public Jogador cadastrarJogador(String user, String password){
        Jogador player = new Jogador();
        player.setUser(user);
        player.setPassword(password);
        
        if(!jogadores.contains(player) && jogadores.size() <= 5){    
            jogadores.addLast(player);
            return player;
        }
        return null;
    }
    
    public boolean removerJogador(String user){
        Iterator iterator = jogadores.iterator();
        
        while(iterator.hasNext()){
            Jogador jogadorRemovido = (Jogador) iterator.next();
            if(jogadorRemovido.getUser().equals(user)){
                jogadores.remove(jogadorRemovido);
                return true;
            }
        }
        return false;
    }
    
    public void iniciarPartida(int quantidadeJogadores){
        
        
    }
}
