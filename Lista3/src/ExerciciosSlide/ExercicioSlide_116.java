package ExerciciosSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioSlide_116 {
    public static void main(String[] args) {
        List<String> listaNomeFamiliares = new ArrayList<>();

        Scanner scNomes = new Scanner(System.in);
        Scanner scNumeros = new Scanner(System.in);
        System.out.println("Digite a quantidade de familiares que deseja declarar:");
        int qtdFamiliares = scNumeros.nextInt();
        for (int i = 1; i <= qtdFamiliares; i++) {
            System.out.println("Digite o nome do familiar: ");
            String nomeFamiliare = scNomes.nextLine();
            listaNomeFamiliares.add(nomeFamiliare);
        }
        System.out.println("Exibição lista formatada: ");
        listaNomeFamiliares.forEach(System.out::println);
        System.out.println("Exibição em formato de lista: ");
        System.out.println(listaNomeFamiliares);

    }
}