public class CalculatorEx {
    public static void main (String [] args) {
//        Calculator 클래스 타입의 변수 myCal을 선언과 동시에 객체 생성
        Calculator myCal = new Calculator();

//        Calculator 클래스 타입의 객체 myCal이 가지고 있는
        myCal.powerOn();

        int result1 = myCal.plus(5, 6);
        System.out.println("result1 : " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCal.dovide(x, y);
        System.out.println("result2 : " + result2);

        myCal.powerOff();
    }
}
