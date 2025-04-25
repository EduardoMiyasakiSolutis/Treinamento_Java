public class Exercicio12 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
               double numero = (double)i / 2;
                System.out.println("Resultado: " + numero);
            }
        }

    }
}
