package exercicios;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<----- Digite um intervalo de números e descubra quais são os numeros ímpares entre eles! -----> ");
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
