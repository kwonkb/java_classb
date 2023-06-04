package pack1;

public class B {
    public void method() {
//        접근 제한자 protected를 사용한 A클래스지만 동일한 패키지에 존재하기 때문에 제한 없이 사용가능.

        A a = new A();
        a.field = "data";
        a.method();
    }
}
