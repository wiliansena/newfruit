/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.repositorio.dao;

import java.util.List;
import javax.persistence.EntityManager;
import newfruit.modelo.produto.Produto;
import newfruit.repositorio.util.FabricaConexao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Wilian
 */
public class ProdutoRepositorio extends RepositorioGenerico {

    public ProdutoRepositorio() {
        super(Produto.class);
    }

    public void SalvarProduto(Produto produto) {
        EntityManager em = FabricaConexao.getEntityManager();
        //iniciando uma transação
        em.getTransaction().begin();

        em.persist(produto);

        em.getTransaction().commit();

        em.close();

    }


public void atualizarProduto(Produto produto) {

        EntityManager em = FabricaConexao.getEntityManager();
        //iniciando uma transação
        em.getTransaction().begin();

        em.merge(produto);

        em.getTransaction().commit();

        em.close();

    }
    public List<Produto> buscar(String textoBuscado) {

        Criteria c = getCriteria();

        Criterion c1 = Restrictions.like("codbarra", textoBuscado, MatchMode.EXACT);
       
        c.add(c1);

        return c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

    }
     public Produto buscarPorCodBarra(final String codbarra) {

        Criteria c = getCriteria();

        c.add(Restrictions.eq("codbarra", codbarra));

        return (Produto) c.uniqueResult();

    }
     public List<Produto> listarTodos() {

        EntityManager em = FabricaConexao.getEntityManager();

        Session s = (Session) em.getDelegate();

        Criteria 

c = s.createCriteria(Produto.class
);

        return c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     }
     
public void excluir(String id) {
    
        EntityManager em = FabricaConexao.getEntityManager();
        //iniciando uma transação
        em.getTransaction().begin();
           
        em.remove(em.find(Produto.class, id));

        em.getTransaction().commit();

        em.close();

    }
  
}