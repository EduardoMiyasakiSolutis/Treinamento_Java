package exercicios;

import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da pirâmide: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
