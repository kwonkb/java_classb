public class ThreadNameEx {
    public static void main(String[] args) {
//         CurrentThread() : 메인 스레드를 가져오는 메소드
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());

        ThreadA ta = new ThreadA();
        System.out.println("작업 스레드 이름 : " + ta.getName());
        ta.start();


        ThreadB tb = new ThreadB();
        System.out.println("작업 스레드 이름 : " + tb.getName());
        tb.start();


    }
}
