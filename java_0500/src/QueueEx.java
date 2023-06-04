import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
//  인터페이스 타입인 Queue 타입의 변수를 생성하고 자식 클래스인 LinkedList 객체를 저장하여 사용
//        Queue 타입의 객체를 생성
        msgQueue.offer(new Message("sendMail", "홍길동"));
        msgQueue.offer(new Message("sendSMS", "유재석"));
        msgQueue.offer(new Message("sendDM", "아이유"));

        while(!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();
//      큐에 저장된 내용이 비었는지 아닌지를 확인
//            저장된 데이터가 가지고 있던 명령 확인
            switch (msg.command) {
                case "sendMail":
//                    가장 먼저 입력된 데이터를 하나 출력, 출려과 동시에 큐에 저장된 데이터 삭제
//                    저장된 데이터가 가지고 있던 데이터 출력
                    System.out.println(msg.to + "님에게 메일을 보냅니다.");
                    break;

                case"sendSMS":
                    System.out.println(msg.to + "님에게 문자를 보냅니다.");
                    break;

                case "sendDM":
                    System.out.println(msg.to + "님에게 DM을 보냅니다.");
                    break;
            }
        }
    }
}
