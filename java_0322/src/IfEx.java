import java.util.Scanner;

public class IfEx {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 점수를 입력하세요 : ");

        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 A입니다.");
        }

        if (score < 90) {
            System.out.println("당신의 점수는 90보다 작습니다.");
        }


    }
}
