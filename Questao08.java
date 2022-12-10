package ListaJava;

import java.util.Scanner;

public class Questao08 {

    public static int qtdDigitos(int numero) {
        String numeroStr = "" + numero;
        return numeroStr.length();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = teclado.nextInt();
        System.out.println("Esse numero tem " + qtdDigitos(n) + " digitos");
        teclado.close();
    }

}
