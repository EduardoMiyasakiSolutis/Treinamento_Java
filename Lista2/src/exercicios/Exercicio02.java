package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor atual do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite o valor do salário do seu salário: ");
        double salario = sc.nextDouble();

        double quantidadeSalariosMinimos = salario / salarioMinimo;
        System.out.println("Você recebe " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
