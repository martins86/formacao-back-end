package br.com.escola.domain.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    void shouldBeThrowsExceptionThenDDDIsInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("1", "123456789"));
    }

    @Test
    void shouldBeThrowsExceptionThenNumberIsInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", "123"));
    }

    @Test
    void shouldBeCreatedWithDDDAndNumberValid() {
        String ddd = "11";
        String number = "123456789";
        Phone phone = new Phone(ddd, number);
        assertEquals(ddd, phone.getDdd());
        assertEquals(number, phone.getNumber());
    }
}
