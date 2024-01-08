package br.com.escola.domain.recommendation;

import java.time.LocalDateTime;

import br.com.escola.domain.student.Student;

public class Recomendation {

    private Student indicated;
    private Student indicative;
    private LocalDateTime dateIndication;

    public Recomendation(Student indicated, Student indicative) {
        this.indicated = indicated;
        this.indicative = indicative;
        this.dateIndication = LocalDateTime.now();
    }

    public Student getIndicated() {
        return indicated;
    }

    public Student getindicative() {
        return indicative;
    }

    public LocalDateTime getDataIndicacao() {
        return dateIndication;
    }

}
