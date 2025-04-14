package exercicios;
import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (i < 10) {
                    System.out.print("0" + i + " ");
                } else  System.out.print(i + " ");

            }
            System.out.println();

        }
    }
}



