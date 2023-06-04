public class SupersonicAirplane extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

//    부모 클래스인  Airplane 에서 상속받은 메소드 중  fly() 재정의 하여 사용함.
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }
        else {
//            부모 객체 메소드 호출
            super.fly();
        }
    }
}
