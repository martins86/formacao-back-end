package br.com.escola.aplication.recommendation;

import br.com.escola.domain.student.Student;

public interface Recomendation {

    void sendEmailFor(Student indicated);

}
