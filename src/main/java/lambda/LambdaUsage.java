package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeee", "aaa", "bbbb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(left.length(), right.length());
        };
        strings.sort(comparator);
        strings.forEach(System.out::println);
    }
}
