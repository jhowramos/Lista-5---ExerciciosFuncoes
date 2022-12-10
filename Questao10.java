package ListaJava;

import java.util.Scanner;
import java.util.Random;

public class Questao10 {

    public static int jogoCraps(int num) {
        Random gerador = new Random();
        int dado1 = 0;
        int dado2 = 0;
        dado1 = gerador.nextInt(6) + 1;
        dado2 = gerador.nextInt(6) + 1;
        return dado1 + dado2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dados = 2;
        int escolha = 0;
        int ponto = 0;
        boolean testeDados = true;

        do {
            System.out.println("[1] para Jogar Dados");
            System.out.println("[0] para Encerrar Jogo");
            escolha = teclado.nextInt();
            dados = jogoCraps(escolha);

            if (escolha < 0 || escolha > 1) {
                System.out.println("Opcão Inválida!");
            } else if (escolha == 1) {
                System.out.println("Soma: " + dados);
                if (dados == 7 || dados == 11) {
                    System.out.println("\tVITORIA!");
                } else if (dados == 2 || dados == 3 || dados == 12) {
                    System.out.println("\tDERROTA!");
                } else if (dados == 4 || dados == 5 || dados == 6 || dados == 8 || dados == 9 || dados == 10) {
                    if (testeDados) {
                        testeDados = false;
                        ponto = dados;
                    } else if (ponto == dados) {
                        System.out.println("\tVITORIA!");
                    }
                }
            }
        } while (escolha != 0);

        System.out.println("\tFim de jogo!");
        teclado.close();

    }

}
