package classes.funcionario;

public class Supervisor extends Funcionario{

    private double COMISSAO = 600.0;

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
