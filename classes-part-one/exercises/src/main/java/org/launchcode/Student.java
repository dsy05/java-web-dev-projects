package org.launchcode;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public Student(String name, int studentId) {
                this(name, studentId, 0, 0);
        }


        // Drop your getters and setters below for the Student class.
        public String getName() { return name; }
        public void setName(String aName) {name = aName;}
        public int getStudentId() {return studentId;}
        public void setStudentId(int aStudentId) {studentId = aStudentId;}
        public int getNumberOfCredits() {return numberOfCredits;}
        public void setNumberOfCredits(int aNumberOfCredits) {numberOfCredits = aNumberOfCredits;}
        public double getGpa() {return gpa;}
        public void setGpa(double aGpa) {gpa = aGpa;}

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.


}
