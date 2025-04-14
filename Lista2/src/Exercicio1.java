import java.util.Calendar;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        // Determine qual é a idade que o usuário faz no ano atual.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento");
        int anoNascimento = teclado.nextInt();

        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(1);

        int idade = ano - anoNascimento;

        System.out.println("Você tem " + idade + " anos");

    }
}
