package oop;

public class Cat {
    private String food;

    private void show() {
        System.out.println(this.food);
    }

    private void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat petty = new Cat();

    }
}
