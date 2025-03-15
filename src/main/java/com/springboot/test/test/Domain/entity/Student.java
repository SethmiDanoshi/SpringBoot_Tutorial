package com.springboot.test.test.Domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String grade;


    public Student(Integer id, String name, String address, String grade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.grade = grade;
    }

    public Student() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
