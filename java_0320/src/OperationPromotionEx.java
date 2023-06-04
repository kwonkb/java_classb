public class OperationPromotionEx {
    public  static void main(String [] args) {
        byte bValue1 = 10;
        byte bValue2 = 20;
//        java에서 정수 타입의 연산이 발생할 경우 기본 타입인 int 타입으로 자동 타입 변환 발생
//        아래 연산식으로 연산 시 결과가 int 타입으로 자동 타입 변환이 발생, byte 타입의 변수에 연산 결과를 저장하려면 byte 타입으로
//        강제 타입 변환이 필요함.

//        byte bValue3 = bValue1 + bValue2;
        int iValue1 = bValue1 + bValue2;
        System.out.println(iValue1);

//        char 타입은 문자를 저장하면서 동시에 정수 타입
        char cValue1 = 'A';
        char cValue2 = 1;
//        위의 byte 연산과 동일할 경우
//        char cValue3 = cValue1 + cValue2;
//        문자 'A' 는 10진수 65이기 때문에 65 + 1이 됨.
        int iValue2 = cValue1 + cValue2;
        System.out.println("유니코드 :" + iValue2);
        System.out.println("출력문자 :" + (char)iValue2);
//        저장된 데이터를 다시 문자 타입으로 출력하기 위해 강제 타입으로 변환해 화면에 출력

        int iValue3 = 10;
        int iValue4 = iValue3 / 4;
        System.out.println(iValue4);

        int iValue5 = 10;
//        아래와 같은 연산식의 결과를 작은 데이터 타입의 변수에 저장하려면 강제 타입 변환이 필요함,
//        int iValue6 = (int)(iValue5 / 4.0);
//        int iValue6 = iValue5 / 4.0;
//        int 타입의 변수는 iValue5가 double 타입의 데이터와 연산하여 결과가 double 타입의 데이터로 변환 되었기 때문에 해당 데이터를
//        저장하는 변수도 double 타입의 변수여야 함.
        double dValue = iValue5 / 4.0;
        System.out.println(dValue);
    }
}
