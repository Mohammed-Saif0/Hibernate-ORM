package com.hibernates.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int emp_id;
    private String name;

    @OneToMany(mappedBy = "employee")
    private List<Account> account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAcc() {
        return this.account;
    }

    public void setAcc(List<Account> account) {
        this.account = account;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Employee(){
        super();
    }

    public Employee(int emp_id, String name, List<Account> account) {
        this.emp_id = emp_id;
        this.name = name;
        this.account = account;
    }
}

