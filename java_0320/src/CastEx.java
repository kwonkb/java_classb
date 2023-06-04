public class CastEx {
    public static void main(String[] args) {
        System.out.println("강제 타입 변환 ------------\n");

        int iValue = 44032;
        char cValue = (char) iValue;

        System.out.println("cValue : " + cValue);

//      long 타입의 변수 lValue에 500L을 저장(long타입의 데이터)을 저장
        long lValue = 500L;
//      long타입의 변수 lValue에 저장된 데이터를 int 타입의 변수
//      iValu에 저장, 강제 타입 변환을 통해서 저장

        iValue = (int)lValue;
        System.out.println("iValue : " + iValue);

        double dValue = 3.14;
//        double 타입의 변수 dValue에 저장된 데이터를 int 타입의 변수 iValue에 저장, 강제 타입 변환을 통해서 저장
        iValue = (int)dValue;

        System.out.println("dValue :" + dValue);
}
}