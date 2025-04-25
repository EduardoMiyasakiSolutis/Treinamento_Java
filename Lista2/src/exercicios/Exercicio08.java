package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de números racionais em números reais!!!");

        System.out.println("Digite o numerador: ");
        double numerador = sc.nextDouble();

        System.out.println("Digite o denominador: ");
        double denominador = sc.nextDouble();

        if (numerador != 0) {
            double numeroReal = numerador / denominador;
            System.out.println("O número real correspondente é: " + numeroReal);
        } else {
            System.out.println("O numerador não pode ser zero, pois o resultado será indefinido.");
        }
    }
}
