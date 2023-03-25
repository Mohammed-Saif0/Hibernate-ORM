package com.hibernates;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Project started!" );
        SessionFactory factory = new Configuration().configure("file:src/main/java/hibernate.cfg.xml").buildSessionFactory();
//        Student stu1 = new Student();
//        stu1.setId(432);
//        stu1.setName("Saif");
//        stu1.setCity("Karnataka");
//        Session session = factory.openSession();
//        session.beginTransaction();
//        session.save(stu1);
//        session.getTransaction().commit();
//        Student res = session.get(Student.class, 432);
////        Transaction trx = session.beginTransaction();
////        session.save(stu1);
////        trx.commit();
//        System.out.println(res);
//        session.close();



        Session session = factory.openSession();

        session.beginTransaction();


        Address add = session.load(Address.class,20);
        System.out.println(add);

        session.close();
    }
}
