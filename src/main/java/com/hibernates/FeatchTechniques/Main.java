package com.hibernates.FeatchTechniques;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/FeatchTechniques/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();


//        Student student1 = new Student();
//        PhoneNo ph1 = new PhoneNo(95123);
//        PhoneNo ph2 = new PhoneNo(45191);
//        PhoneNo ph3 = new PhoneNo(19154);
//        ph1.setStudent(student1);
//        ph2.setStudent(student1);
//        ph3.setStudent(student1);
//        student1.setStudent_name("Mohammed Saif");
//        student1.setStudent_id(1);
//        List<PhoneNo> phoneNos = new ArrayList<>();
//        phoneNos.add(ph1);
//        phoneNos.add(ph2);
//        phoneNos.add(ph3);
//        student1.setPhoneNos(phoneNos);
//        session.beginTransaction();
//        session.save(ph1);
//        session.save(ph2);
//        session.save(ph3);
//        session.save(student1);
//        session.getTransaction().commit();

        Student stud = session.get(Student.class,1);
        System.out.println(stud);
        System.out.println("here I'm -------------------------------");

        System.out.println(stud.getPhoneNos());


        factory.close();
        session.close();
    }
}
