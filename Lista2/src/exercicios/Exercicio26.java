package exercicios;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int horas = sc.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Informe as segundos: ");
        int segundos = sc.nextInt();

        System.out.print("Informe as horas: ");
        int horas2 = sc.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos2 = sc.nextInt();

        System.out.print("Informe as segundos: ");
        int segundos2 = sc.nextInt();

        int horasConvertidas = horas * 3600;
        int minutosConvertidos = minutos * 60;
        int somaHora1 = horasConvertidas + minutosConvertidos + segundos;

        int horasConvertidas2 = horas2 * 3600;
        int minutosConvertidos2 = minutos2 * 60;
        int somaHora2 = horasConvertidas2 + minutosConvertidos2 + segundos2;

        if (somaHora1 > somaHora2) {
            System.out.println("A diferença entre a hora 1 e 2 é de : " + (somaHora1 - somaHora2));
        } else if(somaHora1 < somaHora2){
            System.out.println("A diferença entre a hora 2 e 1 é de : " + (somaHora2 - somaHora1));
        }
        else System.out.println("As horas são iguais");
    }
}
