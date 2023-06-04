import java.util.Scanner;

public class NoBreakEx {
    public static void main(String[] args) {
        System.out.println("-------break가 없을 경우---------");
//        break를 만날때까지 계속 나타남. switch문 끝까지 계속실행함. 그래서 break를 써줘야함.

        Scanner sc = new Scanner(System.in);

        System.out.println("1~6 까지의 숫자를 입력하세요");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다.");

            case 2:
                System.out.println("2번이 나왔습니다.");

            case 3:
                System.out.println("3번이 나왔습니다.");

            case 4:
                System.out.println("4번이 나왔습니다.");

            case 5:
                System.out.println("5번이 나왔습니다.");

            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}
