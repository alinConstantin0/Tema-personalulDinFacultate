package com.company;

public class Student extends Person {
    private enum stat {
        BOBOC,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student : " + super.getName();
    }
}
