public class DefaultMethodEx {
    public static void main(String[] args) {
        System.out.println("\n ------- 추상 메서드로 기능 추가 시 ---------\n");


        MyInterface1 mi11 =new MyClassA1();
        mi11.method1();

        MyInterface1 mi12 = new MyClassB1();
        mi12.method1();

        System.out.println("\n ------ 기능추가 ------\n");

        mi11.method2();
        mi12.method2();


        System.out.println(" \n ----- 디폴트 메소드로 기능 추가 -----\n");
        MyInterface2 mi21 = new MyClassA2();
        mi21.method1();
        MyInterface2 mi22 =new MyClassB2();
        mi22.method1();

        System.out.println("\n ----- 기능 추가 -----\n");

        mi21.method2();
        mi22.method2();

    }
}
