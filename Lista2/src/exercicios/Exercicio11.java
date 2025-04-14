package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Você ainda não pode votar");
        } else if ((idade >= 16 && idade < 18) || (idade > 65)){
            System.out.println("Você pode votar, mas o seu voto é facultativo! ");
        } else if (idade >= 18 && idade <= 65){
            System.out.println("Você pode votar e o seu voto é obrigatório! ");
        }
    }
}
