import java.util.Scanner;

public class IfElseEx {
    public static void mian (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 점수를 입력해주세요");

        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("당신의 점수는 90점 보다 큽니다.");
        }

        else{
            System.out.println("당신의 점수는 90보다 작습니다.");
        }
    }
}
