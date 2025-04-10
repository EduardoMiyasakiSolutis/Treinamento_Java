import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();

        for (int i = 2; i <= numero; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    primo = false;
                }
            }

            if(primo) System.out.println(i);
        }
    }
}
