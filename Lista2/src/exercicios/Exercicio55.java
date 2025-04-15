package exercicios;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNumero = new Scanner(System.in);

        double PLANO_MENSAL = 50.0;
        double MINUTOS_MENSAL = 100;
        double MINUTOS_MENSAL_VAI_VAI = 50;
        double minutos_plus_VAI_VAI = MINUTOS_MENSAL + MINUTOS_MENSAL_VAI_VAI;
        double saldo = 0;
        int ligacao = 0;

        String menu = String.format("""
                0 - Ligar
                1 - Sair
                """);

        String tipo = "";
        int minutos = 0;

        while (ligacao != 1) {
            System.out.println(menu);
            System.out.print("Informe sua opção: ");
            ligacao = scNumero.nextInt();

            System.out.println("Informe o tipo de ligação: ");
            System.out.println("'o' = outras operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo");
            tipo = sc.nextLine();

            System.out.println("Informe a quantidade de minutos da ligação: ");
            minutos = scNumero.nextInt();

            if (tipo.equals("o")) {
                if (minutos <= MINUTOS_MENSAL) {
                    MINUTOS_MENSAL -= minutos;
                } else {
                    double excedente = minutos - MINUTOS_MENSAL;
                    saldo += excedente * 0.65;
                    MINUTOS_MENSAL = 0;
                }
            } else if (tipo.equals("v")) {
                if (minutos <= minutos_plus_VAI_VAI) {
                    minutos_plus_VAI_VAI -= minutos;
                } else {
                    double excedente = minutos - minutos_plus_VAI_VAI;
                    saldo += excedente * 0.20;
                    minutos_plus_VAI_VAI = 0;
                }
        } else if (tipo.equals("f")) {
                int minutosConvertidos = minutos / 2;
                if (minutosConvertidos <= MINUTOS_MENSAL) {
                    MINUTOS_MENSAL -= minutosConvertidos;
                } else {
                    double excedente = minutosConvertidos - MINUTOS_MENSAL;
                    saldo += excedente * 0.65;
                    MINUTOS_MENSAL = 0;
                }
            }

            System.out.println("Valor a pagar: R$" + saldo );
            System.out.println("Quantidade de minutos do plano VAI_VAI: " + minutos_plus_VAI_VAI);
            System.out.println("Quantidade de minutos do plano: " + MINUTOS_MENSAL);
        }



    }
}
