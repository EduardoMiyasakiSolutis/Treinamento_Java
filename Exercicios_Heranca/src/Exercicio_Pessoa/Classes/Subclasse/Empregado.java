package Exercicio_Pessoa.Classes.Subclasse;

import Exercicio_Pessoa.Classes.Pessoa.Pessoa;

public class Empregado extends Pessoa {

    int codigoSetor;
    double salarioBase;
    double imposto;

    public Empregado(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto);
    }
}
