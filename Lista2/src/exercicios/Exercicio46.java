package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> listaIdadeHomens = new ArrayList<>();
        List<Integer> listaIdadeMulheres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe se você é homem ou mulher (h/m)");
            String sexo = sc.nextLine();

            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();

            sc.nextLine();

            if (sexo.contains("h")) {
                listaIdadeHomens.add(idade);
            }
            else listaIdadeMulheres.add(idade);

        }

        List<Integer> listaMaioresdeIdadeH = listaIdadeHomens
                .stream()
                .filter(i -> i >= 18)
                .toList();

        List<Integer> listaMaioresDeIdadeM = listaIdadeMulheres
                .stream()
                .filter(i -> i >= 18)
                .toList();

        System.out.println("A quantidade de homens maior de idade é: " + listaMaioresdeIdadeH.size());
        System.out.println("A quantidade de mulheres maior de idade é: " + listaMaioresDeIdadeM.size());

    }
}
