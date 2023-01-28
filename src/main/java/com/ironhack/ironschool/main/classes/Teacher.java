package com.ironhack.ironschool.main.classes;

import java.util.UUID;
public class Teacher {
    private final String teacherId;
    private String name;
    private double salary;


    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
        teacherId =  UUID.randomUUID().toString();
    }

    public String getTeacherId() {
        return teacherId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}