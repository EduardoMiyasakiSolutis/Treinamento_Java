package classes;

public class Gato extends AnimalAB{
    @Override
    public void comer() {
        qtdComida += 2;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 2;
    }

    @Override
    public void dormir() {
        qtddHorasDormidas += 20;
    }
}
