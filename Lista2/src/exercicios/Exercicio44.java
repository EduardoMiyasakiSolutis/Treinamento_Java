package exercicios;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores que você irá fornecer: ");
        int valores = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= valores; i++) {
            System.out.println("Insira o " +i+ "° número: ");
            soma += sc.nextInt();
        }

        double mediaArimetica = soma / valores;
        System.out.println("A média aritmética dos valores fornecidos é de: " + mediaArimetica);
    }
}
