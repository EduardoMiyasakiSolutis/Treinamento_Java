package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas para avaliação semestral: ");
        int notasAvalicao = sc.nextInt();

        List<Double> notas = new ArrayList<>();

        for (int i = 1; i <= notasAvalicao; i++) {
            System.out.println("Adicione a sua " + i + "° nota");
            notas.add(sc.nextDouble());
        }

        double mediaAritmetica = notas.stream().mapToDouble(Double::doubleValue).sum() / notas.size();

        System.out.println("Informe sua frequência: ");
        double frequencia = sc.nextDouble();

        if (mediaAritmetica >= 7.0 && frequencia >= 75) {
            System.out.println("Você foi aprovado!!!");
        } else System.out.println("Você foi reprovado");
    }
}
