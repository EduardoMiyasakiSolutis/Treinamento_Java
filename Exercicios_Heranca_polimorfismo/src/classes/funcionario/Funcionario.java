package classes.funcionario;

public class Funcionario {

  protected String nome;
  protected int codigoFuncional;

  protected boolean ensinoBasico;
  protected boolean ensinoMedio;
  protected boolean graduacao;

  protected String escola;
  protected String universidade;

  protected double renda = 1000.0;
  protected double comissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public boolean isEnsinoBasico() {
        return ensinoBasico;
    }

    public void setEnsinoBasico(boolean ensinoBasico) {
        this.ensinoBasico = ensinoBasico;
    }

    public boolean isEnsinoMedio() {
        return ensinoMedio;
    }

    public void setEnsinoMedio(boolean ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }

    public boolean isGraduacao() {
        return graduacao;
    }

    public void setGraduacao(boolean graduacao) {
        this.graduacao = graduacao;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "nome -> " + nome + "\n" +
                "Renda -> " + renda + "\n" +
                "Comissão -> " + comissao + "\n" +
                ", codigoFuncional -> " + codigoFuncional + "\n" +
                ", ensinoBasico -> " + ensinoBasico + "\n" +
                ", ensinoMedio -> " + ensinoMedio + "\n" +
                ", graduacao -> " + graduacao + "\n" +
                ", escola ->" + escola + "\n" +
                ", universidade -> " + universidade + "\n";
    }

    public double verificarRenda() {
        if (ensinoBasico) {
            renda += (renda * 0.1);
        }
        if (ensinoMedio) {
            renda += (renda * 0.5);
        }
        if (graduacao) {
            renda += (renda * 1);
        }
        renda = renda + comissao;
        return renda + comissao;
    }
}
