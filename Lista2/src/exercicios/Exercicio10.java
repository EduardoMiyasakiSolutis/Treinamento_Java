package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário líquido: ");
        double salarioLiquido = sc.nextDouble();

        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        double porcentagem = 0.30 * salarioLiquido;

        /*faça um if para liberar o empréstimo apenas se o valor do emprestimo for menor que 30% do salário liquido*/
        if (valorEmprestimo <= porcentagem) {
            System.out.println("Empréstimo liberado!");
        } else {
            System.out.println("Empréstimo não liberado!");
        }
    }
}
