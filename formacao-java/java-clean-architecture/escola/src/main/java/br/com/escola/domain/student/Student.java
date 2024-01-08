package br.com.escola.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Cpf cpf;
    private String name;
    private Email email;
    private String password;
    private List<Phone> phones = new ArrayList<>();

    public Student(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.name = nome;
        this.email = email;
    }

    public void addPhone(String ddd, String number) {
        this.phones.add(new Phone(ddd, number));
    }

    // Getters and setters
    public String getCpf() {
        return cpf.getNumber();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAdress();
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public String getPassword() {
        return password;
    }

}
