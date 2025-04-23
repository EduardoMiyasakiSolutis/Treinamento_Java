package com.cursopcv.repositorio;

import com.cursopcv.entidade.Dinossauro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class RepositorioDinossauro {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public RepositorioDinossauro() {
        emf = Persistence.createEntityManagerFactory("hiberMySQL");
        em = emf.createEntityManager();
    }

    public void salvar(Dinossauro dino) {
        try {
            em.getTransaction().begin();
            em.merge(dino);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerPorCodigo(int codigo) {
        try {
            em.getTransaction().begin();
            Dinossauro dino = em.find(Dinossauro.class, codigo);
            if (dino != null) {
                em.remove(dino);
                System.out.println("Dinossauro removido com sucesso.");
            } else {
                System.out.println("Dinossauro com código " + codigo + " não encontrado.");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao remover: " + e.getMessage());
            em.getTransaction().rollback();
        }
    }

    public Dinossauro obterPorCodigo(int codigo) {
        em.getTransaction().begin();
        Dinossauro dino = em.find(Dinossauro.class, codigo);
        em.getTransaction().commit();
        System.out.println(dino);
        return dino;
    }

    public void updateDinossauro(int codigo, String especie, String genero) {
        try {
            em.getTransaction().begin();
            Dinossauro dinoEncontrado = em.find(Dinossauro.class, codigo);
            dinoEncontrado.setEspecie(especie);
            dinoEncontrado.setGenero(genero);
            em.merge(dinoEncontrado);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Dinossauro> listarTodos() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("select dinos from Dinossauro dinos");
        List<Dinossauro> dinos = consulta.getResultList();
        em.getTransaction().commit();
        dinos.forEach(System.out::println);
        return dinos;
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}