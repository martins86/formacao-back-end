package br.com.escola.domain.student;

public class Email {

    private String adress;

    public Email(String adress) {
        if (adress == null ||
                !adress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido!");
        }

        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

}
