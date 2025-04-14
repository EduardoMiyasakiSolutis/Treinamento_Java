import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       // Solicite a quantidade de homens e de mulheres de uma turma da faculdade.
        // Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres
        // desta turma.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de homens na sua sala: ");
        float homens = teclado.nextInt();

        System.out.print("Informe a quantidade de mulheres na sua sala: ");
        float mulheres = teclado.nextInt();

        float porcentagemHomens = (homens / (homens + mulheres)) * 100;
        float porcentagemMulheres = (mulheres / (homens + mulheres)) * 100;

        System.out.println("Porcentagem de homens: " + porcentagemHomens  + "%");
        System.out.println("Porcentagem de mulheres: " + porcentagemMulheres + "%");
    }
}
