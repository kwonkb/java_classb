public class SwichCaseEx {
    public static void main (String [] args) {
        System.out.println("-------switch ~ case 문 사용하기---------");

//        Math. random() : 0.0 ~ 0.99999999999까지의 임의의 숫자를 생성하는 메소드
//        1 ~ 6까지의 임의의 숫자를 생성
        int num = (int)(Math.random() * 6) + 1;

//        switch ~ case : if문과 같은 조건문의 일종임.
//        if 문과 다른점은 비교값과 case의 값이 동일한지 비교한 후 값이 동일하면 해당코드블럭을 실행하고, 다르면 다음 case문으로 넘어감.
//        비교값이 모든 case문과 일치하지 않을 경우 default문을 실행함.
//        if ~ else if ~ else 문이 switch ~ case 문을 100% 대체할 수 있음.
//        if문은 조건식의 결과 값이 범위 형태로 사용되기 때문에 비교값이 고정된 값이 아닌 A ~ Z까지와 같은 비교형태로 사용하기 편리함.
//        switch ~ case문은 비교값 부분이 하나의 값으로 설정되기 때문에 지정되어 있는 값을 비교하기에 편리.
//        요일(월~일)완전히 고정되어있는 형태, 오늘이 무슨요일이냐 혹은 월에서 1~30중 하루 있는 것. 언제 어디서 보더라도 고정되어있는 형태.
//        범위안에 들어있을 때는 if문이 편하다.

//        주의사항
//        1. switch ~ case 사용 시 default문은 생략가능함.
//        2. case문의 break는 생략하면 안됨(break를 만나게 되면 현재 제어 문을 중지하는 역할. 다음으로 넘어가게 하는 역할)
//        3. break가 없을 경우 break를 만날 때까지 계속 실행 됨./


        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;

            case 2:
                System.out.println("2번이 나왔습니다.");
                break;

            case 3:
                System.out.println("3번이 나왔습니다.");
                break;

            case 4:
                System.out.println("4번이 나왔습니다.");
                break;

            case 5:
                System.out.println("5번이 나왔습니다.");
                break;

            default:
                System.out.println("6번이 나왔습니다.");
                break;
        }

        System.out.println("\n-----------else if 문으로 대체---------\n");

        num = (int)(Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("1번이 나왔습니다.");
        }

        else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        }

        else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        }

        else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        }

        else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        }

        else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
