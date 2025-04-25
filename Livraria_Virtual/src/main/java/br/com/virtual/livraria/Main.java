package br.com.virtual.livraria;

import br.com.virtual.livraria.dao.EletronicoDAO;
import br.com.virtual.livraria.dao.ImpressoDAO;
import br.com.virtual.livraria.modelo.Eletronico;
import br.com.virtual.livraria.modelo.Impresso;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);

        ImpressoDAO impressoDAO = new ImpressoDAO();
        EletronicoDAO eletronicoDAO = new EletronicoDAO();

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
            System.out.print(menu);
            opcao = scNum.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Informe o tipo de livro que será cadastrado: 1 para Impresso, 2 para Eletrônico ou 3 ambos ");
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
                case 5: {
                    break;
                }
            }
        }

    }

}