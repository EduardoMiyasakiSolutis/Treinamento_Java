import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número entre 1 e 7: ");
        int numero = teclado.nextInt();

        String[] dias = {"Segunda-Feira", "Terça-Feira",
                "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};

        switch (numero) {
            case 1: {
                System.out.println(dias[0]);
                break;
            }
            case 2: {
                System.out.println(dias[1]);
                break;
            }
            case 3: {
                System.out.println(dias[2]);
                break;
            }
            case 4: {
                System.out.println(dias[3]);
                break;
            }
            case 5: {
                System.out.println(dias[4]);
                break;
            }
            case 6: {
                System.out.println(dias[5]);
                break;
            }
            case 7: {
                System.out.println(dias[6]);
                break;
            }
            default:
                System.out.println("Número inválido");
        }
    }
}
