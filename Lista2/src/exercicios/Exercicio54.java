package exercicios;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();

        System.out.println("Informe quantos reais você tem: ");
        double reais = sc.nextDouble();

        System.out.printf("Com %.2f R$ você tem em dólares %.2f $", reais, reais/cotacaoDolar);

    }
}
