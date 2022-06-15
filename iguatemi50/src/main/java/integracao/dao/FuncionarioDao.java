package integracao.dao;

import integracao.hibernate.EntityManagerConfig;
import integracao.hibernate.interfaces.IGenericDao;
import integracao.model.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class FuncionarioDao implements IGenericDao<Funcionario, Long> {

    @PersistenceContext(unitName="AulaIntegracao")
    private EntityManager em;

    public FuncionarioDao() {
        em = new EntityManagerConfig().getEntityManager();
        em.getTransaction().begin();
    }

    public Funcionario salvar(Funcionario funcionario) {

        em.persist(funcionario);
        em.flush();
        em.getTransaction().commit();
        return funcionario;
    }

    @Override
    public Funcionario atualizar(Funcionario entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        em.close();
        return entity;
    }

    @Override
    public void remover(Long id) {
        em.getTransaction().begin();
        Funcionario entity = encontrarPeloId(id).get();
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public List<Funcionario> getList() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Funcionario> query = builder.createQuery(Funcionario.class);
        Root<Funcionario> root = query.from(Funcionario.class);
        query.orderBy(builder.asc(root.get("nome")));
        return em.createQuery(query).getResultList();
    }

    @Override
    public Optional<Funcionario> encontrarPeloId(Long id) {
        return Optional.ofNullable(em.find(Funcionario.class, id));
    }
}
