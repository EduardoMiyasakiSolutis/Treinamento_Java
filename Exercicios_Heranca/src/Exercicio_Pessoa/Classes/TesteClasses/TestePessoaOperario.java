package Exercicio_Pessoa.Classes.TesteClasses;

import Exercicio_Pessoa.Classes.Subclasse.Operario;

public class TestePessoaOperario {
    public static void main(String[] args) {
        // 1. Crie uma instância da classe Operario
        Operario operario = new Operario("Maria Souza", "Avenida Brasil, 456", "(21) 88888-7777");

        // 2. Defina os atributos específicos de Operario e o salário base
        operario.setValorProducao(1000.00);
        operario.setComissao(0.10 * operario.getValorProducao()); // 10% de comissão sobre o valor da produção
        operario.setSalarioBase(2500.00);

        // 3. Execute o método calcularSalario()
        double salarioFinal = operario.calcularSalario();

        // 4. Verifique se o resultado é o esperado
        double salarioEsperado = 2500.00 + (0.10 * 1000.00); // salarioBase + comissao
        if (salarioFinal == salarioEsperado) {
            System.out.println("Teste de calcularSalario() para Operario passou!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        } else {
            System.out.println("Teste de calcularSalario() para Operario FALHOU!");
            System.out.println("Salário final calculado: " + salarioFinal);
            System.out.println("Salário esperado: " + salarioEsperado);
        }

        // 5. Opcional: Teste os métodos getters
        System.out.println("\nInformações do Operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Valor da Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário Base: " + operario.getSalarioBase());
    }
}