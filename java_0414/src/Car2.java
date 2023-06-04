public class Car2 {
    public int speed;

    public void speedUp(){
        speed += 1;
    }

//    메소드에 final키워드 사용시 해당 메소드를 상속받아도 재 정의하여 사용할 수 없음.
//    부모 클래스에서 상속해준 그대로 사용해야함.
    public void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
