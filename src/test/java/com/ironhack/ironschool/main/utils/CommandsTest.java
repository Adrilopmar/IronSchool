package com.ironhack.ironschool.main.utils;

import com.ironhack.ironschool.main.classes.Teacher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CommandsTest {
    private Commands commands = new Commands();
    private Map<String,Teacher> teacherListTest;
    private Teacher teacherTest1;

    @BeforeEach
    void setUp() {
        teacherListTest = new HashMap();
//        Teacher teacherTest1 = new Teacher("Chals",20);
//        commands.createTeacher("Chals",20);
        teacherListTest.put(teacherTest1.getTeacherId(),teacherTest1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createTeacher_CreateTeacherCorrectData_TeacherAddedToTeachersList() {
        assertEquals(teacherListTest,commands.getTeacherList());
    }
}