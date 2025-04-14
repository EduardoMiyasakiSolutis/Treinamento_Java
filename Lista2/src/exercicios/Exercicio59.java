package exercicios;

public class Exercicio59 {
    public static void main(String[] args) {

        System.out.println("Tabuadas de 1 a 10:");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("----------");
        }
    }
}
