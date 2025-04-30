package exercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();

        BigInteger soma = BigInteger.valueOf(n1);

        for (int i = n1 - 1; i > 0; i--) {
            System.out.println(i);
            soma = soma.multiply(BigInteger.valueOf(i));

        }
        System.out.println("A fatorial de " + n1 + " é " + soma);

    }
}
