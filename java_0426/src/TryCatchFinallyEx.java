public class TryCatchFinallyEx {
    public static void main(String[] args) {
        System.out.println("\n ---- finally 사용 안함 ----\n");
        System.out.println("\n ----- 프로그램 시작 ------\n");

        try {
            System.out.println("try 구문 시작");

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("두 수의 나눗셈은 " + result);
        }
        catch (Exception e) {
            System.out.println("try 구문  종료");

            System.out.println(" *** 오류 발생 ***");
            System.out.println("지정한 클래스가 존재하지 않습니다.");

        }

        System.out.println("\n ----- 프로그램 종료 ------");


        System.out.println("\n -----finally 사용함");

        System.out.println("\n ----- 프로그램 시작 ------\n");

        try {
            System.out.println("try 구문 시작");

            int num1 = 10;
            int num2 = 3;
            int result = num1 / num2;
            System.out.println("두 수의 나눗셈은 " + result);
            System.out.println("try 구문  종료");
        }
        catch (Exception e) {
            System.out.println(" *** 오류 발생 ***");
            System.out.println("지정한 클래스가 존재하지 않습니다.");

        }
        finally {
            System.out.println("두 수의 연산을 종료합니다." );

        }
        System.out.println("\n ----- 프로그램 종료 ------");

    }

}



