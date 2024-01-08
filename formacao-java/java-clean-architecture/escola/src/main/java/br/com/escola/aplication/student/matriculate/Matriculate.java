package br.com.escola.aplication.student.matriculate;

import br.com.escola.domain.student.RepositoryStudent;
import br.com.escola.domain.student.Student;

public class Matriculate {

    private final RepositoryStudent repositoryStudent;

    public Matriculate(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    public void execute(MatriculateDto data) {
        Student newStudent = data.createStudent();
        repositoryStudent.matriculate(newStudent);
    }
}
