import java.util.Scanner;

/**
 * RockPaperScissors
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        int menu;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo ao jogo\nPedra Papel e Tesoura");
        System.out.println("Pressione Enter para continuar");
        entrada.nextLine();
        System.out.print("\033[H\033[2J"); 
        System.out.println("1 - Jogar\n2 - Regras\n3 - Sair");
        menu = entrada.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println("ok");
        entrada.close();
    }    
}