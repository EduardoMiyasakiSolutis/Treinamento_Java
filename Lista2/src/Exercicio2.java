import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        //  Calcule e exiba a quantidade de salários mínimos

        Scanner teclado = new Scanner(System.in);

        double quantidadeSalarioMinimos = 0;

        System.out.print("Informe o valor do salário mínimo:");
        double salarioMinimo = teclado.nextDouble();

        System.out.print("Informe o seu salário:");
        double salario = teclado.nextDouble();

        quantidadeSalarioMinimos = salario / salarioMinimo;

        System.out.println("A quantidade de salários mínimo que você recebe é " + quantidadeSalarioMinimos);
    }
}
