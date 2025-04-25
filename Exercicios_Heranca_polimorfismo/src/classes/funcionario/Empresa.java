package classes.funcionario;

public class Empresa {

    public Funcionario[] funcionarios = new Funcionario[10];
    private double folhaPagamento;

    public void adicionarSalario(Funcionario f) {
        folhaPagamento += f.getRenda();
    }

    public double getFolhaPagamento() {
        return folhaPagamento;
    }

    public void setFolhaPagamento(double folhaPagamento) {
        this.folhaPagamento = folhaPagamento;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
