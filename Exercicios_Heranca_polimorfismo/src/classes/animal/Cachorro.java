package classes.animal;

public class Cachorro extends Animal {

    @Override
    public String emitirSom() {
        return "AU AU AU";
    }

    @Override
    public String mover() {
        return " Correndo : au au";
    }
}
