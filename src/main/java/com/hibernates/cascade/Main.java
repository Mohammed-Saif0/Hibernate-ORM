package com.hibernates.cascade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/cascade/hibernate.cfg.xml").buildSessionFactory();
        Account acc1 = new Account(12);
        Account acc2 = new Account(13);
        Account acc3 = new Account(14);

        List<Account> accountList= new ArrayList<>();
        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);

        Employee emp = new Employee(1,"Mohammed Saif",accountList);
        acc1.setEmployee(emp);
        acc2.setEmployee(emp);
        acc3.setEmployee(emp);
        Session session = factory.openSession();
        Transaction trx = session.beginTransaction();
        session.save(emp);

        trx.commit();
        Employee employee = session.get(Employee.class,1);
        System.out.println(employee.getAcc());
        session.close();
        factory.close();
    }
}
