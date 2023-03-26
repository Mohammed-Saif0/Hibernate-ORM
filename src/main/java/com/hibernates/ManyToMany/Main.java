package com.hibernates.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/ManyToMany/hibernate.cfg.xml").buildSessionFactory();

        Employee emp1 = new Employee(1,"Saif");
        Employee emp2 = new Employee(2,"laif");

        Project pro1 = new Project(1,"Parking lot ");
        Project pro2 = new Project(2,"Covid management ");
        Project pro3 = new Project(3,"Library management");

        List<Project> projects = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        projects.add(pro1);
        projects.add(pro2);
        projects.add(pro3);
        employees.add(emp1);
        employees.add(emp2);
        emp1.setProjects(projects);
        emp2.setProjects(projects);
        pro1.setEmployees(employees);
        pro2.setEmployees(employees);
        pro3.setEmployees(employees);

        Session session = factory.openSession();
        Transaction trx = session.beginTransaction();

        session.save(emp1);
        session.save(emp2);
        session.save(pro1);
        session.save(pro2);
        session.save(pro3);
        trx.commit();


        Project proj = session.load(Project.class,1);
        List<Employee> lst = proj.getEmployees();
        System.out.println(lst);
        session.close();
        factory.close();

    }
}
