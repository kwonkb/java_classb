public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        System.out.println("----------------Vehicle 클래스 객체 생성------------------");
        Vehicle v = new Vehicle();
        v.run();

        System.out.println("------------Bus 클래스 객체 생성-----------");
        Bus bus = new Bus();
        bus.run();

        System.out.println("------------Taxi 클래스 객체 생성-----------");
        Taxi taxi = new Taxi();
        taxi.run();

        System.out.println("---Driver 객체의 멤버 driver  실행-----");
        driver.drive(bus);
        driver.drive(taxi);
        driver.drive(v);
        }

    }
