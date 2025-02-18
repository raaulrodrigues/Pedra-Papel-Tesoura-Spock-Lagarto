import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("jogador uma das opções abaixo:  \n" +
                "[1]Pedra\n" +
                "[2]Papel\n" +
                "[3]Tesoura\n" +
                "[4]Spock\n" +
                "[5]Lagarto");

        int jogador = sc.nextInt();
        System.out.println("----------------------------------------------");
        String[] opcoes = {"Pedra", "Papel", "Tesoura", "Spock", "Lagarto"};
        System.out.println("Você escolheu " + opcoes[jogador - 1] + ".\n");

        int computador = random.nextInt(5) + 1;
        System.out.println("Computador escolheu " + opcoes[computador - 1] + ".");

        System.out.println("----------------------------------------------");
        if(jogador == 1 && computador == 3){
            System.out.println("Jogador ganhou! Pedra quebra Tesoura");//
        }else if(jogador == 2 && computador == 1){
            System.out.println("Jogador ganhou! Papel cobre Pedra.");//
        }else if(jogador == 3 && computador == 2){
            System.out.println("Jogador ganhou! Tesoura corta Papel.");//
        }else if(jogador == 1 && computador == 5){
            System.out.println("Jogador ganhou! Pedra esmaga Lagarto.");//
        }else if(jogador == 5 && computador == 4){
            System.out.println("Jogador ganhou! Lagarto envenena Spock.");//
        }else if(jogador == 4 && computador == 3){
            System.out.println("Jogador ganhou! Spock derrete Tesoura");//
        }else if(jogador == 3 && computador == 5){
            System.out.println("Jogador ganhou! Tesoura decapita Lagarto.");//
        }else if(jogador == 5 && computador == 2){
            System.out.println("Jogador ganhou! Lagarto come Papel.");//
        } else if (jogador == 2 && computador == 4) {
            System.out.println("Jogador ganhou! Papel refuta Spock.");//
        }else if(jogador == 4 && computador == 1){
            System.out.println("Jogador ganhou! Spock vaporiza Pedra.");//
        }

        if (jogador == computador) {
            System.out.println("Empate!");
        }

        if(computador == 1 && jogador == 3){
            System.out.println("Computador ganhou! Pedra quebra Tesoura");
        }else if(computador == 2 && jogador == 1){
            System.out.println("Computador ganhou! Papel cobre Pedra.");
        }else if(computador == 3 && jogador == 2){
            System.out.println("Computador ganhou! Tesoura corta Papel.");
        }else if(computador == 1 && jogador == 5){
            System.out.println("Computador ganhou! Pedra esmaga Lagarto.");
        }else if(computador == 5 && jogador == 4){
            System.out.println("Computador ganhou! Lagarto envenena Spock.");
        }else if(computador == 4 && jogador == 3){
            System.out.println("Computador ganhou! Spock derrete Tesoura");
        }else if(computador == 3 && jogador == 5){
            System.out.println("Computador ganhou! Tesoura decapita Lagarto.");
        }else if(computador == 5 && jogador == 2){
            System.out.println("Computador ganhou! Lagarto come Papel.");
        } else if (computador == 2 && jogador == 4) {
            System.out.println("Computador ganhou! Papel refuta Spock.");
        }else if(computador == 4 && jogador == 1){
            System.out.println("Computador ganhou! Spock vaporiza Pedra.");
        }

        sc.close();
    }
}