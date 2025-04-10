import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o raio do círculo");
        calcularArea(teclado.nextDouble());
    }

    public static void calcularArea(double raio) {

        var area = Math.PI * (Math.pow(raio, 2));
        System.out.println("A área do círculo com raio de " + raio + " é de " + area);
    }
}