import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua 1° nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Informe sua 2° nota: ");
        float n2 = teclado.nextFloat();

        System.out.print("Informe sua 3° nota: ");
        float n3 = teclado.nextFloat();

        System.out.print("Informe sua 4° nota: ");
        float n4 = teclado.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é de " + media);
    }
}
