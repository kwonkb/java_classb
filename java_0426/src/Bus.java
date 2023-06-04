public class Bus implements Vehicle{
//    부모인 인터페이스에서 상속받은 차상 메소드 구현
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
//    Bus의 전용 메서드
    public void checkFare(){
        System.out.println("승차 요금을 확인합니다.");
    }
}
