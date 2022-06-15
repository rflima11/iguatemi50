package integracao.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerConfig {

    private EntityManager entityManager;

    public EntityManagerConfig() {
        entityManager = Persistence.createEntityManagerFactory("AulaIntegracao").createEntityManager();
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
