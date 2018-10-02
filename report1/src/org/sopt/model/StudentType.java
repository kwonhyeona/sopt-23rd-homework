package org.sopt.model;

import java.util.Arrays;

public enum StudentType {
    ABSENCE("휴학"),
    BEING("재학"),
    MILITARY("군휴학"),
    EMPLOYEE("취업계");

    private String sType;

    StudentType(String sType) {
        this.sType = sType;
    }

    public String getsType() {
        return sType;
    }

    public static StudentType getByName(String name) {
        return Arrays.stream(StudentType.values())
                .filter((object) -> object.getsType().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String toString() {
        return "StudentType{" +
                "sType='" + sType + '\'' +
                '}';
    }
}
