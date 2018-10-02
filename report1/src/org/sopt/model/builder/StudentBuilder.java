package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Student;
import org.sopt.model.StudentType;
import org.sopt.service.impl.DepartmentServiceImpl;

public class StudentBuilder {
    private int idx;
    private String name;
    private String address;
    private int grade;
    private Department department;
    private String email;
    private int age;
    private StudentType studentType;

    public StudentBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setDepartmentByName(String departmentName) {
        this.department = new DepartmentServiceImpl().getByDepartmentName(departmentName);
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStudentType(StudentType studentType) {
        this.studentType = studentType;
        return this;
    }

    public Student build() {
        return new Student(idx, name, address, grade, department, email, age, studentType);
    }


}
