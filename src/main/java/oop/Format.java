package oop;

public class Format {
    public static void getGreeting(String name) {
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }

    public static void main(String[] args) {
        getGreeting("Елена");
    }
}
