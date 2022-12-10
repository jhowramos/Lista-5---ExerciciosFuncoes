package ListaJava;

import java.util.Scanner;

public class Questao14 {

    public static boolean ehQuadradoMagico(int[][] matriz) {
        boolean eMagico = true;
        int primeira_linha = 0;
        int primeira_col = 0;

        for (int i = 0; i < 3; i++) {
            int qtdLinha = 0;
            int qtdCol = 0;
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    primeira_linha += matriz[i][j];
                    primeira_col += matriz[j][i];
                }
                qtdLinha += matriz[i][j];
                qtdCol += matriz[j][i];
            }
            if (qtdLinha != primeira_linha || qtdLinha != qtdCol || qtdCol != primeira_col
                    || primeira_col != primeira_linha) {
                eMagico = false;
            }

        }
        if (eMagico) {
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
        return eMagico;
    }

    public static void main(String[] args) {
        int[][] quadradoMagico = new int[][] { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
        ehQuadradoMagico(quadradoMagico);
    }
}
