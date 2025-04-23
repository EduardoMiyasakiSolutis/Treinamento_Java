package com.cursopcv.entidade;

import jakarta.persistence.*;

@Entity
public class Dinossauro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false, length = 45)
    private String genero;

    private String especie;

    public Dinossauro(){}

    public Dinossauro(String genero, String especie) {
        this.genero = genero;
        this.especie = especie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "codigo=" + codigo +
                ", genero='" + genero + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
