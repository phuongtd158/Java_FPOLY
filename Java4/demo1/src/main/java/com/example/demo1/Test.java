package com.example.demo1;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
