import java.awt.*;

public class BeepTask implements Runnable{
// 멀티 스레드를 사용하기 위해서 인터페이스 러너블을 상속받아 런() 추상 메소드를 구현함
//    상속받은 추상 메소드 런()을 실행하면 메인 스레드와 함께 동작할 수 있음
//    메인 스레드와 함께 동작할 내용을 구현하면 됨
//    스레드 클래스 타입의 객체가 스타트() 메소드를 통해서 실행되면 런() 메소드가 실행되어 동작함
    @Override
    public void run() {
//        현재 OS의 기본 설정값을 가져옴
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
//            beep 경고음을 출력
            toolkit.beep();

            try{
//                프로그램을 지정한 시간만큼 일시 정지
                Thread.sleep(500);
            }
            catch(Exception e) {}
        }
    }
}
