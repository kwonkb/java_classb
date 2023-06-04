import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
//        문제 1) 사용자 키보드 입력을 통해서 소프트웨어설계, 소프트웨어개발, 데이터베이스 구축, 프로그래밍언어활용, 정보시스템구축관리 과목의 점수를 각각 입력받고,
//        평균이 60점 이상이면 합격, 60점 미만이면 불합을 출력하시오.
//        변수명 : int sub1, int sub2, int sub3, int sub4, int sub5
//        평균값을 저장할 변수도 하나 선언하여 사용

        Scanner sc = new Scanner(System.in);

        System.out.println("소프트웨어 설계 과목의 점수를 입력하시오 : ");
        int sub1 = sc.nextInt();
        System.out.println("소프트웨어 개발 과목의 점수를 입력하시오 : ");
        int sub2 = sc.nextInt();
        System.out.println("데이터베이스 구축 과목의 점수를 입력하시오 : ");
        int sub3 = sc.nextInt();
        System.out.println("프로그래밍언어 활용 과목의 점수를 입력하시오 : ");
        int sub4 = sc.nextInt();
        System.out.println("정보시스템구축관리 과목의 점수를 입력하시오 : ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        int avg = total / 5;

        if(avg >= 60) {
            System.out.println("당신의 평균 점수는 " + avg +" 점입니다.");
        }
        else{
            System.out.println("당신은 불합격입니다.");
        }


        }
    }
