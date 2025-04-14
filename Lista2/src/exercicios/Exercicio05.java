package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial do débito: ");
        double valorInicial = sc.nextDouble();

        System.out.println("Digite a quantidade de meses: ");
        double quantidadeMeses = sc.nextDouble();

        System.out.println("Digite a taxa de juros mensais: ");
        double taxaJuros = sc.nextDouble();

        double valorFinal = valorInicial * (1 + (taxaJuros / 100) * quantidadeMeses);
        System.out.println("O valor final do débito é: " + valorFinal);

        double valorFinalArredondado = Math.round(valorFinal * 100.0) / 100.0;
        System.out.println("O valor final do débito arredondado é: " + valorFinalArredondado);

    }
}
