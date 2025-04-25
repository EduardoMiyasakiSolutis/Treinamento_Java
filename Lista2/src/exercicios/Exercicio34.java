package exercicios;

public class Exercicio34 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        for (int i = 0; i <= 50; i++) {
            double numeroAleatorio = Math.round(Math.random() * (max - min) + min);
            System.out.println(numeroAleatorio);
        }
    }
}
