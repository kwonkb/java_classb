import java.awt.*;
import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        System.out.println("a의 값 : " + a + "\tB의 값 :" + b);
        a = b;
        System.out.println("수정 후 a의 값 : " + a + " 수정후 \tB의 값 :" + b);

        b = 2000;
        System.out.println("재 수정 후 a의 값 : " + a + " 재수정후 \tB의 값 :" + b);


        System.out.println("\n------배열을 복사했을 경우-------\n");

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {100, 200, 300};


        System.out.println("원본 배열 arr1의 값 : ");
        printArray(arr1, "arr1");

        System.out.println("원본 배열 arr2의 값 : ");
        printArray(arr2, "arr2");

        arr1 = arr2;
        System.out.println("--------------arr1에 arr2를 대입 후 ------------------");
        System.out.println("원본 배열 arr1의 값 : ");
        printArray(arr1, "arr1");

        System.out.println("원본 배열 arr2의 값 : ");
        printArray(arr2, "arr2");

        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        System.out.println("--------------arr2의 값 수정 후 ------------------");
        System.out.println("원본 배열 arr1의 값 : ");
        printArray(arr1, "arr1");

        System.out.println("원본 배열 arr2의 값 : ");
        printArray(arr2, "arr2");

//        배열 복사 방식.
//        1. 반복문을 사용하여 배열의 각 요소 값을 꺼내와서 직접 대입하는 방식
//        2. System.arraycopy 메소드 이용
//        3. Arrays 클래스 이용

         System.out.println("\n------반복문을 이용한 배열 복사------\n");

         int [] arr3 = {10, 20, 30};
         int [] arr4 = {100, 200, 300};

        System.out.println("\n------원본 배열 출력------\n");

        System.out.println("원본 배열 arr3의 값 : ");
        printArray(arr3, "arr3");

        System.out.println("원본 배열 arr4의 값 : ");
        printArray(arr4, "arr4");

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr4[i];
        }

        System.out.println("\n------arr4를 arr3에 반복문으로 복사 ------\n");

        System.out.println("원본 배열 arr3의 값 : ");
        printArray(arr3, "arr3");

        System.out.println("원본 배열 arr4의 값 : ");
        printArray(arr4, "arr4");

        arr4[0] = 1000;
        arr4[1] = 2000;
        arr4[2] = 3000;

        System.out.println("\n------arr4 수정 후 ------\n");

        System.out.println("원본 배열 arr3의 값 : ");
        printArray(arr3, "arr3");

        System.out.println("원본 배열 arr4의 값 : ");
        printArray(arr4, "arr4");

//        System.arraycopy() : System 클래스에서 제공하는 배열 복사 메소드
//        사용법
//        System.out.println(원본 배열명, 시작 index, 타겟배열명, 시작 index, 복사할 크기);
//        Sysyem.arraycopy(arr4, 0, arr3, 0, arr4.length)
        System.out.println("\n-----System.arraycopy()----------\n");

        int[] arr5 = {10, 20, 30};
        int[] arr6 = {100, 200, 300};

        System.out.println("\n------원본배열 출력 ------\n");

        System.out.println("원본 배열 arr5의 값 : ");
        printArray(arr3, "arr5");

        System.out.println("원본 배열 arr6의 값 : ");
        printArray(arr4, "arr6");

        System.arraycopy(arr6, 0, arr5, 0, arr6.length);

        System.out.println("\n------arraycopy사용 후 출력 ------\n");

        System.out.println("원본 배열 arr5의 값 : ");
        printArray(arr3, "arr5");

        System.out.println("원본 배열 arr6의 값 : ");
        printArray(arr4, "arr6");

        arr6[0] = 1000;
        arr6[1] = 2000;
        arr6[2] = 3000;

        System.out.println("\n------arraycopy 수정 후 출력 ------\n");

        System.out.println("원본 배열 arr5의 값 : ");
        printArray(arr3, "arr5");

        System.out.println("원본 배열 arr6의 값 : ");
        printArray(arr4, "arr6");

//        Arrays 클래스의 copyOf() 메소드 사용
//        배열을 다루기 위한 클래스인 Arrays에서 지원하는 메소드 copyOf(), copyOfRange()를 사용하여 배열을 복사할 수 있음.
//        copyOf() : 원본 배열 전체를 복사
//        copyOfRange() : 원본 배열에서 원하는 크기만큼만 복사
//        사용법 :
//        사본 배열 = Arrays.copyOf(원본 배열명, 원본 배열크기);
//        사본 배열 = Arrays.copyOfRange(원본 배열명, 시작index, 복사할 크기);

        int [] arr7 = {10, 20, 30};
        int [] arr8 = {100, 200, 300};

        System.out.println("\n------원본배열 출력 ------\n");

        System.out.println("원본 배열 arr7의 값 : ");
        printArray(arr7, "arr7");

        System.out.println("원본 배열 arr8의 값 : ");
        printArray(arr8, "arr8");

        arr7 = Arrays.copyOf(arr8, arr8.length);

        System.out.println("\n------원본배열 출력 ------\n");

        System.out.println("원본 배열 arr7의 값 : ");
        printArray(arr7, "arr7");

        System.out.println("원본 배열 arr8의 값 : ");
        printArray(arr8, "arr8");

        arr8[0] = 1000;
        arr8[1] = 2000;
        arr8[2] = 3000;

        System.out.println("\n------arr8 수정 후 출력 ------\n");

        System.out.println("원본 배열 arr7의 값 : ");
        printArray(arr7, "arr7");

        System.out.println("원본 배열 arr8의 값 : ");
        printArray(arr8, "arr8");

//    Object.clone() 사용하여 복사하기
//    최상위 클래스이 Object에 clone()메소드를 사용하면 배열을 쉽게 복사할 수 있음.
//    원본 그대로를 복사하는 것 밖에 지원하지 않음.
//        사용법
//        사본 배열명 = 원본 배열명.clone();

        System.out.println("\n------Object.clone() ------\n");

        int[] arr9 = {10, 20, 30};
        int[] arr10 = {100, 200, 300};

        System.out.println("\n------원본 배열 출력 ------\n");

        System.out.println("원본 배열 arr9의 값 : ");
        printArray(arr9, "arr9");

        System.out.println("원본 배열 arr10의 값 : ");
        printArray(arr10, "arr10");

        arr9 = arr10.clone();

        System.out.println("\n------clone()사용 후 출력------\n");

        System.out.println("원본 배열 arr9의 값 : ");
        printArray(arr9, "arr9");

        System.out.println("원본 배열 arr10의 값 : ");
        printArray(arr10, "arr10");

        arr9[0] = 1000;
        arr9[1] = 2000;
        arr9[2] = 3000;

        System.out.println("\n------arr9수정 후 -----\n");

        System.out.println("원본 배열 arr9의 값 : ");
        printArray(arr9, "arr9");

        System.out.println("원본 배열 arr10의 값 : ");
        printArray(arr10, "arr10");

    }
    public static void printArray(int[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(name + "[" + i + "] : " + array[i]);
        }
    }
}
