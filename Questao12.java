package ListaJava;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Questao12 {

    public static String embaralhaPalavra(List<String> embaralhador, String palavra) {
        Collections.shuffle(embaralhador);
        StringBuilder saida = new StringBuilder(palavra.length());

        saida.append("Nova palavra >> ");

        for (String k : embaralhador) {
            saida.append(k);
        }

        return saida.toString();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = teclado.nextLine();
        List<String> embaralha = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralha, palavra));
        teclado.close();
    }
}
