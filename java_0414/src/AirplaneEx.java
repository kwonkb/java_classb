public class AirplaneEx {
    public static void main (String [] args) {
        SupersonicAirplane sa = new SupersonicAirplane();


//        Airplne 클래스에서 상속받은 메소드 그대로 사용
        sa.takeOff();

//        재 정의된 메소드 호출
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
