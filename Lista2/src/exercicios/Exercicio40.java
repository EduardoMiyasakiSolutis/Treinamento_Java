package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int qtdPessoas = sc.nextInt();

        List<Integer> listaIdades = new ArrayList<>();
        int contador = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Informe a idade da " + (i + 1) + "° pessoa");
            var idade = sc.nextInt();
            listaIdades.add(idade);
            if(idade >= 18){
                contador++;
            }
        }

        int soma = listaIdades.stream().mapToInt(Integer::intValue).sum();
        double media = soma / qtdPessoas;
        var listaOrdenada = listaIdades.stream().sorted().toList();
        System.out.println(listaOrdenada);
        int maiorIdade = listaIdades.get(qtdPessoas - 1);
        int menorIdade = listaIdades.get(0);

        System.out.println("A média de idade é: " + media);
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("A quantidade de pessoas maior de idade é de: " +contador+ " pessoas.");
    }
}
