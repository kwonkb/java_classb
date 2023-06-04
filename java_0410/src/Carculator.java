import java.awt.*;

public class Carculator {
    public void add() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        printResult(result, "덧셈");
    }

    public void add1(int num1, int num2) {
        int result = num1 + num2;
        printResult(result, "덧셈");
    }

    public int add2() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        return result;
    }

    public void printResult(int result, String str) {
        System.out.println("두 수의 " + str + "은 : " + result);

        System.out.println("\n----메소드 4가지 형태-----\n");
        Carculator2 cal2 = new Carculator2();

        cal2.sum01();
        cal2.sum01();
        cal2.sum01();

        cal2.sum02(10, 3);
        cal2.sum02(20, 3);
        cal2.sum02(30, 3);

        result = cal2.sum03();
        System.out.println("두 수의 덧셈은" + result + "입니다.");
        result += cal2.sum03();
        System.out.println("두 수의 덧셈은" + result + "입니다.");
        result *= cal2.sum03();
        System.out.println("두 수의 덧셈은" + result + "입니다.");

        result = cal2.sum04(10, 3);
        System.out.println("두 수의 덧셈은" +result + "입니다.");
        result += cal2.sum04(20, 3);
        System.out.println("두 수의 덧셈은" + result + "입니다.");
        result *= cal2.sum04(30, 3);
        System.out.println("두 수의 덧셈은" + result + "입니다.");


        System.out.println("\n----생성자-----\n");
//        Calculator5클래스 타입의 변수 cal5를 선언하고, new키워드로 Calculator5
//        클래스의 생성자를 호출하여 객체를 메모리에 생성
//        생성된 객체의 주소를 Calculator5() 클래스 타입의 변수  cal5에 저장

        Calculator5 cal5; //Calculator5 클래스 타입의 변수 선언
        cal5 = new Calculator5(); //변수 cal5에 Calculator5의 객체 주소 저장
//        Calculator5 cal5 = new Calculator5();
        System.out.println(cal5.num1);
        System.out.println(cal5.num2);
        System.out.println(cal5.result);

        Calculator5 cal51 = new Calculator5(20, 30);
        System.out.println(cal51.num1);
        System.out.println(cal51.num2);
        System.out.println(cal51.result);



    }
}

