package br.com.escola.domain.student;

public class StudentNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StudentNotFound(Cpf cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumber());
    }

}
