package br.com.virtual.livraria.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class LivrariaVirtual {

    @Id
    @GeneratedValue
    private int idLlivrariaVirtual;

    private int MAX_IMPRESSOS = 10;
    private int MAX_ELETRONICOS = 20;
    private int MAX_VENDAS = 50;

    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    @OneToMany
   private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];

    @OneToMany
    private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];

    @OneToMany
    private Venda[] vendas = new Venda[MAX_VENDAS];

    public void cadastrarLivro(Livro livro) {


    };
    public void realizarVenda(){};
    public void listarLivrosImpressos(){};
    public void listarLivrosEletronicos(){};
    public void listarLivros(){};
    public void listarVendas(){};
}
