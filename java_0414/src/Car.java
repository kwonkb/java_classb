public class Car {
    //    필드 : 일반적으로 클래스의 필드는 접근 제한자를 private로 설정하는 것이 안전
//    private : 해당 클래스 내부에서만 사용 가능
//    getter/setter : 접근제한자가 private로 설정된 필드를 외부에서 우회접근할 수 있도록 해주는 메소드
//    get + 필드명, set + 필드명로 이름을 설정\
//    getter/setter 시용 시 데이터를 저장하거나 가져올 때 데이터의 검증을 할 수 있음.
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        }

        else if (speed < 250) {
            this.speed = 250;
        }
        else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}