package classes.funcionario;

public class Vendedor extends Funcionario{

    private double COMISSAO = 250.0;

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
        renda += COMISSAO;
        return renda;
    }
}
