package com.ironhack.ironschool.main.classes;
import java.util.UUID;

public class Course {

    private String courseID = UUID.randomUUID().toString();
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher = null;

    public Course( String name, double price, double money_earned, Teacher teacher) {
        this.name = name;
        this.price = price;
        this.money_earned = money_earned;
        this.teacher = teacher;
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

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned = money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
