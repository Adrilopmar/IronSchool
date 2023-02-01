package com.ironhack.ironschool.main.classes;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Double.compare(teacher.salary, salary) == 0 && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}