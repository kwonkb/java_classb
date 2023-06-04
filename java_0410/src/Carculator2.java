public class Carculator2 {
//    메소드의 4가지 형태
//    1. 매개변수와 반환값이 모두 없는형태
//    : 매개변수가 없어서 메소드에서 연산 시 필요한 데이터를 메소드 내부에서 선언하고 사용하고 메소드 종료시 삭제됨.
//    메소드 외부에서 데이터 전달이 없기 때문에 연산 결과가 같음.
//    화면 출력 부분을 메소드 내부에서 처리함.
//    메소드 연산 결과를 메소드 내부에서 사용하고 버려짐.

//    2. 매개변수는 존재하고, 반환값은 없는 형태
//    : 매개변수가 존재하여 메소드 연산 시 필요한 데이터를 메소드 외부에서 전달받아 사용함.
//    메소드 외부에서 데이터를 전달받기 때문에 연산 시 결과가 달라짐.
//    화면 출력 부분을 메소드 내부에서 처리함.
//    메소드 연산 결과를 메소드 내부에서 사용하고 버려짐

//    3. 매개변수는 없고, 반환값은 존재하는 형태
//    : 매개변수가 없어 메소드에서 연산 시 필요한 데이터를 메소드 내부에서 선언하고 사용하고 메소드 종료시 삭제됨.
//    메소드 외부에서 전달되는 데이터 가 없기 때문에 연산 결과가 같음.
//    화면 출력 부분을 메소드 외부에서 처리함.
//    메소드 연산 결과는 메소드 외부로 전달하여 외부에서 활용함.

//    4. 매개변수와 변환값이 모두 존재하는 형태
//    : 매개변수가 메소드 연산시 필요한 데이터를 메소드 외부에서 전달받아 사용함.
//    메소드 외부에서 데이터를 전달받기 때문에 연산 시 결과가 달라짐.
//    화면 출력 부분을 메소드 외부에서 처리함.
//    메소드 연산 결과는 메소드 외부로 전달하여 외부에서 활용함.

    public void sum01() {
        int num1 = 10;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }

    public void sum02(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }

    public int sum03() {
        int num1 = 10;
        int num2 = 3;
        int result = num1 + num2;
        return result;
    }

    public int sum04(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}