package controller;

import util.LinkedList;
import util.Iterator;
import model.*;

public class MenuController {
    
    LinkedList jogadores;
    BlackJackController controller = new BlackJackController();

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
    
    public void iniciarJogo(Jogador[] jogadores, int i){
        Jogador[] jogador = new Jogador[i];
    }

    public LinkedList getJogadores() {
        return jogadores;
    }
    
    public Jogador buscaJogador(String user){
        Iterator iterator = jogadores.iterator();
        
        while(iterator.hasNext()){
            Jogador jogadorBuscado = (Jogador) iterator.next();
            if(jogadorBuscado.getUser().equals(user)){
                return jogadorBuscado;
            }
        }
        return null;
    }
}
