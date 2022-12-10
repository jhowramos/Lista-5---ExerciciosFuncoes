package ListaJava;

import java.util.Scanner;

public class Questao04 {

    public static char ePositivo(int n) {
        if (n >= 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = teclado.nextInt();
        System.out.println(ePositivo(n));

        teclado.close();
    }

}
