package blackjack.view;

import blackjack.controller.*;
import blackjack.util.*;
import java.io.IOException;


public class Main{
    public static void main(String[] args) throws IOException {

        //Controller controller = new Controller();
        BlackJackController BJController = new BlackJackController();
        MenuController menuController = new MenuController();
        
        String menuEscolha;
        String menuOpcao;
        System.out.println("Sistema BestFoliaSys");
        do{
            System.out.println("Escolha uma das opções:\n"
                            + "|1| - Listar Cartas\n"
                            + "|2| - Listar Cartas - Ordenado\n"
                            + "|3| - Iniciar Partida\n"
                            + "|4| - Placar\n"
                            + "|5| - Cadastro Jogador\n"
                            + "|s| - Sair\n");
            System.out.println("O que deseja: "); 
            menuEscolha = menuOpcao = Console.readString();
                
            boolean verificaLimite, verificaNull;
            
            switch (menuOpcao){
                case "1":
                    BJController.adicionaCartas();
                    BJController.imprime();
                    break;    
            }        
        }while(!menuOpcao.equals("s"));
    }
    
    public static boolean idadeLimit(String idade){
        int idades = Integer.parseInt(idade);
        if(idades < 18){
            System.out.println("Menor de idade. Inválido!");
            return false;
        }
        return true;
    }
    
    public static boolean stringLimit(String texto, int maximo){
        if(texto.length() > maximo){
            System.out.println("Voce ultrapassou o maximo de caracteres.");
            return false;
        }
        return true;
    }
    
    public static boolean stringIdeal(String texto, int maximo){
        if(!(texto.length() == maximo)){
            System.out.println("Falta ou Excesso de caracteres.");
            return false;
        }
        return true;
    }
    
    public static String replaceLetters(String text){
        return text.replaceAll("[^A-z]", "");
    }
    
    public static String replaceOpcao(String text){
        return text.replaceAll("[^1-2]", "");
    }

    public static String replaceInteger(String text){
        return text.replaceAll("[^0-9]", "");
    }
    
    public static boolean stringNull(String text){
        if(!text.equals("")&&!text.equals("'")&&!text.equals("\\")){
            if(text.equals("0")){
                System.out.println("Voce digitou "+text+". Invalido!");
                return false;
            }else if(text.equals("")){
                System.out.println("Voce não digitou nada.");
                return false;
            }
        }    
        return true;
    }
}
