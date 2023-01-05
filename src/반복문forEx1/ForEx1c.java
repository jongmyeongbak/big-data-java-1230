package 반복문forEx1;

import java.util.Scanner;

public class ForEx1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력하세요. : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);
    }

    private static int recursiveFunc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveFunc(n - 1);
    }
}
