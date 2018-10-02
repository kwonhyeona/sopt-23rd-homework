package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.service.impl.DepartmentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProfessorBuilder {
    private int idx;
    private String name;
    private Department department;
    private String phone;
    private List<String> subjects = new ArrayList<>();

    public ProfessorBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public ProfessorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProfessorBuilder setDepartmentByName(String departmentName) {
        this.department = new DepartmentServiceImpl().getByDepartmentName(departmentName);
        return this;
    }

    public ProfessorBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ProfessorBuilder addSubject(String subjectName) {
        this.subjects.add(subjectName);
        return this;
    }

    public Professor build() {
        return new Professor(idx, name, department, phone, subjects);
    }
}
