package Exercicio_Pessoa.Classes.TesteClasses;

import Exercicio_Pessoa.Classes.Pessoa.Pessoa;
import Exercicio_Pessoa.Classes.Subclasse.Empregado;

public class TestePessoaEmpregadoSimples {

    public static void imprimirPessoa(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }

    public static void imprimirEmpregado(Empregado empregado) {
        imprimirPessoa(empregado); // Reutiliza o método para imprimir os dados de Pessoa
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto (%): " + empregado.getImposto());
        System.out.println("Salário Calculado (após imposto): " + empregado.calcularSalario());
    }

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Empregado ---");

        // Criando uma instância de Empregado usando o construtor herdado
        Empregado empregado1 = new Empregado("Carlos Souza", "Avenida dos Trabalhadores, 567", "11 4444-3333");
        empregado1.setCodigoSetor(10);
        empregado1.setSalarioBase(3000.00);
        empregado1.setImposto(0.10); // 10% de imposto

        System.out.println("Empregado 1:");
        imprimirEmpregado(empregado1);

        System.out.println("\n--- Testando modificações no Empregado 1 ---");

        empregado1.setNome("Carlos de Souza");
        empregado1.setSalarioBase(3500.00);
        empregado1.setImposto(0.12); // 12% de imposto
        empregado1.setCodigoSetor(11);
        empregado1.setEndereco("Rua Nova, 789");
        empregado1.setTelefone("11 9876-5432");

        System.out.println("Empregado 1 (após modificações):");
        imprimirEmpregado(empregado1);

        // Criando outra instância de Empregado
        Empregado empregado2 = new Empregado("Ana Pereira", "Rua das Flores, 890", "21 9999-0000");
        empregado2.setCodigoSetor(20);
        empregado2.setSalarioBase(5000.00);
        empregado2.setImposto(0.15); // 15% de imposto

        System.out.println("\nEmpregado 2:");
        imprimirEmpregado(empregado2);
    }
}