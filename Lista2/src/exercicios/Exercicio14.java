package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um mês para consultar o seu númeral: ");
        String mes = sc.nextLine();

        switch (mes){
            case "janeiro":
                System.out.println("Janeiro é o 1º mês do ano.");
                break;
            case "fevereiro":
                System.out.println("Fevereiro é o 2º mês do ano.");
                break;
            case "março":
                System.out.println("Março é o 3º mês do ano.");
                break;
            case "abril":
                System.out.println("Abril é o 4º mês do ano.");
                break;
            case "maio":
                System.out.println("Maio é o 5º mês do ano.");
                break;
            case "junho":
                System.out.println("Junho é o 6º mês do ano.");
                break;
            case "julho":
                System.out.println("Julho é o 7º mês do ano.");
                break;
            case "agosto":
                System.out.println("Agosto é o 8º mês do ano.");
                break;
            case "setembro":
                System.out.println("Setembro é o 9º mês do ano.");
                break;
            case "outubro":
                System.out.println("Outubro é o 10º mês do ano.");
                break;
            case "novembro":
                System.out.println("Novembro é o 11º mês do ano.");
                break;
            case "dezembro":
                System.out.println("Dezembro é o 12º mês do ano.");
                break;
        }

        /*
        ou

        if(mes.equals("janeiro")){
            System.out.println("Janeiro é o 1º mês do ano.");
        } else if(mes.equals("fevereiro")){
            System.out.println("Fevereiro é o 2º mês do ano.");
            ...
         */

    }
}
