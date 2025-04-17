package Principal;

import classes.funcionario.Funcionario;

import java.util.Scanner;

public class MainFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNumero = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        String resposta;

        while (true) {
            System.out.println("Informe seu nome: ");
            funcionario.setNome(sc.nextLine());

            System.out.println("Informe seu código de registro: ");
            funcionario.setCodigoFuncional(scNumero.nextInt());

            System.out.println("Você concluiu o ensino básico? (s/n)");
            resposta = sc.nextLine().toUpperCase();

            if (resposta.contains("S")) {
                funcionario.setEnsinoBasico(true);
                System.out.println("Informe o nome da escola: ");
                funcionario.setEscola(sc.nextLine().toUpperCase());
            } else {
                funcionario.setEnsinoBasico(false);
                break;
            }
            System.out.println("Você concluiu o ensino médio? (S/N)");
            resposta = sc.nextLine().toUpperCase();

            if (resposta.contains("S")) {
                funcionario.setEnsinoMedio(true);
            } else {
                funcionario.setEnsinoMedio(false);
                break;
            }

            System.out.println("Você concluiu alguma graduação? (S/N)");
            resposta = sc.nextLine().toUpperCase();

            if (resposta.contains("S")) {
                funcionario.setGraduacao(true);
                System.out.println("Informe o nome da instituição: ");
                funcionario.setUniversidade(sc.nextLine());
            } else {
                funcionario.setGraduacao(false);
                break;
            }
            break;
        }

        System.out.println(funcionario.toString());
        System.out.println(funcionario.verificarRenda());
    }
}
