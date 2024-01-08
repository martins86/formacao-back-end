package br.com.escola.domain.student;

public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        if (ddd == null || number == null) {
            throw new IllegalArgumentException("DDD e Número são obrigatórios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

}
