package org.example.models;

import org.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class Teacher implements Employee {
    private int id;
    private String name;
    private String subject;

    @Autowired
    private Address teacherAddress;

    public Teacher(){}

    public Teacher(int id, String name, String subject, Address teacherAddress) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.teacherAddress = teacherAddress;
    }

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Address getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(Address teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", teacherAddress=" + teacherAddress +
                '}';
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Teacher details");
    }
}
