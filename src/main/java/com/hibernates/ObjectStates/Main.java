package com.hibernates.ObjectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    //Object states in hibernates;
    //Transient
    //Persistent
    //Detached
    //Removed
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/ObjectStates/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Student student = new Student();
        student.setStudent_id(12);
        student.setStudent_name("Mohammed Saif");
        student.setStudent_age(21);
        //Now object is in Transient state

        Transaction trx = session.beginTransaction();
        session.save(student);
        //Now object is in persistent state
        student.setStudent_name("Saif");
        //database as well as session will also get updated

        session.close();
        student.setStudent_name("Mohammed");
        //this will  not update in db , it's in detached state

        factory.close();

    }
}
