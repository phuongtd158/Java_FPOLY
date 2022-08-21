package entity1;

import javax.persistence.*;
import java.util.List;

public class test {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
//            String jpql = "select o from Students o";
//            TypedQuery<Students> query = entityManager.createQuery(jpql, Students.class);
//
//            List<Students> list = query.getResultList();
//            for (Students x : list) {
//                System.out.println(x.toString());
//            }
            transaction.begin();
            Students students = entityManager.find(Students.class, 1);
            students.setSdt("0385606568");
            entityManager.merge(students);

            System.out.println(students.toString());
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
