public class DmbCellPhoneEx {
    public static void main(String [] args) {
        DmbCellPhone dmbPhone = new DmbCellPhone("갤럭시", "검정", 10);
        System.out.println("모델 : " + dmbPhone.model);
        System.out.println("색상 : " + dmbPhone.color);
        System.out.println("채널 : " + dmbPhone.channel);

//        CellPhone 클래스의 멤버 메소드를 모두 상속받았기 때문에
//        DmbCellPhone 클래스 타입의 객체 dmbPhone에서도 해당 메소드를 사용할 수 있음

        dmbPhone.powerOn();
        dmbPhone.bell();
        dmbPhone.sendMessage("여보세요");
        dmbPhone.receiveMessage("안녕하세요. 뚱인데요");
        dmbPhone.sendMessage("난 징징이야");
        dmbPhone.hangUp();
        dmbPhone.powerOff();

//        DmbCellPhone 클래스가 원래 가지고 있는 메소드

        dmbPhone.turnOnDmb();
        dmbPhone.changeChannel(20);
        dmbPhone.turnOffDmb();

    }
}
