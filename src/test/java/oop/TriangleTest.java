package oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and00and01ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when590to301Then9dot27() {
        Point a = new Point(5, 9, 0);
        Point b = new Point(3, 0, 1);
        double expected = 9.27;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when614to217Then5() {
        Point a = new Point(6, 1, 4);
        Point b = new Point(2, 1, 7);
        double expected = 5;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenMinus33Minus3to947Then15dot65() {
        Point a = new Point(-3, 3, -3);
        Point b = new Point(9, 4, 7);
        double expected = 15.65;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }
}