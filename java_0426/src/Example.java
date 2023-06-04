public class Example {
    public static void main(String[] args) {
        implC impl = new implC();

        InterA ia = impl;
        ia.methodA();
        System.out.println("------------------");
        InterB ib = impl;
        ib.methodB();
        System.out.println("------------------");

//      다중 상속
        InterC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println("------------------");


        ImplD d = new ImplD();

        ia=d;
        ia.methodA();
        System.out.println("------------------");

        ib=d;
        ib.methodB();
        System.out.println("----------------------");

        InterD id = d;
        id.methodA();
        id.methodB();
        id.methodD();



    }
}
