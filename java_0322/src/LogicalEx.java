public class LogicalEx {
    public static void main(String[] args) {
//        논리 연산자 : 두 항의 데이터를 연산하여 논리적으로 참인지 거짓인지 확인하는 연산자
//        논리곱 연산('AND연산'라 부름, &기호사용) : A와 B의 값이 모두 참일 경우에만 최종 결과 값이 참인 연산, 나머지는 모두 거짓으로 출력
//        논리합 연산('OR연산'라 부름, |기호사용) : A와 B의 값이 하나만 참이어도 최종 결과 값이 참인 연산, 둘 다(A, B)값이 모두 거짓일 때만 최종적으로
//        거짓이됨
//        논리 부정 연산 ('NOT연산'라 부름 , !기호사용) : 입력이 참이면 결과가 거짓이 되고, 입력이 거짓이면, 결과가 참이되는 연산

        int charCode = 'A';

        if ((charCode >= 65) && (charCode <=90)) {
            System.out.println("대문자입니다.");
        }

        if ((charCode >= 97) && (charCode <=122)) {
            System.out.println("소문자입니다.");
        }

        if (!(charCode <48) && (charCode>57)) {
            System.out.println("0~9숫자 입니다.");
        }


        if(!(charCode<48) && !(charCode>57)) {
            System.out.println("0 ~ 9 숫자 입니다.");
        }

        int value = 6;
        if((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("변수 value는 2 또는 3의 배수 입니다.");
        }
    }
}
