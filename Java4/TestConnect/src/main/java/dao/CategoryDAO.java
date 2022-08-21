package dao;

import Utils.JpaUtils;
import entities.Categories;

import javax.persistence.EntityManager;

public class CategoryDAO {
    private EntityManager entityManager;

    public CategoryDAO() {
        this.entityManager = JpaUtils.getEntityManager();
    }

    public Categories create(Categories category) {
        try {
            this.entityManager.getTransaction().begin();

            this.entityManager.persist(category);

            this.entityManager.getTransaction().commit();

            return category;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
