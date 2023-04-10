package com.hibernates.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    int account_id;
    @ManyToOne
    Employee employee;
    public Account() {
        super();
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", employee=" + employee +
                '}';
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Account(int account_id) {
        this.account_id = account_id;
    }


}
