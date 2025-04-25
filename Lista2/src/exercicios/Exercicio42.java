package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 59;

        int contador = 0;
        List<Double> listaOrdenada = new ArrayList<>();

        List<List<Double>> listaDeListas = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            List<Double> listaDeNumeros = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                double numeroAleatorio = Math.round(Math.random() * (max - min) + min);
                listaDeNumeros.add(numeroAleatorio);
                 listaOrdenada = listaDeNumeros.stream().sorted().toList();
            }
                listaDeListas.add(listaOrdenada);
        }
        listaDeListas.forEach(System.out::println);
    }
}
