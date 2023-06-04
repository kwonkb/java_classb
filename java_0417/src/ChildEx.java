public class ChildEx {
    public static void main (String[] args) {
        System.out.println("\n-------Parent 클래스 타입의 객체 생성------\n");
        Parent p = new Parent();
        p.method01();
        p.method02();

        System.out.println("\n------- Child 클래스 타입의 객체 생성-----\n");
        Child c = new Child();
        c.method01();
        c.method02();
        c.method03();
        System.out.println("\n------- Parent 변수에 Child 객체 담기-----\n");

//         부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장하면 부모 클래스 타입의 멤버만 사용할 수 있음
    }
}
