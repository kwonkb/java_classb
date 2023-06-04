public class ArrayEx {
    public static void main(String [] args) {
//        배경 : 하나의 변수명을 여러개 동일 한 데이터 타입의 데이터로 저장할 수 있는 데이터 타입
//        각각의 데이터를 구분하기 위해 index사용
//        index는 0부터 시작
//        배열을 사용하기 위한 기호로 []사용.([]안에 index번호 입력)
//        배열은 생성 시 크기를 지정하고 배열이 생성되면 크기를 변경할 수 없음.
//        배열 생성 시 기본 데이터 타입으로 배열을 생성하면 기본값이 0(정수타입).0.0(실수타입), false(불리언타입)임
//        배열 생성 시 참조 타입으로 배열을 생성하면 기본값이 null임.
//
//        선언방법
//        1.
//        int[] 배열명;
//        배열명 = new int[배열 크기]
//        배열명 = new int[] {데이터1, 데이터2, 데이터3....}
//        2.
//        int[] 배열명 = new int[배열 크기];
//        3.
//        int[] 배열명 = {데이터1, 데이터2, 데이터3, ....}

//        1번 방식은 : 프로그램 도중 나중에 사용할 것을 예상하고 미리 선언해 놓는 방식, 필요할 경우 배열을 생성하여 사용하는 함.
//        기본값은 null임.
//        2번 방식은 : 일반적으로 많이 사용하는 방식, 해당 배열에 저장될 데이터의 길이를 미리 알고 있을 경우 사용
//        3번 방식은 : 선언과 동시에 데이터를 저장하는 방식. 동시에 저장된 데이터의 크기에 의해 배열의 크기가 결정됨.

//        사용방법(저장, 가져오기)
//        배열명[index] = 데이터;
//        배열명[index];
//        System.out.println(배열명[index]);


//        1번 방식으로 배열 선언
        int[] arr1;
        arr1 = new int[5]; // 미리 생성한 배열 변수에 실제로 배열을 생성
        System.out.println(arr1); // 생성한 배열을 출력
        System.out.println(arr1[0]); // 빈 배열의 값(0번 index값)을 출력

//        배열의 각각의 index에 데이터 저장
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

//        배열의 각각의 index에 저장된 데이터를 출력
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

//        2번 방식으로 배열 선언
        int[] arr2 = new int[5];
        System.out.println("배열 arr2의 크기 : " + arr2.length);
        System.out.println("배열 arr2의 0번 index의 값 : " + arr2[0]);

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);


        //        3번 방식으로 배열 선언
        int[] arr3 = {10, 20, 30, 40, 50};
        System.out.println("배열 arr3의 크기 : " + arr3.length);
        System.out.println("arr[0] : " + arr3[0]);
        System.out.println("arr[1] : " + arr3[1]);
        System.out.println("arr[2] : " + arr3[2]);
        System.out.println("arr[3] : " + arr3[3]);
        System.out.println("arr[4] : " + arr3[4]);


//      주의사항 : 1번 배열 생성 방식으로 배열 변수를 미리 선언하고, 필요한 위치에서 배열을 생성하여 저장할 경우
//      3번 방식처럼 데이터만 입력하는 형태로 배열을 생성하는 것은 허용되지 않음.
//        int[] ex; 배열 타입의 변수를 미리 선언
//        ex = {10, 20, 30}; 실제 배열 타입의 변수에 배열 데이터를 입력시 {데이터} 형태로 입력하는 것은 허용되지 않음.
//        ex = new int[] {데이터}; // 이러한 방식으로 사용해야 함.



        int[] arr4;
        arr4 = new int[] {10, 20, 30, 40, 50};
        System.out.println("배열 arr4의 크기 : " + arr4.length);
        System.out.println("arr[0] : " + arr4[0]);
        System.out.println("arr[1] : " + arr4[1]);
        System.out.println("arr[2] : " + arr4[2]);
        System.out.println("arr[3] : " + arr4[3]);
        System.out.println("arr[4] : " + arr4[4]);

        int[] arr5 = new int[] {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println("arr5[" + i + "] : " + arr5[i]);
        }

        for (int i = 0; i < arr5.length; i++) {
            System.out.println("arr5[" + i + "] : " + arr5[i]);
        }



    }
}
