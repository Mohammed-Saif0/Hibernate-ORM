package com.hibernates.HQL;

import com.hibernates.ObjectStates.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/HQL/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        String query = "from Student as s where s.student_name=:name and s.student_age >:age";
        Query q = session.createQuery(query);
        q.setParameter("name","mohammed Saif");
        q.setParameter("age",12);
//        Student student = (Student) q.uniqueResult();
        List<Student> student =  q.list();
        System.out.println(student);

        session.close();
        factory.close();

    }
}
