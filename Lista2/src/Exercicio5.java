import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        // Calcule e exiba o valor final de uma dívida.
        // Para isto pergunte ao usuário o valor inicial do débito,
        // a quantidade de meses e os juros mensais. Use o calculo de juros simples.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do débito inicial: ");
        float dividaInicial = teclado.nextFloat();

        System.out.print("Informe a quantidade de meses: ");
        int mesesDivida = teclado.nextInt();

        System.out.print("Informe o juros mensal");
        float juros = teclado.nextFloat();

        float valorJuros = dividaInicial * mesesDivida * juros;
        float dividaFinal = dividaInicial + valorJuros;
        System.out.println(dividaFinal);
    }
}
