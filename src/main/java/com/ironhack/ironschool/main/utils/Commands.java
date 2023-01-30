package com.ironhack.ironschool.main.utils;

import com.ironhack.ironschool.main.classes.Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Commands {
    // storage for new classes created. once user creates any of them, they will be stored in.
    private Map<String, Teacher> teacherList= new HashMap<>(); // store for teachers Map <teacherID,Teacher>
    // ----------> uncomment once Course class created <-----------------
    //private Map<String, Course> coursesList= new HashMap<>(); // store for teachers Map <courseID,Course>
    // ----------> uncomment once Student class created <-----------------
//    private Map<String, Student> StudentsList= new HashMap<>(); // store for teachers Map <studentID,Student>

    public void createTeacher(String name, double salary){
            Teacher teacher =new Teacher(name,salary);
            teacherList.put(teacher.getTeacherId(),teacher);
    }
    // ----------> uncomment once Course class created <-----------------
//    public void createCourse(String name, double price){
//        Course course =new Course(name,price);
//        coursesList.put(course.getCourseId(),course);
//    }
    // ----------> uncomment once Student class created <-----------------
//    public void createStudent(String name, String address, String email){
//        Student student =new Student(name,address,email);
//        StudentsList.put(student.getStudentId(),student);
//    }
    public void enroll(String studentID,String courseID){
    }

    public Map<String, Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commands commands = (Commands) o;
        return Objects.equals(teacherList, commands.teacherList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherList);
    }

    @Override
    public String toString() {
        return "Commands{" +
                "teacherList=" + teacherList +
                '}';
    }
}
