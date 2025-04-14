import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<String> listaDePalavras = new ArrayList<>();

        System.out.println("Escreva um palavra");
        String palavra1 = teclado.nextLine();
        listaDePalavras.add(palavra1);

        System.out.println("Escreva outra palavra");
        String palavra2 = teclado.nextLine();
        listaDePalavras.add(palavra2);

        listaDePalavras.sort(String::compareTo);

        if (palavra1.length() > palavra2.length()) {
            System.out.println(palavra1 + " tem mais caracteres que " + palavra2 + ". Contendo " + palavra1.length() + " letras");
        } else if (palavra1.length() == palavra2.length()) {
            System.out.println("As duas palavras tem o mesmo tamanho");
        } else {
            System.out.println(palavra2 + " tem mais caracteres que " + palavra1 + ". Contendo " + palavra2.length() + " letras");
        }

        listaDePalavras.forEach(System.out::println);


    }
}
