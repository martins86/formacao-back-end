package br.com.escola.domain.student;

public interface PasswordEncryptor {
    String encryptPassword(String password);

    boolean validateEncryptPassword(String encryptedPassword, String password);
}
