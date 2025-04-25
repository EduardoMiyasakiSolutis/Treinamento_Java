package exercicios;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tabuada a ser impressa: ");
        int tabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
