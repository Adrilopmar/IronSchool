package com.ironhack.ironschool.main.classes;
import java.io.StringReader;
import java.util.UUID;

public class Course {

    private String courseID = UUID.randomUUID().toString();
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher = null;

    public Course(String courseID, String name, double price) {
        this.name = name;
        this.price = price;
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
}
