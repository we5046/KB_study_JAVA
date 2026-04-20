package submit0420.exam05;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();

        Bus bus = (Bus)vehicle;
        bus.run();
        bus.checkFare();
    }
}
