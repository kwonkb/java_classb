public class BeepPrintEx2 {
//  멀티 스레드를 사용한 방식
//    Thread 클래스의 start() 메소들르 실행하면 작업 스레드가 동작됨
//    메인 스레드와 작업 스레드가 동시에 실행됨
    public static void main(String[] args) {
//        실핼하고자 하는 소스코드가 있느 멀티 스레드용 클래스 타입의 객체를 생성
        BeepTask beepTask = new BeepTask();
//        작업 스레드를 실행하기 위해  스레드 클래스 타입의 객체을 생성
//        멀티 스레드용 실행용 클래스 타입의 객체를 스레드 클래스의 생성자 매개변수로 사용함
        Thread thread = new Thread(beepTask);
//      Thread 클래스 타입의 객체가 사용자가 만든 클래스의 객체를 대신 실행하는 방식으로 구현되어 있음
        thread.start();
//         작업 스레드를 동작시킴
//        메인 스레드가 작업 스레드의 작업을 시작(위임)하고 바로 아래의 다른 작업을 실행하러 감
//      메인 스레드가 화면에 글자를 출력하는 반복문
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }
            catch (Exception e) {}
        }
    }
}
