package br.com.escola.domain.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void shouldBeThrowsExceptionsThenEmailIsInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void shouldBeCreatedWithEmailValid() {
        String adress = "fulano@alura.com.br";
        Email email = new Email(adress);
        assertEquals(adress, email.getAdress());
    }

}
