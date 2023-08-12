package br.com.escola.aplication.student.matriculate;

import br.com.escola.domain.student.Student;
import br.com.escola.domain.student.Cpf;
import br.com.escola.domain.student.Email;

public class MatriculateDto {

    private String nameStudent;
    private String cpfStudent;
    private String emailStudent;

    public MatriculateDto(String nameStudent, String cpfStudent, String emailStudent) {
        this.nameStudent = nameStudent;
        this.cpfStudent = cpfStudent;
        this.emailStudent = emailStudent;
    }

    public Student createStudent() {
        return new Student(
                new Cpf(cpfStudent),
                nameStudent,
                new Email(emailStudent));
    }

}
