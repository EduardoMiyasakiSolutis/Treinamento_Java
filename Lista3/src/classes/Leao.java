package classes;

public class Leao extends AnimalAB {

    @Override
    public void comer() {
        qtdComida += 10;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 10;
    }

    @Override
    public void dormir() {
        qtddHorasDormidas += 20;
    }
}