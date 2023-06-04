public class DoWhileEx {
    public static void main (String [] args) {
//        do ~ while : 기본적으로 while문과 동일한 반복문이지만 최초의 1번은 무조건 실행 보장하는 while문
//        반복조건이 처음부터 false라도 한번은 실행함.
//        while문의 조건식이 가장 마지막에 존재함

        int count = 0;
        do {
            System.out.println(" count의 값 " + count);
            count++;
        } while(count <10);
        System.out.println("\n-------while 사용---------\n");

        count = 0;

        while (count < 10)
            System.out.println("count의 값 : " + count);
        count++;

        System.out.println("\n------------조건식이 처음부터 false일때 while문----------\n");
        count = 5;
        while (count < 5)
            System.out.println("count의 값 " + count);
        count++;


        System.out.println("\n------------조건식이 처음부터 false일때 do-while문----------\n");

        count = 10;
        do {
            System.out.println("count의 값 : " + count);
            count++;
        } while (count < 5);
    }
}
