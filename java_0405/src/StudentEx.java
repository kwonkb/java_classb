public class StudentEx {
    public static void main (String [] args) {
//        객체 생성하기
//        Student 클래스 타입의 변수 std를 선언과 동시에 객체를 생성함.

        Student std = new Student();
//        Car클래스 타입의 변수를 선언만 함
        Car car;
//        필요한 순간에 Car클래스 타입의 객체를 선언하고 그 주소를 Car 클래스 타입의 변수에 저장.
        car = new Car();
//        Tire클래스 타입의 변수를 선언하고 주소가 비었다는 의미로 null을 저장함.
        Tire t = null;
//        Tire클래스 타입의 변수 t에 Tire 객체를 생성하고 그 주소를 저장
        t = new Tire();
    }
}
