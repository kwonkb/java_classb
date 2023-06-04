import java.util.Scanner;
public class ConditionalEx {

    public static void main (String[] args){
//        키보드 입력을 받기 위한 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 점수를 입력하세요 : ");

//        사용자 키보드 입력을 통해서 점수를 입력받음
        int score = sc.nextInt();
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");


        System.out.println("\n---------if문사용 --------------\n");
        System.out.println("당신의 점수를 입력하세요 : ");
        score = sc.nextInt();

        if (score > 90) {
            grade = 'A';
        }

        else {
            grade = 'B';
        }

        System.out.println("당신의 점수는 " + score + "점이고, 등급은" + grade + "입니다.");
        }
    }
