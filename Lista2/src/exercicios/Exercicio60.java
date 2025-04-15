package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> listaValorDivida = new ArrayList<>();

        System.out.println("Informe o valor da dívida: ");
        double divida = sc.nextDouble();

        System.out.println("Informe a taxa de correção: ");
        double correcao = sc.nextDouble();

        System.out.println("Informe a quantidade de anos: ");
        int anos = sc.nextInt();

        int contador = 0;
        while (contador != anos) {
            contador++;

            for (int i = 1 ; i <= anos*12; i++){
                double valorMes = divida*correcao;
                System.out.println(valorMes);
            }

        }
    }
}
