package org.sopt.model;

import java.util.Arrays;

public enum DepartmentType {
    ENGINEERING("공대"),
    NATURAL("자연대"),
    EDUCATION("사범대"),
    DENTAL("치대");

    private String dType;

    DepartmentType(String dType) {
        this.dType = dType;
    }

    public String getdType() {
        return dType;
    }

    public static DepartmentType getByName(String name) {
        return Arrays.stream(DepartmentType.values())
                .filter((object) -> object.getdType().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String toString() {
        return "DepartmentType{" +
                "dType='" + dType + '\'' +
                '}';
    }
}
