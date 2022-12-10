package ListaJava;

import java.util.Scanner;

public class Questao09 {

    public static int reverse(int numero) {
        String numeroStr = "" + numero;
        String novoNmr = "";
        for (int x = numeroStr.length() - 1; x >= 0; x--) {
            novoNmr += numeroStr.charAt(x);
        }
        return Integer.parseInt(novoNmr);

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = teclado.nextInt();
        System.out.println("Esse numero ao contrario: " + reverse(n));
        teclado.close();
    }
}
