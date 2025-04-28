package br.com.virtual.livraria.modelo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LIVRO_ELETRONICO")
public class Eletronico extends Livro {

    private int tamanho;

    public Eletronico(){
        super();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "\n" +
                "Autor: " + getAutores() + "\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Tamanho em KB: " + getTamanho() + "\n";

    }
}
