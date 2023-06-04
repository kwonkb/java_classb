public class Child2Ex {
    public static void main(String[] args) {
        Parent2 p= new parent2();
        p.field1 = "부모 클래스";
        p.method01();
        p.method02();

        System.out.println("-----------------Child2 클래스 객체 생성-----------");
        Child2 c = new Child2();
        c.field1= "상속받은 필드";
        c.field2 = "Child2 전용 필드";
        c.method01();
        c.method02();
        c.method03();

        System.out.println("--------Parent2에 Child2 객체 저장-----");

        p=c;
        p.field1 = "부모에 자식 객체 대입";
        p.method01();
        p.method02();

        System.out.println("--------Parent2에 저장된 Child2 객체를 다시 Child2 클래스 타입의 변수에 저장------");

        Child2 c2 = (Child2)p;
        c2.field1 = "상속받은 필드";
        c2.field2 = "Child2 전용 필드";
        c2.method01();
        c2.method02();
        c2.method03();

        System.out.println("-------원본이 부모타입인 것을 자식타입으로 변환할 수 없음-------");

//        강제타입 변환의 조건 자체가 원본 객체가 자식 타입의 객체인 것을 부모 타입의 변수에 저장했다가 다시 자식 클래스 타입의 변수에 저장하는 것이 조건임
//        원본이 부모 클래스 타입의 객체이거나 혹은 형제 클래스타입의 객체를 타입 변환할려고 할때 오류가 발생함
//        Parent2 p2 = new Parent2();
//        Child2 child2 =(Child2)p2;

        Child3 c3 = new Child3();
        Parent2 p3 = c3;

//        문법적으로 원본이 자식 클래스 타입의 객체를 부모 클래스 타입의 변수에 저장한 것을 가지고 다시 자식 클래스 타입의 변수에 강제 타입 변환을 한 것이라서 문법 오류가 발생하지는 않음\
//        실행 시 실제 원본 객체와 강제 타입 변환으로 변경하고자 하는 클래스가 다르기 때문에 오류가 발생함
//        Child2 child2 = (Child2) p3;
    }
}
