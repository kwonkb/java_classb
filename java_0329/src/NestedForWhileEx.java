public class NestedForWhileEx {
    public static void main(String[] args) {
//        중복 for/while : 반복문 안에 반복문이 있는 형태
//        외부 반복문이 1회실행시 내부 반복문은 전체 실행

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("1의 값 : " + i + "            j의 값 : " + j);
            }
            System.out.println("---------------------");
        }

        System.out.println("\n-------2중 while문--------\n");
        int cnt1 = 0; //외부 while문의 초기화 변수
        int cnt2 = 0; //내부 while문의 초기화 변수
        while (cnt1 < 5) {
            while (cnt2 < 5) {
                System.out.println("cnt1의 값 : " + cnt1 + "    cnt2의 값 " + cnt2);
                cnt2++;
            }
            System.out.println("---------------------");
            cnt2 = 0;
            cnt1++;
        }
//        이중 for문을 사용하여 구구단을 2~9단까지 모두 출력하시오.

        for (int i1 = 1; i1 < 10; i1++) {
            for( int j1 = 1; j1 < 10; j1++) {
                System.out.println(i1 + "X" + j1 + "은" +  " " + i1 * j1 + "입니다");
            }
            System.out.println("---------------------");
        }
    }
}
