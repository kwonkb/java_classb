public class MainArgsEx {
    public static void main (String [] args) {
        System.out.println("hello world!!");

        if (args.length != 2) {
            System.out.println("use program : ");
            System.out.println("java MainArgsEx num1 num2");
            System.exit(0);
        }

//        문자열 배열
        String strNum1 = args[0];
        String strNum2 = args[1];

//        int 타입으로 데이터 변환 시도
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;

        System.out.println(num1 + " + " +  num2 + " = " + result);
    }
}
