package pack2;

//클래스 A는 접근제한자가 default로 설정되어 있어 다른 패키에서 사용할 수 없음.

import pack1. B;
public class C {
//    A a = new A(); // 클래스 A 타입의 객체 생성 진행, 오류 발생
    B b = new B();
}
