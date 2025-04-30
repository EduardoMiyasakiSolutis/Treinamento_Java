package exercicios;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números sorteados");
        int numeros = sc.nextInt();

        System.out.print("Informe o intervalo Mínimo");
        int min = sc.nextInt();

        System.out.print("Informe o intevalo Máximo");
        int max = sc.nextInt();

        for (int i = 0; i < numeros; i++) {
            double numeroAleatorio = Math.round(Math.random() * (max - min) + min);
            System.out.println(numeroAleatorio);
        }
    }
}
