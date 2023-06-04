public class StringEx {
    public static void main(String[] args) {
//        String : 자바에서 문자열을 저장하기 위한 데이터 타입
//        String 데이터 타입은 클래스 타입이나 쉬운 사용을 위해서 기본 데이터 타입처럼 사용할 수 있음
//        String 데이터 타입은 문자열을 저장하기 위해서 "" 를 사용함.

//        사용방법 :
//        1.
//        String 변수명;
//        변수명 = "문자열";
//        2.
//        String 변수명 = "문자열";
//        3.
//        String 변수명 = new String("문자열");

        String str1;
        str1 = "문자열을 저장하는 데이터 타입";
        String str2 = "String 데이터 타입은 기본처럼 사용가능. 그렇다고 기본타입은 아님";
        String str3 = new String("클래스 타입처럼 문자열 만들기");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("\n-------문자열 타입의 비교-------\n");

        int iVal1 = 100;
        int iVal2 = 100;

        if(iVal1 == iVal2) {
            System.out.println("iVal1과 iVal2는 같다");
        }

        else {
            System.out.println("iVal1과 iVal2는 다르다");
        }
        String strVal1 = "아이유";
        String strVal2 = "아이유";

        if (str1== str2) {
            System.out.println("str1Val1과 strVal2는 같다.");
        }

        else {
            System.out.println("str1Val1과 strVal2는 다르다.");

            String strVal3 = new String("아이유");
            String strVal4 = new String("아이유");

            System.out.println("strVal3의 값 : " + strVal3);
            System.out.println("StrVal4의 값 : " + strVal4);
        }

//        if (strVal3 == strVal4) {
//            System.out.println("strVal3과 strVal4는 같다.");
//            }
//
//        else
//            System.out.println("strVal3과 strVal4는 다르다.");
        }
  }
