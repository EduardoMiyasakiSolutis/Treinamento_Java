package classes.funcionario;

public class Vendedor extends Funcionario {

    public Vendedor() {
        this.comissao = 250;
    }

    @Override
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
        renda += comissao;
        return renda;
    }
}
