package br.com.escola.domain.student;

public class FactoryStudent {

    private Student student;

    public FactoryStudent withNameCpfAndEmail(String nome, String cpf, String email) {
        this.student = new Student(new Cpf(cpf), nome, new Email(email));
        return this;
    }

    public FactoryStudent withPhone(String ddd, String numero) {
        this.student.addPhone(ddd, numero);
        return this;
    }

    public Student create() {
        return this.student;
    }

}
