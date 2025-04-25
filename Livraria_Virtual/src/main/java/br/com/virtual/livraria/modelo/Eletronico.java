package br.com.virtual.livraria.modelo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LIVRO_ELETRONICO")
public class Eletronico extends Livro {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int idEletronico;

    private int tamanho;

    public Eletronico(){
        super();
    }

//    public int getIdEletronico() {
//        return idEletronico;
//    }
//
//    public void setIdEletronico(int idEletronico) {
//        this.idEletronico = idEletronico;
//    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +
                "tamanho: " + tamanho + "Kb";
    }
}
