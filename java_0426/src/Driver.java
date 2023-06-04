public class Driver {
//    매개변수로 인터페이스인 Vehicle 타입을 사용함
//    매개변수로 사용할 수 있는 데이터는 Vehicle 타입을 상속받아 구현한 자식 클래스만 가능함
    public void drive(Vehicle vehicle ) {
//        매개변수로 넘어온 데이터의 원본이 Bus 타입의 객체이면 강제 타입 변환을 통해서    Bus 클래스 타입의 객체로 변환하고, Bus 클래스의 전용 메서드인 checkFare()를 사용함
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }
}
