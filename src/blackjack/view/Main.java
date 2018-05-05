package blackjack.view;

import blackjack.controller.*;
import blackjack.model.*;
import blackjack.util.*;
import java.io.IOException;


public class Main{
    public static void main(String[] args) throws IOException {

        BlackJackController BJController = new BlackJackController();
        MenuController menuController = new MenuController();
        
        String menuEscolha;
        String menuOpcao;
        int verificaCadastro = 0;
        
        System.out.println("Sistema BestFoliaSys");
        do{
            System.out.println("Escolha uma das opções:\n"
                            + "|1| - Listar Cartas\n"
                            + "|2| - Listar Cartas - Ordenado\n"
                            + "|3| - Iniciar Partida\n"
                            + "|4| - Placar\n"
                            + "|5| - Cadastro Jogador\n"
                            + "|6| - Remover Jogador\n"
                            + "|s| - Sair\n");
            System.out.println("O que deseja: "); 
            menuEscolha = menuOpcao = Console.readString();
            
            String opcao, user, password;
            boolean verificaLimite, verificaNull;
            
            switch (menuOpcao){
                case "1":
                    BJController.adicionaCartas();
                    BJController.imprime();
                    break;
                case "5":
                    do{
                        System.out.println("Cadastrando Jogador\n");
                        do{
                            System.out.printf("Insira o user do Jogador: ");
                            user = Console.readString();
                            System.out.println("Esse é o user "+user+" ?\n"+"1 - Sim/2 - Nao: ");
                            opcao = Console.readString();
                            opcao = replaceOpcao(opcao);
                            verificaLimite = stringIdeal(user,6,20);
                            verificaNull = stringNull(user);
                        }while(opcao.equals("")||verificaNull == false ||verificaLimite == false && (opcao.equals("1") ||  opcao.equals("2")) || verificaLimite == true && opcao.equals("2")); 
                        do{
                            System.out.printf("Insira password do Jogador: ");
                            password = Console.readString();
                            System.out.println("Esse é o password "+password+" ?\n"+"1 - Sim/2 - Nao: ");
                            opcao = Console.readString();
                            opcao = replaceOpcao(opcao);
                            verificaLimite = stringIdeal(password,8,16);
                            verificaNull = stringNull(password);
                        }while(opcao.equals("")||verificaNull == false ||verificaLimite == false && (opcao.equals("1") ||  opcao.equals("2")) || verificaLimite == true && opcao.equals("2")); 
                        
                        Jogador jogadorCadastrado = menuController.cadastrarJogador(user, password);
                        
                        if(jogadorCadastrado == null){
                            System.out.println("Erro Cadastro.");
                        }else{
                            verificaCadastro++;
                            System.out.println("Cadastro Concluido.");
                        }
                        System.out.println("Insira 1 ou 2 :\n1 - Menu\n2 - Novo Jogador\nOpcao: ");
                        menuEscolha = Console.readString();
                    }while(!menuEscolha.equals("1"));
                    
                    break;
                case "6": 
                    if(verificaCadastro > 0){
                        do{
                            if(verificaCadastro > 0){
                                System.out.println("Removendo Jogador\n");
                                do{
                                    System.out.printf("Qual user do Jogador: ");
                                    user = Console.readString();
                                    System.out.println("Esse é o user "+user+" ?\n"+"1 - Sim/2 - Nao: ");
                                    opcao = Console.readString();
                                    opcao = replaceOpcao(opcao);
                                    verificaLimite = stringIdeal(user,6,20);
                                    verificaNull = stringNull(user);
                                }while(opcao.equals("")||verificaNull == false ||verificaLimite == false && (opcao.equals("1") ||  opcao.equals("2")) || verificaLimite == true && opcao.equals("2")); 

                                Boolean jogadorCadastrado = menuController.removerJogador(user);

                                if(jogadorCadastrado == false){
                                    System.out.println("Jogador nao existe.");
                                }else{
                                    verificaCadastro--;
                                    System.out.println("Removido com Sucesso.");
                                }
                                System.out.println("Insira 1 ou 2 :\n1 - Menu\n2 - Remover outro Jogador\nOpcao: ");
                                menuEscolha = Console.readString();
                            }else{
                                System.out.println("Sem jogador para remover.");
                                menuEscolha = "1";
                            }
                        }while(!menuEscolha.equals("1"));
                    }else{
                        System.out.println("Sem jogador para remover.");
                    }
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
    
    public static boolean stringIdeal(String texto, int minimo, int maximo){
        
        if(texto.length() < minimo){
            System.out.println("Falta de caracteres.");
            return false;
        }else if((texto.length() >= maximo)){
            System.out.println("Excesso de caracteres.");
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
