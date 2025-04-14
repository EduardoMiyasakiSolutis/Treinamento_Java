
package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();
        System.out.println("Saiba a ordem dos números.");
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = sc.nextInt();

        listaNumeros.add(n1);
        listaNumeros.add(n2);
        listaNumeros.add(n3);

        listaNumeros.stream().sorted().forEach(System.out::println);
    }
}
