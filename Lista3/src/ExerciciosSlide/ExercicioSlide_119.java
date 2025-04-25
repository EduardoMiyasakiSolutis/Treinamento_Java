package ExerciciosSlide;

import java.math.BigInteger;

public class ExercicioSlide_119 {
    public static void main(String[] args) {
        BigInteger[][] tabuleiro;
        BigInteger valorGrao = BigInteger.ZERO;
        tabuleiro = new BigInteger[8][8];
        int contador = 0;
        for (int i = 0; i <= tabuleiro.length - 1; i++) {
            for (int j = 0; j <= tabuleiro.length - 1; j++) {
                tabuleiro[i][j] = BigInteger.TWO.pow(contador);
                contador++;
                if (j == 7) {
                    System.out.print(tabuleiro[i][j] + " | \n");
                } else {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
            }
        }
    }
}


