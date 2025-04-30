package estoque.controle.testes;

import estoque.controle.repositorio.RepositorioProduto;

public class AlteracaoDeProduto {

    public static void main(String[] args) {

        RepositorioProduto rep = new RepositorioProduto();
        rep.update(2, 345.00);
        rep.fechar();
    }
}
