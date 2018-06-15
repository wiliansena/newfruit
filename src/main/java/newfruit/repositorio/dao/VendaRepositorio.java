/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.repositorio.dao;

import javax.persistence.EntityManager;
import newfruit.modelo.venda.Venda;
import newfruit.repositorio.util.FabricaConexao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Wilian alt + shift + f = identar o codigo
 */
public class VendaRepositorio {

    public void salvarVenda(Venda venda) {

        EntityManager em = FabricaConexao.getEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(venda);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {

            em.close();
        }
    }

    public void atualizarVenda(Venda venda) {

        EntityManager em = FabricaConexao.getEntityManager();
        //iniciando uma transação
        em.getTransaction().begin();

        em.merge(venda);

        em.getTransaction().commit();

        em.close();

    }

    public Venda buscarPorIdVenda(final Integer id) {

        Criteria c = getCriteria();

        c.add(Restrictions.eq("codigo", id));

        return (Venda) c.uniqueResult();

    }

    public Venda excluirVenda(final Integer id) {
EntityManager em = FabricaConexao.getEntityManager();

        return em.createQuery("delete v from Venda v where v.id = :cod",
                Venda.class)
                .setParameter("cod", id)
                .getSingleResult();
    }

    private Criteria getCriteria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
