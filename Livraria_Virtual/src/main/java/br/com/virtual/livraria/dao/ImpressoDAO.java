package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Impresso;
import br.com.virtual.livraria.modelo.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

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

    public Impresso getUmImpresso(int id) {
//        em.getTransaction().begin();

        Impresso impresso = em.find(Impresso.class, id);
        em.getTransaction().commit();
        return impresso;
    }

    public List<Livro> ListarLivrosImpressos() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT i from Impresso i INNER join Livro l ON i.id = l.id");
        List<Livro> listaLivrosImpressos = consulta.getResultList();
        return listaLivrosImpressos;
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
