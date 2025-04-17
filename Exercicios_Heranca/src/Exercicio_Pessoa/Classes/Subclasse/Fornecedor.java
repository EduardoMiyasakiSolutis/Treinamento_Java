package Exercicio_Pessoa.Classes.Subclasse;

import Exercicio_Pessoa.Classes.Pessoa.Pessoa;

public class Fornecedor extends Pessoa {

    double valorCredito; //correspondente ao crédito máximo atribuído ao fornecedor
    double valorDivida;  //montante da dívida para com o fornecedor

    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }
}
