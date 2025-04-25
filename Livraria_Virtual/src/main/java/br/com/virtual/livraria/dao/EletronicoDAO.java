package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Eletronico;
import br.com.virtual.livraria.modelo.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EletronicoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;

    public EletronicoDAO() {
        emf = Persistence.createEntityManagerFactory("livraria_virtual");
        em = emf.createEntityManager();
    }

    public void cadastraLivro(Eletronico livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
        em.close();
    }
}
