package com.hibernates.HQL.ComplexQureies.Pegination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/HQL/ComplexQureies/Pegination/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Query query  = session.createQuery("from Student");
        query.setFirstResult(15);
        query.setMaxResults(5);

        List<Student> list = query.list();

        for(Student stud : list){
            System.out.println(stud);
        }

        session.close();
        factory.close();
    }
}
