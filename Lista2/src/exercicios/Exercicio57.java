package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia (DD) da primeira data: ");
        int dia1 = sc.nextInt();

        System.out.println("Informe o mês (MM) da primeira data: ");
        int mes1 = sc.nextInt();

        System.out.println("Informe o ano (AAAA) da primeira data: ");
        int ano1 = sc.nextInt();

        System.out.println("Informe o dia (DD) da segunda data: ");
        int dia2 = sc.nextInt();

        System.out.println("Informe o mês (MM) da segunda data: ");
        int mes2 = sc.nextInt();

        System.out.println("Informe o ano (AAAA) da segunda data: ");
        int ano2 = sc.nextInt();

        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

        while (data1.isBefore(data2.minusDays(1))) {
            var data3 = data1.plusDays(1);

            System.out.println(data3);
            data1 = data1.plusDays(1);
        }
    }
}
