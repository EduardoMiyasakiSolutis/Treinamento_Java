package estoque.controle.testes;

import estoque.controle.modelo.Produto;
import estoque.controle.repositorio.RepositorioProduto;

public class InclusaoProdutos {

    public static void main(String[] args) {

        RepositorioProduto rep = new RepositorioProduto();

        Produto prod = new Produto("Panela de Pressão",56.80, "panela de pressão");
        Produto prod1 = new Produto("Cama de casal BIG",450.68, "Cama de casal");
        Produto prod2 = new Produto("caixa de som",160.00,"caixa de som JBL");

        rep.cadastrarProduto(prod);
        rep.cadastrarProduto(prod1);
        rep.cadastrarProduto(prod2);

        rep.fechar();
    }
}
