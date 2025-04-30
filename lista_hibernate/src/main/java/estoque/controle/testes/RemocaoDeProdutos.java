package estoque.controle.testes;

import estoque.controle.repositorio.RepositorioProduto;

public class RemocaoDeProdutos {

    public static void main(String[] args) {

        RepositorioProduto rep = new RepositorioProduto();
        rep.deleteProduto(3);
        rep.fechar();
    }
}
