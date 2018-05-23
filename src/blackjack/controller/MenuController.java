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
    
    /**
     * Cadastra jogador, a partir o user e password, e acicionando depois a uma lista de jogadores.
     * @param user
     * @param password
     * @return player.
     */
    public Jogador cadastrarJogador(String user, String password){
        Jogador player = new Jogador();
        player.setUser(user);
        player.setPassword(password);
        
        if(!jogadores.contains(player)){    
            jogadores.addLast(player);
            return player;
        }
        return null;
    }
    
    /**
     * Busca pelo iterator da lista, um jogador com mesmo user e o remove, retornando true, caso não remova retorna false.
     * @param user
     * @return Boolean.
     */
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
    
    /**
     * Busca pelo iterator da lista, um jogador com mesmo user, caso não ache retorna null.
     * @param user
     * @return jogadorBuscado.
     */
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
    
    /**
     * Pega a lista do menuController.
     * @return jogadores.
     */
    public LinkedList getJogadores() {
        return jogadores;
    }
}