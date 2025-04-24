package estoque.controle.repositorio;

import estoque.controle.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class RepositorioProduto {
    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioProduto() {
        emf = Persistence.createEntityManagerFactory("controleEstoque");
        em = emf.createEntityManager();
    }

    public void cadastrarProduto(Produto prod) {
        try {
            em.getTransaction().begin();
            em.persist(prod);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Produto obterPorCodigo(int codigo) {
        try {
            em.getTransaction().begin();
            Produto prod = em.find(Produto.class, codigo);
            fechar();
            return prod;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> obterListaProduto() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT prods FROM Produto prods");
        List<Produto> listaProdutos = consulta.getResultList();
        fechar();
        return listaProdutos;
    }

    public void update(int codigo, double preco) {

        try {
            em.getTransaction().begin();
            Produto prod = em.find(Produto.class, codigo);
            prod.setPreco(preco);
            em.merge(prod);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProduto(int codigo) {
        try {
            em.getTransaction().begin();
            Produto prod = em.find(Produto.class, codigo);

            if (prod == null) {
                System.out.println("Produto não encontrado!");
            }

            em.remove(prod);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
