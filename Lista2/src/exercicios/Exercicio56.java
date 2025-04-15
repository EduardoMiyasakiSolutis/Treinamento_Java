package exercicios;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do 1° candidato: ");
        String candidato1 = sc.nextLine();

        System.out.println("Informe o nome do 2° candidato: ");
        String candidato2 = sc.nextLine();

        System.out.println("Informe o nome do 3° candidato: ");
        String candidato3 = sc.nextLine();

        int qtdVoto1 = 0;
        int qtdVoto2 = 0;
        int qtdVoto3 = 0;
        int qtdVotoBranco = 0;
        int qtdVotosTotais = 0;

        String menu = String.format("""
                Voto 1 para o candidato 1: %s
                Voto 2 para o candidato 2: %s
                Voto 3 para o candidato 3: %s
                Voto 4 em Branco
                Voto 5 para Sair
                """, candidato1, candidato2, candidato3).trim();


        int voto = 0;

        while (voto != 5) {
            System.out.println(menu);
            System.out.println("Informe seu voto: ");
            voto = sc.nextInt();

            if (voto == 1) {
                qtdVoto1++;
                qtdVotosTotais++;
            } else if (voto == 2) {
                qtdVoto2++;
                qtdVotosTotais++;
            } else if (voto == 3) {
                qtdVoto3++;
                qtdVotosTotais++;
            } else if (voto == 4) {
                qtdVotoBranco++;
                qtdVotosTotais++;
            } else break;
        }

        String resposta = String.format("""
                Votos para o candidato 1: %d
                Votos para o candidato 2: %d
                Votos para o candidato 3: %d
                Votos em Branco, %d
                """, qtdVoto1, qtdVoto2, qtdVoto3, qtdVotoBranco).trim();

        double porcCandidato1 = (double) qtdVoto1 / qtdVotosTotais * 100;
        double porcCandidato2 = (double) qtdVoto2 / qtdVotosTotais * 100;
        double porcCandidato3 = (double) qtdVoto3 / qtdVotosTotais * 100;
        double porcBranco = (double) qtdVotoBranco / qtdVotosTotais * 100;

            System.out.println(resposta);
        System.out.printf("Porcentagem de voto candidato 1: %.2f %%\n", porcCandidato1);
        System.out.printf("Porcentagem de voto candidato 2: %.2f %%\n", porcCandidato2);
        System.out.printf("Porcentagem de voto candidato 3: %.2f %%\n", porcCandidato3);
        System.out.printf("Porcentagem de voto em branco: %.2f %%\n", porcBranco);

    }
}
