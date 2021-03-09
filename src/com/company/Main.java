package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(2006, 3, 10);
        CollegeMember member = new CollegeMember("Popescu", 8, "Principal");
        CollegePersonnel personnel = new CollegePersonnel("Ionescu", "Intermediate");
        Employee employee = new Employee("Ioan");
        Student student = new Student("Popa");
        System.out.println(member.toString());
        System.out.println(personnel.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
    }
}
