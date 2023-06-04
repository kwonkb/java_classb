public class ArrayInArrayEx {
    public static void main(String[] args) {
//        다차원 배열 : 배열의 요소로 배열을 사용하는 배열
//        1차원 배열 : 일반적인 배열, 배열의 요소로 데이터를 사용하는 배열
//        2차원 배열 : 배열의 요소로 1차원 배열을 사용하는 배열
//        3차원 배열 : 배열의 요소로 2차원 배열을 사용하는 배열
//        ...
//        주로 사용하는 배열은 1,2차원 배열을 주로 사용함.
//        더 높은 차원의 배열이 있을 경우 각각의 2차원 배열로 분리하여 사용하면 됨.
//        하나의 차원에 []를 하나씩 추가하여 사용함.

//        사용방법 :
//        int [][] arr = new int [3][5]; //3행 5열의 2차원 배열
//        arr[1][3] 100;
//        System.out.println(arr[1][3]); // 저장된 데이터 출력


//        1번방법. 2차원 배열을 선언과 동시에 데이터 저장
        int[][] numArr1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };

        System.out.println(" numArr1[4][1] : " + numArr1[4][1]);

        //        2번방법. 빈 2차원 배열을

        int[][] numArr2 = new int[3][3];
        numArr2[0][0] = 1;
        numArr2[0][1] = 2;
        numArr2[0][2] = 3;
        numArr2[1][0] = 4;
        numArr2[1][1] = 5;
        numArr2[1][2] = 6;
        numArr2[2][0] = 7;
        numArr2[2][1] = 8;
        numArr2[2][2] = 9;

        System.out.println("numArr2[2][1] :  " + numArr2[2][1]);

        //       3번방법. 1차원 배열을 여러개 생성하고
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[3];
        arr3[0] = 7;
        arr3[1] = 8;
        arr3[2] = 9;

        //       2차원 배열의 각 index에 1차원 배열을 저장
        int[][] numArr3 = new int[3][3];
        numArr3[0] = arr1;
        numArr3[1] = arr2;
        numArr3[2] = arr3;
        System.out.println("numArr3[2][0] :  " + numArr3[2][0]);


//        1차원 배열의 요소를 모두 출력 할 때 반복문을 사용하면 편리함.
//        2차원 배열의 요소를 모두 출력할 때는 2중 반복문을 사용하면 됨.

//        2차원 배열의 크기 : 배열이름. length로 출력, 2차원 배열에서 라인의 개수를 출력함
//        2차원 배열의 요소의 크기 : 배열이름[줄번호].length로 출력, 지정한 index의 요소가 배열이므로 해당 배열의 크기를 출력함.

        int[][] numArr4 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };

        System.out.println(numArr4[0][0]);

        for (int i = 0; i < numArr4.length; i++) {
            for (int j = 0; j < numArr4[i].length; j++) {
                System.out.println("numArr4[" + i + "][" + j + "] : " + numArr4[i][j]);
            }
        }

        int[][] numArr5 = new int[3][];
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {4, 5, 6, 7, 8, 9, 10};
        int[] arr6 = {11, 12, 13, 14, 15};

        numArr5[0] = arr4;
        numArr5[1] = arr5;
        numArr5[2] = arr6;

        System.out.println(numArr5[0][1]);
        System.out.println(numArr5[1][5]);
        System.out.println(numArr5[2][3]);

        for (int i = 0; i < numArr5.length; i++) {
            for (int j = 0; j < numArr5.length; j++) {
                System.out.println("numArr5[" + i + "][" + j + "] : " + numArr5[i][j]);
            }
        }

        System.out.println("\n---------3차원 배열---------\n");

        int[][][] arrNum3 = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
    };
}

