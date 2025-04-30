package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você tem: " +idade+ ", e ja é maior de idade!");
        } else {
            System.out.println("Você tem: " +idade+ ", e ainda não é maior de idade!");
        }
    }
}
