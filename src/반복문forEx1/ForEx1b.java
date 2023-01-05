package 반복문forEx1;

import java.util.Scanner;

public class ForEx1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력하세요. : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("입력한 숫자보다 작거나 같은 자연수의 합은 : " + sum);

        sum = 0;
        while (number > 0) {
            sum += number;
            number--;
        }
        System.out.println("입력한 숫자보다 작거나 같은 자연수의 합은 : " + sum);

    }
}
