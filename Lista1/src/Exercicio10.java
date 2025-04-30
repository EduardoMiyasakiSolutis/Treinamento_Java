import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int quantidadeVogais = 0;
        int quantidadeConsoantes = 0;
        int espacoVazio = 0;

        System.out.println("Insira uma palavra ou frase");
        String palavra = teclado.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                quantidadeVogais++;
            } else if (letra == ' ') {
                espacoVazio++;
            } else {
                quantidadeConsoantes++;
            }

        }

        System.out.println(quantidadeVogais + " vogais");
        System.out.println(quantidadeConsoantes + " consoantes");
        System.out.println(espacoVazio + " espaços vazios");
    }
}
