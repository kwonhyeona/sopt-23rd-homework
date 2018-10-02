package org.sopt.model;

import java.util.List;

public class Professor {
    private int idx;
    private String name;
    private Department department;
    private String phone;
    private List<String> subjects;

    public Professor(int idx, String name, Department department, String phone, List<String> subjects) {
        this.idx = idx;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.subjects = subjects;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idx='" + idx + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", phone='" + phone + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
