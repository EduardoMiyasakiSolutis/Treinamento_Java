package exercicios;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int horas = sc.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Informe as segundos: ");
        int segundos = sc.nextInt();

        if (horas < 0 || horas > 25) {
            System.out.println("Hora inválida");
        }
        else System.out.println("Hora válida");

        if (minutos < 0 || minutos > 60) {
            System.out.println("Minutos inválido");
        }
        else System.out.println("Minutos válidos");

        if (segundos < 0 || segundos > 60) {
            System.out.println("Segundos inválido");
        }
        else System.out.println("segundos válidos");

    }
}
