package checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String surname;
    private static final String NEW_VALUE = "";
    private String name;

    public Broken() {
    }

    private void echo() {
    }

    private void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    private void method(int a, int b, int c, int d, int e, int f) {

    }
}