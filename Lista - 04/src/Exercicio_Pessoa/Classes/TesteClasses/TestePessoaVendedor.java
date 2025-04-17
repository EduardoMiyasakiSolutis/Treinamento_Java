package Exercicio_Pessoa.Classes.TesteClasses;

import Exercicio_Pessoa.Classes.Subclasse.Vendedor;

public class TestePessoaVendedor {
    public static void main(String[] args) {
        // 1. Crie uma instância da classe Vendedor
        Vendedor vendedor = new Vendedor("Carlos Pereira", "Rua dos Lírios, 789", "(15) 77777-6666");

        // 2. Defina os atributos específicos de Vendedor e o salário base
        vendedor.setSalarioBase(2800.00);
        vendedor.setValorVendas(5000.00);
        vendedor.setComissao(0.05 * vendedor.getValorVendas()); // 5% de comissão sobre o valor das vendas

        // 3. Execute o método calcularSalario()
        double salarioFinal = vendedor.calcularSalario();

        // 4. Verifique se o resultado é o esperado
        double salarioEsperado = 2800.00 + (0.05 * 5000.00); // salarioBase + comissao
        if (salarioFinal == salarioEsperado) {
            System.out.println("Teste de calcularSalario() para Vendedor passou!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        } else {
            System.out.println("Teste de calcularSalario() para Vendedor FALHOU!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        }

        // 5. Opcional: Teste os métodos getters
        System.out.println("\nInformações do Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
    }
}