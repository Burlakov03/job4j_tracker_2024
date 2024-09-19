package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task2> tasks) {
        HashSet<String> result = new HashSet<>();
        for (Task2 task : tasks) {
            result.add(task.getNumber());
        }
        return result;
    }
}
