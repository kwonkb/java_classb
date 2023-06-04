public abstract class Searchable2 extends RemoteControl2{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VULUME){
            this.volume=MAX_VOLUME;

        }
        else if (volume<RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }
        System.out.println("현재  TV 볼륨 : " + RemoteControl.MAX_VULUME);
    }

}
