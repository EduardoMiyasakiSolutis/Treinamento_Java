package exercicios;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}



