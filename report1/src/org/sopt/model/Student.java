package org.sopt.model;

public class Student extends Department {
    private int grade;
    private Department department;
    private String email;
    private int age;
    private StudentType studentType;

    public Student(int idx, String name, String address) {
        super(idx, name, null, address);
    }

    public Student(int idx, String name, String address, int grade, Department department, String email, int age, StudentType studentType) {
        super(idx, name, null, address);
        this.grade = grade;
        this.department = department;
        this.email = email;
        this.age = age;
        this.studentType = studentType;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idx='" + idx + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", department=" + department +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", studentType=" + studentType +
                '}';
    }
}
