package exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu nome");
        String nome = sc.nextLine();

        System.out.println("Insira o seu cargo: ");
        String cargo = sc.nextLine();

        System.out.println("Insira o seu salário: ");
        double salario = sc.nextDouble();

        double emprestimoDiretoria = salario * 0.3;
        double emprestimoGerente = salario * 0.25;
        double emprestimoOperacional = salario * 0.2;

        String mensagem = "";

        if(cargo.equals("Diretor") || cargo.equals("diretor")){
            double valorEmprestimo = emprestimoDiretoria;
            mensagem = "Olá " + nome + ", o valor do seu empréstimo é: " + valorEmprestimo + ", de acordo com o seu cargo: " + cargo;
        } else if (cargo.equals("Gerente") || cargo.equals("gerente")){
            double valorEmprestimo = emprestimoGerente;
            mensagem = "Olá " + nome + ", o valor do seu empréstimo é: " + valorEmprestimo + ", de acordo com o seu cargo: " + cargo;
        } else if (cargo.equals("Operacional") || cargo.equals("operacional")){
            double valorEmprestimo = emprestimoOperacional;
            mensagem = "Olá " + nome + ", o valor do seu empréstimo é: " + valorEmprestimo + ", de acordo com o seu cargo: " + cargo;
        } else {
            System.out.println("Cargo inválido");
        }

        System.out.println(mensagem);
    }
}
