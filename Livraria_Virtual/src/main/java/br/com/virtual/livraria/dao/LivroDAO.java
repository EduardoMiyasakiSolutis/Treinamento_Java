package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class LivroDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public LivroDAO() {
        emf = Persistence.createEntityManagerFactory("livraria_virtual");
        em = emf.createEntityManager();
    }

    public List<Livro> listarTodosLivros() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT l FROM Livro l");
        return consulta.getResultList();
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
