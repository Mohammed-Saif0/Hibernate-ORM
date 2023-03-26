package com.hibernates.Embeddable;

import javax.persistence.*;


@Entity(name="Student_deatils")
public class Student {
    @Id
    private int studentId;
    private String name;
    private Certificate certificate;

    public Student() {
        super();
    }
    public Student(int studentId, String name, Certificate certificate) {
        this.studentId = studentId;
        this.name = name;
        this.certificate = certificate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
