package com.hibernates.FeatchTechniques;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNo {
    @Id
    private int phone_number;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    private Student student;
    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public PhoneNo(int phone_number) {
        this.phone_number = phone_number;
    }

    public PhoneNo() {
    }

    @Override
    public String toString(){
        return ""+this.phone_number;
    }
}
