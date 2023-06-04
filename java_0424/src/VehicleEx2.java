public class VehicleEx2 {
    public static void main(String[] args) {
        Vehicle2 v2 = new Bus2();
        v2.run();
//        v2.checkFare;
        Bus2 b2 = (Bus2) v2;

        b2.run();
        b2.checkFare();
    }
}
