package exercicios;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número : ");
        int n1 = sc.nextInt();

        int soma = 0;
        for (int i = n1 - 1; i > 0; i--) {
            if (n1 % i == 0) {
                soma += i;
            }
        }

        if (n1 == soma) {
            System.out.println("Número é perfeito");
        } else{
            System.out.println("Número não é perfeito");
        }
    }
}


