package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public void addStudent(Student enrolledStudent) {
        enrolledStudents.add(enrolledStudent);
    }
}
