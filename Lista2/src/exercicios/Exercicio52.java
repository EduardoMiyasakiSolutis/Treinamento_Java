package exercicios;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {

        BigInteger somaGraos = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
           somaGraos  = somaGraos.multiply(BigInteger.valueOf(i));
            System.out.println("Na " + i + "° casa será distribuido " + somaGraos);
        }
    }
}
