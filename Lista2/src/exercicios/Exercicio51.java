package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        List<Long> fibonacci = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição de fibonacci que você deseja: ");
        int numeroDesejado = sc.nextInt();

        fibonacci.add(0l);
        fibonacci.add(1l);
        fibonacci.add(1l);
        for (int i = 2; i < numeroDesejado; i++) {
            Long proximoNumero = fibonacci.get(i) + fibonacci.get(i - 2) + fibonacci.get(i - 1);
            fibonacci.add(proximoNumero);
        }

        fibonacci.forEach(System.out::println);
    }
}
