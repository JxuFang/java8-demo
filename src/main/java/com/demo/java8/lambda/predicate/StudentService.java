package com.demo.java8.lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentService {


    public List<Student> filterStudents(List<Student> students, int age) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > age) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
    public List<Student> filterStudents(List<Student> students, float score) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() > score) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
    public List<Student> filterStudents(List<Student> students, String name) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public List<Student> filterStudents(List<Student> students, float score, int age) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > age && student.getScore() > score) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    /**
     * use predicate instead of the different conditions
     * @param students
     * @param predicate
     * @return
     */
    public List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

}