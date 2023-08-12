package br.com.escola.infrastructure.student;

import java.util.ArrayList;
import java.util.List;

import br.com.escola.domain.student.Cpf;
import br.com.escola.domain.student.RepositoryStudent;
import br.com.escola.domain.student.Student;
import br.com.escola.domain.student.StudentNotFound;

public class RepositoryStudentInMemory implements RepositoryStudent {

    private List<Student> matriculates = new ArrayList<>();

    @Override
    public void matriculate(Student aluno) {
        this.matriculates.add(aluno);
    }

    @Override
    public Student searchByCPF(Cpf cpf) {
        return this.matriculates.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        return this.matriculates;
    }

}
