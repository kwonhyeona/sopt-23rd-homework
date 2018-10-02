package org.sopt.model;

public class Department extends University {
    private DepartmentType departmentType;

    public Department(int idx, String name, String phone, String address) {
        super(idx, name, phone, address);
    }

    public Department(int idx, String name, String phone, DepartmentType departmentType) {
        super(idx, name, phone);
        this.departmentType = departmentType;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentType=" + departmentType +
                ", idx=" + idx +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}