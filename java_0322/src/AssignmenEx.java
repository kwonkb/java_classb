public class AssignmenEx {
    public static void main (String [] args) {
        int result = 0;
        System.out.println("변수 result : " + result);

        result = 0;
        System.out.println("변수 result : " + result);

        result += 10;
        System.out.println("변수 result : " + result);

        result -= 5;
        System.out.println("변수 result : " + result);

        result *= 3;
        System.out.println("변수 result : " + result);

        result *= 2;
        System.out.println("변수 result : " + result);

        result %= 3;
        System.out.println("변수 result : " + result);

//        +=는 주로 여러개의 문자열을 하나로 연결하기 위해 사용하고 있으며 DB를 다루기 위한 SQL 문을 사용하기 위해 사용함

        String str = " += 형태는 여러개의" + " ";
        str += "문자열을" + " ";
        str += "하나로 연결하기 위해"+ " ";
        str += "주로 사용하고 있음";

        System.out.println(str);

        String str2 = " += 형태는 여러개의" + " ";
        str2 = str2 + "문자열을" + " ";
        str2 = str2 + "하나로 연결하기 위해"+ " ";
        str2 = str2 + "주로 사용하고 있음";

        System.out.println(str2);
    }
}
