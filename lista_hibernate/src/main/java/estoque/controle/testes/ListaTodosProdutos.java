package estoque.controle.testes;

import estoque.controle.modelo.Produto;
import estoque.controle.repositorio.RepositorioProduto;

import java.util.ArrayList;
import java.util.List;

public class ListaTodosProdutos {

    public static void main(String[] args) {

        RepositorioProduto rep = new RepositorioProduto();
        List<Produto> listaProdutos = rep.obterListaProduto();
        listaProdutos.forEach(System.out::println);
        rep.fechar();
    }
}
