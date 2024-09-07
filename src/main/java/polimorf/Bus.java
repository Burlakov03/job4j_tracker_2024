package polimorf;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("yeeeee");
    }

    @Override
    public void passengers(int count) {
        System.out.println("y vas " + count);
    }

    @Override
    public int refuel(int fuel) {
        return 12;
    }
}
