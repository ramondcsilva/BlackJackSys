package view;

import util.Console;
import controller.*;
import java.io.FileOutputStream;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BlackJackController BJController = new BlackJackController();
        MenuController menuController = new MenuController();

        String menuEscolha;
        String menuOpcao;
        String opcao, user, password;
        int verificaCadastro = 0;
        boolean verificaLimite, verificaNull;

        BJController.adicionaCartas();

        System.out.println("♠♥♦♣BLACKJACK♣♦♥♠");
        do {
            System.out.println("\nEscolha uma das opções:\n"
                    + "|1| - Iniciar Jogo\n"
                    + "|2| - Manutenção de Jogador\n"
                    + "|3| - Placa Geral\n"
                    + "|s| - Sair\n");
            System.out.println("O que deseja: ");
            menuOpcao = Console.readString();

            switch (menuOpcao) {
                case "1":
                    BJController.embaralha();
                    Partida partidas = new Partida();
                    if (verificaCadastro > 0) {
                        int jogadorContador = 0;
                        int vencedor = 0;
                        do {
                            System.out.println("Iniciando o jogo.");
                            do {
                                System.out.printf("User do Jogador: ");
                                user = Console.readString();
                                System.out.println("Esse é o user " + user + " ?\n" + "1 - Sim/2 - Nao: ");
                                opcao = Console.readString();
                                opcao = replaceOpcao(opcao);
                                verificaLimite = stringIdeal(user, 6, 20);
                                verificaNull = stringNull(user);
                            } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));
                            Jogador jogadorSelecionado = menuController.buscaJogador(user);

                            if (jogadorSelecionado == null) {
                                System.out.println("Erro na Busca.");
                            } else {
                                System.out.println(jogadorSelecionado);
                                partidas.setJogador(jogadorContador, jogadorSelecionado);
                                jogadorContador++;
                                System.out.println("Jogador Encontrado.");
                            }
                            if (jogadorContador < 5) {
                                System.out.println("Insira 1 ou 2 :\n1 - Iniciar Jogo\n2 - Novo Jogador\n3 - Menu\nOpcao: ");
                                menuEscolha = Console.readString();
                            } else {
                                System.out.println("Maximo de jogadores para jogar (5) atingido.");
                                menuEscolha = "1";
                            }
                            if (menuEscolha.equals("3")) {
                                menuEscolha = "1";
                                menuOpcao = "s";
                            }
                        } while (!menuEscolha.equals("1"));
                        if (!menuOpcao.equals("s")) {
                            for (Jogador jogador : partidas.getJogador()) {
                                if (jogador != null) {
                                    Carta carta0 = (Carta) BJController.pushCarta();
                                    Carta carta1 = (Carta) BJController.pushCarta();
                                    jogador.getMaoAtual().addCarta(carta0);
                                    jogador.getMaoAtual().addCarta(carta1);
                                }
                            }
                            for (int i = 0; i < partidas.getJogador().length; i++) {
                                Jogador jogador = partidas.getJogador(i);
                                Jogador anterior = new Jogador();
                                if(i > 0){
                                    anterior = partidas.getJogador(i-1);
                                }
                                Boolean n = false;
                                if (jogador != null) {
                                    do {
                                        System.out.println("\nVez do Jogador " + jogador.getUser() + "\n\n\n");
                                        System.out.println("Carta na mao.");
                                        for (int j = 0; j < jogador.getMaoAtual().getCartas().size(); j++) {
                                            Carta c0 = (Carta) jogador.getMaoAtual().getCartas().get(j);
                                            System.out.print(c0);
                                            if (n == false) {
                                                int x = BJController.transformaNumero(c0.getNumero());
                                                jogador.setTotalDaMao(x);
                                            } else if (j == jogador.getMaoAtual().getCartas().size() - 1) {
                                                int x = BJController.transformaNumero(c0.getNumero());
                                                jogador.setTotalDaMao(x);
                                            }
                                        }
                                        Carta a = (Carta) jogador.getMaoAtual().getCartas().get(0);
                                        Carta b = (Carta) jogador.getMaoAtual().getCartas().get(1);
                                        int verificando = BJController.verificaValor(a.getNumero(), b.getNumero());
                                        if (verificando == 21) {
                                            System.out.println("ITS A BLACK J♠CK!!!");
                                            menuOpcao = "2";
                                        } else {
                                            n = true;
                                            System.out.println("\nSeu total de pontos na mão é: " + jogador.getTotalDaMao());
                                            Boolean verifica = BJController.estouro(jogador.getTotalDaMao());
                                            if(anterior != null && jogador.getTotalDaMao() < 22 && jogador.getTotalDaMao() > anterior.getTotalDaMao()){
                                                vencedor = jogador.getTotalDaMao();
                                            }
                                            if (!verifica) {
                                                System.out.println("\nEscolha uma das opções:\n"
                                                        + "|1| - Hit\n"
                                                        + "|2| - Break\n");
                                                System.out.println("O que deseja: ");
                                                menuOpcao = Console.readString();

                                                switch (menuOpcao) {
                                                    case "1":
                                                        Carta nova = (Carta) BJController.pushCarta();
                                                        jogador.getMaoAtual().addCarta(nova);
                                                        break;
                                                    case "2":
                                                        System.out.println("Proximo Jogador");
                                                        break;
                                                }
                                            } else {
                                                System.out.println("Seu total ultrapassou 21.");
                                                menuOpcao = "2";
                                            }
                                        }
                                    } while (!menuOpcao.equals("2"));
                                }
                            }
                        }
                        for (Jogador jogador : partidas.getJogador()) {
                            if(jogador != null){    
                                System.out.println(vencedor);
                                if (jogador.getTotalDaMao() == vencedor) {
                                    System.out.println("\n\n"+jogador+" foi o vencedor ganhando 50 pontos.");
                                    jogador.setPontuacao(50);
                                    jogador.setPartidasVencidas(1);
                                }
                                jogador.getMaoAtual().clearCartas();
                                jogador.setTotalDaMao(-jogador.getTotalDaMao());
                            }    
                        }
                        do {
                            System.out.println("\nEscolha uma das opções:\n"
                                    + "|1| - Listar Cartas\n"
                                    + "|2| - Listar Cartas - Ordenado\n"
                                    + "|s| - Menu BlackJack\n");
                            System.out.println("O que deseja: ");
                            menuOpcao = Console.readString();

                            switch (menuOpcao) {
                                case "1":
                                    BJController.verCartasRestantes();
                                    break;
                                case "2":
                                    BJController.verCartasRestantesOrdenadas();
                                    break;
                            }
                        } while (!menuOpcao.equals("s"));
                    } else {
                        System.out.println("Nao há jogadores cadastrados para jogar.");
                    }
                    menuOpcao = "voltar";
                    //Verificar igualdade de pontos dos jogadores.
                    //Verificar como zerar o total de pontos dos jogadores.
                    break;
                case "2":
                    do {
                        System.out.println("\nEscolha uma das opções:\n"
                                + "|1| - Cadastrar Jogador\n"
                                + "|2| - Remover Jogador\n"
                                + "|s| - Voltar ao menu\n");
                        System.out.println("O que deseja: ");
                        menuOpcao = Console.readString();

                        switch (menuOpcao) {
                            case "1":
                                do {
                                    System.out.println("Cadastrando Jogador\n");
                                    do {
                                        System.out.printf("Insira o user do Jogador: ");
                                        user = Console.readString();
                                        System.out.println("Esse é o user " + user + " ?\n" + "1 - Sim/2 - Nao: ");
                                        opcao = Console.readString();
                                        opcao = replaceOpcao(opcao);
                                        verificaLimite = stringIdeal(user, 6, 20);
                                        verificaNull = stringNull(user);
                                    } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));
                                    do {
                                        System.out.printf("Insira password do Jogador: ");
                                        password = Console.readString();
                                        System.out.println("Esse é o password " + password + " ?\n" + "1 - Sim/2 - Nao: ");
                                        opcao = Console.readString();
                                        opcao = replaceOpcao(opcao);
                                        verificaLimite = stringIdeal(password, 8, 16);
                                        verificaNull = stringNull(password);
                                    } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));

                                    Jogador jogadorCadastrado = menuController.cadastrarJogador(user, password);
                                    if (jogadorCadastrado == null) {
                                        System.out.println("Erro Cadastro.");
                                    } else {
                                        verificaCadastro++;
                                        System.out.println("Cadastro Concluido.");
                                    }
                                    System.out.println("Insira 1 ou 2 :\n1 - Menu\n2 - Novo Jogador\nOpcao: ");
                                    menuEscolha = Console.readString();
                                } while (!menuEscolha.equals("1"));
                                break;
                            case "2":
                                if (verificaCadastro > 0) {
                                    do {
                                        if (verificaCadastro > 0) {
                                            System.out.println("Removendo Jogador\n");
                                            do {
                                                System.out.printf("Qual user do Jogador: ");
                                                user = Console.readString();
                                                System.out.println("Esse é o user " + user + " ?\n" + "1 - Sim/2 - Nao: ");
                                                opcao = Console.readString();
                                                opcao = replaceOpcao(opcao);
                                                verificaLimite = stringIdeal(user, 6, 20);
                                                verificaNull = stringNull(user);
                                            } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));

                                            Boolean jogadorCadastrado = menuController.removerJogador(user);

                                            if (jogadorCadastrado == false) {
                                                System.out.println("Jogador nao existe.");
                                            } else {
                                                System.out.println("Removido com sucesso");
                                                verificaCadastro--;
                                            }
                                            System.out.println("Insira 1 ou 2 :\n1 - Menu\n2 - Remover outro Jogador\nOpcao: ");
                                            menuEscolha = Console.readString();
                                        } else {
                                            System.out.println("Sem jogador para remover.");
                                            menuEscolha = "1";
                                        }
                                    } while (!menuEscolha.equals("1"));
                                }
                        }
                    } while (!menuOpcao.equals("s"));
                    menuOpcao = "voltar";
                    break;
                case "3":
                    FileOutputStream arquivo = new FileOutputStream("PlacarTotal.txt");
                    PrintWriter n = new PrintWriter(arquivo);
                    LinkedList jogador = menuController.getJogadores();
                    n.println("\t\t\t|PLACAR GERAL|");
                    n.println("|Username|\t|Pontuação|\t|Rodadas|");
                    for (int i = 0; i < jogador.size(); i++) {
                        Jogador player = (Jogador) menuController.getJogadores().get(i);
                        if(player.getUser().length() < 7){
                            n.println(" " + player.getUser() + "\t\t " + player.getPontuacao() + "\t\t " + player.getPartidasVencidas());
                        }else{
                            n.println(" " + player.getUser() + "\t " + player.getPontuacao() + "\t\t " + player.getPartidasVencidas());
                        }    
                    }
                    n.close();
                    arquivo.close();
                    break;
            }
        } while (!menuOpcao.equals("s"));
    }

    public static boolean stringLimit(String texto, int maximo) {
        if (texto.length() > maximo) {
            System.out.println("Voce ultrapassou o maximo de caracteres.");
            return false;
        }
        return true;
    }

    public static boolean stringIdeal(String texto, int minimo, int maximo) {
        if (texto.length() < minimo) {
            System.out.println("Falta de caracteres.");
            return false;
        } else if ((texto.length() >= maximo)) {
            System.out.println("Excesso de caracteres.");
            return false;
        }
        return true;
    }

    public static String replaceLetters(String text) {
        return text.replaceAll("[^A-z]", "");
    }

    public static String replaceOpcao(String text) {
        return text.replaceAll("[^1-2]", "");
    }

    public static String replaceInteger(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    public static boolean stringNull(String text) {
        if (!text.equals("") && !text.equals("'") && !text.equals("\\")) {
            if (text.equals("0")) {
                System.out.println("Voce digitou " + text + ". Invalido!");
                return false;
            } else if (text.equals("")) {
                System.out.println("Voce não digitou nada.");
                return false;
            }
        }
        return true;
    }
}
