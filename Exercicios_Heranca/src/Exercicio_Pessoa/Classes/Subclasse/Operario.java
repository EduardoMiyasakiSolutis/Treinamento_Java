package Exercicio_Pessoa.Classes.Subclasse;

public class Operario extends Empregado {

    double valorProducao;
    double comissao;

    public Operario(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }


    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto) + comissao;
    }

}
