import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double KM = 1.609;

        System.out.println("Informe uma distância em milhas: ");
        int milhas = teclado.nextInt();

        System.out.println("Distância em milhas: " + milhas);
        System.out.println("Distância em KM: " + (milhas * KM) );

    }
}
