package collection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

class StringCompareTest {
    @Test
    public void whenOneStrGreaterTwoStr() {
        Comparator<String> stringComparator = new StringCompare();
        int result = stringComparator.compare("Onet", "One");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenOneStrGreaterTwoStr2() {
        Comparator<String> stringComparator = new StringCompare();
        int result = stringComparator.compare("Oze", "One");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenOneStrLessTwoStr() {
        Comparator<String> stringComparator = new StringCompare();
        int result = stringComparator.compare("One", "Onet");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenOneStrLessTwoStr2() {
        Comparator<String> stringComparator = new StringCompare();
        int result = stringComparator.compare("One", "Oze");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenOneStrEqlsTwoStr() {
        Comparator<String> stringComparator = new StringCompare();
        int result = stringComparator.compare("One", "One");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }
}