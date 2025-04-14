package exercicios;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;

        int contador = 0;
        double numeroAleatorio = Math.round(Math.random() * (max - min) + min);

        int numero = 0;
        while (numeroAleatorio != numero) {
            contador++;
            System.out.println("Informe um número: ");
            numero = sc.nextInt();
            if(numero > numeroAleatorio){
                System.out.println("opss, você errou! O número digitado é maior que o sorteado.");
            } else if(numero < numeroAleatorio){
                System.out.println("opss, você errou! O número digitado é menor que o sorteado.");
            } else {
                System.out.println("Opaaa, você acertou!");

            }
        }
        var mensagem = "Você acertou em: " +contador+ " Tentativas.";
        System.out.println(mensagem);
    }
}
