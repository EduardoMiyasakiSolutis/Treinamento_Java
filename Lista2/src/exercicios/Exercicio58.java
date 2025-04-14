package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia (DD) da primeira data: ");
        int dia1 = sc.nextInt();

        System.out.println("Informe o mês (MM) da primeira data: ");
        int mes1 = sc.nextInt();

        System.out.println("Informe o ano (AAAA) da primeira data: ");
        int ano1 = sc.nextInt();

        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);

        System.out.println("Informe quantos dias você deseja somar: ");
        int diasSoma = sc.nextInt();

        System.out.println(data1.plusDays(diasSoma));
    }
}
