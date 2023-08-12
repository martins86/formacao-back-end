package br.com.escola;

import br.com.escola.aplication.student.matriculate.Matriculate;
import br.com.escola.aplication.student.matriculate.MatriculateDto;
import br.com.escola.infrastructure.student.RepositoryStudentInMemory;

public class Main {
    public static void main(String[] args) {
        String name = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        Matriculate matriculate = new Matriculate(
                new RepositoryStudentInMemory());
        matriculate.execute(
                new MatriculateDto(name, cpf, email));
    }
}
