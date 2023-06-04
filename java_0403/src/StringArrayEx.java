import java.awt.*;

public class StringArrayEx {
    public static void main(String [] args) {
//        참조 타입 배열 : 배열의 요소로 참조 타입을 사용하는 배열
//        클래스, 인터페이스 등을 데이터타입으로 하는 배열

        String[] strArr = {"JAVA", "JSP", "SPRING"};
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i + "] : " + strArr[i]);
        }

        String[] strArr1 = new String[3];
        strArr1[0] = "JAVA";
        strArr1[1] = "JSP";
        strArr1[2] = new String("SPRING");

        for (int i = 0; i <strArr1.length; i++) {
            System.out.println("strArr1[" + i + "] : " + strArr1[i]);
        }

    }
}
