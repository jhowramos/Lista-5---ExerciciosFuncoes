package ListaJava;

import java.util.Scanner;

public class Questao06 {

    public static String Converte(int hr, int m) {
        String novaHr = "";
        if (hr < 13) {
            novaHr += "" + hr + ":" + m + " A.M";
        } else {
            hr = hr % 12;
            novaHr += "" + hr + ":" + m + " P.M";

        }
        return novaHr;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a hora (0 / 24): ");
        int hora = teclado.nextInt();
        System.out.println("Digite o minuto ( 0 / 60): ");
        int min = teclado.nextInt();
        System.out.println(Converte(hora, min));

        teclado.close();
    }

}
