package com.hibernates.HQL.NativeQueries;

import com.hibernates.HQL.ComplexQureies.Pegination.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/HQL/ComplexQureies/Pegination/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        NativeQuery query = session.createNativeQuery("select * from student");

        List<Object[]> list = query.list();

        for(Object[] obj : list){
            System.out.println(Arrays.toString(obj));
        }
        session.close();
        factory.close();
    }
}
