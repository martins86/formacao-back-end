package br.com.escola.domain.student;

import java.util.List;

public interface RepositoryStudent {
    void matriculate(Student aluno);

    Student searchByCPF(Cpf cpf);

    List<Student> listAllStudentsEnrolled();
}
