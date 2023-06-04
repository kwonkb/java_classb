public class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("홍길동");
        String name = (String) box.get();
        System.out.println(name);

        Apple apple = new Apple();
        box.set(apple);
        Apple apple2 = (Apple)box.get();

        box.set(10000);
        int number = (int) box.get();



        System.out.println("\n----제네릭을 사용한 클래스 사용하기-----\n");

//        String 타입으로 객체 사용설정
        Box2<String> box2 = new Box2<>() ;
        box2.set("홍길동");
        name = box2.get();
//        사용할 수 있는 타입을 String 타입으로 지정했기 때문에 다른 데이터 타입은 사용할 수 없음.
//        저장된 데이터 출력 시 자동으로 String 타입으로 변환

//        Apple클래스 타입으로 객체 사용설정
    Box2<Apple> box21 = new Box2<Apple>();

//    저장할 수 있는 데이터 타입이 Apple 클래스 타입으로 고정됨
    box21.set(apple);
//    출력시 Apple 클래스 타입으로 자동 변경됨, 강제 타입 변환이 필요없음.
    Apple apple1 = box21.get();
    }
}
