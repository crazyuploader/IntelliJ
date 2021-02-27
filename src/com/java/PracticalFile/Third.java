package com.java.PracticalFile;

class Student {
    private int StudentID;
    private String Name;

    public Student() {
        StudentID = 122;
        Name = "Omen";
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

public class Third {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student2.setStudentID(123);
        student2.setName("Reyna");
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Student Name: " + student1.getName() + "\n");
        System.out.println("Student ID: " + student2.getStudentID());
        System.out.println("Student Name: " + student2.getName());
    }
}
