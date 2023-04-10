package com.hibernates.HQL.ComplexQureies;

import javax.persistence.*;
import java.util.List;

@Entity
public class PhoneNo {

    @Id
    private int phoneNo;
    @ManyToOne
    private Student student;

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Student getStud() {
        return student;
    }

    public void setStud(Student stud) {
        this.student = stud;
    }
}
