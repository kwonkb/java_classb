public class CarculatorEx {

    public static void main(String[] args) {
        Carculator myCal = new Carculator();
        myCal.add();
        myCal.add1(10, 20);
        int result  = myCal.add2();
        System.out.println("두 수의 덧셈은 : " + result);
    }
}

