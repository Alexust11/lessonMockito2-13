package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private StudentValueGenerator studentValueGenerator;
    private Map <Integer, Student> allStudent=new HashMap<>();
    private int countId=1;

    public University(StudentValueGenerator studentValueGenerator) {
        this.studentValueGenerator = studentValueGenerator;
    }

    public void addStudent(Student student) {
        if (allStudent == null) {
            allStudent=new HashMap<>();
        }
        student.setId(countId);
        student.setAge(studentValueGenerator.generateAge());
        allStudent.put(countId, student);
        countId++;
    }
    public void addStudentInRange(Student student, int minYear, int maxYear) {
        if (allStudent == null) {
            allStudent=new HashMap<>();
        }
        student.setId(countId);
        allStudent.put(countId, student);
        countId++;
    }
    public List<Student> getAllStudent() {
        return new ArrayList<Student>(allStudent.values());
    }



}
