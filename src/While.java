
// while 문 : 가장 기본적인 반복문
// while 문 실행 시 while 문 밖에 초기화 변수를 선언하고, while 안에서 초기화 변수의 카운트가 필요함

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("\n----- while 문 -----\n");

        int hit = 0;

        while (hit < 10) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }


//        while 사용 시 주의점
//        1. 초기화 변수의 카운트 부분 위치에 따라 결과가 달라짐
//        1.1 프로그래밍이 익숙하지 않을 경우 변수의 카운트 부분을 고정해서 사용하는 것이 좋음
//        2. while문을 탈출할 수 있는 조건을 반드시 명시해야 함 (무한 루프에 빠질 수 있음)
//        2.1 break 문을 사용하여 탈출 가능

        System.out.println("\n----- while 문 사용 시 주의점 -----\n");
        hit = 0;

        while (hit < 5) {
//            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            hit++;
            if (hit == 5) {
                System.out.println("나무가 넘어갑니다.");
            }
//            hit++;
        }


//        문제 2) while문을 사용하여 1 ~ 10 까지 화면에 출력하는 프로그램을 작성하세요
        System.out.println("\n----- 문제 2 -----\n");
        int n = 1;

        while (n <= 10) {
            System.out.print(" " + n);
            n++;
        }
//        문제 3 ) while 문을 사용하여 1~10 까지의 총합을 구하는 프로그램을 작성하세요
//        값이 저장될 변수 필요
        System.out.println("\n----- 문제 3 -----\n");

        int count = 1;
        int total = 0;

        while (count < 11) {
            total = total + count;
            System.out.println("count : " + count + "\ttotal : " + total);

            count++;
        }

        n = 1;
        int sum=0;

        while (n <= 10) {
            sum = sum + n;
            n++;
            System.out.println(sum);
        }

        System.out.println("\n----- 책 예제 -----\n");

        Scanner scanner = new Scanner(System.in);

        count = 0;
        int n1 = 0;
        double sum1 = 0.0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

//        while문의 조건식에 탈출 조건까지 함께 지정
//        키보드 입력을 통한 데이터가 0이 아닐 경우 아래의 while문 실행, 0이면 while문 종료
        while ((n=scanner.nextInt()) != 0) {
            sum1 = sum1 + n1;
            count++;
        }

        System.out.print("수의 개수는 " + count + "개이며, ");
//        총합이 저장된 변수 sum은 double 형
//        입력된 데이터의 수가 저장된 count 는 int형
//        double형과 int형의 연산이 수행되면 자동형변환이 발생하여 double 형으로 데이터가 만들어 짐
        System.out.println("평균은 " + sum/count + "입니다.");

//        문제 4 while문을 사용하여 지정한 단수의 구구단을 출력하세요
//        출력 형태 : 5 * 1 =5, ~, 5 * 9 = 45
        System.out.println("\n----- 문제 4 -----\n");

        System.out.print("출력하고자 하는 구구단의 단수를 입력하세요");
        int a = scanner.nextInt();
        int i = 1;

        while(i < 10) {
            System.out.println(a + " * " + i + " = " + (a * i));
            i++;
        }

//        다중 while문 : 하나의 while 문 안에 또 다른 while문이 있는 형태의 while문을 뜻함
        System.out.println("\n----- 다중 while 문 -----\n");

//         i = 0;
//        int j = 0;
//
//        while (i < 5) {
//            while (j < 5) {
//                System.out.println("i : " + i + "\tj : " + j);
//                j++;
//            }
//            i++;
//            j = 0;
//        }

        i = 0;

        while (i < 5) {

            int j = 0;
            while (j < 5) {
                System.out.println("i : " + i + "\tj : " + j);
                j++;
            }
            i++;
        }

//        문제 5) while문을 사용하여 2 ~ 9 단 까지의 구구단을 모두 출력하는 프로그램을 작성하세요
//        다중 while문 사용
//        출력 형태 : 5 * 1 =5, ~, 5 * 9 = 45
        System.out.println("\n----- 문제 5 -----\n");


        i = 2;
        while(i < 10) {
            System.out.println("----- " + i + "단 -----");
            int j = 1;
            while (j < 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
            j++;
            }
            i++;
        }

//        do ~ while : 기본적으로 while 문과 동일한 반복문, 무조건 1번은 실행이 되는 while문, 반복 조건을 나중에 확인
        System.out.println("\n----- 일반 while 문 -----\n");

        int c1 = 10;

        while (c1 < 5) { // 조건 먼저 확인
            System.out.println(c1);
            c1++;
        }

        System.out.println("\n----- do ~ while 문 -----\n");
        int c2 = 10;
        do { // 일단 먼저 실행
            System.out.println(c2);
            c2++;
        } while (c2 < 5); // 조건을 나중에 확인
    }
}
