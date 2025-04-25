package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + areaCirculo);

        double areaCirculoArredondada = Math.round(areaCirculo * 100.0) / 100.0;
        System.out.println("A área do círculo arredondada é: " + areaCirculoArredondada);
    }
}
