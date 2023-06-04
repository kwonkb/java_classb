public class OperratorEx {
    public static void main (String [] args) {
//        산술연산자
//        % : 정수 혹은 실수의 나눗셈 후 남은 나머지를 구하는 연산자

        int num1 = 10;
        int num2 = 3;
        int result = 0;

        result = num1 + num2;
        System.out.println("두 수의 덧셈은 : " + result);

        result = num1 - num2;
        System.out.println("두 수의 뺄셈은 : " + result);

        result = num1 * num2;
        System.out.println("두 수의 곱셈은 : " + result);

        result = num1 / num2;
        System.out.println("두 수의 나눗셈은 : " + result);

        result = num1 % num2;
        System.out.println("두 수의 나눗셈 후 나머지는 : " + result);

//        단항연산자 = 증감연산자 (int사용)
        System.out.println("\n-----------증감 연산자 ------------\n");
        num1 = 10;
        System.out.println("변수 num1의 값 : " + num1);

        num1 = num1 + 1;
        System.out.println("+ 연산자 1 증가 후 num1의 값 : " + num1);

        num1++;
        System.out.println("++연산자로 1 증가 후 num1의 값 : " + num1);

        num1--;
        System.out.println("--연산자로 1 감소후 num1의 값 : " + num1);

        System.out.println("\n-----------전치 연산, 후치 연산 ------------\n");
//        증감 연산자는 한라인에 단독사용시 연산자를 피연산자 앞에 있거나 뒤에있거나 차이 X
//        증감 연산자를 한라인의 다른 연산식과 함께 사용 시 피 연산자의 앞에 있을 경우와 뒤에 있을 경우의 결과값이 다름
//        전치연산 : 증감 연산자가 피연산자 앞에 있을 경우, 가장 먼저 연산 후 나머지 연산을 진행함.
//        후치연산 : 증감 연산자가 피연산자 뒤에 있을 경우, 다른 연산 먼저 진행 후 마지막에 증감 연산 진행

        num1 = 10;
        System.out.println("원본 num1의 값 : " + num1);
        ++num1;
        System.out.println("전치 증가 연산 후 num1 : " + num1);
        num1++;
        System.out.println("후치 증가 연산 후 num1 : " + num1);
        --num1;
        System.out.println("전치 감소 연산 후 num1 : " + num1);
        num1--;
        System.out.println("전치 감소 연산 후 num1 : " + num1);

        System.out.println();

        num1 = 10;
        System.out.println("원본 num1의 값 : " + num1);
        System.out.println("전치 증가 연산 사용 : " + ++num1);
        System.out.println("후치 증가 연산 사용 : " + num1++);
        System.out.println("연산 완료 후 num1의 값 : " + num1);
        System.out.println("후치 감소 연산 사용 : " + num1--);
        System.out.println("전치 감소 연산 사용 : " + --num1);
        System.out.println("연산 완료 후 num1의 값 : " + num1);


        System.out.println("\n-----------문자열 연결 연산자 ------------\n");
//        (String사용)
//        문자열 연결 연산자 : '+' 기호를 사용하고, 여러개의 문자열을 하나의 문자열로 결합하는 연산자
//        1특징 : 문자열과 다른 데이터 타입을 연산 시 모두 문자열로 변환하여 연결함.
        String str1 = "저녁";
        String str2 = "JAVA";
        String str3 = "기초반";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 + str3 + str2);
        String str4 = str1 + " " + str3 + " " + str2;
        System.out.println(str4);

        System.out.println();
//      문자열과 다른 데이터 타입의 연산시 모두 문자열로 변환 후 연산
        String str5 = "JDK" + 17.0;
        String str6 = str5 + "특징";
        System.out.println(str6);

//        연산 진행 방향에 의해 "JDK" + 10이 먼저 연산되고 나중에 "JDK10" + 7.0이 추가 연산됨
        String str7 = "JDK" + 10 + 7.0;
//        연산 진행 방향에 의해 10 + 7.0이 먼저 연산되고 나중에 17.0 + "JDK"가 추가로 연산됨
        String str8 = 10 + 7.0 + "JDK";
        System.out.println(str7);
        System.out.println(str8);

    }
}