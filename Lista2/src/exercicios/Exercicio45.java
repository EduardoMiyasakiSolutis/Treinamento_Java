package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.println("Adicione um valor a lista: ");
            listaNumeros.add(sc.nextInt());
        }

       var listaOrdenada =  listaNumeros.stream().sorted().toList();

        System.out.println("O maior valor fornecido foi : " + listaOrdenada.get(99));
    }
}
