package 반복문연습문제2번;

import java.util.Scanner;

// *
// * *
// * * *
// * * * *
// * * * * *
public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력하시오. : ");
        int starNumber = sc.nextInt();
        for (int i = 0; i < starNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
