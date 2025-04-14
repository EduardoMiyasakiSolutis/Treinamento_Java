import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero <= 50) {
            System.out.print("Digite um número: ");
            soma += teclado.nextInt();
            numero++;
        }


        double mediaDosValores = (double) soma / 50;
        System.out.println("A média dos valores inseridos é " + mediaDosValores);

    }
}
