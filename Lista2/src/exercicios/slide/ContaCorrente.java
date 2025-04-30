package exercicios.slide;

public class ContaCorrente {

    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    public void credito(double valor) {
        this.saldo += valor;
    }

    public void debito(double valor) {
        this.saldo -= valor;
    }

    public void resumo() {
        System.out.println("Número da conta corrente: " + this.numero);
        System.out.println("Nome do primeiro titular: " + this.primeiroTitular.nome);
        System.out.println("Nome do segundo titular: " + this.segundoTitular.nome);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite atual: " + (this.limiteTotal + this.saldo));
        System.out.println("Limite total: " + this.limiteTotal);

        boolean devendo = estaDevedor();

        if(devendo) System.out.println("Procure seu gerente!");

    }

    public boolean estaDevedor() {
        if (saldo < 0) {
            return true;
        }
        return false;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPrimeiroTitular() {
        return primeiroTitular;
    }

    public void setPrimeiroTitular(Cliente primeiroTitular) {
        this.primeiroTitular = primeiroTitular;
    }

    public Cliente getSegundoTitular() {
        return segundoTitular;
    }

    public void setSegundoTitular(Cliente segundoTitular) {
        this.segundoTitular = segundoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }
}

