public class CalculatorEx {
    public static void main (String [] args) {
//        Calculator 클래스의 정적 필드인 pi를 사용하여 계산
        double result1 = 10 * 10 * Calculator.pi;
//        Calcullator 클래스의 정적 메소드 plus(), minus()를 사용하여 계산
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result1 : " + result2);
        System.out.println("result1 : " + result3);

        System.out.println("\n------정적멤버의 데이터 공유-------\n");
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.num1 = 10;
        c1.num2 = 20;
        c2.num1 = 1000;
        c2.num2 = 2000;

        System.out.println("c1의 num1 : " +c1.num1);
        System.out.println("c1의 num2 : " +c1.num2);
        System.out.println("c2의 num1 : " +c2.num1);
        System.out.println("c2의 num2 : " +c2.num2);

        c1.num1 = 100;
        c1.num2 = 200;
        c2.num1 = 10000;
        c2.num2 = 20000;

        System.out.println("c1의 num1 : " +c1.num1);
        System.out.println("c1의 num2 : " +c1.num2);
        System.out.println("c2의 num1 : " +c2.num1);
        System.out.println("c2의 num2 : " +c2.num2);

        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c2.sNum1 = 1000;
        c2.sNum2 = 2000;

        System.out.println("c1의 sNum1 : " +c1.sNum1);
        System.out.println("c1의 sNum2 : " +c1.sNum2);
        System.out.println("c2의 sNum1 : " +c2.sNum1);
        System.out.println("c2의 sNum2 : " +c2.sNum2);

        c1.sNum1 = 100;
        c1.sNum2 = 200;
        c2.sNum1 = 10000;
        c2.sNum2 = 20000;
        Calculator.sNum1 = 100000;
        Calculator.sNum2 = 200000;

        System.out.println("c1의 sNum1 : " +c1.sNum1);
        System.out.println("c1의 sNum2 : " +c1.sNum2);
        System.out.println("c2의 sNum1 : " +c2.sNum1);
        System.out.println("c2의 sNum2 : " +c2.sNum2);
        System.out.println("Calculator의 sNum1 : " +Calculator.sNum1);
        System.out.println("Calculator의 sNum2 : " +Calculator.sNum2);
    }
}