package org.launchcode;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Course course = new Course();

        Student enrolledStudent1 = new Student("Daniyal Syed", 53286, 20, 4.0);
        Student enrolledStudent2 = new Student("Sam Sung", 12345);

        course.addStudent(enrolledStudent1);
        course.addStudent(enrolledStudent2);

    }
}
