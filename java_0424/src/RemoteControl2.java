public abstract class RemoteControl2 {
    public static final int MAX_VOLUME=10;
    public static final int MIN_VOLUME=0;

    public abstract void turnOn();
    public abstract void turnOff();

    public static void setMute(boolean mute) {
    }

    public abstract void setVolume(int volume);
}
