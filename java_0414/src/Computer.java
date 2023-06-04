public class Computer extends Calculator {

//    @Override : 컴파일러에게 부모 클래스의 메소드와 자식 클래스의 오버라이딩 할 메소드의 선언부가 동일한지 체크하라는 지시어
    @Override
    double areaCircle(double r) {
        System.out.println("Computer객체의 areaCircle()실행");
        return Math.PI * r * r;
    }
}
