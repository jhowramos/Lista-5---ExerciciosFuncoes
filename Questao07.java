package ListaJava;

import java.util.Scanner;

public class Questao07 {

    public static float valorPagamento(float valor, int atraso) {
        if (atraso == 0) {
            return valor;
        } else {
            float juros = 0.1f * atraso;
            return valor + (valor * juros);
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd = 0;
        float valorTotal = 0;
        while (true) {
            System.out.println("Digite o valor das prestacoes: ");
            float valor = teclado.nextFloat();
            if (valor == 0) {
                break;
            }
            System.out.println("Digite o numero de dias em atraso: ");
            int dias = teclado.nextInt();
            valorTotal += valorPagamento(valor, dias);
            qtd++;
        }
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Quantidade de pagamentos: " + qtd);
        teclado.close();
    }

}
