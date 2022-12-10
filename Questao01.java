package ListaJava;

import java.util.Scanner;

public class Questao01 {

    public static void imprime(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.printf("%d ", x + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite valor de n: ");
        int n = teclado.nextInt();
        imprime(n);
        teclado.close();

    }

}
