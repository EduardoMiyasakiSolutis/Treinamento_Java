package exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if(num1 < 0 || num2 < 0) {
            System.out.println("Os número digitados não podem ser negativos.");
        } else {

        if (num1 > num2) {
            System.out.println("Em ordem crescente: " + num2 + ", " + num1);
        } else if (num1 < num2) {
            System.out.println("Em ordem crescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
        }
    }
}
