public class SmartTvEx {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.turnOn();
        stv.setVolume(50);
        stv.search("카톡");
        stv.turnOff();


        RemoteControl rc;
        rc=stv;

        rc.turnOn();
        rc.setVolume(-10);
        rc.turnOff();

        Searchable s =stv;
        s.search("네이버");

//        동일한 기능을 구현하기 위해서 인터페이스가 아닌 클래스를 사용하는 경우


    }
}
