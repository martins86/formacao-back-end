package br.com.escola.domain.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CpfTest {

    @Test
    void shouldBeThrowsExceptionThenCpfIsInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("12345678900"));
    }

    @Test
    void shouldBeCreatedWithCpfValid() {
        String numero = "123.456.789-00";
        Cpf cpf = new Cpf(numero);
        assertEquals(numero, cpf.getNumber());
    }
}
