package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        String[] s = {"1", "2", "3"};
        Input in = new MockInput(s);
        Input input = new ValidateInput(output, in);
        for (String str : s) {
            int select = input.askInt("Enter menu");
            assertThat(select).isEqualTo(Integer.parseInt(str));
        }
    }
}