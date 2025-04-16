package ExerciciosSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExercicioSlide_116 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> nomesFamiliares = obterNomesFamiliares();
        exibirNomesFormatados(nomesFamiliares);
    }

    private static int obterQuantidadeFamiliares() {
        System.out.println("Digite a quantidade de familiares que deseja declarar:");
<<<<<<< HEAD
        int qtdFamiliares = scNumeros.nextInt();
        for (int i = 1; i <= qtdFamiliares; i++) {
            System.out.println("Digite o nome do familiar: ");
            String nomeFamiliar = scNomes.nextLine();
            listaNomeFamiliares.add(nomeFamiliar);
        }
        System.out.println("Exibição lista formatada: ");
        listaNomeFamiliares.forEach(System.out::println);
        System.out.println("Exibição em formato de lista: ");
        System.out.println(listaNomeFamiliares);
=======
        return scanner.nextInt();
    }
>>>>>>> 2a7fdbd47920f400f298c2b1145298112178a61a

    private static List<String> obterNomesFamiliares() {
        int quantidadeFamiliares = obterQuantidadeFamiliares();
        List<String> listaNomes = new ArrayList<>();
        IntStream.rangeClosed(1, quantidadeFamiliares)
                .forEach(i -> {
                    System.out.println("Digite o nome do familiar " + i + ":");
                    listaNomes.add(scanner.nextLine());
                });
        return listaNomes;
    }

    private static void exibirNomesFormatados(List<String> listaNomes) {
        System.out.println("\nExibição lista formatada:");
        listaNomes.forEach(System.out::println);
        System.out.println("\nExibição em formato de lista:");
        System.out.println(listaNomes);
    }
}