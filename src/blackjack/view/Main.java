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

        System.out.print("♠");
        System.out.print("\u001B[31m"+"♥♦"+"\u001B[0m");
        System.out.print("♣ BLACKJACK ♣");
        System.out.print("\u001B[31m"+"♦♥"+"\u001B[0m");
        System.out.print("♠");

        do {
            System.out.println("\nEscolha uma das opções:\n"
                    + "|1| - Iniciar Jogo\n"
                    + "|2| - Manutenção de Jogador\n"
                    + "|3| - Placar Geral\n"
                    + "|s| - Sair\n");
            System.out.println("O que deseja: ");
            menuOpcao = Console.readString();

            switch (menuOpcao) {
                case "1":
                    Partida partidas = new Partida();
                    if (verificaCadastro > 0) {
                        int jogadorContador = 0;
                        int vencedor = 0;
                        System.out.println("Iniciando o jogo.");
                        do {
                            do {
                                System.out.printf("User do Jogador: ");
                                user = Console.readString();
                                System.out.println("Esse é o user " + user
                                        + " ?\n"
                                        + "|1| - Sim\n|2| - Nao: ");
                                opcao = Console.readString();
                                opcao = replaceOpcao(opcao);
                                verificaLimite = stringIdeal(user, 6, 20);
                                verificaNull = stringNull(user);
                            } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));
                            Jogador jogadorSelecionado = menuController.buscaJogador(user);
                            if (jogadorContador < 5) {
                                if (jogadorSelecionado == null) {
                                    System.out.println("\u001B[31m"+"Erro na Busca."+"\u001B[0m");
                                    menuOpcao = "s";
                                } else {
                                    System.out.println(jogadorSelecionado);
                                    partidas.setJogador(jogadorContador, jogadorSelecionado);
                                    jogadorContador++;
                                    System.out.println("\u001B[32m"+"Jogador Encontrado."+"\u001B[0m");
                                }
                            } else {
                                System.out.println("\u001B[31m"+"MAXIMO (5) DE JOGADORES PARA A PARTIDAD ATINGIDO."+"\u001B[0m");
                            }
                            if (jogadorContador > 0 && jogadorContador < 5 && jogadorSelecionado == null || jogadorSelecionado != null) {
                                System.out.println("Insira 1 ou 2 :\n"
                                        + "|1| - Iniciar Jogo\n"
                                        + "|2| - Novo Jogador\n"
                                        + "|s| - Menu\n"
                                        + "Opcao: ");
                                menuOpcao = Console.readString();
                            }
                        } while (!menuOpcao.equals("1") && partidas.getJogador(0) == null && !menuOpcao.equals("s") || menuOpcao.equals("2"));
                        if (jogadorContador > 0 && menuOpcao.equals("1") && partidas.getJogador(0) != null) {
                            do {
                                BJController.embaralha();
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
                                    if (i > 0) {
                                        anterior = partidas.getJogador(i - 1);
                                    }
                                    Boolean n = false;
                                    if (jogador != null) {
                                        do {
                                            System.out.println("\nVez do Jogador " + jogador.getUser());
                                            System.out.println("Carta na mao.");
                                            for (int j = 0; j < jogador.getMaoAtual().getCartas().size(); j++) {
                                                Carta c0 = (Carta) jogador.getMaoAtual().getCartas().get(j);
                                                colorCard(c0);
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
                                                if (anterior != null && jogador.getTotalDaMao() < 22 && jogador.getTotalDaMao() > anterior.getTotalDaMao()) {
                                                    vencedor = jogador.getTotalDaMao();
                                                }
                                                if (!verifica) {
                                                    do {
                                                        System.out.println("\n\n\n\nEscolha uma das opções:\n"
                                                                + "|1| - Hit\n"
                                                                + "|2| - Break\n");
                                                        System.out.println("O que deseja: ");
                                                        menuOpcao = Console.readString();
                                                        menuOpcao = replaceOpcao(menuOpcao);
                                                    } while (menuOpcao.equals("") || !menuOpcao.equals("1") && !menuOpcao.equals("2"));
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
                                                    System.out.println("\u001B[31m"+"Seu total ultrapassou 21."+"\u001B[0m");
                                                    menuOpcao = "2";
                                                }
                                            }
                                        } while (!menuOpcao.equals("2"));
                                    }
                                }
                                Croupier mesa = new Croupier();
                                while (mesa.getTotalDaMao() < 17) {
                                    Carta carta = (Carta) BJController.pushCarta();
                                    mesa.getMaoAtual().addCarta(carta);
                                    int x = BJController.transformaNumero(carta.getNumero());
                                    mesa.setTotalDaMao(x);
                                    colorCard(carta);
                                }
                                Boolean verificaCroupier = BJController.estouro(mesa.getTotalDaMao());
                                int croupierGanhou = 0;
                                int numeroVencedores = 0;
                                int empate = 0;

                                for (int i = 0; i < partidas.getJogador().length; i++) {
                                    Jogador jogador = partidas.getJogador(i);
                                    Jogador anterior = new Jogador();
                                    if (i > 0) {
                                        anterior = partidas.getJogador(i - 1);
                                    }
                                    if (jogador != null) {
                                        if (jogador.getTotalDaMao() > anterior.getTotalDaMao()) {
                                            numeroVencedores++;
                                            empate = jogador.getTotalDaMao();
                                        }
                                    }
                                }
                                if (empate == mesa.getTotalDaMao()) {
                                    System.out.println("\nEmpate, ninguem ganha.");
                                    croupierGanhou++;
                                } else if (verificaCroupier) {
                                    System.out.println("\u001B[32m"+"\nCroupier ultrapassou 21. Todos ganham!"+"\u001B[0m");
                                    for (Jogador jogador : partidas.getJogador()) {
                                        if (jogador != null) {
                                            croupierGanhou++;
                                            System.out.println("\u001B[32m"+"\n\n" + jogador + " foi o vencedor ganhando 50 pontos."+"\u001B[0m");
                                            BJController.partidaGanha(jogador, jogadorContador);
                                            jogador.setPartidasVencidas(1);
                                            jogador.getMaoAtual().clearCartas();
                                            jogador.setTotalDaMao(-jogador.getTotalDaMao());
                                        }
                                    }
                                } else {
                                    for (Jogador jogador : partidas.getJogador()) {
                                        if (jogador != null) {
                                            if (jogador.getTotalDaMao() > mesa.getTotalDaMao()) {
                                                if (jogador.getTotalDaMao() == vencedor) {
                                                    System.out.println("\u001B[32m"+"\n\n" + jogador + " foi o vencedor."+"\u001B[0m");
                                                    BJController.partidaGanha(jogador, numeroVencedores);
                                                    jogador.setPartidasVencidas(1);
                                                    croupierGanhou++;
                                                }
                                            } else if (jogador.getTotalDaMao() == mesa.getTotalDaMao()) {
                                                if (jogador.getTotalDaMao() == vencedor) {
                                                    System.out.println("\u001B[32m"+"\n\n" + jogador + " foi o vencedor."+"\u001B[0m");
                                                    BJController.partidaGanha(jogador, numeroVencedores);
                                                    jogador.setPartidasVencidas(1);
                                                    croupierGanhou++;
                                                }
                                            }
                                            jogador.getMaoAtual().clearCartas();
                                            jogador.setTotalDaMao(-jogador.getTotalDaMao());
                                        }
                                    }
                                }
                                if (croupierGanhou == 0) {
                                    System.out.println("\u001B[32m"+"\nCroupier ganhou!"+"\u001B[0m");
                                }
                                do {
                                    System.out.println("\nEscolha uma das opções:\n"
                                            + "|1| - Listar Cartas\n"
                                            + "|2| - Listar Cartas - Ordenado\n"
                                            + "|3| - Nova rodada\n"
                                            + "|s| - Menu BlackJack\n");
                                    System.out.println("O que deseja: ");
                                    menuOpcao = Console.readString();
                                    if (menuOpcao.equals("1")) {
                                        BJController.verCartasRestantes();
                                    } else if (menuOpcao.equals("2")) {
                                        BJController.verCartasRestantesOrdenadas();
                                    }
                                } while (!menuOpcao.equals("s") && !menuOpcao.equals("3") || menuOpcao.equals(""));
                            } while (!menuOpcao.equals("s"));
                        }
                    } else {
                        System.out.println("\u001B[31m"+"Nao há jogadores cadastrados para jogar."+"\u001B[0m");
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
                                        System.out.println("Esse é o user " + user + " ?\n" + "|1| - Sim\n|2| - Nao: ");
                                        opcao = Console.readString();
                                        opcao = replaceOpcao(opcao);
                                        verificaLimite = stringIdeal(user, 6, 15);
                                        verificaNull = stringNull(user);
                                    } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));
                                    do {
                                        System.out.printf("Insira password do Jogador: ");
                                        password = Console.readString();
                                        System.out.println("Esse é o password " + password + " ?\n" + "|1| - Sim\n|2| - Nao: ");
                                        opcao = Console.readString();
                                        opcao = replaceOpcao(opcao);
                                        verificaLimite = stringIdeal(password, 8, 16);
                                        verificaNull = stringNull(password);
                                    } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));

                                    Jogador jogadorCadastrado = menuController.cadastrarJogador(user, password);
                                    if (jogadorCadastrado == null) {
                                        System.out.println("\u001B[31m"+"Erro Cadastro."+"\u001B[0m");
                                    } else {
                                        verificaCadastro++;
                                        System.out.println("\u001B[32m"+"Cadastro concluído."+"\u001B[0m");
                                    }
                                    System.out.println("Insira 1 ou 2 :\n|1| - Menu\n|2| - Novo Jogador\nOpcao: ");
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
                                                System.out.println("Esse é o user " + user + " ?\n" + "|1| - Sim\n|2| - Nao: ");
                                                opcao = Console.readString();
                                                opcao = replaceOpcao(opcao);
                                                verificaLimite = stringIdeal(user, 6, 20);
                                                verificaNull = stringNull(user);
                                            } while (opcao.equals("") || verificaNull == false || verificaLimite == false && (opcao.equals("1") || opcao.equals("2")) || verificaLimite == true && opcao.equals("2"));

                                            Boolean jogadorCadastrado = menuController.removerJogador(user);

                                            if (jogadorCadastrado == false) {
                                                System.out.println("\u001B[31m"+"Jogador não existe."+"\u001B[0m");
                                            } else {
                                                System.out.println("\u001B[32m"+"Removido com sucesso."+"\u001B[0m");
                                                verificaCadastro--;
                                            }
                                            System.out.println("Insira 1 ou 2 :\n|1| - Menu\n|2| - Remover outro Jogador\nOpcao: ");
                                            menuEscolha = Console.readString();
                                        } else {
                                            System.out.println("\u001B[31m"+"Sem jogador para remover."+"\u001B[0m");
                                            menuEscolha = "1";
                                        }
                                    } while (!menuEscolha.equals("1"));
                                }else{
                                    System.out.println("\u001B[31m"+"Sem jogador para remover."+"\u001B[0m");
                                }
                        }
                    } while (!menuOpcao.equals("s"));
                    menuOpcao = "voltar";
                    break;
                case "3":
                    FileOutputStream arquivo = new FileOutputStream("PlacarTotal.txt");
                    PrintWriter n = new PrintWriter(arquivo);
                    LinkedList jogador = menuController.getJogadores();
                    n.println("\t    |PLACAR GERAL|");
                    n.println("|   Username   ||Pontuação||Rodadas|");
                    for (int i = 0; i < jogador.size(); i++) {
                        Jogador player = (Jogador) menuController.getJogadores().get(i);
                        if (player.getUser().length() < 7) {
                            n.println(" " + player.getUser() + "\t\t " + player.getPontuacao() + "\t    " + player.getPartidasVencidas());
                        } else {
                            n.println(" " + player.getUser() + "\t " + player.getPontuacao() + "\t    " + player.getPartidasVencidas());
                        }
                    }
                    n.close();
                    arquivo.close();
                    System.out.println("\u001B[32m"+"Arquivo gerado."+"\u001B[0m");
                    break;
            }
        } while (!menuOpcao.equals("s"));
    }

    /**
     * Verifica o tamanho adequado para a string usando apenas um valor máximo.
     *
     * @param texto
     * @param maximo
     * @return Boolean.
     */
    public static boolean stringLimit(String texto, int maximo) {
        if (texto.length() > maximo) {
            System.out.println("\u001B[31m"+"Voce ultrapassou o maximo de caracteres."+"\u001B[0m");
            return false;
        }
        return true;
    }

    /**
     * Verifica o tamanho adequado para a string, usando um mínimo e máximo de
     * caracteres.
     *
     * @param texto
     * @param minimo
     * @param maximo
     * @return String.
     */
    public static boolean stringIdeal(String texto, int minimo, int maximo) {
        if (texto.length() < minimo) {
            System.out.println("\u001B[31m"+"Falta de caracteres."+"\u001B[0m");
            return false;
        } else if ((texto.length() >= maximo)) {
            System.out.println("\u001B[31m"+"Excesso de caracteres."+"\u001B[0m");
            return false;
        }
        return true;
    }

    /**
     * Retira caracteres inválidos, passando apenas Letras.
     *
     * @param text
     * @return String.
     */
    public static String replaceLetters(String text) {
        return text.replaceAll("[^A-z]", "");
    }

    /**
     * Retira caracteres inválidos, passando apenas 1 ou 2.
     *
     * @param text
     * @return String.
     */
    public static String replaceOpcao(String text) {
        return text.replaceAll("[^1-2]", "");
    }

    /**
     * Retira caracteres inválidos, passando apenas Números.
     *
     * @param text
     * @return String.
     */
    public static String replaceInteger(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    /**
     * Verifica se a String é null.
     *
     * @param text
     * @return Boolean.
     */
    public static boolean stringNull(String text) {
        if (!text.equals("") && !text.equals("'") && !text.equals("\\")) {
            if (text.equals("0")) {
                System.out.println("\u001B[31m"+"Voce digitou " + text + ". Invalido!"+"\u001B[0m");
                return false;
            } else if (text.equals("")) {
                System.out.println("\u001B[31m"+"Voce não digitou nada."+"\u001B[0m");
                return false;
            }
        }
        return true;
    }
    
    public static void colorCard(Carta carta){
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
