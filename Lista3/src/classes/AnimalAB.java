package classes;

public abstract class AnimalAB implements AnimalLF { //classe abstrata
    String nome;
    int idade;
    String habitat;
    double altura;
    double peso;

    protected double qtdComida;
    protected double caminhoPercorrido;
    protected double qtddHorasDormidas;

    @Override
    public void comer() {
        System.out.println("Comendo: nham nham");
    }

    @Override
    public void moverse() {
        System.out.println("Movendo: poc poc");
    }

    @Override
    public void dormir() {
        System.out.println("Dormir: ZZZ ZZZ");
    }


}
