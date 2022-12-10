package ListaJava;

import java.util.Scanner;

public class Questao13 {

    public static String desenhaMoldura(int linha, int coluna) {
        String saida = "";

        for (int i = 0; i < linha; i++) {
            if (i == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (i == (linha - 1)) {
                System.out.print("+");
            }

        }

        for (int j = 0; j < coluna; j++) {
            for (int i = 0; i < linha; i++) {
                if (i == 0) {
                    System.out.print("\n|");
                } else {
                    System.out.print(" ");
                }

                if (i == (linha - 1)) {
                    System.out.print(" |");
                }
            }
        }

        for (int i = 0; i < linha; i++) {
            if (i == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (i == (linha - 1)) {
                System.out.print("+");
            }

        }
        return saida;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho da linha: ");
        int linha = teclado.nextInt();

        if (linha < 1) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        }

        System.out.print("Digite o tamanho da Coluna: ");
        int coluna = teclado.nextInt();

        if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.println(desenhaMoldura(linha, coluna));
        teclado.close();
    }
}
