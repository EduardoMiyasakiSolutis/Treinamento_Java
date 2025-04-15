package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePacientes = 0;
        int somaIdadeHomens = 0;
        int quantidadeHomens = 0;
        int mulheresAlturaPeso = 0;
        int pessoasIdade18a25 = 0;
        String nomePacienteMaisVelho = "";
        int idadePacienteMaisVelho = 0;
        String nomeMulherMaisBaixa = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;

        while (true) {
            System.out.println("Digite o nome do paciente (ou 'fim' para encerrar): ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o sexo do paciente (M/F): ");
            char sexo = sc.nextLine().toUpperCase().charAt(0);

            System.out.println("Digite o peso do paciente (kg): ");
            double peso = sc.nextDouble();

            System.out.println("Digite a idade do paciente: ");
            int idade = sc.nextInt();

            System.out.println("Digite a altura do paciente (m): ");
            double altura = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha

            quantidadePacientes++;

            if (sexo == 'M') {
                somaIdadeHomens += idade;
                quantidadeHomens++;
            }

            if (sexo == 'F' && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                mulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                pessoasIdade18a25++;
            }

            if (idade > idadePacienteMaisVelho) {
                idadePacienteMaisVelho = idade;
                nomePacienteMaisVelho = nome;
            }

            if (sexo == 'F' && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
        }

        System.out.println("\nRelatório:");
        System.out.println("--> Quantidade de pacientes: " + quantidadePacientes);
        System.out.println("--> Média de idade dos homens: " + (somaIdadeHomens / (double) quantidadeHomens));
        System.out.println("--> Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheresAlturaPeso);
        System.out.println("--> Quantidade de pessoas com idade entre 18 e 25: " + pessoasIdade18a25);
        System.out.println("--> Nome do paciente mais velho: " + nomePacienteMaisVelho);
        System.out.println("--> Nome da mulher mais baixa: " + nomeMulherMaisBaixa);

    }
}
