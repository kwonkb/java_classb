public class WhileEx {
    public static void main(String[] args) {
//        while문 : for문과 같은 반복문의 일종
//        조건식의 결과가 true이면 아래의 코드블록을 반복 실행하고, 결과가 false면 코드블럭을 실행하지 않고 while문을 종료하는 반복문.
//        그냥 사용하면 무한루트가 되기 때문에 실제로 사용할 때는 for문에 카운트 변수(=초기화식)의 초기값을 while문 외부에 선언하여 사용.
//        증감식을 while문 내부에 입력하여 사용
//        주의사항 :
//        1. 증감식을 생략할 경우 무한 루프에 빠질 수 있음.
//        2. 증감식의 위치에 따라 출력되는 결과가 달라질 수 있음.
//        3. while문의 탈출조건을 반드시 설정해야한다.(내 대신 컴퓨터가 반복문 작업할때 사용)

        System.out.println("\n-----while문 사용하기----\n");

        int count = 0;
        while (count < 10) {
            System.out.println("count의 값 : " + count);
            count++;
        }

        System.out.println("\n--for문으로 구현하기----\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("i의 값 : " + i);
        }

//        System.out.println("\n-----while문 무한반복----\n");
//
//        count = 0;
////        증감식을 생략할 경우 반복조건이 늘 true가 되기 때문에 무한 반복될 가능성이 크다.
//        while (count < 10) {
//            System.out.println("count의 값 : " + count);
////            count++;
//        }
//      for문의 무한반복은 반복 조건을 생략하거나 true사용
//      증감식을 생략할 경우 무한 반복 됨
        System.out.println("\n-----for문 무한반복----\n");
//        for (; ; ) {
//            System.out.println("for문의 무한 반복");
//        }

//         ----------------------------------------------------------------+
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++; // 증감식을 while문 처음에 입력

            System.out.println("나무를" + treeHit + "번 찍었습니다.");

//        treeHit++; //증감식 while문 중간에 입력

            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
            //            treeHit++; //증감식을 while문 마지막에 입력
        }

//        문제 1 while문을 이용하여 1~10까지의 총합을 구하는 프로그램을 작성하세요
//        문제 2 shile문을 이용하여 원하는 단수의 구구단을 출력하는 프로그램을 작성하세요

//-------------------------------------------------------------------------------------
        System.out.println("\n-----1~10까지의 총합----\n");
        int total = 0;
        int count1 = 0;
        while (count1 < 11) {
            total = total + count1;
            System.out.println(count1 + "더한 값 : " + total);
            count1++;
        }

        System.out.println("\n-----5단 구구단----\n");

        int g1 = 1;
        while (g1 < 10) {
            System.out.println(5 + " * " + g1 + "은(는)" + 5 * g1 + "입니다");
            g1++;
        }
    }
}
//-------------------------------------------------------------------------------------