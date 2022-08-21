package dao;

import entity.User;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {
	EntityManager entityManager = JpaUtils.getEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public void insert(User user) {
		try {
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	public void update(User user) {
		try {
			transaction.begin();
			entityManager.merge(user);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	public void delete(String id) {
		try {
			transaction.begin();
			User user = entityManager.find(User.class, id);

			if (user != null) {
				entityManager.remove(user);
			}

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	public List<User> selectAll() {
		TypedQuery<User> query = entityManager.createNamedQuery("User.SelectAll", User.class);
		return query.getResultList();
	}

	public User selectById(String id) {
		return entityManager.find(User.class, id);
	}

	public List<User> selectByFullName(String fullName) {
		String jpql = "select o from User o where o.fullName like :fullName";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("fullName", "%" + fullName + "%");
		System.out.println(query + " " + jpql);
		return query.getResultList();
	}

	public User findByUserIdAndPassword(String userId, String password) {
		String jpql = "select o from User o where o.userId = :userId and o.password = :password";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);

		query.setParameter("userId", userId);
		query.setParameter("password", password);

		return query.getSingleResult();
	}
}
