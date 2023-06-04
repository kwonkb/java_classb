public class ArraysEx {
    public static void main(String[] args) {
//        여러가지 배열 만들기
        int[] iarr = {10, 20, 30, 40, 50};
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + "]" + iarr[i]);
        }

        double[] dArr = new double[]{3.14, 4.26, 10.5, 7.5};
        for (int i = 0; i < dArr.length; i++) {
            System.out.println("dArr[" + i + "] : " + dArr[i]);
        }

        String[] strArr = new String[12];
        strArr[0] = "1월";
        strArr[1] = "2월";
        strArr[2] = "3월";
        strArr[3] = "4월";
        strArr[4] = "5월";
        strArr[5] = "6월";
        strArr[6] = "7월";
        strArr[7] = "8월";
        strArr[8] = "9월";
        strArr[9] = "10월";
        strArr[10] = "11월";
        strArr[11] = "12월";

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

//        문자열 String 타입의 배열의 초기 값은 null이다.
//        String 타입은 클래스 타입이고 클래스 타입은 참조 타입이기 때문에 초기값이 null이다.
        String[] sArr = new String[3];
        System.out.println(sArr[0]);
        System.out.println(sArr[1]);
        System.out.println(sArr[2]);
        sArr[0] = "문자열1";
        sArr[1] = "문자열2";
        sArr[2] = "문자열3";


        int[] iArr = new int[3];
        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
    }
}
