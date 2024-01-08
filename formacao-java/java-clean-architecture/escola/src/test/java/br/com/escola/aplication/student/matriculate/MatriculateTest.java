package br.com.escola.aplication.student.matriculate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.escola.domain.student.Cpf;
import br.com.escola.domain.student.Student;
import br.com.escola.infrastructure.student.RepositoryStudentInMemory;

public class MatriculateTest {

    @Test
    void shouldBeMatriculateNewStudentWithSucess() {
        RepositoryStudentInMemory repositoryInMemory = new RepositoryStudentInMemory();

        Matriculate useCase = new Matriculate(repositoryInMemory);

        MatriculateDto data = new MatriculateDto(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");
        useCase.execute(data);

        Student studentFound = repositoryInMemory.searchByCPF(
                new Cpf("123.456.789-00"));

        assertEquals("Fulano", studentFound.getName());
        assertEquals("123.456.789-00", studentFound.getCpf());
        assertEquals("fulano@email.com", studentFound.getEmail());
    }
}
