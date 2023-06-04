public class InstanceofEx {
    public static void main(String[] args) {

    }
    public static void method1 (Parent4 parent4) {
        if (parent4 instanceof Chld4) {
            Child4 child4 = (Child4) parent4;
            System.out.println("method1 - ")
        }

    }
    public static void method2 (Parent4 parent4){
        Child4 child4 - (Child4) parent4;
        System.out.println("method2 - Child4로 변환 성공");
    }
}
