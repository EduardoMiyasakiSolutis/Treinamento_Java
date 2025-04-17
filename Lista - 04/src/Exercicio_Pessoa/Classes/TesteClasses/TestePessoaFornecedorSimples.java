package Exercicio_Pessoa.Classes.TesteClasses;

import Exercicio_Pessoa.Classes.Pessoa.Pessoa;
import Exercicio_Pessoa.Classes.Subclasse.Fornecedor;

public class TestePessoaFornecedorSimples {

    public static void imprimirPessoa(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }

    public static void imprimirFornecedor(Fornecedor fornecedor) {
        imprimirPessoa(fornecedor); // Reutiliza o método para imprimir os dados de Pessoa
        System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());
    }

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Pessoa ---");

        Pessoa pessoa1 = new Pessoa("João Silva", "Rua das Flores, 123", "11 9999-8888");
        System.out.println("Pessoa 1:");
        imprimirPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa("Maria Oliveira", "11 7777-6666");
        System.out.println("\nPessoa 2:");
        imprimirPessoa(pessoa2);

        pessoa1.setEndereco("Avenida Principal, 456");
        System.out.println("\nPessoa 1 (após modificação do endereço):");
        System.out.println("Endereço: " + pessoa1.getEndereco());

        pessoa2.setTelefone("11 5555-4444");
        System.out.println("\nPessoa 2 (após modificação do telefone):");
        System.out.println("Telefone: " + pessoa2.getTelefone());

        // Testando o método setNome
        pessoa1.setNome("João da Silva");
        System.out.println("\nPessoa 1 (após modificação do nome):");
        System.out.println("Nome: " + pessoa1.getNome());

        pessoa2.setNome("Maria de Oliveira");
        System.out.println("\nPessoa 2 (após modificação do nome):");
        System.out.println("Nome: " + pessoa2.getNome());

        System.out.println("\n--- Testando a Classe Fornecedor ---");

        Fornecedor fornecedor1 = new Fornecedor("Empresa ABC", "Rua dos Negócios, 789", "21 3333-2222");
        fornecedor1.setValorCredito(1000.00);
        fornecedor1.setValorDivida(200.00);
        System.out.println("Fornecedor 1:");
        imprimirFornecedor(fornecedor1);

        // Testando o método setNome herdado em Fornecedor
        fornecedor1.setNome("ABC Produtos");
        System.out.println("\nFornecedor 1 (após modificação do nome):");
        System.out.println("Nome: " + fornecedor1.getNome());

        Fornecedor fornecedor2 = new Fornecedor("Fornecedor XYZ", "Avenida Industrial, 1011", "15 8888-7777");
        fornecedor2.setValorCredito(500.00);
        fornecedor2.setValorDivida(0.0);
        System.out.println("\nFornecedor 2:");
        imprimirFornecedor(fornecedor2);

        // Testando o método setNome herdado em Fornecedor
        fornecedor2.setNome("XYZ Suprimentos");
        System.out.println("\nFornecedor 2 (após modificação do nome):");
        System.out.println("Nome: " + fornecedor2.getNome());
    }
}