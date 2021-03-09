package com.company;

public class CollegeMember extends Employee {
    private int officeTime;
    private String rank;

    public CollegeMember(String name,int officeTime, String rank) {
        super(name);
        this.officeTime = officeTime;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "College Member : " + super.getName();
    }

    public int getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(int officeTime) {
        this.officeTime = officeTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
