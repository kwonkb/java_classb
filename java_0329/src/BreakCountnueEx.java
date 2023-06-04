public class BreakCountnueEx {
    public static void main(String [] args) {
//        break : 반복문과 switch ~ case문에서 사용가능, 반복문과 switch ~ case문 사용 시 break 만나면 즉시
//        반복문과 switch ~ case문 종료
//        continue : 반복문사용, 반복문에서 continue를 만나면 현재 루프를 중지하고 다음 루프로 이동

        System.out.println("\n----break 사용시-----\n");
        for (int i = 0; i <10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i의 값 : " + i);
        }

        System.out.println("\n----continue 사용시-----\n");

        for (int i = 0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i의 값 : " + i);
        }
    }
}
