import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();

        if(n1 % 2 == 0){
            System.out.println(n1 + " é par");
        } else{
            System.out.println(n1 + " é impar");
        }
    }


}
