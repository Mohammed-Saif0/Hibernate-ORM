package com.hibernates.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int employee_id;
    private String employee_name;

    @ManyToMany
    @JoinTable(
            name = "EMP_PRO",
            joinColumns = {@JoinColumn(name="EMP_id")},
            inverseJoinColumns = {@JoinColumn(name = "PRO_id")}
    )
    private List<Project> projects;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Employee(int employee_id, String employee_name) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
    }



    public Employee() {
    }
}
