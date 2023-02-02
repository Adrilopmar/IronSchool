package com.ironhack.ironschool.main.utils;

import com.ironhack.ironschool.main.classes.Course;
import com.ironhack.ironschool.main.classes.Teacher;
import com.ironhack.ironschool.main.classes.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Commands {
    // storage for new classes created. once user creates any of them, they will be stored in.
    private final Map<String, Teacher> teacherList= new HashMap<>(); // store for teachers Map <teacherID,Teacher>
    // ----------> uncomment once Course class created <-----------------
    private final Map<String, Course> coursesList= new HashMap<>(); // store for teachers Map <courseID,Course>
    // ----------> uncomment once Student class created <-----------------
//    private Map<String, Student> StudentsList= new HashMap<>(); // store for teachers Map <studentID,Student>

    // create teacher with provided name and salary. then put teacher in teachers map.
    public void createTeacher(String name, double salary){
            Teacher teacher =new Teacher(name,salary);
            teacherList.put(teacher.getTeacherId(),teacher);
    }
    // assign teacher to a course, get course and use set teacher after get teacher through id
    public void assignTeacherCourse(String teacherId, String courseId){
        // uncomment once course class is added
        coursesList.get(courseId).setTeacher(teacherList.get(teacherId));
    }
    // return all teachers from list
    public Map<String, Teacher> getTeacherList() {
        return teacherList;
    }
    // return specified teacher
    public Teacher getTeacher(String teacherId){
        return teacherList.get(teacherId);
    }
    // ----------> uncomment once Course class created <-----------------
    public void createCourse(String name, double price){
        //Course course =new Course(name,price);
        //coursesList.put(course.getCourseId(),course);
    }
    public Course getCourse(String courseId){
        return coursesList.get(courseId);
    }
    // ----------> uncomment once Student class created <-----------------
//    public void createStudent(String name, String address, String email){
//        Student student =new Student(name,address,email);
//        StudentsList.put(student.getStudentId(),student);
//    }
    public void enroll(String studentID,String courseID){
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
