/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.repositorio.dao;

import java.util.List;
import javax.persistence.EntityManager;
import newfruit.modelo.usuario.User;
import newfruit.repositorio.util.FabricaConexao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Wilian
 */
public class UserRepositorio extends RepositorioGenerico{

     public UserRepositorio() {
        super(User.class);

     }

    public void salvarUser(User user) {

        EntityManager em = FabricaConexao.getEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {

            em.close();
        }

    }

    public void atualizar(User user) {

        EntityManager em = FabricaConexao.getEntityManager();
        //iniciando uma transação
        em.getTransaction().begin();

        em.merge(user);

        em.getTransaction().commit();

        em.close();

    }

    public List<User> buscar(String textoBuscado) {

        Criteria c = getCriteria();

        Criterion c1 = Restrictions.ilike("nome", textoBuscado, MatchMode.ANYWHERE);
        Criterion c2 = Restrictions.like("id", textoBuscado, MatchMode.START);
        Criterion c3 = Restrictions.or(c1, c2);
        c.add(c3);

        return c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

    }

    public User buscarPorId(final Integer id) {

        Criteria c = getCriteria();

        c.add(Restrictions.eq("codigo", id));

        return (User) c.uniqueResult();

    }

    public List<User> listarTodos() {

        EntityManager em = FabricaConexao.getEntityManager();

        Session s = (Session) em.getDelegate();

        Criteria c = s.createCriteria(User.class);

        return c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
    }

   
}
