package com.hibernates.HQL.ComplexQureies;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class Student {
    @Id
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "student")
    private List<PhoneNo> phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<PhoneNo> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneNo> phone) {
        this.phone = phone;
    }
}
