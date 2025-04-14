package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira data (DD/MM): ");
        String data1 = sc.nextLine();

        System.out.println("Digite a segunda data (DD/MM): ");
        String data2 = sc.nextLine();

        if(data2.equals(data1)) {
            System.out.println("As datas são exatamente iguais!");
        } else {
            System.out.println("As datas são diferentes!");
        }
    }
}
