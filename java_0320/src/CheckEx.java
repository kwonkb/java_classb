public class CheckEx {
    public static void main(String [] args) {
//        기본 데이터 타입에는 최대값과 최소값이 존재함
//        만약 최대값 혹은 최소값을 넘어가는 값을 저장시 어떻게 되는가?

        byte b1 = 127;
        byte b2 = -128;

        System.out.println("byte 변수 b1의 값 : " + b1);
        System.out.println("byte 변수 b2의 값 : " + b2);

        b1 = (byte)(b1 + 1);
        System.out.println("연산 후 b1의 값 : " + b1);
        b2 = (byte)(b2 - 2);
        System.out.println("연산 후 b2의 값 : " + b2);


    }
}
