package exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite o dia do aniversário da primeira pessoa: ");
        int diaAniversario = sc.nextInt();

        System.out.println("Digite o mês do aniversário da primeira pessoa: ");
        int mesAniversario = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.println("Digite o dia do aniversário da segunda pessoa: ");
        int diaAniversario2 = sc.nextInt();

        System.out.println("Digite o mês do aniversário da segunda pessoa: ");
        int mesAniversario2 = sc.nextInt();

        if(diaAniversario < 0 || diaAniversario2 < 0 || mesAniversario < 0 || mesAniversario2 < 0) {
            System.out.println("Os dias e meses digitados não podem ser negativos.");
        } else {
            if(diaAniversario == diaAniversario2 && mesAniversario == mesAniversario2) {
                System.out.println("As duas pessoas fazem aniversário no mesmo dia!");
            } else if (diaAniversario > diaAniversario2 && mesAniversario == mesAniversario2) {
                System.out.println("A pessoa mais velha é: " + nome2 + ", de acordo com a data fornecida: " + diaAniversario2 + "/" + mesAniversario2);
                System.out.println("A pessoa mais nova é: " + nome1 + ", de acordo com a data fornecida: " + diaAniversario + "/" + mesAniversario);
            } else if (diaAniversario < diaAniversario2 && mesAniversario == mesAniversario2) {
                System.out.println("A pessoa mais velha é: " + nome1 + ", de acordo com a data fornecida: " + diaAniversario + "/" + mesAniversario);
                System.out.println("A pessoa mais nova é: " + nome2 + ", de acordo com a data fornecida: " + diaAniversario2 + "/" + mesAniversario2);
            } else if (mesAniversario > mesAniversario2) {
                System.out.println("A pessoa mais velha é: " + nome2 + ", de acordo com a data fornecida: " + diaAniversario2 + "/" + mesAniversario2);
                System.out.println("A pessoa mais nova é: " + nome1 + ", de acordo com a data fornecida: " + diaAniversario + "/" + mesAniversario);
            } else if (mesAniversario < mesAniversario2) {
                System.out.println("A pessoa mais velha é: " + nome1 + ", de acordo com a data fornecida: " + diaAniversario + "/" + mesAniversario);
                System.out.println("A pessoa mais nova é: " + nome2 + ", de acordo com a data fornecida: " + diaAniversario2 + "/" + mesAniversario2);

            }
        }
    }
}
