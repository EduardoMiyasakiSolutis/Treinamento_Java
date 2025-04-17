package Exercicio_Pessoa.Classes.Subclasse;

public class Administrador extends Empregado {

    double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto) + ajudaDeCusto;
    }
}
