import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = teclado.nextInt();

        if (codigo == 1) {
            System.out.println("Parafuso");
        }
        else if(codigo == 2) {
            System.out.println("Porca");
        }

        else if(codigo == 3) {
            System.out.println("Prego");
        }
        else System.out.println("Diversos");
    }
}
