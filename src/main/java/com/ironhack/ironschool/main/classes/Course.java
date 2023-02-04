package com.ironhack.ironschool.main.classes;
import java.util.UUID;

public class Course {

    private final String courseId;
    private String name;
    private double price;
    private double moneyEarned;
    private Teacher teacher = null;

    public Course( String name, double price) {
        this.name = name;
        this.price = price;
        courseId = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double money_earned) {
        this.moneyEarned = money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Course: " +
                "CourseId: " + courseId + '\n' +
                "Name: " + name + '\n' +
                "Price: " + price +"\n"+
                "MoneyEarned: " + moneyEarned +"\n"+
                "Teacher: " + teacher +"\n";
    }
}
