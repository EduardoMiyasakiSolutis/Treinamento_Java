public class Exercicio7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int resto = i % 3;

            if (resto == 0) {
                double resultado = i / 2;
                System.out.println("Resultado de: " + i + "/2 " + resultado );
            }
        }
    }
}
