public class Array2 {
    public static void main(String[] args) {
        System.out.println("\n ----- 다차원 배열 -----\n");

//        1차원 배열 : 기본 배열, 배열의 요소로 데이터를 가지는 배열
//        2차원 배열 : 배열의 요소로 1차원 배열을 가지는 배열
//        3차원 배열 : 배열의 요소로 2차원 배열을 가지는 배열

//        1차원 배열 선언
        int arr1[] = {1, 2, 3, 4, 5};

//        2차원 배열 선언
        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

//        3차원 배열 선언
        int arr3[][][] = { { {1, 2, 3}, {4, 5, 6}}, { {7, 8, 9}, {10, 11, 12} } };

//        2차원 배열에서 항상 라인 번호가 먼저, 칸 번호는 나중
//        라인 안에 칸이 있는 형태로 구성되어 있음
//        2차원 배열에서 크기를 확인하기 위한 속성인 length를 사용 시 배열명.length 하면 해당 배열의 라인 수를 출력
        int numArr[][] = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.println("numArr[4][1] : " + numArr[4][1]);
        System.out.println("numArr[1][4] : " + numArr[1][4]);
//        2차원 배열의 요소가 1차원 배열이므로 새로운 1차원 배열 형식의 변수에 2차원 배열의 요소를 대입하면 1차원 배열을 얻을 수 있음
        int test[] = numArr[2];
        System.out.println(test[0] + " " + test[1] + " " + test[2] + " " + test[3] + " " + test[4]);

//        반복문을 사용하여 2차원 배열의 데이터를 출력하려면 2중 반복문을 사용해야 함
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numArr[i][j] + " ");
            }
        }

        System.out.println();

        for (int item[] : numArr) {
            for (int i : item) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int item[] : numArr) {
            for (int i = 0; i < item.length; i++) {
                System.out.print(item[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            for (int item : numArr[i]) {
                System.out.print(item + " ");
            }
        }

        System.out.println();

        int numArr2[][] = {
                {1,  2,  3},
                {4,  5,  6,  7},
                {8,  9,  10,  11,  12},
                {13, 14}
        };

        System.out.println(numArr2[3][1]);
        System.out.println(numArr2[2][4]);

        for (int i = 0; i < numArr2.length; i++) {
            for (int j = 0; j < numArr2[i].length; j++) {
                System.out.print(numArr2[i][j] + " ");
            }
        }

        System.out.println();
        for (int items[] : numArr2) {
            for (int item : items) {
                System.out.print(item + " ");
            }
        }
    }
}
