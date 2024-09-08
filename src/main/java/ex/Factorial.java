package ex;

public class Factorial {
    public static int calc(int number) {
        int result = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        for (int index = 2; index <= number; index++) {
            result *= index;
        }
        return result;
    }

    public static void main(String[] args) {
        calc(-1);
    }
}
