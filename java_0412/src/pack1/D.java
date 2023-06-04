package pack1;

public class D {
//    클래스 D에 생성자 오버로딩에 의해 생성자가 3개 존재

//    접근제한자가 public인 생성자
    D d1 = new D(true);
    D d2 = new D(1);
    D d3 = new D("문자열");

    //    접근제한자가 public인 생성자
    public D(boolean d) {
    }

    //    접근제한자가 default인 생성자
    D(int d) {
    }
    //    접근제한자가 private인 생성자
    private D(String d) {
    }

    D d1 = new D(true);
    D d2 = new D(1);
    D d3 = new D("문자열");
}
