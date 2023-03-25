package com.design.pattern.prototype;

public class Client {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("student 1");
        student.setBatchName("April");
        student.setInstructor("Sandeep");
        System.out.println(student);

        Student student1 = student.clone();
        student1.setId(2);
        student1.setName("student 2");
        System.out.println(student1);
    }
}
