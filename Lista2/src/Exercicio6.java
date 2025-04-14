import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        calcularArea(teclado.nextInt());
    }

    public static void calcularArea(int raio) {

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é de " + area);
    }
}
