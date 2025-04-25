package com.cursopcv.teste5;

import com.cursopcv.entidade.Dinossauro;
import com.cursopcv.repositorio.RepositorioDinossauro;

public class TesteHiber5 {
    public static void main(String[] args) {
        RepositorioDinossauro repo = new RepositorioDinossauro();
        Dinossauro dino = new Dinossauro("T-Rex", "Cretáceo");

        repo.salvar(dino);
        repo.removerPorCodigo(1);
        repo.obterPorCodigo(3);
        repo.updateDinossauro(10," aaaaaaaaa", "aaaaaaaaa");
        repo.listarTodos();
        repo.fechar();
    }
}