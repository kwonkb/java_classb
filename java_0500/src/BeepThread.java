import java.awt.*;

public class BeepThread extends Thread{
//    Thread 클래스를 상속받아  run() 추상 메소드를 구현하여 멀티 스레드 프로그램을 구현함
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try{
                Thread.sleep(500);
            }
            catch (Exception e) {}
        }
    }
}
