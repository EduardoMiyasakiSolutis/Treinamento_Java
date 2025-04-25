package exercicios;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o um número e descubra se ele é primo ou não: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false; // 0 e 1 não são primos
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}

/*
int numero = 7; // Número que você quer testar se é primo ou não
boolean ehPrimo = true; // Supondo inicialmente que o número é primo

// Verifica se o número é menor ou igual a 1
if (numero <= 1) {
    ehPrimo = false; // Números menores ou iguais a 1 não são primos
} else {
    // Loop para verificar se o número é divisível por algum valor entre 2 e numero - 1
    for (int i = 2; i < numero; i++) {
        // Se o número for divisível por i (ou seja, resto da divisão for 0)
        if (numero % i == 0) {
            ehPrimo = false; // Então não é primo
            break; // Para o loop assim que encontrar um divisor
        }
    }
}

// Após o loop, imprime o resultado com base na variável ehPrimo
if (ehPrimo) {
    System.out.println(numero + " é primo."); // Se não achou nenhum divisor, é primo
} else {
    System.out.println(numero + " não é primo."); // Se achou algum divisor, não é primo
}

 */