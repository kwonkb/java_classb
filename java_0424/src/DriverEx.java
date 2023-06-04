public class DriverEx {
    public static void main(String[] args) {
        Driver driver =new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

        Vehicle v;
        v = bus;
        v.run();
        v = taxi;
        v.run();
    }
}
