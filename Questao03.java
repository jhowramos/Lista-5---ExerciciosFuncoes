package ListaJava;

import java.util.Scanner;

public class Questao03 {

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = teclado.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int c = teclado.nextInt();
        int somados = soma(a, b, c);
        System.out.println("A soma deles: " + somados);
        teclado.close();

    }

}
