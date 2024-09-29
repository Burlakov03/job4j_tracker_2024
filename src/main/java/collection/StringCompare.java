package collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = Integer.compare(left.length(), right.length());
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            int symbol = Character.compare(left.charAt(i), right.charAt(i));
            if (symbol != 0) {
                result = symbol;
                break;
            }
        }
        return result;
    }
}
