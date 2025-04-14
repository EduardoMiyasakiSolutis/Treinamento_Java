package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens na sala: ");
        int quantidadeHomens = sc.nextInt();

        System.out.println("Digite a quantidade de mulheres na sala: ");
        int quantidadeMulheres = sc.nextInt();

        int totalPessoas = quantidadeHomens + quantidadeMulheres;
        double percentualHomens = (double) quantidadeHomens / totalPessoas * 100;
        double percentualMulheres = (double) quantidadeMulheres / totalPessoas * 100;

        double percentualHomensArredondado = Math.round(percentualHomens * 100.0) / 100.0;
        double percentualMulheresArredondado = Math.round(percentualMulheres * 100.0) / 100.0;

        System.out.println("A porcentagem de homens na sala é: " + percentualHomens + "%");
        System.out.println("A porcentagem de mulheres na sala é: " + percentualMulheres + "%");

        System.out.println("A porcentagem de homens na sala é: " + percentualHomensArredondado + "%");
        System.out.println("A porcentagem de mulheres na sala é: " + percentualMulheresArredondado + "%");

    }
}
