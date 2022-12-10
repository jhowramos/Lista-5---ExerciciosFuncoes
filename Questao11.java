package ListaJava;

import java.util.Scanner;

public class Questao11 {

    public static String mostraData(String dat, String[] ext) {
        StringBuilder saida = new StringBuilder();

        ext = dat.split("/");
        saida.append("Dia ");

        for (int x = 0; x < 3; x++) {
            if (x == 0) {
                saida.append(ext[x]);
                saida.append(" do mês ");
            }

            if (x == 1) {
                if (ext[x].compareTo("01") == 0) {
                    saida.append("de Janeiro");
                } else if (ext[x].compareTo("02") == 0) {
                    saida.append("de Fevereiro");

                } else if (ext[x].compareTo("03") == 0) {
                    saida.append("de Março");
                } else if (ext[x].compareTo("04") == 0) {
                    saida.append("de Abril");
                } else if (ext[x].compareTo("05") == 0) {
                    saida.append("de Maio");
                } else if (ext[x].compareTo("06") == 0) {
                    saida.append("de Junho");
                } else if (ext[x].compareTo("07") == 0) {
                    saida.append("de Julho");
                } else if (ext[x].compareTo("08") == 0) {
                    saida.append("de Agosto");
                } else if (ext[x].compareTo("09") == 0) {
                    saida.append("de Setembro");
                } else if (ext[x].compareTo("10") == 0) {
                    saida.append("de Outubro");
                } else if (ext[x].compareTo("11") == 0) {
                    saida.append("de Novembro");
                } else if (ext[x].compareTo("12") == 0) {
                    saida.append("de Dezembro");
                } else {
                    saida.append(ext[x]);
                }

                saida.append(" do ano de ");
            }

            if (x == 2) {
                saida.append(ext[x]);
            }
        }

        return saida.toString();

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] porextenso = new String[3];
        String data = "";

        do {
            System.out.print("Data No Padarão [dd/mm/aaaa]: ");
            data = teclado.nextLine();

            if (data.length() != 10) {
                System.out.println("Data Inválida!");
            }
        } while (data.length() != 10);
        teclado.close();
        System.out.println(mostraData(data, porextenso));
    }

}
