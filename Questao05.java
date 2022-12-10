package ListaJava;

import java.util.Scanner;

public class Questao05 {

    public static float somaImporto(float taxaImposto, float custo) {
        return custo + (custo * (taxaImposto / 100));

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o custo: ");
        float custo = teclado.nextFloat();
        System.out.println("Digite a taxa de imposto em porcentagem: ");
        float taxa = teclado.nextFloat();
        float novoCusto = somaImporto(taxa, custo);
        System.out.println("O novo custo sera de: " + novoCusto);
        teclado.close();
    }

}
