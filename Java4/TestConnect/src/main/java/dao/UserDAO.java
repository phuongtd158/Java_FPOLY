package dao;

import Utils.JpaUtils;
import entities.Users;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {
    private EntityManager entityManager;

    public UserDAO() {
        this.entityManager = JpaUtils.getEntityManager();
    }

    public Users create(Users user) {
        try {
            this.entityManager.getTransaction().begin();

            this.entityManager.persist(user);

            this.entityManager.getTransaction().commit();

            return user;
        } catch (Exception e) {
            e.printStackTrace();
            this.entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Users> selectAll() {
        String jpql = "select u from Users u";
        TypedQuery<Users> query = this.entityManager.createQuery(jpql, Users.class);
        return query.getResultList();
    }

    public Users findById(int id) {
        try {
            Users user = this.entityManager.find(Users.class, id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        try {
            this.entityManager.getTransaction().begin();
            Users user = this.findById(id);
            if (user != null) {
                this.entityManager.remove(user);
                System.out.println("user is deleted");
            }
            this.entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
            this.entityManager.getTransaction().rollback();
        }
    }

    public void update(Users user) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.merge(user);
            System.out.println("user is updated");
            this.entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
            this.entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }
}
