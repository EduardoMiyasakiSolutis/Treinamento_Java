import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            soma += teclado.nextInt();
            numero++;
        } while (numero <= 50);


        double mediaDosValores = (double) soma / 50;
        System.out.println("A média dos valores inseridos é " + mediaDosValores);

    }
}
