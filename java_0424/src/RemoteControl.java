public interface RemoteControl {
    int MAX_VULUME = 10;
    int MIN_VOLUME = 0;


    void turnOn();
    void turnOff();



    default void  setMute(boolean mute){
        if(true){
            System.out.println("무음 처리합니다.");

        }
        else {
            System.out.println("무음 해제합니다.");
        }
    }


    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }

    void setVolume(int volume);
}
