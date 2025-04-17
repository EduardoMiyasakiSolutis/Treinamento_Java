package Exercicio_Pessoa.Classes.TesteClasses; // Crie um pacote 'Teste' para organizar seus testes

import Exercicio_Pessoa.Classes.Subclasse.Administrador;

public class TestePessoaAdministrador {
    public static void main(String[] args) {
        // 2. Crie uma instância da classe Administrador
        Administrador admin = new Administrador("João Silva", "Rua das Flores, 123", "(11) 99999-8888");

        // 3. Defina a ajuda de custo e o salário base (herdado de Empregado)
        admin.setAjudaDeCusto(500.00);
        admin.setSalarioBase(3000.00);

        // 4. Execute o método calcularSalario()
        double salarioFinal = admin.calcularSalario();

        // 5. Verifique se o resultado é o esperado
        double salarioEsperado = 3000.00 + 500.00;
        if (salarioFinal == salarioEsperado) {
            System.out.println("Teste de calcularSalario() passou!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        } else {
            System.out.println("Teste de calcularSalario() FALHOU!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        }

        // 6. Opcional: Teste os métodos getters
        System.out.println("\nInformações do Administrador:");
        System.out.println("Nome: " + admin.getNome());
        System.out.println("Endereço: " + admin.getEndereco());
        System.out.println("Telefone: " + admin.getTelefone());
        System.out.println("Ajuda de Custo: " + admin.getAjudaDeCusto());
        System.out.println("Salário Base: " + admin.getSalarioBase());
    }
}