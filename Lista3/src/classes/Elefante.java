package classes;

public class Elefante extends AnimalAB {

    @Override
    public void comer() {
        qtdComida += 20;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 5;
    }

    @Override
    public void dormir() {
        qtddHorasDormidas += 2;
    }
}