import java.util.Scanner;

public class ElseIfEx {
    public static void main(String[] args) {
//        else if문 사용 시 주의 점.
//        1. else if 문은 여러개의 조건식을 사용하므로 해당 조건식을 순서에 맞게 배치해야 함.\
//        2. else문은 생략 가능함(모든 조건을 다 입력시)
//        2-1 해당 else 부분을 의도적으로 무시할때 가능
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력해 주세요 : ");
        int score = sc.nextInt();

        if (score >=90) {
            System.out.println("당신의 점수는 " + score + "점이고, 등급은 A입니다.");
        }

        else if (score >= 80) {
            System.out.println(" 당신의 점수는 " + score + "점이고, 등급은 B입니다.");

        }

        else if (score >= 70) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 C입니다.");
        }

        else if (score >= 60) {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 D입니다.");
        }

        else {
            System.out.println("당신의 점수는" + score + "점이고, 등급은 F입니다.");
        }


    }
}
