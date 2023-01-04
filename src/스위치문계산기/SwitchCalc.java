package 스위치문계산기;

import java.util.Scanner;

// 스위치문으로 계산기 만들기
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 입력하세요. (예. 999 % 10) : ");
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println("Addition : " + (x + y));
                break;
            case '-':
                System.out.println("Subtraction : " + (x - y));
                break;
            case '*':
                System.out.println("Multiplication : " + (x * y));
                break;
            case '/':
                System.out.println("Quotient : " + (x / y));
                break;
            case '%':
                System.out.println("Remainder : " + (x % y));
                break;
            default:
                System.out.println("연산자를 잘못 입력하셨습니다");
        }
    }
}
