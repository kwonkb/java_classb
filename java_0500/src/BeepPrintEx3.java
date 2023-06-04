import javax.tools.Tool;
import java.awt.*;

public class BeepPrintEx3 {
//  멀티 스레그를 구현
    public static void main(String[] args) {
//        스레드 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장하여 사용
        Thread thread = new BeepThread();
//        메인 스레드가 작업 스레드를 생성
//        메인 스레드가 작업 스레드인 스레드를 동작 시킴, 메인스레드는 다른 작업을 실행하러 이동함
//      다른 방법 1
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i-0; i < 5; i++ ) {
//                    try {
//                        Thread.sleep(500);
//                    }
//                    catch (Exception e) {}
//                }
//            }
//        });
        thread.start();
//        메인 스레드는 화면에 문자를 반복출력하는 소스코드를 실행함

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            }
            catch (Exception e) {}
        }
    }
}
