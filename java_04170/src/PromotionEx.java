public class PromotionEx {
//    각각의 클래스 타입의 객체를 생성
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
//        자동 타입 변환이 발생괴어 자식 클래스 타입의 객체를 부모 클래스 타입의 변수에 저장 가능
//        최상의 클래스인 A 클래스 타입의 변수에 객체 b를 저장
        A a1 = b;
//        최상위 클래스인 A 클래스 타입의 변수 a2에 객체 b를 저장
        A a2 = c;
//        최상위 클래스인 A 클래스 타입의 변수 a2에 객체 b를 저장
        A a3 = d;
//        최상위 클래스인 A 클래스 타입의 변수 a3에 객체 b를 저장
        A a4 = e;
//        최상위 클래스인 A 클래스 타입의 변수 a4에 객체 b를 저장

//        부모 클래스인 B 클래스 타입의 변수 b1에 객체 d를 저장
        B b1 = d;
//        부모 클래스인 C 클래스 타입의 변수 a4에 객체 d를 저장
        C c1 = e;

//        B b2 = e; b클래스와 e클래스는 상속관계에 없다.
//        C c2 = d; c클래스와 d클래스는 상속관계에 없다.
    }
}
