package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Impresso;
import br.com.virtual.livraria.modelo.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ImpressoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;

    public ImpressoDAO() {
        emf = Persistence.createEntityManagerFactory("livraria_virtual");
        em = emf.createEntityManager();
    }

    public void cadastraLivro(Impresso livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
        em.close();
    }
}
