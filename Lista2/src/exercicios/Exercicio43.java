package exercicios;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 500; i++) {
            System.out.println("Insira o " +i+ "° número: ");
            soma += sc.nextInt();
        }

        double mediaArimetica = soma / 500;
        System.out.println("A média aritmética dos valores fornecidos é de: " + mediaArimetica);
    }
}
