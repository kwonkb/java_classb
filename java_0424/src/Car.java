public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backtRightTire = new KumhoTire();
    Tire backLefttTire = new KumhoTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLefttTire.roll();
        backtRightTire.roll();
        System.out.println("------------");
    }
}
