public class SmartTv implements RemoteControl, Searchable {
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
    public void setMute(boolean mute) {
        RemoteControl.super.setMute(mute);
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VULUME){
            this.volume=volume;

        }
        else if (volume<RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }
        System.out.println("현재  TV 볼륨 : " + RemoteControl.MAX_VULUME);
    }

    @Override
    public void search(String url) {
        System.out.println(url +"를 검색합니다.");
    }
}
