import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite um número: ");
        int n2 = teclado.nextInt();
        int n3 = n2;

        System.out.println("Valores antes da alteração: ");
        System.out.println("A = " + n1);
        System.out.println("B = " + n2);

        System.out.println("Valores depois da alteração: ");

        n2 = n1;
        n1 = n3;
        System.out.println("A = " + n1);
        System.out.println("B = " + n2);
    }

}
