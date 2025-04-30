package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total da conta: ");
        double valorTotal = sc.nextDouble();
        double TaxaDeServiço = 0.10;
        double valorFinal = valorTotal + (valorTotal * TaxaDeServiço);

        System.out.println("O valor total da conta com a taxa de serviço é: " + valorFinal);

    }
}
