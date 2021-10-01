import java.util.Random;
import java.util.Scanner;

/**
 * RockPaperScissors
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        int menu, userChoice, pcChoice, userScore, pcScore;
        boolean on, startGame = false;
        String[] game = { "pedra", "papel", "tesoura" };
        // MENU DE ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo ao jogo\nPedra Papel e Tesoura");
        System.out.println("Pressione Enter para continuar");
        entrada.nextLine();
        System.out.print("\033[H\033[2J");
        // MENU ESCOLHA
        on = true;
        while (on) {
            System.out.println("1 - Jogar\n2 - Regras\n3 - Limpa Tela\n4 - Sair");
            menu = entrada.nextInt();
            // System.out.print("\033[H\033[2J");
            if (menu == 1) {
                System.out.println("1 press");
                startGame = true;
                System.out.print("\033[H\033[2J");
            } else if (menu == 2) {
                System.out.println("Pedra ganha da tesoura (amassando-a ou quebrando-a).");
                System.out.println("Tesoura ganha do papel (cortando-o).");
                System.out.println("Papel ganha da pedra (embrulhando-a).");
                System.out.println("\n\n------------------------------------------------------");
            } else if (menu == 3) {
                System.out.print("\033[H\033[2J");
            } else if (menu == 4) {
                System.out.println("Até logo");
                on = false;
            } else {
                System.out.println("Comando não existe\nTente novamente outr opção");
            }
            // JOGO
            userScore = 0;
            pcScore = 0;
            while (startGame) {
                Random generator = new Random();
                pcChoice = generator.nextInt(3);
                System.out.printf("PLAYER : %d         |           PC : %d\n",userScore, pcScore);                
                System.out.println("0 - Pedra   |   1 - Papel   |   2 - Tesoura");
                System.out.println("7 - Limpa a Tela   |    8 - Reseta Score    |   9 - Retorna ao menu principal");
                userChoice = entrada.nextInt();
                if (userChoice == 0 || userChoice == 1 || userChoice == 2) {
                    System.out.println("Voce escolheu: " + game[userChoice]);
                    System.out.println("Computador escolheu: " + game[pcChoice]);
                }
                // Escolhas
                if (userChoice == pcChoice) {
                    System.out.println("Empate");
                    System.out.println("\n\n");
                } else if (userChoice == 0 && pcChoice == 1) {
                    pcScore ++;
                    System.out.println("Você Perdeu");
                    System.out.println("Papel embrulha pedra");
                    System.out.println("\n\n");
                } else if (userChoice == 0 && pcChoice == 2) {
                    userScore ++;
                    System.out.println("Você Venceu");
                    System.out.println("Pedra quebra a tesoura");
                    System.out.println("\n\n");
                } else if (userChoice == 1 && pcChoice == 2) {
                    pcScore ++;
                    System.out.println("Você Perdeu");
                    System.out.println("Tesoura corta papel");
                    System.out.println("\n\n");
                } else if (userChoice == 1 && pcChoice == 0) {
                    userScore ++;
                    System.out.println("Você Venceu");
                    System.out.println("Papel embrulha pedra");
                    System.out.println("\n\n");
                } else if (userChoice == 2 && pcChoice == 0) {
                    pcScore ++;
                    System.out.println("Você Perdeu");
                    System.out.println("Pedra quebra a tesoura");
                    System.out.println("\n\n");
                } else if (userChoice == 2 && pcChoice == 1) {
                    userScore ++;
                    System.out.println("Você Venceu");
                    System.out.println("Tesoura corta papel");
                    System.out.println("\n\n");
                } /* MENU */
                else if (userChoice == 7) {
                    System.out.print("\033[H\033[2J");
                } else if (userChoice == 8) {
                    System.out.println("Score resetado");
                    pcScore = 0;
                    userScore = 0;
                } else if (userChoice == 9) {
                    startGame = false;
                    System.out.print("\033[H\033[2J");
                    System.out.println("Usuario saiu do jogo");
                    System.out.println("------------------------------------------------------");
                }
            }
        }
        entrada.close();
    }
}