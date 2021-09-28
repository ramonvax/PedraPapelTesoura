import java.security.Principal;
import java.util.Scanner;

/**
 * RockPaperScissors
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        int menu;
        boolean on;
        // MENU DE ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo ao jogo\nPedra Papel e Tesoura");
        System.out.println("Pressione Enter para continuar");
        entrada.nextLine();
        System.out.print("\033[H\033[2J");
        // MENU ESCOLHA
        on = true;
        while (on) { 
            Boolean startGame = false;           
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
            }
            // JOGO
            while (startGame) {
                int choice;
                System.out.println("Game on");
                choice = entrada.nextInt();
                if (choice == 5) {
                    System.out.println("Game exit");
                    startGame = false;
                }
            }
        }
        entrada.close();
    }
}