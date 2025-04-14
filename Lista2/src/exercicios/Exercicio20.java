package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        if (idade1 < 0 || idade2 < 0) {
            System.out.println("As idades digitadas não podem ser negativas.");
        } else {

            if(idade1 > idade2) {
                System.out.println("A pessoa mais velha é: " + nome1 + ", com " + idade1 + " anos.");
                System.out.println("A pessoa mais nova é: " + nome2 + ", com " + idade2 + " anos.");
            } else if(idade1 < idade2) {
                System.out.println("A pessoa mais velha é: " + nome2 + ", com " + idade2 + " anos.");
                System.out.println("A pessoa mais nova é: " + nome1 + ", com " + idade1 + " anos.");
            } else {
                System.out.println("As duas pessoas têm a mesma idade: " + idade1 + " anos.");
            }

        }
    }
}