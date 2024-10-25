package stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 5, -5, -8, 5, -8, 10, -89);
        List<Integer> positive = numbers.stream()
                .filter(number -> number > 0)
                .toList();
        positive.forEach(System.out::println);
    }
}
