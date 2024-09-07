package oop;

public class Truck extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Электро педаль");
    }

    @Override
    public void steer() {
        System.out.println("Стандарт управление");
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }
}
