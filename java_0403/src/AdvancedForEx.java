import java.awt.*;

public class AdvancedForEx {
    public static void main(String [] args) {
        int [] scores = {95, 71 ,84 ,93 ,87};

        int total = 0;
        for (int i = 0; i < scores.length; i++); {
            total = total + scores[i];
        }

        System.out.println("점수 총합 : " + total);

        double avg = (double) total / scores.length;
        System.out.println("점수 평균 : " + avg);

        System.out.println("\n-----향상된 for문 사용시------\n");

        total = 0;

        for (int score :scores) {
            total = total + score;

            System.out.println("점수 총합 : " + total);

            avg = (double) total / scores.length;
            System.out.println("점수 평균 : " + avg);
        }
    }
}