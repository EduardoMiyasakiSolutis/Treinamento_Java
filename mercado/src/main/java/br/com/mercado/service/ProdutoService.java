package br.com.mercado.service;

import br.com.mercado.dto.CadastroProdutoDTO;
import br.com.mercado.entity.Produto;
import br.com.mercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void cadastrarProduto(CadastroProdutoDTO produtoDTO) {
        produtoRepository.save(new Produto(produtoDTO));
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto listarUmProduto(long id) {
        var produto = produtoRepository.findById(id);

        if (produto.isEmpty()) {
            throw new RuntimeException("Produto com ID não encontrado!");
        }

        return produto.get();
    }

    public void atualizarPreco(long id, double preco) {
        produtoRepository.atualizarPreco(id, preco);
    }

    public void atualizarEstoque(long id, int qtdEstoque) {
        produtoRepository.atualizarEstoque(id, qtdEstoque);
    }

    public void deletarProduto(long id) {
        produtoRepository.deleteById(id);
    }
}
