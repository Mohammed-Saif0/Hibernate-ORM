package com.hibernates.HQL.ComplexQureies.Pegination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AutoInsert {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/HQL/ComplexQureies/Pegination/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Transaction trx1 = session.beginTransaction();

        for(int i=0;i<20;i++){
            int id = i;
            String name = "saif"+i;
            int age = i+10;

            session.save(getStudent(id,name,age));
        }
        trx1.commit();
        factory.close();
        session.close();
    }
    public static Student getStudent(int id, String name, int age){
        return new Student(id,name,age);
    }
}
