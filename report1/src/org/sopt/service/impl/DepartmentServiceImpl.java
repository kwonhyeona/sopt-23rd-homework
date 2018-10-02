package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentBuilder departmentBuilder = new DepartmentBuilder();

    @Override
    public Department getByDepartmentName(String departmentName) {
        return departmentBuilder
                .setName(departmentName)
                .build();
    }
}
