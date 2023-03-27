package com.hibernates.FeatchTechniques;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student {
    @Id
    private int student_id;
    private String student_name;

//    @OneToMany(mappedBy = "student")
    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
    private List<PhoneNo> phoneNos;

    public Student() {
    }

    public Student(int student_id, String student_name, List<PhoneNo> phoneNos) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.phoneNos = phoneNos;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<PhoneNo> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<PhoneNo> phoneNos) {
        this.phoneNos = phoneNos;
    }
}
