package com.company;

public class Employee extends Person {
    private String name;
    private String office;
    private int wage;
    private MyDate employmentDate;


    @Override
    public String toString() {
        return "Employee : " + super.getName();
    }

    public Employee(String name) {
        super(name);
        this.office = office;
        this.wage = wage;
        this.employmentDate = employmentDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public MyDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(MyDate employmentDate) {
        this.employmentDate = employmentDate;
    }
}
