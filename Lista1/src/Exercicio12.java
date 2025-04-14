import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de veículos que serão avaliados: ");
        int quantidadeCarros = teclado.nextInt();

        List<Integer> listaDeKmPercorridos = new ArrayList<>();
        List<Integer> listaDeLitrosConsumidos = new ArrayList<>();
        List<Double> listakmPorLitro = new ArrayList<>();

        for (int i = 0; i < quantidadeCarros; i++) {

            System.out.println("Informe quantos KM foram percorridos: ");
            listaDeKmPercorridos.add(teclado.nextInt());

            System.out.println("Informe quantos litros foram consumidos: ");
            listaDeLitrosConsumidos.add(teclado.nextInt());

            System.out.println("----------------------------");
            listakmPorLitro.add((double) (listaDeKmPercorridos.get(i) / listaDeLitrosConsumidos.get(i)));
        }

        listakmPorLitro.forEach(l -> System.out.println("quantidade de km que você faz por litro " + l));

        int somaKm = listaDeKmPercorridos.stream().mapToInt(Integer::intValue).sum();
        int somaLitros = listaDeLitrosConsumidos.stream().mapToInt(Integer::intValue).sum();

        System.out.println("A soma de todos os km da " + somaKm + "km" );
        System.out.println("A soma de litros da " + somaLitros + "l" );

        double kmPorLitroGeral = (double) somaKm / somaLitros;

        System.out.println("A média de litros consumidos por km no geral da " + kmPorLitroGeral);
    }
}
