package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos.");
    }
}