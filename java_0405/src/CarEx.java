import java.awt.*;

public class CarEx {

    public static void main (String [] args) {
//        Car 클래스 타입의 변수 myCar 선언과 동시에 객체 생성
        Car myCar = new Car ();

//        Car 클래스 타입의 변수 myCar의 필드에 저장된 값 출력
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

//        Car클래스 타입의 변수 myCar의 필드 중 speed에 데이터 수정
        myCar.speed = 50;
        System.out.println("변경된 속도 : " + myCar.speed);

        Car yourCar = new Car();
        yourCar.company = "기아자동차";
        yourCar.model = "EV6";
        yourCar.color = "회색";
        yourCar.maxSpeed = 250;
        yourCar.speed = 50;

        System.out.println("제작회사 : " + yourCar.company);
        System.out.println("모델명 : " + yourCar.model);
        System.out.println("색상 : " + yourCar.color);
        System.out.println("최고속도 : " + yourCar.maxSpeed);
        System.out.println("현재속도 : " + yourCar.speed);



    }
}
