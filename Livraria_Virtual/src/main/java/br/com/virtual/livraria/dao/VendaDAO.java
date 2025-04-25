package br.com.virtual.livraria.dao;

import br.com.virtual.livraria.modelo.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class VendaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public VendaDAO() {
        emf = Persistence.createEntityManagerFactory("livraria_virtual");
        em = emf.createEntityManager();
    }

    public void cadastrarVenda(Venda venda) {
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
    }
}
