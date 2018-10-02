package org.sopt;

import org.sopt.model.*;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

public class Main {
    public static void main(String[] args) {
        final StudentBuilder studentBuilder = new StudentBuilder();
        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
        final DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        final UniversityBuilder universityBuilder = new UniversityBuilder();

        // 학생리스트
        new DefaultArrayList<Student>()
                .addEntity(studentBuilder
                        .setIdx(1)
                        .setName("권현아1")
                        .setGrade(4)
                        .setDepartmentByName("컴퓨터공학과")
                        .setStudentType(StudentType.getByName("재학"))
                        .build())
                .addEntity(studentBuilder
                        .setIdx(2)
                        .setName("권현아2")
                        .setGrade(4)
                        .setDepartmentByName("컴퓨터공학과")
                        .setStudentType(StudentType.getByName("휴학"))
                        .build())
                .addEntity(studentBuilder
                        .setIdx(1)
                        .setName("권현아3")
                        .setGrade(4)
                        .setDepartmentByName("컴퓨터공학과")
                        .setStudentType(StudentType.getByName("취업계"))
                        .build())
                .print();

        // 교수리스트
        new DefaultArrayList<Professor>()
                .addEntity(professorBuilder
                        .setIdx(1)
                        .setName("배다슬")
                        .addSubject("server")
                        .setDepartmentByName("컴퓨터공학과")
                        .build())
                .addEntity(professorBuilder
                        .setIdx(1)
                        .setName("이승수")
                        .addSubject("ios")
                        .setDepartmentByName("컴퓨터공학과")
                        .build())
                .addEntity(professorBuilder
                        .setIdx(1)
                        .setName("나성수")
                        .addSubject("plan")
                        .setDepartmentByName("컴퓨터공학과")
                        .build())
                .print();

        // 학과리스트
        new DefaultArrayList<Department>()
                .addEntity(departmentBuilder
                        .setIdx(1)
                        .setName("컴퓨터공학과")
                        .setDepartmentType(DepartmentType.getByName("공대"))
                        .build())
                .addEntity(departmentBuilder
                        .setIdx(2)
                        .setName("화학공학과")
                        .setDepartmentType(DepartmentType.getByName("공대"))
                        .build())
                .addEntity(departmentBuilder
                        .setIdx(3)
                        .setName("생명공학과")
                        .setDepartmentType(DepartmentType.getByName("공대"))
                        .build())
                .print();

        // 학교리스트
        new DefaultArrayList<University>()
                .addEntity(universityBuilder
                        .setIdx(1)
                        .setName("성신여자대학교")
                        .build())
                .addEntity(universityBuilder
                        .setIdx(2)
                        .setName("동덕여자대학교")
                        .build())
                .addEntity(universityBuilder
                        .setIdx(3)
                        .setName("서울여자대학교")
                        .build())
                .print();
    }
}
