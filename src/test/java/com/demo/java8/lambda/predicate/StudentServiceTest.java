package com.demo.java8.lambda.predicate;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTest {

    private List<Student> students;
    private StudentService studentService;

    @Before
    public void init() {
        students = new ArrayList<>();
        Student test1 = Student.builder().name("test1").age(20).score(80.0f).build();
        Student test2 = Student.builder().name("test2").age(30).score(70.0f).build();
        Student test3 = Student.builder().name("test3").age(22).score(60.0f).build();
        Student sky = Student.builder().name("sky").age(18).score(90.0f).build();
        students.add(test1);
        students.add(test2);
        students.add(test3);
        students.add(sky);

        studentService = new StudentService();
    }

    @Test
    public void testAgeGreaterThan21() {
        System.out.println(studentService.filterStudents(students, 21));
    }

    @Test
    public void testScoreGreaterThan80() {
        System.out.println(studentService.filterStudents(students, 80.0f));
    }

    @Test
    public void testNameEqualToSky() {
        System.out.println(studentService.filterStudents(students, "sky"));
    }

    @Test
    public void testScoreGreaterThan60AndAgeGreaterThan21() {
        System.out.println(studentService.filterStudents(students, 60, 21));
    }
}