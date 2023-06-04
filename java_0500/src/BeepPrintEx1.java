import java.awt.*;
public class BeepPrintEx1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i <5; i++) {
            toolkit.beep();
            try {
//                현재 지정된 스레드를 지정된 시간만큼 일시정지 시킨다
//                천분의 일초로 동작 500은 0.5초에 한번씩 동작하면 비프음을 낸다
                Thread.sleep(500);
            }
            catch(Exception e) {}
        }
//        0.5초 후 화면에 출력, 5번 반복
        for (int i = 0; i< 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }
            catch(Exception  e) {}
        }

    }
}
