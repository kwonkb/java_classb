public class DmbCellPhone extends CellPhone {
    int channel;

//    생성자
//    this : 객체 자기 자신을 호출하는 키워드
//    this() : 객체 자신의 다른 생성자를 호출하는 명령어
//    super : 현재 객체의 부모 객체를 호출하는 키워드
//    super() : 현재 객체의 부모 객체의 생성자를 호출하는 명령어, 부모 객체를 생성하는 명령어
//    자식 객체의 생성자 첫번째 명령어로 사용되어야 함.
//    부모 클래스에 기본 생성자를 사용할 경우 자식클래스 생성자에서 super()를 생략해도 됨(컴파일러가 자동으로 super()를 추가)
//    부모 클래스가 기본 생성자를 사용하지 않고 다른 생성자를 사용할 경우 자식 클래스에서 부모 생성자를 호출하는 super(매개변수...)를 반드시 입력해야 한다.


    public DmbCellPhone(String model, String color, int channel){
//        super();
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송을 수신합니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB방송 수신을 종료합니다.");
    }

    void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("채널 " + this.channel + "번으로 변경합니다.");
    }
}
