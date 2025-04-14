package exercicios;

import java.util.Scanner;

public class Exercicio15_16_17_18 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dia (DD): ");
        int dia = sc.nextInt();

        System.out.println("Insira o mês (MM): ");
        int mes = sc.nextInt();

        System.out.println("Insira o ano (AAAA): ");
        int ano = sc.nextInt();

        System.out.println("Insira o ano em que estamos: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - ano;
        System.out.println("Você ja fez ou fará " +idade+ " anos.");

        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12) {
            System.out.println("Data : " + dia + "/" + mes);
        } else {
            System.out.println("Data inválida.");
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                System.out.println("Data inválida.");
            }
        } else if (mes == 2) {
            if (dia > 29) {
                System.out.println("Data inválida.");
            }
        }

        switch (mes) {
            case 1:
                System.out.println("O mês 1 é Janeiro.");
                break;
            case 2:
                System.out.println("O mês 2 é Fevereiro.");
                break;
            case 3:
                System.out.println("O mês 3 é Março.");
                break;
            case 4:
                System.out.println("O mês 4 é Abril.");
                break;
            case 5:
                System.out.println("O mês 5 é Maio.");
                break;
            case 6:
                System.out.println("O mês 6 é Junho.");
                break;
            case 7:
                System.out.println("O mês 7 é Julho.");
                break;
            case 8:
                System.out.println("O mês 8 é Agosto.");
                break;
            case 9:
                System.out.println("O mês 9 é Setembro.");
                break;
            case 10:
                System.out.println("O mês 10 é Outubro.");
                break;
            case 11:
                System.out.println("O mês 11 é Novembro.");
                break;
            case 12:
                System.out.println("O mês 12 é Dezembro.");
                break;
        }

        if(mes == 1 || mes == 2 || mes == 3){
            System.out.println("Você nasceu no primeiro trimestre do ano!");
        } else if(mes == 4 || mes == 5 || mes == 6){
            System.out.println("Você nasceu no segundo trimestre do ano!");
        } else if(mes == 7 || mes == 8 || mes == 9){
            System.out.println("Você nasceu no terceiro trimestre do ano!");
        } else {
            System.out.println("Você nasceu no quarto trimestre do ano!");
        }

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 18 )){
            System.out.println("Você é do signo de Aquário.");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)){
            System.out.println("Você é do signo de Peixes.");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)){
            System.out.println("Você é do signo de Áries.");
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)){
            System.out.println("Você é do signo de Touro.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)){
            System.out.println("Você é do signo de Gêmeos.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)){
            System.out.println("Você é do signo de Câncer.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)){
            System.out.println("Você é do signo de Leão.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)){
            System.out.println("Você é do signo de Virgem.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)){
            System.out.println("Você é do signo de Libra.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){
            System.out.println("Você é do signo de Escorpião.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){
            System.out.println("Você é do signo de Sagitário.");
        } else {
            System.out.println("Você é do signo de Capricórnio.");
        }

    }
}
