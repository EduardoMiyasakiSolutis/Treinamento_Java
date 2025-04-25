import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n1 = teclado.nextInt();

        System.out.print("Informe outro número: ");
        int n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("O Primeiro valor digitado é o maior: " + n1);
        } else
            System.out.println("O Segundo valor digitado é o maior: " + n2);
    }


}