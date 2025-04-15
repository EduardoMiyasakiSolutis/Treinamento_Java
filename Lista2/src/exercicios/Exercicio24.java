package exercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe o ano: ");
            int ano = sc.nextInt();

            System.out.println("Informe o mês: ");
            int mes = sc.nextInt();

            System.out.println("Informe o dia: ");
            int dias = sc.nextInt();

            LocalDate data1 = LocalDate.of(ano, mes, dias);
            System.out.println(data1);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
