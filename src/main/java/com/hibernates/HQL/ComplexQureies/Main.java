package com.hibernates.HQL.ComplexQureies;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/HQL/ComplexQureies/hibernate.cfg.xml").buildSessionFactory();

        Student stud1 = new Student();
        stud1.setName("mohammed saif");
        stud1.setAge(21);
        stud1.setId(12345);
        PhoneNo phone = new PhoneNo();
        PhoneNo phone2 = new PhoneNo();
        PhoneNo phone3 = new PhoneNo();
        phone.setPhoneNo(1345);
        phone2.setPhoneNo(4321);
        phone3.setPhoneNo(3412);
        phone.setStud(stud1);
        phone2.setStud(stud1);
        phone3.setStud(stud1);

        List<PhoneNo> ph = new ArrayList<>();
        ph.add(phone);
        ph.add(phone2);
        ph.add(phone3);

        stud1.setPhone(ph);



        Session session = factory.openSession();
        session.save(phone);
        session.save(phone2);
        session.save(phone3);
        session.save(stud1);
        Transaction trx1 = session.beginTransaction();


          //Delete Query
//        Query query = session.createQuery("delete from Student s where s.name=:name");
//        query.setParameter("name",stud1.getName());
//        int res = query.executeUpdate();
//        System.out.println(res);

        //update Query

//        Query query = session.createQuery("update Student as s set s.name=:updatedName where s.name =:name");
//        query.setParameter("updatedName","don");
//        query.setParameter("name","mohammed saif");
//        int res = query.executeUpdate();
//        System.out.println(res);

        //Join query

        Query query = session.createQuery("select s.name,s.age,p.phoneNo from Student as s inner join s.phone as p");

        List<Object[]> list = query.getResultList();
        for(Object[] arr : list){
            System.out.println(Arrays.toString(arr));
        }
        trx1.commit();
        session.close();
        factory.close();
    }
}
