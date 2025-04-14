
package exercicios;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Saiba a ordem dos números.");
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 é o maior: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("N2 é o maior: " + n2);
        }
        else if(n3 > n1 && n3 > n2){
            System.out.println("N3 é o maior: " + n3);
        } else{
            System.out.println("Os números são iguais : " + n1);
        }
    }
}
