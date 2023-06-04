public class Calculator5 {
//    생성자 : 클래스 이름과 동일한 이름의 메소드
//    new 키워드를 통해서 호출하여 객체를 초기화하는데 사용함.
//    생성자를 하나도 작성하지 않으면 컴파일러가 자동으로 기본 생성자를 추가함.
//    생성자를 하나라도 작성 시 컴파일러가 기본 생성자를 추가하지 않음.
//    생성자는 메소드를 호출할 수 있으나, 메소드는 생성자를 호출할 수 없음.

    public int num1 = 10;
    public int num2 = 20;
    public int result;
//    기본 생성자 : 매개변수가 없는 생성자

    public Calculator5() {
        num1 = 100;
        num2 = 200;
    }

    //    사용자가 작성한 생성자가 존재 시  기본 생성자를 컴파일러가 추가 하지 않음.
    public Calculator5(int x, int y){
        num1 = x;
        num2 = y;
        result = 0;
    }

    public Calculator5(int x, int y, int z) {
        num1 = x;
        num2 = y;
        result = z;
    }
}
