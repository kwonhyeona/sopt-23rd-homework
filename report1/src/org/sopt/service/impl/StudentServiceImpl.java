package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private final StudentBuilder studentBuilder = new StudentBuilder();

    @Override
    public Student getByStudentIdx(int studentIdx) {
        return null;
    }
}
