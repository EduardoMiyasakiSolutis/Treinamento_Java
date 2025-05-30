package br.com.virtual.livraria;

import br.com.virtual.livraria.dao.EletronicoDAO;
import br.com.virtual.livraria.dao.ImpressoDAO;
import br.com.virtual.livraria.dao.LivroDAO;
import br.com.virtual.livraria.dao.VendaDAO;
import br.com.virtual.livraria.modelo.Eletronico;
import br.com.virtual.livraria.modelo.Impresso;
import br.com.virtual.livraria.modelo.Livro;
import br.com.virtual.livraria.modelo.Venda;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Scanner scNum = new Scanner(System.in);

    static EletronicoDAO eletronicoDAO = new EletronicoDAO();
    static ImpressoDAO impressoDAO = new ImpressoDAO();
    static VendaDAO vendaDAO = new VendaDAO();
    static LivroDAO livroDAO = new LivroDAO();

    public static void main(String[] args) {

        String menu = """
                +-------------------------------------------------------+
                |--> Bem-vindo a Livraria da dupla Kendi & Lázaro <--   |
                +-------------------------------------------------------+
                |--> Selecione uma opção: <--                           |
                +-------------------------------------------------------+
                | 1 - Cadastrar Livro...                                |
                | 2 - Realizar uma venda...                             |
                | 3 - Listar Livros...                                  |
                | 4 - Listar Vendas...                                  |
                | 5 - Sair do Menu...                                   |
                +-------------------------------------------------------+
                |---> Digite um número:""";

        int opcao = 0;
        while (opcao != 5) {
            System.out.println(menu);
            opcao = scNum.nextInt();
            switch (opcao) {
                case 1: {
                    cadastrarLivros();
                    break;
                }
                case 2: {
                    realizarVenda();
                    break;
                }
                case 3: {
                    getTodosLivros();
                    break;
                }
                case 4: {
                    getTodasVendas();
                    break;
                }
                case 5:
                    break;
            }
        }
        eletronicoDAO.fechar();
        impressoDAO.fechar();
        livroDAO.fechar();
    }

    public static void cadastrarLivros() {

        System.out.println("\n <---------- Bem-Vindo ao cadastro de livros ---------->");
        System.out.println(" \n Informe o tipo de livro que será cadastrado: \n" +
                " 1 - para Impresso... \n" +
                " 2 - para Eletrônico... \n" +
                " 3 - ambos... ");
        int num = scNum.nextInt();

        if (num == 1) {
            Impresso imp = new Impresso();

            System.out.println("Informe o título do livro: ");
            imp.setTitulo(sc.nextLine());

            sc.nextLine();

            System.out.println("Informe o nome do(a) Autor(a): ");
            imp.setAutores(sc.nextLine());

            System.out.println("Informe a editora: ");
            imp.setEditora(sc.nextLine());

            System.out.println("Informe o valor (R$): ");
            imp.setPreco(scNum.nextDouble());

            System.out.println("Informe o frete (R$): ");
            imp.setFrete(scNum.nextDouble());

            System.out.println("Informe o estoque (Número inteiro): ");
            imp.setEstoque(scNum.nextInt());

            impressoDAO.cadastraLivro(imp);
        } else if (num == 2) {
            Eletronico ele = new Eletronico();

            System.out.println("Informe o nome do livro: ");
            ele.setTitulo(sc.nextLine());

            System.out.println("Informe o nome do(a) Autor(a): ");
            ele.setAutores(sc.nextLine());

            System.out.println("Informe a editora: ");
            ele.setEditora(sc.nextLine());

            System.out.println("Informe o valor (R$): ");
            ele.setPreco(scNum.nextInt());

            System.out.println("Informe o tamanho em KB:");
            ele.setTamanho(scNum.nextInt());

            eletronicoDAO.cadastraLivro(ele);
        } else if (num == 3) {
            Impresso imp = new Impresso();

            System.out.println("Informe o nome do livro: ");
            String titulo = sc.next();
            imp.setTitulo(titulo);

            sc.nextLine();

            System.out.println("Informe o nome do(a) Autor(a): ");
            String autores = sc.nextLine();
            imp.setAutores(autores);

            System.out.println("Informe a editora: ");
            String editora = sc.nextLine();
            imp.setEditora(editora);

            System.out.println("Informe o valor (R$): ");
            double preco = scNum.nextDouble();
            imp.setPreco(preco);

            System.out.println("Informe o frete (R$): ");
            double frete = scNum.nextDouble();
            imp.setFrete(frete);

            System.out.println("Informe o estoque: ");
            int estoque = scNum.nextInt();
            imp.setEstoque(estoque);

            Eletronico ele = new Eletronico();

            System.out.println("Informe o tamanho em KB:");
            ele.setTamanho(scNum.nextInt());

            impressoDAO.cadastraLivro(imp);

            ele.setTitulo(titulo);
            ele.setAutores(autores);
            ele.setEditora(editora);
            ele.setPreco(preco);

            eletronicoDAO.cadastraLivro(ele);
        } else {
            System.out.println("Número de Opção Inválido!");
        }
    }

    public static void realizarVenda() {

        double valorTotalVenda = 0.0;

        var venda = new Venda();
        int max = 100;
        int min = 1;
        venda.setNumero((int) (Math.random() * (max - min) + min));

        System.out.println("Informe seu nome: ");
        venda.setCliente(sc.nextLine());

        venda.setNumVendas(selecionarUltimaVenda() + 1);

        System.out.println("Informe a quantidade de livro que deseja comprar (Número inteiro): ");
        int qtdLivros = sc.nextInt();

        for (int i = 1; i <= qtdLivros; i++) {
            System.out.println("Qual tipo do " + i + "° livro?");
            System.out.println("""
                    +--------------------------------------+
                    |--> Selecione uma opção: <--          |
                    +--------------------------------------+
                    | 1 - Eletrônico...                    |
                    | 2 - Impresso...                      |
                    +--------------------------------------+
                    |---> Digite uma opção:""");

            int opcao = scNum.nextInt();

            if (opcao == 1) {
                var lista = listarLivrosEletronicos();
                escolherOpcaoLivro(lista);
                var livroId = scNum.nextInt();
                Eletronico livroPeloID = getUmEletronico(livroId);
                venda.addLivro(livroPeloID);
                valorTotalVenda += livroPeloID.getPreco();
                venda.setValor(valorTotalVenda);
                vendaDAO.cadastrarVenda(venda);
            } else {
                var lista = listarLivrosImpressos();
                escolherOpcaoLivro(lista);
                var livroId = scNum.nextInt();
                Impresso impressoPeloID = getUmImpresso(livroId);
                valorTotalVenda += impressoPeloID.getPreco() + impressoPeloID.getFrete();
                venda.addLivro(impressoPeloID);
                venda.setValor(valorTotalVenda);
                vendaDAO.cadastrarVenda(venda);
            }
        }
        venda.getLivros().forEach(System.out::println);
    }

    public static List<Livro> listarLivrosEletronicos() {
        List<Livro> livrosEletronicos = eletronicoDAO.ListarLivrosEletronicos();
        livrosEletronicos.forEach(System.out::println);
        return livrosEletronicos;
    }

    public static List<Livro> listarLivrosImpressos() {
        List<Livro> livrosImpressos = impressoDAO.ListarLivrosImpressos();
        livrosImpressos.forEach(System.out::println);
        return livrosImpressos;
    }

    public static void escolherOpcaoLivro(List<Livro> livros) {
        System.out.println("<----- Escoha uma opção de livro pelo id ----->");
        livros.forEach(l ->
                System.out.println("Id: " + l.getId() + " <--> Título: " + l.getTitulo() + " <--> Preço: " + l.getPreco()));
        System.out.println("Número escolhida: ");
    }

    public static Impresso getUmImpresso(int id) {
        Impresso livroImpresso = impressoDAO.getUmImpresso(id);
        System.out.println(livroImpresso);
        return livroImpresso;
    }

    public static Eletronico getUmEletronico(int id) {
        Eletronico livroEletronico = eletronicoDAO.getUmEletronico(id);
        return livroEletronico;
    }

    public static int selecionarUltimaVenda() {
        int numeroVenda = Integer.valueOf(String.valueOf(vendaDAO.selecionarUltimaVenda()));
        return numeroVenda;
    }

    public static List<Livro> getTodosLivros() {
        List<Livro> totalLivro = livroDAO.listarTodosLivros();
        totalLivro.forEach(l ->
                System.out.println("| Id: " + l.getId() + " <--> Título: " + l.getTitulo() + " <--> Preço: " + l.getPreco() + "|"));
        return totalLivro;
    }

    public static List<Venda> getTodasVendas() {
        List<Venda> totalVendas = vendaDAO.listarTodasVendas();
        totalVendas.forEach(v ->
                System.out.println("| Id: " + v.getId()+ " <--> Cliente: " + v.getCliente() + " <--> número da venda: " + v.getNumero() + " <--> Valor: " + v.getValor() + " |"));
        return totalVendas;
    }
}