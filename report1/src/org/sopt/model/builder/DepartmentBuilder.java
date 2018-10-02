package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.DepartmentType;

public class DepartmentBuilder {
    private int idx;
    private String name;
    private String phone;
    private DepartmentType departmentType;

    public DepartmentBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public DepartmentBuilder setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
        return this;
    }

    public Department build() {
        return new Department(this.idx, this.name, this.phone, this.departmentType);
    }
}
