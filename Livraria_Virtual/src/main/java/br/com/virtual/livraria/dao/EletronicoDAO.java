package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Eletronico;
import br.com.virtual.livraria.modelo.Impresso;
import br.com.virtual.livraria.modelo.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

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

    public Eletronico getUmEletronico(int id) {
//        em.getTransaction().begin();

        Eletronico eletronico = em.find(Eletronico.class, id);
        em.getTransaction().commit();
        return eletronico;
    }

    public List<Livro> ListarLivrosEletronicos() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT e from Eletronico e INNER join Livro l ON e.id = l.id");
        return  consulta.getResultList();
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
