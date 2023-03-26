package com.hibernates.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("file:src/main/java/hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Certificate certi = new Certificate("Java","2 Month");
        Student student = new Student(1,"Mohamemd saif",certi);

        session.beginTransaction();

        session.save(student);

        session.getTransaction().commit();


        session.close();
        factory.close();

    }
}
