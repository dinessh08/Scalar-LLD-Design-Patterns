package com.design.pattern.prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student implements Prototype<Student> {

    private int id;
    private String name;
    private String batchName;
    private String instructor;

    public Student() {
    }

    public Student(Student s) {
        this.batchName = s.batchName;
        this.instructor = s.instructor;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
