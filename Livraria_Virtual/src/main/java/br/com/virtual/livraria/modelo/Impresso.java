package br.com.virtual.livraria.modelo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LIVRO_IMPRESSO")
public class Impresso extends Livro {

    private int idImpresso;

    private double frete;
    private int estoque;

    public Impresso(){
        super();
    }

    public void atualizarEstoque() {
        this.estoque -= 1;
    }

    public int getIdImpresso() {
        return idImpresso;
    }

    public void setIdImpresso(int idImpresso) {
        this.idImpresso = idImpresso;
    }

    @Override
    public String toString() {
        return "Impresso: " +
                "Título: " + getTitulo() +
                "frete: " + frete +
                ", estoque: " + estoque +
                '}';
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
