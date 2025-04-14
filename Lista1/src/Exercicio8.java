import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira uma palavra");
        verificadorAnagrama(teclado.next());
    }

    public static void verificadorAnagrama(String palavra) {

        var stringInvertida = new StringBuilder(palavra).reverse().toString();

        if (stringInvertida.equals(palavra)) {
            System.out.println(palavra + " , é um palindromo");
        } else System.out.println("Não é um palindromo");
    }
}
