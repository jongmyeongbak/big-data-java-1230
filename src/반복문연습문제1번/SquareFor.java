package 반복문연습문제1번;

import java.util.Scanner;

// 양의 정수 n을 받아서 n * n 크기의 행렬을 출력하는 프로그램 작성
// 값은 1부터 시작
// 정수 값 : 4
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("31 이하의 자연수를 입력하세요 : ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.printf("%4d", ++number);
            }
            System.out.println();
        }
    }
}
