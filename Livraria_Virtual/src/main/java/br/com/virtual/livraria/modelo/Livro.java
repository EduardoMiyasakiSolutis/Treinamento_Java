package br.com.virtual.livraria.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "livrotype")
public abstract class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titulo;
    private String autores;
    private String editora;
    private double preco;

    @ManyToMany(mappedBy = "livros")
    private List<Venda> vendas;

    public Livro(String titulo, String autores, String editora, double preco) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.preco = preco;
    }

    public Livro (){}

    @Override
    public String toString() {
        return  ", titulo: " + titulo + '\'' +
                ", autores: " + autores + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
