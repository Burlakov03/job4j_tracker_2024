package ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.calc(-1));
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }
}