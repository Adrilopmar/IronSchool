package com.ironhack.ironschool.main.classes;

import com.ironhack.ironschool.main.classes.Course;

import java.util.UUID;

public class Student {
    private final String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;

    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        studentId = UUID.randomUUID().toString();
    }

    public String getStudentId() {
        return studentId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        String courseName;
        String courseId;
        try {
            courseName =  course.getName();
            courseId=  course.getCourseId();
        }catch (NullPointerException e){
            courseName = null;
            courseId=null;
        }
        return  "\nStudentId: " + studentId + '\n' +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Email: " + email + '\n' +
                "Course: " + courseName + " - " +courseId
                + "\n==========================";
    }
}
