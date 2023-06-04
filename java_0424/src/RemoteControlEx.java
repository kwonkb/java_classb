public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(){
            private int volume;
            @Override
            public void turnOn() {
                System.out.println("전원을 켭니다.");

            }


            @Override
            public void turnOff() {
                System.out.println("전원을 끕니다.");

            }




            @Override
            public void setVolume(int volume) {
                if (volume<0){
                    this.volume =0;
                }
                else if(volume >20){
                    this.volume =RemoteControl.MAX_VULUME;
                }
                else{
                    this.volume=volume;
                }

                System.out.println("현재 volume : " + RemoteControl.MAX_VULUME);

            }

        };

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
//        RemoteControl 인터페이스 타입의 변수를 생성
//        RemoteControl 인터페이스 타입의 객체 생성x
//        인터페이스의 모든 추상 메소드를 구현해야 함
    }
}
