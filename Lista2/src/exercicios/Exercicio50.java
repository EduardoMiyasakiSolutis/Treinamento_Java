package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        List<Long> fibonacci = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição de fibonacci que você deseja: ");
        int numeroDesejado = sc.nextInt();

        fibonacci.add(1l);
        fibonacci.add(1l);
        for (int i = 1; i <= numeroDesejado - 2; i++) {
            Long proximoNumero = fibonacci.get(i) + fibonacci.get(i - 1);
            fibonacci.add(proximoNumero);
        }

        System.out.println(fibonacci.getLast());;
    }
}
