package com.szxs.entity;

import java.util.Date;

public class User {
    private int uid;
    private String uname;
    private String position;
    private String office;
    private int age;
    private Date startDate;
    private String salary;

    public User() {
    }

    public User(int uid, String uname, String position, String office, int age, Date startDate, String salary) {
        this.uid = uid;
        this.uname = uname;
        this.position = position;
        this.office = office;
        this.age = age;
        this.startDate = startDate;
        this.salary = salary;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
