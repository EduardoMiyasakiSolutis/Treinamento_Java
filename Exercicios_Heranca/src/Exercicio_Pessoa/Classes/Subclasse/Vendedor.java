package Exercicio_Pessoa.Classes.Subclasse;

public class Vendedor extends Empregado{

    double valorVendas;
    double comissao;

    public Vendedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    @Override
    public double calcularSalario() {
        return  salarioBase - (salarioBase * imposto) + comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
