package classes;

public class Cachorro extends AnimalAB{


    @Override
    public void comer() {
        System.out.println("Comendo: AU AU AU AU");
        qtdComida += 3;
    }

    @Override
    public void moverse() {
        System.out.println("Movendo: AU AU AU AU ");
        caminhoPercorrido += 3;
    }

    @Override
    public void dormir() {
        super.dormir();
        qtddHorasDormidas += 14;
    }
}