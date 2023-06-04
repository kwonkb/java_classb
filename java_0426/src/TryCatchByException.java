import java.util.Scanner;

public class TryCatchByException {
    public static void main(String[] args) {
        System.out.println("\n ------ 프로그램 시작------ \n");

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" 첫 번째 숫자를 입력하세요 : ");
            String data1 =sc.next();
            System.out.println(" 두 번째 숫자를 입력하세요 : ");
            String data2 =sc.next();


            int num1 =Integer.parseInt(data1);
            int num2 =Integer.parseInt(data2);
            int result = num1 + num2;
            System.out.println(num1 + " + " +
                    num2 + " = " + result);

            System.out.println("1 ~ 10까지의 숫자 중 하나를 입력하세요 : ");
            String data3 = sc.next();
            int num3 = Integer.parseInt(data3);

            int[] numArr = null;

            if(num3 > 10 ) {
                numArr = new int[10];
            }
            else if (num3 < 1){
                numArr = new int[1];
            }
            else {
                numArr = new int[num3];
            }


            for(int i = 1; i < num3; i++){
                result += i + 1;
            }
            for(int i = 0; i< num3; i++){
                result += numArr[i];
            }

            System.out.println(" 1 에서 " + num3 + "까지의 총합은 " +result +"입니다");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열을 최대 범위를 넘어서 사용했습니다.");

        }
        catch (NumberFormatException e){
            System.out.println("정수로 변경할 수 없습니다.");
        }
        catch (RuntimeException e){
            System.out.println("실행 오류");
        }
        catch (Exception e){
            System.out.println("오류가 발생했습니다.");

        }






        System.out.println("\n ----- 프로그램 종료 ----- \n");
}
}
