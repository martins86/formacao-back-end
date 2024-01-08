package br.com.escola.infrastructure.student;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.escola.domain.student.PasswordEncryptor;

public class PassWordEncryptorWithMD5 implements PasswordEncryptor {

    @Override
    public String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar hash da senha");
        }
    }

    @Override
    public boolean validateEncryptPassword(String encryptedPassword, String password) {
        return encryptedPassword.equals(encryptPassword(password));
    }

}
