package 제일큰값찾기;

import java.util.Scanner;

// 세 자리의 정수를 입력받아서 100자리, 10자리, 1자리로 나누어 담고 이 중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 자연수를 입력하세요. : ");
        int number = sc.nextInt();
        int a = number / 100;
        int b = number % 100 / 10;
        int c = number % 10;
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
