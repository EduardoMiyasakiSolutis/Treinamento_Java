package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio49 {

    public static void main(String[] args) {
        List<Long> fibonacci = new ArrayList<>();
        fibonacci.add(1l);
        fibonacci.add(1l);
        for (int i = 1; i <= 50; i++) {
            Long proximoNumero = fibonacci.get(i) + fibonacci.get(i - 1);
            fibonacci.add(proximoNumero);
        }

        fibonacci.forEach(System.out::println);
    }
}
