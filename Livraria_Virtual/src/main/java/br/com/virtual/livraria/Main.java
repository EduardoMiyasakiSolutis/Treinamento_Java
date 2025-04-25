package br.com.virtual.livraria;

import br.com.virtual.livraria.dao.EletronicoDAO;
import br.com.virtual.livraria.dao.ImpressoDAO;
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
                case 5:
                    break;
            }
        }
        eletronicoDAO.fechar();
        impressoDAO.fechar();
    }

    public static void cadastrarLivros() {

        ImpressoDAO impressoDAO = new ImpressoDAO();
        EletronicoDAO eletronicoDAO = new EletronicoDAO();

        System.out.println("\n <---------- Bem-Vindo ao cadastr de livros ---------->");
        System.out.println(" \n Informe o tipo de livro que será cadastrado: 1 para Impresso, 2 para Eletrônico ou 3 ambos ");
        int num = scNum.nextInt();

        if (num == 1) {
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

            System.out.println("Informe o valor: ");
            double preco = scNum.nextDouble();
            imp.setPreco(preco);

            System.out.println("Informe o frete: ");
            double frete = scNum.nextDouble();
            imp.setFrete(frete);

            System.out.println("Informe o estoque: ");
            int estoque = scNum.nextInt();
            imp.setEstoque(estoque);

            impressoDAO.cadastraLivro(imp);
        } else if (num == 2) {
            Eletronico ele = new Eletronico();

            System.out.println("Informe o nome do livro: ");
            ele.setTitulo(sc.nextLine());


            System.out.println("Informe o nome do(a) Autor(a): ");
            ele.setAutores(sc.nextLine());


            System.out.println("Informe a editora: ");
            ele.setEditora(sc.nextLine());

            System.out.println("Informe o valor: ");
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

            System.out.println("Informe o valor: ");
            double preco = scNum.nextDouble();
            imp.setPreco(preco);

            System.out.println("Informe o frete: ");
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

        var venda = new Venda();
        venda.setNumero((int) Math.round(Math.random()));

        System.out.println("Informe seu nome: ");
        String nomeCliente = sc.nextLine();
        venda.setCliente(nomeCliente);

        System.out.println("Informe a quantidade de livro que deseja comprar: ");
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
                venda.addLivro(getUmEletronico(livroId));
                vendaDAO.cadastrarVenda(venda);
            } else {
                var lista =  listarLivrosImpressos();
                escolherOpcaoLivro(lista);
                var livroId = scNum.nextInt();
                venda.addLivro(getUmImpresso(livroId));
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

    public static Impresso getUmImpresso(int id){
        Impresso livroImpresso = impressoDAO.getUmImpresso(id);
        System.out.println(livroImpresso);
        return livroImpresso;
    }

    public static Eletronico getUmEletronico(int id){
        Eletronico livroEletronico = eletronicoDAO.getUmEletronico(id);
        return livroEletronico;
    }
}


