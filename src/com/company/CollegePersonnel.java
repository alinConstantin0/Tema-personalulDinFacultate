package com.company;

public class CollegePersonnel extends Employee {
    private String title;

    @Override
    public String toString() {
        return "College Personnel : " + super.getName();
    }

    public CollegePersonnel(String name,String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
