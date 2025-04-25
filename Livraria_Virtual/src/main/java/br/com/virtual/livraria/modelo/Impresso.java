package br.com.virtual.livraria.modelo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LIVRO_IMPRESSO")
public class Impresso extends Livro {

    private double frete;
    private int estoque;

    public Impresso(){
        super();
    }

    public void atualizarEstoque() {
        this.estoque -= 1;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "\n" +
                "Autor: " + getAutores() + "\n" +
                "Editora: " + getEditora() + "\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Frete: R$" + getFrete() + "\n" +
                "Quantidade em estoque: " + getEstoque();
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
