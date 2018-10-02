package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorBuilder professorBuilder = new ProfessorBuilder();

    @Override
    public Professor getByProfessorIdx(int professorIdx) {
        return professorBuilder
                .setIdx(professorIdx)
                .build();
    }
}
