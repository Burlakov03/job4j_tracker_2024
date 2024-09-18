package collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] ints : list) {
            for (int number : ints) {
                result.add(number);
            }
        }
        return result;
    }
}
