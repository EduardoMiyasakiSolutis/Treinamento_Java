package br.com.mercado.controller;

import br.com.mercado.dto.AtualizarEstoqueDTO;
import br.com.mercado.dto.AtualizarPrecoDTO;
import br.com.mercado.dto.CadastroProdutoDTO;
import br.com.mercado.entity.Produto;
import br.com.mercado.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoJpaController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<CadastroProdutoDTO> cadastrarProduto(@RequestBody @Valid CadastroProdutoDTO produtoDTO) {

        produtoService.cadastrarProduto(produtoDTO);
        return ResponseEntity.status(201).body(produtoDTO);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos() {
        var listaProdutos = produtoService.listarTodos();

        if (listaProdutos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(listaProdutos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarUmProduto(@PathVariable long id) {
        try {
            return ResponseEntity.ok(produtoService.listarUmProduto(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/preco/{id}")
    public ResponseEntity<Produto> atualizarPreco(@PathVariable long id, @RequestBody @Valid AtualizarPrecoDTO precoDTO) {
        try {
            var produto = produtoService.listarUmProduto(id);
            produtoService.atualizarPreco(id, precoDTO.preco());
            return ResponseEntity.ok(produto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/qtdEstoque/{id}")
    public ResponseEntity<Produto> atualizarEstoque(@PathVariable long id, @RequestBody @Valid AtualizarEstoqueDTO estoqueDTO) {
        try {
            var produto = produtoService.listarUmProduto(id);
            produtoService.atualizarEstoque(id, estoqueDTO.qtdEstoque());
            return ResponseEntity.ok(produto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable long id) {

        try {
            var produto = produtoService.listarUmProduto(id);
            produtoService.deletarProduto(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
