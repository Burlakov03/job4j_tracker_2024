package stream;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Examp {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return iteratorToStream(it)
                .flatMap(Examp::iteratorToStream)
                .toList();
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false);
    }
}
